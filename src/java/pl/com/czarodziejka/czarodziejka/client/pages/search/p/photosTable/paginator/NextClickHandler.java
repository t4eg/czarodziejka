package pl.com.czarodziejka.czarodziejka.client.pages.search.p.photosTable.paginator;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.photosTable.PhotosTableModel;

/**
 *
 * @author Administrator
 */
public class NextClickHandler implements ClickHandler {

    private final PhotosTableModel model;

    public NextClickHandler(PhotosTableModel model) {
        this.model = model;
    }

    @Override
    public void onClick(ClickEvent event) {
//        if (Window.getScrollTop() > 370) {
//            Window.scrollTo(0, 331);
//        }
        model.showNext();
    }
}
