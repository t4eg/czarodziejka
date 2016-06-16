package pl.com.czarodziejka.czarodziejka.client.pages.boys;

import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.pages.boys.ChlopcyModel;
import pl.com.czarodziejka.czarodziejka.client.components.page.CanShow;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.photosTable.PhotosTable;

/**
 *
 * @author Administrator
 */
public class ChlopcyView extends VerticalPanel implements CanShow {

    private ChlopcyModel model = new ChlopcyModel(this);
    private PhotosTable photosTable = new PhotosTable(false);
    private boolean isShown;

    public ChlopcyView() {
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
