package gwt.client.presenter.wyszukiwarka.photoFrame.popup;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import gwt.client.model.wyszukiwarka.stroj.Zdjęcie;
import gwt.client.view.wyszukiwarka.photoFrame.popup.PhotoPopup;

/**
 *
 * @author Administrator
 */
public class PhotoNumberLinkClickHandler implements ClickHandler {

    private final PhotoPopup parent;
    private final Zdjęcie photo;

    public PhotoNumberLinkClickHandler(PhotoPopup parent, Zdjęcie photo) {
        this.parent = parent;
        this.photo = photo;
    }

    @Override
    public void onClick(ClickEvent ce) {
        parent.updatePopup(photo);
    }
}
