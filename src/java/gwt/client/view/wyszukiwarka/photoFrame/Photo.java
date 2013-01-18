package gwt.client.view.wyszukiwarka.photoFrame;

import com.google.gwt.user.client.ui.Image;
import gwt.client.model.wyszukiwarka.stroj.Płeć;
import gwt.client.model.wyszukiwarka.stroj.Strój;
import gwt.client.model.wyszukiwarka.stroj.Wiek;
import gwt.client.model.wyszukiwarka.stroj.Zdjęcie;
import gwt.client.presenter.wyszukiwarka.photoFrame.PhotoClickHandler;

/**
 *
 * @author Administrator
 */
class Photo extends Image {

    public Photo(Strój strój) {
        super.setStylePrimaryName("photoPhoto");
        super.setUrl(getPhotoUrl(strój));
        super.setPixelSize(133, 200);
        super.setAltText(strój.getNazwa());
        addClickHandler(new PhotoClickHandler(strój));
    }

    private String getPhotoUrl(Strój strój) {
        Zdjęcie[] zdjecia = strój.getZdjęcie();
        if (zdjecia == null || zdjecia.length == 0) {
            if (strój.getPłeć() == Płeć.DAMSKI && strój.getWiek() == Wiek.DOROSŁY) {
                return "img/noPhotoWoman.png";
            } else if (strój.getPłeć() == Płeć.DAMSKI && strój.getWiek() == Wiek.DZIECKO) {
                return "img/noPhotoGirl.png";
            } else if (strój.getPłeć() == Płeć.MĘSKI && strój.getWiek() == Wiek.DOROSŁY) {
                return "img/noPhotoMan.png";
            } else if (strój.getPłeć() == Płeć.MĘSKI && strój.getWiek() == Wiek.DZIECKO) {
                return "img/noPhotoBoy.png";
            } else if (strój.getPłeć() == Płeć.DAMSKI) {
                return "img/noPhotoWoman.png";
            } else { // męski
                return "img/noPhotoMan.png";
            }
        } else {
            return "zdjecia/" + zdjecia[0].getNumber() + "_small.jpg";
        }
    }
}
