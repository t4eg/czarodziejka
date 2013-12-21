package gwt.czarodziejka.view.kobiety;

import com.google.gwt.user.client.ui.VerticalPanel;
import gwt.czarodziejka.model.kobiety.KobietyModel;
import gwt.czarodziejka.view.CanShow;
import gwt.czarodziejka.view.wyszukiwarka.photosTable.PhotosTable;

/**
 *
 * @author Administrator
 */
public class KobietyView extends VerticalPanel implements CanShow {

    private KobietyModel model = new KobietyModel(this);
    private PhotosTable photosTable = new PhotosTable();
    private boolean isShown;

    public KobietyView() {
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
