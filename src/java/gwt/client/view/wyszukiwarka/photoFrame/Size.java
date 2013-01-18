package gwt.client.view.wyszukiwarka.photoFrame;

import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import gwt.client.model.wyszukiwarka.stroj.Pas;
import gwt.client.model.wyszukiwarka.stroj.Rozmiar;
import gwt.client.model.wyszukiwarka.stroj.Strój;
import gwt.client.model.wyszukiwarka.stroj.Wzrost;

/**
 *
 * @author Administrator
 */
class Size extends HorizontalPanel {

    private int maxBelt = Pas.XS.getNr();
    private int minBelt = Pas.XXL.getNr();
    private int maxHeight = Wzrost.getMin().getHeight();
    private int minHeight = Wzrost.getMax().getHeight();

    public Size(Strój stroj) {
        super.setStylePrimaryName("photoSize");

        super.add(getLeft(stroj));
        super.add(new ZoomImage(stroj));
    }

    private VerticalPanel getLeft(Strój stroj) {
        Rozmiar[] size = stroj.getRozmiar();
        for (Rozmiar r : size) {
            if (r.getPasOd() < minBelt) {
                minBelt = r.getPasOd();
            }
            if (r.getPasDo() > maxBelt) {
                maxBelt = r.getPasDo();
            }
            if (r.getWzrostOd() < minHeight) {
                minHeight = r.getWzrostOd();
            }
            if (r.getWzrostDo() > maxHeight) {
                maxHeight = r.getWzrostDo();
            }
        }
        String beltTxt;
        if (minBelt == maxBelt) {
            beltTxt = Pas.getString(minBelt);
        } else {
            beltTxt = Pas.getString(minBelt) + "-" + Pas.getString(maxBelt);
        }
        String heightTxt;
        if (minHeight == maxHeight) {
            heightTxt = Integer.toString(minHeight);
        } else {
            heightTxt = minHeight + "-" + maxHeight;
        }

        Image heightImg = new Image("img/height.png");
        heightImg.setTitle("wzrost");
        HorizontalPanel row1 = new HorizontalPanel();
        row1.setStylePrimaryName("photoSizeHeight");
        row1.add(heightImg);
        row1.add(new Label(heightTxt + " cm"));

        Image beltImg = new Image("img/belt.png");
        beltImg.setTitle("rozmiar");
        HorizontalPanel row2 = new HorizontalPanel();
        row2.setStylePrimaryName("photoSizeBelt");
        row2.add(beltImg);
        row2.add(new Label(beltTxt));

        VerticalPanel result = new VerticalPanel();
        result.add(row1);
        result.add(row2);
        return result;
    }
}
