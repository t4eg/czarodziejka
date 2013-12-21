package gwt.czarodziejka.view.mezczyzni;

import com.google.gwt.user.client.ui.VerticalPanel;
import gwt.czarodziejka.model.mezczyzni.MezczyzniModel;
import gwt.czarodziejka.view.CanShow;
import gwt.czarodziejka.view.wyszukiwarka.photosTable.PhotosTable;

/**
 *
 * @author Administrator
 */
public class MezczyzniView extends VerticalPanel implements CanShow {

    private MezczyzniModel model = new MezczyzniModel(this);
    private PhotosTable photosTable = new PhotosTable(false);
    private boolean isShown;

    public MezczyzniView() {
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
