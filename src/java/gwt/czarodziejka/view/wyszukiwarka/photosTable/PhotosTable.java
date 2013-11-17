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
    private PhotosPerPage photosPerPage = new PhotosPerPage(model);

    public Paginator getPaginator() {
        return topPaginator;
    }

    public Grid getGrid() {
        return grid;
    }

    public PhotosTableModel getModel() {
        return model;
    }

    public void createView(int pagesCount) {
        super.clear();
        topPaginator = null;
        bottomPaginator = null;
        if (pagesCount > 1) {
            topPaginator = new Paginator(model, pagesCount);
            add(photosPerPage);
            add(topPaginator);
        }
        add(grid);
        if (pagesCount > 1) {
            bottomPaginator = new Paginator(model, pagesCount);
            add(bottomPaginator);
        }
    }

    public PhotosPerPage getPhotosPerPage() {
        return photosPerPage;
    }
}
