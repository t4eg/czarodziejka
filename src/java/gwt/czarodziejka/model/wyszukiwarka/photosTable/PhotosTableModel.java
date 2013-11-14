package gwt.czarodziejka.model.wyszukiwarka.photosTable;

import com.google.gwt.user.client.ui.Grid;
import gwt.czarodziejka.model.wyszukiwarka.stroj.Strój;
import gwt.czarodziejka.view.wyszukiwarka.WyszukiwarkaView;
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
    private static final int zdjecNaWiersz = 4;
    private static final int zdjecNaStrone = zdjecNaWiersz * 3;
    private ArrayList<List<Strój>> pages;

    public PhotosTableModel(PhotosTable view) {
        this.view = view;
    }

    public void setStrojToTable(ArrayList<Strój> found) {
        splitBetweenPages(found);
        view.createNewPaginator(pages.size());
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

    public void showPage(int number) {
        if (number > pages.size() - 1) {
            return;
        }
        List<Strój> page = pages.get(number);

        Grid tabela = view.getGrid();
        tabela.clear();
        tabela.resize((int) Math.ceil(page.size() / (double) zdjecNaStrone), zdjecNaStrone);

        for (int i = 0; i < page.size(); i++) {
            int col = i % zdjecNaStrone;
            int row = (int) Math.floor(i / (double) zdjecNaStrone);
            tabela.setWidget(row, col, new Frame(page.get(i)));
        }
        view.getPaginator().setShownPage(number);
    }
}
