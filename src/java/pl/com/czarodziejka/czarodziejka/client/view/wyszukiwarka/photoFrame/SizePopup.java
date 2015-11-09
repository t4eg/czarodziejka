package pl.com.czarodziejka.czarodziejka.client.view.wyszukiwarka.photoFrame;

import com.google.gwt.user.client.ui.DecoratedPopupPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Belt;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Size;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Costume;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Age;

/**
 *
 * @author Administrator
 */
public class SizePopup extends DecoratedPopupPanel {

    public SizePopup(Costume stroj) {
        super(true);
        setWidth("220px");

        VerticalPanel panel = new VerticalPanel();
        panel.add(getGrid(stroj.getRozmiar(), stroj.getWiek() != Age.DZIECKO));

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
            if (size.getWzrostDo() == size.getWzrostOd()) {
                heightTxt = Integer.toString(size.getWzrostOd());
            } else {
                heightTxt = size.getWzrostOd() + " - " + size.getWzrostDo();
            }
            result.setWidget(i + 1, 0, new HTML(heightTxt));

            if (isAdult) {
                String beltTxt;
                if (size.getPasOd() == size.getPasDo()) {
                    beltTxt = Belt.getString(size.getPasOd());
                } else {
                    beltTxt = Belt.getString(size.getPasOd()) + " - " + Belt.getString(size.getPasDo());
                }
                result.setWidget(i + 1, 1, new HTML(beltTxt));
            }
        }

        return result;
    }
}
