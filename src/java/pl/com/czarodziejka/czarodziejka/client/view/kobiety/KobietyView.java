package pl.com.czarodziejka.czarodziejka.client.view.kobiety;

import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.model.kobiety.KobietyModel;
import pl.com.czarodziejka.czarodziejka.client.view.CanShow;
import pl.com.czarodziejka.czarodziejka.client.view.wyszukiwarka.photosTable.PhotosTable;

/**
 *
 * @author Administrator
 */
public class KobietyView extends VerticalPanel implements CanShow {

    private KobietyModel model = new KobietyModel(this);
    private PhotosTable photosTable = new PhotosTable(false);
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
