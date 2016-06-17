package pl.com.czarodziejka.czarodziejka.client.pages.search.v.photosTable;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.photosTable.PhotosPerPageModel;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.photosTable.PhotosTableModel;
import pl.com.czarodziejka.czarodziejka.client.pages.search.p.photosTable.PhotosPerPageChangedHandler;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.components.SelectOne;

/**
 *
 * @author Adam Mazur
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
