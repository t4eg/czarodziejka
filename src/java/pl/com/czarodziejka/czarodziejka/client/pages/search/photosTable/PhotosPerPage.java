package pl.com.czarodziejka.czarodziejka.client.pages.search.photosTable;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import pl.com.czarodziejka.czarodziejka.client.components.form.SelectOne;

/**
 *
 * @author Adam Mazur
 */
public class PhotosPerPage extends HorizontalPanel {

    private final SelectOne number = new SelectOne();
    private final PhotosPerPageModel model = new PhotosPerPageModel(number);
    private final HTML txt = new HTML("Wyników na stronę&nbsp;");

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
