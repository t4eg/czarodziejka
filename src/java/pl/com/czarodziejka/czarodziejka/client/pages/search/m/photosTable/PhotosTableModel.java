package pl.com.czarodziejka.czarodziejka.client.pages.search.m.photosTable;

import com.google.gwt.user.client.ui.Grid;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Costume;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.photoFrame.Frame;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.photosTable.PhotosTable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adam Mazur
 */
public class PhotosTableModel {

    private final PhotosTable view;
    private final int photosPerRow = 4;
    private int photosPerPage;
    private ArrayList<List<Costume>> pages;
    private ArrayList<Costume> found;
    private int pageCurrentlyShown;
    private final boolean showForWho;

    public PhotosTableModel(PhotosTable view, boolean showForWho) {
        this.view = view;
        this.showForWho = showForWho;
    }

    public void setData(ArrayList<Costume> found) {
        this.found = found;
        refreshPages();
    }

    public void refreshPages() {
        photosPerPage = Integer.parseInt(view.getPhotosPerPage().getNumber().getSelected());
        splitBetweenPages(found);
        view.createView(pages.size());
        showPage(0);
    }

    private void splitBetweenPages(ArrayList<Costume> found) {
        int pagesNumber = (int) Math.ceil(found.size() / (double) photosPerPage);
        pages = new ArrayList<List<Costume>>(pagesNumber);
        for (int i = 0; i < pagesNumber; i++) {
            int from = i * photosPerPage;
            int to = (i + 1) * photosPerPage;
            if (to > found.size()) {
                to = found.size();
            }
            List<Costume> page = found.subList(from, to);
            pages.add(page);
        }
    }

    public void showNext() {
        showPage(pageCurrentlyShown + 1);
    }

    public void showPrevious() {
        showPage(pageCurrentlyShown - 1);
    }

    public void showPage(int number) {
        if (number < 0 || number > pages.size() - 1) {
            return;
        }
        List<Costume> page = pages.get(number);

        Grid table = view.getGrid();
        table.clear();
        table.resize((int) Math.ceil(page.size() / (double) photosPerRow), photosPerRow);

        for (int i = 0; i < page.size(); i++) {
            int col = i % photosPerRow;
            int row = (int) Math.floor(i / (double) photosPerRow);
            table.setWidget(row, col, new Frame(page.get(i), showForWho));
        }
        this.pageCurrentlyShown = number;
        view.getTopPaginator().setShownPage(number);
        view.getTopPaginator().getPresenter().refreshComponents(number, pages.size() - 1);
        view.getBottomPaginator().setShownPage(number);
        view.getBottomPaginator().getPresenter().refreshComponents(number, pages.size() - 1);
    }
}
