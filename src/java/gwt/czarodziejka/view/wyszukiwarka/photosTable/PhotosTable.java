package gwt.czarodziejka.view.wyszukiwarka.photosTable;

import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.VerticalPanel;
import gwt.czarodziejka.model.wyszukiwarka.photosTable.PhotosTableModel;
import gwt.czarodziejka.view.wyszukiwarka.photosTable.paginator.Paginator;

/**
 *
 * @author Administrator
 */
public class PhotosTable extends VerticalPanel {

    private PhotosTableModel model = new PhotosTableModel(this);
    private Paginator topPaginator, bottomPaginator;
    private Grid grid = new Grid();

    public Paginator getPaginator() {
        return topPaginator;
    }

    public Grid getGrid() {
        return grid;
    }

    public PhotosTableModel getModel() {
        return model;
    }

    public void createView(int size) {
        topPaginator = new Paginator(model, size);
        bottomPaginator = new Paginator(model, size);
        super.clear();
        add(topPaginator);
        add(grid);
        add(bottomPaginator);
    }
}
