package gwt.dodaj.view.image;

import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.TextBox;
import gwt.czarodziejka.presenter.wyszukiwarka.NumberChangedHandler;

/**
 *
 * @author Administrator
 */
public class ImageInstance extends VerticalPanel {

    private Image image = new Image("http://czarodziejka.com.pl/img/noPhotoMan.png");
    private TextBox photoNumber = new TextBox();

    public ImageInstance() {
        setSpacing(5);
        add(photoNumber);
        add(image);

        double powieksz = 1.1;
        image.setWidth((int) (133 * powieksz) + "px");
        image.setHeight((int) (200 * powieksz) + "px");

        photoNumber.setWidth((int) (133 * powieksz + 1) + "px");
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
}
