package pl.com.czarodziejka.czarodziejka.client.pages.search.p.photoFrame.popup;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Photo;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.photoFrame.popup.PhotoPopup;

/**
 *
 * @author Adam Mazur
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
