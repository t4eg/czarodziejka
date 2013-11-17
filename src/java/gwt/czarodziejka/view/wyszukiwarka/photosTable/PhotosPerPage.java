package gwt.czarodziejka.view.wyszukiwarka.photosTable;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import gwt.czarodziejka.model.wyszukiwarka.photosTable.PhotosPerPageModel;
import gwt.czarodziejka.model.wyszukiwarka.photosTable.PhotosTableModel;
import gwt.czarodziejka.presenter.wyszukiwarka.photosTable.PhotosPerPageChangedHandler;
import gwt.czarodziejka.view.wyszukiwarka.components.SelectOne;

/**
 *
 * @author Administrator
 */
public class PhotosPerPage extends HorizontalPanel {

    private SelectOne number = new SelectOne();
    private PhotosPerPageModel model = new PhotosPerPageModel(number);
    private HTML txt = new HTML("Strojów na stronę&nbsp;");

    public PhotosPerPage(PhotosTableModel photosTableModel) {
        PhotosPerPageChangedHandler handler = new PhotosPerPageChangedHandler(photosTableModel);
        number.addChangeHandler(handler);
        number.addKeyPressHandler(handler);
        txt.setStylePrimaryName("clothCountInfo");

        add(txt);
        add(number);
    }

    public SelectOne getNumber() {
        return number;
    }
}
