package pl.com.czarodziejka.czarodziejka.client.pages.girls;

import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.components.page.CanShow;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.photosTable.PhotosTable;

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
