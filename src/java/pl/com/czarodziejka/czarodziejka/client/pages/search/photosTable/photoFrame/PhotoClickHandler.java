package pl.com.czarodziejka.czarodziejka.client.pages.search.photosTable.photoFrame;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Costume;
import pl.com.czarodziejka.czarodziejka.client.pages.search.photosTable.photoFrame.popup.PhotoPopup;

/**
 *
 * @author Adam Mazur
 */
public class PhotoClickHandler implements ClickHandler {

    private final Costume costume;

    public PhotoClickHandler(Costume costume) {
        this.costume = costume;
    }

    @Override
    public void onClick(ClickEvent event) {
        PhotoPopup box = new PhotoPopup(costume);
        box.show();
    }

    private void openNewWindow(String url) {
        Window.open(url, "_blank", null);
    }
}
