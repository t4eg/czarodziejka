package gwt.czarodziejka.presenter.wyszukiwarka.photosTable.paginator;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
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
        if (Window.getScrollTop() > 370) {
            Window.scrollTo(0, 331);
        }
        model.showPage(pageNumber);
    }
}
