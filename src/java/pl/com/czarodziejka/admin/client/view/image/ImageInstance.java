package pl.com.czarodziejka.admin.client.view.image;

import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.presenter.wyszukiwarka.NumberChangedHandler;
import pl.com.czarodziejka.admin.client.view.components.ErrorImage;

/**
 *
 * @author Administrator
 */
public class ImageInstance extends VerticalPanel {

    private Image image = new Image("http://czarodziejka.com.pl/img/noPhotoMan.png");
    private TextBox photoNumber = new TextBox();
    private ErrorImage img = new ErrorImage();
    public static final double POWIEKSZENIE = 1.6;

    public ImageInstance() {
        HorizontalPanel err = new HorizontalPanel();
        img.setVisible(false);
        img.setTitle("Wpisz numer zdjęcia.");
        err.add(img);
        err.add(photoNumber);

        setSpacing(5);
        add(err);
        add(image);

        image.setWidth((int) (133 * POWIEKSZENIE) + "px");
        image.setHeight((int) (200 * POWIEKSZENIE) + "px");

        photoNumber.setWidth((int) (133 * POWIEKSZENIE + 1) + "px");
        photoNumber.addKeyPressHandler(new NumberChangedHandler());
        photoNumber.addKeyUpHandler(new KeyUpHandler() {

            @Override
            public void onKeyUp(KeyUpEvent event) {
                String value = photoNumber.getValue();
                if (value == null || value.isEmpty()) {
                    image.setUrl("http://czarodziejka.com.pl/img/noPhotoMan.png");
                } else {
                    image.setUrl("http://czarodziejka.com.pl/zdjecia/" + value.trim() + ".jpg");
                }
            }
        });
    }

    public String getPhotoNumber() {
        return photoNumber.getValue();
    }

    public boolean validate() {
        String value = photoNumber.getValue();
        if (value == null || value.isEmpty()) {
            photoNumber.setWidth((int) (133 * POWIEKSZENIE + 1 - 26) + "px");
            img.setVisible(true);
            return false;
        } else {
            photoNumber.setWidth((int) (133 * POWIEKSZENIE + 1) + "px");
            img.setVisible(false);
            return true;
        }
    }

    void clearError() {
        img.setVisible(false);
    }
}
