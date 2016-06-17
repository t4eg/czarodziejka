package pl.com.czarodziejka.czarodziejka.client.pages.boys;

import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.components.page.CanShow;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.photosTable.PhotosTable;

/**
 *
 * @author Adam Mazur
 */
public class BoysView extends VerticalPanel implements CanShow {

    private final BoysModel model = new BoysModel(this);
    private final PhotosTable photosTable = new PhotosTable(false);
    private boolean isShown;

    public BoysView() {
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
