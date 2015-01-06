package gwt.dodaj.view.rozmiar;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import gwt.czarodziejka.model.wyszukiwarka.costume.Belt;
import gwt.czarodziejka.model.wyszukiwarka.costume.Height;
import gwt.czarodziejka.view.wyszukiwarka.components.SelectOne;
import gwt.dodaj.view.DodajStrojView;
import gwt.dodaj.view.components.ErrorImage;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class RozmiarInstance extends HorizontalPanel {

    private SelectOne heightFrom = new SelectOne();
    private SelectOne heightTo = new SelectOne();
    private SelectOne beltFrom = new SelectOne();
    private SelectOne beltTo = new SelectOne();
    private ErrorImage wzrostErr = new ErrorImage();
    private ErrorImage rozmiarErr = new ErrorImage();
    private final DodajStrojView view;

    public RozmiarInstance(DodajStrojView view) {
        String width = "50px";
        heightFrom.setWidth(width);
        heightTo.setWidth(width);
        beltFrom.setWidth(width);
        beltTo.setWidth(width);

        wzrostErr.setVisible(false);
        rozmiarErr.setVisible(false);
        wzrostErr.setTitle("Wybierz wzrost.");
        rozmiarErr.setTitle("Strój jest tylko dla dzieci, więc nie można wybrać rozmiaru.");

        super.setStylePrimaryName("selectManyCheckbox");
        super.add(wzrostErr);
        super.add(new HTML("Wzrost od&nbsp;"));
        super.add(heightFrom);

        super.setStylePrimaryName("selectManyCheckbox");
        super.add(new HTML("&nbsp;do&nbsp;"));
        super.add(heightTo);

        super.setStylePrimaryName("selectManyCheckbox");
        super.add(new HTML("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"));
        super.add(rozmiarErr);
        super.add(new HTML("Rozmiar od&nbsp;"));
        super.add(beltFrom);

        super.setStylePrimaryName("selectManyCheckbox");
        super.add(new HTML("&nbsp;do&nbsp;"));
        super.add(beltTo);

        setValues(beltFrom, Belt.values());
        setValues(beltTo, Belt.values());
        setValues(heightFrom, Height.values());
        setValues(heightTo, Height.values());

        beltFrom.addChangeHandler(new ChangeHandler() {

            @Override
            public void onChange(ChangeEvent event) {
                setBeltTo(Belt.getNr(beltFrom.getSelected()));
            }
        });
        beltFrom.addKeyPressHandler(new KeyPressHandler() {

            @Override
            public void onKeyPress(KeyPressEvent event) {
                setBeltTo(Belt.getNr(beltFrom.getSelected()));
            }
        });

        heightFrom.addChangeHandler(new ChangeHandler() {

            @Override
            public void onChange(ChangeEvent event) {
                setHeightTo(Integer.valueOf(heightFrom.getSelected()));
            }
        });
        heightFrom.addKeyPressHandler(new KeyPressHandler() {

            @Override
            public void onKeyPress(KeyPressEvent event) {
                setHeightTo(Integer.valueOf(heightFrom.getSelected()));
            }
        });
        this.view = view;
    }

    private void setValues(SelectOne box, Object[] values) {
        box.addItem("");
        for (Object v : values) {
            box.addItem(v.toString());
        }
    }

    public String getRozmiar() {
        String result = "new Size(";

        String h1 = heightFrom.getSelected() == null ? "" : heightFrom.getSelected();
        String h2 = heightTo.getSelected() == null ? "" : heightTo.getSelected();
        String w1 = beltFrom.getSelected() == null ? "" : beltFrom.getSelected();
        String w2 = beltTo.getSelected() == null ? "" : beltTo.getSelected();
        if (h1.equals(h2) || h2.isEmpty()) {
            result += "Height.cm_" + h1;
        } else {
            result += "Height.cm_" + h1 + ", Height.cm_" + h2;
        }
        if (w1.isEmpty() && w2.isEmpty()) {
            //do nothing
        } else if (w1.equals(w2) || w2.isEmpty()) {
            result += ", Belt." + w1;
        } else {
            result += ", Belt." + w1 + ", Belt." + w2;
        }

        result += ")";
        return result;
    }

    private void setHeightTo(int heightFrom) {
        Height previouslySelected = heightTo.getSelected().isEmpty() ? null : Height.valueOf(Integer.valueOf(heightTo.getSelected()));

        Height[] values = Height.values();
        ArrayList<Height> filteredValues = new ArrayList<Height>();
        for (Height value : values) {
            if (value.getHeight() >= heightFrom) {
                filteredValues.add(value);
            }
        }

        heightTo.clear();
        setValues(heightTo, filteredValues.toArray());

        if (filteredValues.contains(previouslySelected)) {
            heightTo.setSelectedIndex(filteredValues.indexOf(previouslySelected) + 1);
        } else {
            heightTo.setSelectedIndex(0);
        }
    }

    private void setBeltTo(int beltFrom) {
        Belt previouslySelected = Belt.valueOf(beltTo.getSelected());

        Belt[] values = Belt.values();
        ArrayList<Belt> filteredValues = new ArrayList<Belt>();
        for (Belt value : values) {
            if (value.getNr() >= beltFrom) {
                filteredValues.add(value);
            }
        }

        beltTo.clear();
        setValues(beltTo, filteredValues.toArray());

        if (filteredValues.contains(previouslySelected)) {
            beltTo.setSelectedIndex(filteredValues.indexOf(previouslySelected) + 1);
        } else {
            beltTo.setSelectedIndex(0);
        }
    }

    boolean validate() {
        boolean result = true;
        if (heightFrom.getSelected().isEmpty()) {
            wzrostErr.setVisible(true);
            result = false;
        } else {
            wzrostErr.setVisible(false);
        }
        boolean isChildOnly = view.getChild().getValue() && !view.getAdult().getValue();
        if (isChildOnly && !beltFrom.getSelected().isEmpty()) {
            rozmiarErr.setVisible(true);
            result = false;
        } else {
            rozmiarErr.setVisible(false);
        }
        return result;
    }

    void clearError() {
        wzrostErr.setVisible(false);
        rozmiarErr.setVisible(false);
    }
}
