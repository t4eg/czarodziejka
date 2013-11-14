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
    private Paginator paginator;
    private Grid grid = new Grid();

    public PhotosTable() {
        add(paginator);
        add(grid);
//        add(paginator);
    }

    public Paginator getPaginator() {
        return paginator;
    }

    public Grid getGrid() {
        return grid;
    }

    public PhotosTableModel getModel() {
        return model;
    }

    public void createNewPaginator(int size) {
        paginator = new Paginator(model, size);
    }
}
