package pl.com.czarodziejka.czarodziejka.client.view.chlopcy;

import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.model.chlopcy.ChlopcyModel;
import pl.com.czarodziejka.czarodziejka.client.view.CanShow;
import pl.com.czarodziejka.czarodziejka.client.view.wyszukiwarka.photosTable.PhotosTable;

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
