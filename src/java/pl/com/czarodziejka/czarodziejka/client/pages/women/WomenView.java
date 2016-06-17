package pl.com.czarodziejka.czarodziejka.client.pages.women;

import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.components.page.CanShow;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.photosTable.PhotosTable;

/**
 *
 * @author Administrator
 */
public class WomenView extends VerticalPanel implements CanShow {

    private final WomenModel model = new WomenModel(this);
    private final PhotosTable photosTable = new PhotosTable(false);
    private boolean isShown;

    public WomenView() {
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
