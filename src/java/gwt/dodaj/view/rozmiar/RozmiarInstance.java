package gwt.dodaj.view.rozmiar;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import gwt.czarodziejka.model.wyszukiwarka.stroj.Pas;
import gwt.czarodziejka.model.wyszukiwarka.stroj.Wzrost;
import gwt.czarodziejka.view.wyszukiwarka.components.SelectOne;
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

    public RozmiarInstance() {
        String width = "50px";
        heightFrom.setWidth(width);
        heightTo.setWidth(width);
        beltFrom.setWidth(width);
        beltTo.setWidth(width);

        super.setStylePrimaryName("selectManyCheckbox");
        super.add(new HTML("Wzrost od&nbsp;"));
        super.add(heightFrom);

        super.setStylePrimaryName("selectManyCheckbox");
        super.add(new HTML("&nbsp;do&nbsp;"));
        super.add(heightTo);

        super.setStylePrimaryName("selectManyCheckbox");
        super.add(new HTML("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Rozmiar od&nbsp;"));
        super.add(beltFrom);

        super.setStylePrimaryName("selectManyCheckbox");
        super.add(new HTML("&nbsp;do&nbsp;"));
        super.add(beltTo);

        setValues(beltFrom, Pas.values());
        setValues(beltTo, Pas.values());
        setValues(heightFrom, Wzrost.values());
        setValues(heightTo, Wzrost.values());

        beltFrom.addChangeHandler(new ChangeHandler() {

            @Override
            public void onChange(ChangeEvent event) {
                setBeltTo(Pas.getNr(beltFrom.getSelected()));
            }
        });
        beltFrom.addKeyPressHandler(new KeyPressHandler() {

            @Override
            public void onKeyPress(KeyPressEvent event) {
                setBeltTo(Pas.getNr(beltFrom.getSelected()));
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
    }

    private void setValues(SelectOne box, Object[] values) {
        box.addItem("");
        for (Object v : values) {
            box.addItem(v.toString());
        }
    }

    public String getRozmiar() {
        String result = "new Rozmiar(";

        String h1 = heightFrom.getSelected() == null ? "" : heightFrom.getSelected();
        String h2 = heightTo.getSelected() == null ? "" : heightTo.getSelected();
        String w1 = beltFrom.getSelected() == null ? "" : beltFrom.getSelected();
        String w2 = beltTo.getSelected() == null ? "" : beltTo.getSelected();
        if (h1.equals(h2) || h2.isEmpty()) {
            result += "Wzrost.cm_" + h1;
        } else {
            result += "Wzrost.cm_" + h1 + ", Wzrost.cm_" + h2;
        }
        if (w1.isEmpty() && w2.isEmpty()) {
            //do nothing
        } else if (w1.equals(w2) || w2.isEmpty()) {
            result += ", Pas." + w1;
        } else {
            result += ", Pas." + w1 + ", Pas." + w2;
        }

        result += ")";
        return result;
    }

    private void setHeightTo(int heightFrom) {
        Wzrost previouslySelected = heightTo.getSelected().isEmpty() ? null : Wzrost.valueOf(Integer.valueOf(heightTo.getSelected()));

        Wzrost[] values = Wzrost.values();
        ArrayList<Wzrost> filteredValues = new ArrayList<Wzrost>();
        for (Wzrost value : values) {
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
        Pas previouslySelected = Pas.valueOf(beltTo.getSelected());

        Pas[] values = Pas.values();
        ArrayList<Pas> filteredValues = new ArrayList<Pas>();
        for (Pas value : values) {
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
}
