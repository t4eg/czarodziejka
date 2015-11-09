package pl.com.czarodziejka.czarodziejka.client.view.wyszukiwarka.photosTable;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.photosTable.PhotosPerPageModel;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.photosTable.PhotosTableModel;
import pl.com.czarodziejka.czarodziejka.client.presenter.wyszukiwarka.photosTable.PhotosPerPageChangedHandler;
import pl.com.czarodziejka.czarodziejka.client.view.wyszukiwarka.components.SelectOne;

/**
 *
 * @author Administrator
 */
public class PhotosPerPage extends HorizontalPanel {

    private SelectOne number = new SelectOne();
    private PhotosPerPageModel model = new PhotosPerPageModel(number);
    private HTML txt = new HTML("Wyników na stronę&nbsp;");

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
