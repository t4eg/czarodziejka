package pl.com.czarodziejka.czarodziejka.client.pages.search.photosTable;

import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.pages.search.photosTable.paginator.PaginatorView;

/**
 *
 * @author Adam Mazur
 */
public class PhotosTableView extends VerticalPanel {

    private final PhotosTableModel model;
    private final Grid grid = new Grid();
    private final PhotosPerPage photosPerPage;
    private PaginatorView topPaginator, bottomPaginator;

    public PhotosTableView(boolean showForWho) {
        model = new PhotosTableModel(this, showForWho);
        photosPerPage = new PhotosPerPage(model);
    }

    public PaginatorView getTopPaginator() {
        return topPaginator;
    }

    public PaginatorView getBottomPaginator() {
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
            topPaginator = new PaginatorView(model, pagesCount);
            add(photosPerPage);
            add(topPaginator);
        }
        if (pagesCount > 0) {
            add(grid);
        }
        if (pagesCount > 1) {
            bottomPaginator = new PaginatorView(model, pagesCount);
            add(bottomPaginator);
        }
    }

    public PhotosPerPage getPhotosPerPage() {
        return photosPerPage;
    }
}
