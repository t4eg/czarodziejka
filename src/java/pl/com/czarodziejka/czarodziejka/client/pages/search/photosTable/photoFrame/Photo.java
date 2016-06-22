package pl.com.czarodziejka.czarodziejka.client.pages.search.photosTable.photoFrame;

import com.google.gwt.user.client.ui.Image;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Sex;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Costume;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Age;

/**
 *
 * @author Adam Mazur
 */
class Photo extends Image {

    public Photo(Costume costume) {
        super.setStylePrimaryName("photoPhoto");
        super.setUrl(getPhotoUrl(costume));
        super.setPixelSize(133, 200);
        super.setAltText(costume.getName());
        addClickHandler(new PhotoClickHandler(costume));
    }

    private String getPhotoUrl(Costume costume) {
        pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Photo[] photos = costume.getPhotos();
        if (photos == null || photos.length == 0) {
            if (costume.getSex() == Sex.FEMALE && costume.getAge() == Age.ADULT) {
                return "img/noPhotoWoman.png";
            } else if (costume.getSex() == Sex.FEMALE && costume.getAge() == Age.CHILD) {
                return "img/noPhotoGirl.png";
            } else if (costume.getSex() == Sex.MALE && costume.getAge() == Age.ADULT) {
                return "img/noPhotoMan.png";
            } else if (costume.getSex() == Sex.MALE && costume.getAge() == Age.CHILD) {
                return "img/noPhotoBoy.png";
            } else if (costume.getSex() == Sex.FEMALE) {
                return "img/noPhotoWoman.png";
            } else { // męski
                return "img/noPhotoMan.png";
            }
        } else {
            return "zdjecia/" + photos[0].getNumber() + "_small.jpg";
        }
    }
}
