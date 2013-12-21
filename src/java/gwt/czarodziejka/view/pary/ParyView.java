package gwt.czarodziejka.view.pary;

import com.google.gwt.user.client.ui.VerticalPanel;
import gwt.czarodziejka.model.pary.ParyModel;
import gwt.czarodziejka.view.CanShow;
import gwt.czarodziejka.view.wyszukiwarka.photosTable.PhotosTable;

/**
 *
 * @author Administrator
 */
public class ParyView extends VerticalPanel implements CanShow {

    private ParyModel model = new ParyModel(this);
    private PhotosTable photosTable = new PhotosTable();
    private boolean isShown;

    public ParyView() {
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
