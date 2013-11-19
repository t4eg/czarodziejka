package gwt.czarodziejka.view.dorosli;

import com.google.gwt.user.client.ui.VerticalPanel;
import gwt.czarodziejka.model.dorosli.DorosliModel;
import gwt.czarodziejka.view.CanShow;
import gwt.czarodziejka.view.wyszukiwarka.photosTable.PhotosTable;

/**
 *
 * @author Administrator
 */
public class DorosliView extends VerticalPanel implements CanShow {

    private DorosliModel model = new DorosliModel(this);
    private PhotosTable photosTable = new PhotosTable();
    private boolean isShown;

    public DorosliView() {
        setStylePrimaryName("dorosli");
        add(photosTable);
    }

    @Override
    public void onShow() {
        if (!isShown) {
            model.findMachingRecords();
            isShown = true;
        }
    }

    public PhotosTable getPhotosTable() {
        return photosTable;
    }
}
