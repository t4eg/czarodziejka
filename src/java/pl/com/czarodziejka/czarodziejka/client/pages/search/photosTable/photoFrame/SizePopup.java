package pl.com.czarodziejka.czarodziejka.client.pages.search.photosTable.photoFrame;

import com.google.gwt.user.client.ui.DecoratedPopupPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Belt;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Size;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Costume;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Age;

/**
 *
 * @author Adam Mazur
 */
public class SizePopup extends DecoratedPopupPanel {

    public SizePopup(Costume costume) {
        super(true);
        setWidth("220px");

        VerticalPanel panel = new VerticalPanel();
        panel.add(getGrid(costume.getSizes(), costume.getAge() != Age.CHILD));

        add(panel);
    }

    private Grid getGrid(Size[] sizes, boolean isAdult) {
        Grid result = new Grid(sizes.length + 1, 2);
        result.setWidget(0, 1, new HTML("Rozmiar"));
        result.setWidget(0, 0, new HTML("Wzrost [cm]"));
        result.setStylePrimaryName("sizeGrid");
        for (int i = 0; i < sizes.length; i++) {
            Size size = sizes[i];

            String heightTxt;
            if (size.getSizeTo() == size.getSizeFrom()) {
                heightTxt = Integer.toString(size.getSizeFrom());
            } else {
                heightTxt = size.getSizeFrom() + " - " + size.getSizeTo();
            }
            result.setWidget(i + 1, 0, new HTML(heightTxt));

            if (isAdult) {
                String beltTxt;
                if (size.getBeltFrom() == size.getBeltTo()) {
                    beltTxt = Belt.getString(size.getBeltFrom());
                } else {
                    beltTxt = Belt.getString(size.getBeltFrom()) + " - " + Belt.getString(size.getBeltTo());
                }
                result.setWidget(i + 1, 1, new HTML(beltTxt));
            }
        }

        return result;
    }
}
