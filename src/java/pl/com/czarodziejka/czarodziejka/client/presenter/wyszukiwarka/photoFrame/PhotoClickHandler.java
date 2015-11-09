package pl.com.czarodziejka.czarodziejka.client.presenter.wyszukiwarka.photoFrame;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Costume;
import pl.com.czarodziejka.czarodziejka.client.view.wyszukiwarka.photoFrame.popup.PhotoPopup;

/**
 *
 * @author Administrator
 */
public class PhotoClickHandler implements ClickHandler {

    private final Costume stroj;

    public PhotoClickHandler(Costume strój) {
        this.stroj = strój;
    }

    @Override
    public void onClick(ClickEvent event) {
        PhotoPopup box = new PhotoPopup(stroj);
        box.show();
    }

    private void openNewWindow(String url) {
        Window.open(url, "_blank", null);
    }
}
