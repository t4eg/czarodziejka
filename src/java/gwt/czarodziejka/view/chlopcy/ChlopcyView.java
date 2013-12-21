package gwt.czarodziejka.view.chlopcy;

import com.google.gwt.user.client.ui.VerticalPanel;
import gwt.czarodziejka.model.chlopcy.ChlopcyModel;
import gwt.czarodziejka.view.CanShow;
import gwt.czarodziejka.view.wyszukiwarka.photosTable.PhotosTable;

/**
 *
 * @author Administrator
 */
public class ChlopcyView extends VerticalPanel implements CanShow {

    private ChlopcyModel model = new ChlopcyModel(this);
    private PhotosTable photosTable = new PhotosTable();
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
