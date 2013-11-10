package gwt.dodaj.view.dodajStroj.rozmiar;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
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

    public AddRozmiary() {
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
                RozmiarInstance rozm = new RozmiarInstance();
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
            result += "\t\t" + list.get(i).getRozmiar();
            if (i < list.size() - 1) {
                result += ",\n";
            }
        }
        return result;
    }

    public final void reset() {
        list.clear();
        rozmiaryPanel.clear();
        RozmiarInstance first = new RozmiarInstance();
        list.add(first);
        rozmiaryPanel.add(first);
    }
}
