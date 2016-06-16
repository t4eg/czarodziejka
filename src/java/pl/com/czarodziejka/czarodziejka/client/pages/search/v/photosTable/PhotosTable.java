package pl.com.czarodziejka.czarodziejka.client.pages.search.v.photosTable;

import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.photosTable.PhotosTableModel;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.photosTable.paginator.Paginator;

/**
 *
 * @author Administrator
 */
public class PhotosTable extends VerticalPanel {

    private PhotosTableModel model;
    private Paginator topPaginator, bottomPaginator;
    private Grid grid = new Grid();
    private PhotosPerPage photosPerPage;

    public PhotosTable(boolean showForWho) {
        model = new PhotosTableModel(this, showForWho);
        photosPerPage = new PhotosPerPage(model);
    }

    public Paginator getTopPaginator() {
        return topPaginator;
    }

    public Paginator getBottomPaginator() {
        return bottomPaginator;
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
        if (pagesCount > 0) {
            add(grid);
        }
        if (pagesCount > 1) {
            bottomPaginator = new Paginator(model, pagesCount);
            add(bottomPaginator);
        }
    }

    public PhotosPerPage getPhotosPerPage() {
        return photosPerPage;
    }
}
