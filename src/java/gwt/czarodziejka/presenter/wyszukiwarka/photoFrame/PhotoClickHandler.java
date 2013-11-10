package gwt.czarodziejka.presenter.wyszukiwarka.photoFrame;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import gwt.czarodziejka.model.wyszukiwarka.stroj.Strój;
import gwt.czarodziejka.view.wyszukiwarka.photoFrame.popup.PhotoPopup;

/**
 *
 * @author Administrator
 */
public class PhotoClickHandler implements ClickHandler {

    private final Strój stroj;

    public PhotoClickHandler(Strój strój) {
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