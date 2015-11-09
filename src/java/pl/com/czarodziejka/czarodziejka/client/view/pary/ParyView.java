package pl.com.czarodziejka.czarodziejka.client.view.pary;

import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.model.pary.ParyModel;
import pl.com.czarodziejka.czarodziejka.client.view.CanShow;
import pl.com.czarodziejka.czarodziejka.client.view.wyszukiwarka.photosTable.PhotosTable;

/**
 *
 * @author Administrator
 */
public class ParyView extends VerticalPanel implements CanShow {

    private ParyModel model = new ParyModel(this);
    private PhotosTable photosTable = new PhotosTable(true);
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
