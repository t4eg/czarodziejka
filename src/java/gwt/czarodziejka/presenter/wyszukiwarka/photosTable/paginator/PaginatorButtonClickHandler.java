package gwt.czarodziejka.presenter.wyszukiwarka.photosTable.paginator;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import gwt.czarodziejka.model.wyszukiwarka.photosTable.PhotosTableModel;

/**
 *
 * @author Administrator
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
