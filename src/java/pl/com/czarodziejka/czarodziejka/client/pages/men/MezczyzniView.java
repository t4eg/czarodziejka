package pl.com.czarodziejka.czarodziejka.client.pages.men;

import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.pages.men.MezczyzniModel;
import pl.com.czarodziejka.czarodziejka.client.components.page.CanShow;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.photosTable.PhotosTable;

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
