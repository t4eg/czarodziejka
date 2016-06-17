package pl.com.czarodziejka.czarodziejka.client.pages.men;

import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.components.page.CanShow;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.photosTable.PhotosTable;

/**
 *
 * @author Adam Mazur
 */
public class MenView extends VerticalPanel implements CanShow {

    private final MenModel model = new MenModel(this);
    private final PhotosTable photosTable = new PhotosTable(false);
    private boolean isShown;

    public MenView() {
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
