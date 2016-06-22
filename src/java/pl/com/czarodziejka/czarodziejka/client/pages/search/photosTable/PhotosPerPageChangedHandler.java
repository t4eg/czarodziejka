package pl.com.czarodziejka.czarodziejka.client.pages.search.photosTable;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;

/**
 *
 * @author Adam Mazur
 */
public class PhotosPerPageChangedHandler implements KeyPressHandler, ChangeHandler {

    private final PhotosTableModel model;

    public PhotosPerPageChangedHandler(PhotosTableModel model) {
        this.model = model;
    }

    @Override
    public void onKeyPress(KeyPressEvent event) {
        model.refreshPages();
    }

    @Override
    public void onChange(ChangeEvent event) {
        model.refreshPages();
    }
}
