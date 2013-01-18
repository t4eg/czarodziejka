package gwt.client.view.wyszukiwarka.photoFrame;

import com.google.gwt.user.client.ui.*;
import gwt.client.model.wyszukiwarka.stroj.Pas;
import gwt.client.model.wyszukiwarka.stroj.Rozmiar;
import gwt.client.model.wyszukiwarka.stroj.Strój;
import gwt.client.model.wyszukiwarka.stroj.Wiek;

/**
 *
 * @author Administrator
 */
public class SizePopup extends DecoratedPopupPanel {

    public SizePopup(Strój stroj) {
        super(true);
        setWidth("220px");

        VerticalPanel panel = new VerticalPanel();
        panel.add(new Label("Posiadamy następujące rozmiary:"));
        panel.add(getGrid(stroj.getRozmiar(), stroj.getWiek() != Wiek.DZIECKO));

        add(panel);
    }

    private Grid getGrid(Rozmiar[] sizes, boolean isAdult) {
        Grid result = new Grid(sizes.length + 1, 2);
        result.setWidget(0, 1, new HTML("Rozmiar"));
        result.setWidget(0, 0, new HTML("Wzrost [cm]"));
        result.setStylePrimaryName("sizeGrid");
        for (int i = 0; i < sizes.length; i++) {
            Rozmiar size = sizes[i];

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
                    beltTxt = Pas.getString(size.getPasOd());
                } else {
                    beltTxt = Pas.getString(size.getPasOd()) + " - " + Pas.getString(size.getPasDo());
                }
                result.setWidget(i + 1, 1, new HTML(beltTxt));
            }
        }

        return result;
    }
}
