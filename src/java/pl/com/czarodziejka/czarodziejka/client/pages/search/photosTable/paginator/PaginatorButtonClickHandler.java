package pl.com.czarodziejka.czarodziejka.client.pages.search.photosTable.paginator;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import pl.com.czarodziejka.czarodziejka.client.pages.search.photosTable.PhotosTableModel;

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
        model.showPage(pageNumber);
    }
}
