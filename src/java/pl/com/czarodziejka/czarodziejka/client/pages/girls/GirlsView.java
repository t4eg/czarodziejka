package pl.com.czarodziejka.czarodziejka.client.pages.girls;

import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.components.page.CanShow;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.photosTable.PhotosTable;

/**
 *
 * @author Adam Mazur
 */
public class GirlsView extends VerticalPanel implements CanShow {

    private final GirlsModel model = new GirlsModel(this);
    private final PhotosTable photosTable = new PhotosTable(false);
    private boolean isShown;

    public GirlsView() {
        add(photosTable);
    }

    @Override
    public void onShow() {
        if (!isShown) {
            model.setData();
            isShown = true;
        }
    }

    public PhotosTable getPhotosTable() {
        return photosTable;
    }
}
