package gwt.czarodziejka.presenter.wyszukiwarka.photoFrame.popup;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import gwt.czarodziejka.model.wyszukiwarka.costume.Photo;
import gwt.czarodziejka.view.wyszukiwarka.photoFrame.popup.PhotoPopup;

/**
 *
 * @author Administrator
 */
public class PhotoNumberLinkClickHandler implements ClickHandler {

    private final PhotoPopup parent;
    private final Photo photo;

    public PhotoNumberLinkClickHandler(PhotoPopup parent, Photo photo) {
        this.parent = parent;
        this.photo = photo;
    }

    @Override
    public void onClick(ClickEvent ce) {
        parent.updatePopup(photo);
    }
}
