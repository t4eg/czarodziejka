package pl.com.czarodziejka.czarodziejka.client.pages.search.v.photoFrame;

import com.google.gwt.user.client.ui.Image;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Sex;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Costume;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Age;
import pl.com.czarodziejka.czarodziejka.client.pages.search.p.photoFrame.PhotoClickHandler;

/**
 *
 * @author Administrator
 */
class Photo extends Image {

    public Photo(Costume strój) {
        super.setStylePrimaryName("photoPhoto");
        super.setUrl(getPhotoUrl(strój));
        super.setPixelSize(133, 200);
        super.setAltText(strój.getNazwa());
        addClickHandler(new PhotoClickHandler(strój));
    }

    private String getPhotoUrl(Costume strój) {
        pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Photo[] zdjecia = strój.getZdjęcie();
        if (zdjecia == null || zdjecia.length == 0) {
            if (strój.getPłeć() == Sex.DAMSKI && strój.getWiek() == Age.DOROSŁY) {
                return "img/noPhotoWoman.png";
            } else if (strój.getPłeć() == Sex.DAMSKI && strój.getWiek() == Age.DZIECKO) {
                return "img/noPhotoGirl.png";
            } else if (strój.getPłeć() == Sex.MĘSKI && strój.getWiek() == Age.DOROSŁY) {
                return "img/noPhotoMan.png";
            } else if (strój.getPłeć() == Sex.MĘSKI && strój.getWiek() == Age.DZIECKO) {
                return "img/noPhotoBoy.png";
            } else if (strój.getPłeć() == Sex.DAMSKI) {
                return "img/noPhotoWoman.png";
            } else { // męski
                return "img/noPhotoMan.png";
            }
        } else {
            return "zdjecia/" + zdjecia[0].getNumber() + "_small.jpg";
        }
    }
}
