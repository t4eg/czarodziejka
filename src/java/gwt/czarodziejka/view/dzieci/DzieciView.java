package gwt.czarodziejka.view.dzieci;

import com.google.gwt.user.client.ui.VerticalPanel;
import gwt.czarodziejka.model.dzieci.DzieciModel;
import gwt.czarodziejka.view.CanShow;
import gwt.czarodziejka.view.wyszukiwarka.photosTable.PhotosTable;

/**
 *
 * @author Administrator
 */
public class DzieciView extends VerticalPanel implements CanShow {

    private DzieciModel model = new DzieciModel(this);
    private PhotosTable photosTable = new PhotosTable();
    private boolean isShown;

    public DzieciView() {
        setStylePrimaryName("dzieci");
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
