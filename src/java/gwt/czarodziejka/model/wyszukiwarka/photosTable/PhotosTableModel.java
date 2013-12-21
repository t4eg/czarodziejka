package gwt.czarodziejka.model.wyszukiwarka.photosTable;

import com.google.gwt.user.client.ui.Grid;
import gwt.czarodziejka.model.wyszukiwarka.stroj.Strój;
import gwt.czarodziejka.view.wyszukiwarka.photoFrame.Frame;
import gwt.czarodziejka.view.wyszukiwarka.photosTable.PhotosTable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class PhotosTableModel {

    private final PhotosTable view;
    private final int zdjecNaWiersz = 4;
    private int zdjecNaStrone;
    private ArrayList<List<Strój>> pages;
    private ArrayList<Strój> found;
    private int pageCurrentlyShown;
    private final boolean showForWho;

    public PhotosTableModel(PhotosTable view, boolean showForWho) {
        this.view = view;
        this.showForWho = showForWho;
    }

    public void setStrojToTable(ArrayList<Strój> found) {
        this.found = found;
        refreshPages();
    }

    public void refreshPages() {
        zdjecNaStrone = Integer.parseInt(view.getPhotosPerPage().getNumber().getSelected());
        splitBetweenPages(found);
        view.createView(pages.size());
        showPage(0);
    }

    private void splitBetweenPages(ArrayList<Strój> found) {
        int pagesNumber = (int) Math.ceil(found.size() / (double) zdjecNaStrone);
        pages = new ArrayList<List<Strój>>(pagesNumber);
        for (int i = 0; i < pagesNumber; i++) {
            int from = i * zdjecNaStrone;
            int to = (i + 1) * zdjecNaStrone;
            if (to > found.size()) {
                to = found.size();
            }
            List<Strój> page = found.subList(from, to);
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
        List<Strój> page = pages.get(number);

        Grid tabela = view.getGrid();
        tabela.clear();
        tabela.resize((int) Math.ceil(page.size() / (double) zdjecNaWiersz), zdjecNaWiersz);

        for (int i = 0; i < page.size(); i++) {
            int col = i % zdjecNaWiersz;
            int row = (int) Math.floor(i / (double) zdjecNaWiersz);
            tabela.setWidget(row, col, new Frame(page.get(i), showForWho));
        }
        this.pageCurrentlyShown = number;
        view.getTopPaginator().setShownPage(number);
        view.getTopPaginator().getPresenter().refreshComponents(number, pages.size() - 1);
        view.getBottomPaginator().setShownPage(number);
        view.getBottomPaginator().getPresenter().refreshComponents(number, pages.size() - 1);
    }
}
