package gwt.czarodziejka.presenter.wyszukiwarka.photosTable.paginator;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import gwt.czarodziejka.model.wyszukiwarka.photosTable.PhotosTableModel;

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
        model.showNext();
    }
}
