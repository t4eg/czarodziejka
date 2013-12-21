package gwt.czarodziejka.view.dziewczynki;

import com.google.gwt.user.client.ui.VerticalPanel;
import gwt.czarodziejka.model.dziewczynki.DziewczynkiModel;
import gwt.czarodziejka.view.CanShow;
import gwt.czarodziejka.view.wyszukiwarka.photosTable.PhotosTable;

/**
 *
 * @author Administrator
 */
public class DziewczynkiView extends VerticalPanel implements CanShow {

    private DziewczynkiModel model = new DziewczynkiModel(this);
    private PhotosTable photosTable = new PhotosTable(false);
    private boolean isShown;

    public DziewczynkiView() {
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
