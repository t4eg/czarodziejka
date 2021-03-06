package pl.com.czarodziejka.czarodziejka.client.pages.search.photosTable.paginator;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import pl.com.czarodziejka.czarodziejka.client.pages.search.photosTable.PhotosTableModel;

/**
 *
 * @author Adam Mazur
 */
public class PreviousClickHandler implements ClickHandler {

    private final PhotosTableModel model;

    public PreviousClickHandler(PhotosTableModel model) {
        this.model = model;
    }

    @Override
    public void onClick(ClickEvent event) {
        model.showPrevious();
    }
}
