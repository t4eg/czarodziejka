package pl.com.czarodziejka.czarodziejka.client.pages.search.p.photosTable.paginator;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.photosTable.PhotosTableModel;

/**
 *
 * @author Adam Mazur
 */
public class PaginatorButtonClickHandler implements ClickHandler {

    private final PhotosTableModel model;
    private final int pageNumber;

    public PaginatorButtonClickHandler(PhotosTableModel model, int pageNumber) {
        this.model = model;
        this.pageNumber = pageNumber;
    }

    @Override
    public void onClick(ClickEvent event) {
//        if (Window.getScrollTop() > 370) {
//            Window.scrollTo(0, 331);
//        }
        model.showPage(pageNumber);
    }
}
