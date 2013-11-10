package gwt.dodaj.view.rozmiar;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import gwt.dodaj.view.DodajStrojView;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class AddRozmiary extends VerticalPanel {

    private ArrayList<RozmiarInstance> list = new ArrayList<RozmiarInstance>();
    private Button add = new Button("+");
    private Button remove = new Button("-");
    private VerticalPanel rozmiaryPanel = new VerticalPanel();
    private HorizontalPanel addRemove = new HorizontalPanel();
    private final DodajStrojView view;

    public AddRozmiary(DodajStrojView viewS) {
        this.view = viewS;
        super.setSpacing(2);
        super.add(rozmiaryPanel);
        super.add(addRemove);

        addRemove.setSpacing(10);
        addRemove.add(add);
        addRemove.add(remove);

        reset();

        add.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(ClickEvent event) {
                RozmiarInstance rozm = new RozmiarInstance(view);
                rozmiaryPanel.add(rozm);
                list.add(rozm);
            }
        });
        remove.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(ClickEvent event) {
                if (!list.isEmpty()) {
                    RozmiarInstance toRemove = list.get(list.size() - 1);
                    rozmiaryPanel.remove(toRemove);
                    list.remove(list.size() - 1);
                }
            }
        });
    }

    public String getRozmiary() {
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            String rozm = list.get(i).getRozmiar();
            result += "\t\t" + rozm;
            if (!rozm.isEmpty() && i < list.size() - 1) {
                result += ",\n";
            }
        }
        return result;
    }

    public final void reset() {
        list.clear();
        rozmiaryPanel.clear();
        RozmiarInstance first = new RozmiarInstance(view);
        list.add(first);
        rozmiaryPanel.add(first);
    }

    public boolean validate() {
        boolean result = true;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).validate()) {
                result = false;
            }
        }
        return result;
    }

    public void clearErrors() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).clearError();
        }
    }
}
