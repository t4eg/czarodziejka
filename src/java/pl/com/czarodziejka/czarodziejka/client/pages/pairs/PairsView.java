package pl.com.czarodziejka.czarodziejka.client.pages.pairs;

import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.components.page.CanShow;
import pl.com.czarodziejka.czarodziejka.client.pages.search.photosTable.PhotosTableView;

/**
 *
 * @author Adam Mazur
 */
public class PairsView extends VerticalPanel implements CanShow {

    private final PairsModel model = new PairsModel(this);
    private final PhotosTableView photosTable = new PhotosTableView(true);
    private boolean isShown;

    public PairsView() {
        add(photosTable);
    }

    @Override
    public void onShow() {
        if (!isShown) {
            model.setData();
            isShown = true;
        }
    }

    public PhotosTableView getPhotosTable() {
        return photosTable;
    }
}
