package pl.com.czarodziejka.czarodziejka.client.pages.search.p.photosTable.paginator;

import pl.com.czarodziejka.czarodziejka.client.pages.search.v.photosTable.paginator.Paginator;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.photosTable.paginator.PaginatorButton;
import java.util.ArrayList;

/**
 *
 * @author Adam Mazur
 */
public class PaginatorPresenter {

    private final Paginator view;

    public PaginatorPresenter(Paginator view) {
        this.view = view;
    }

    public void refreshComponents(int shownPage, int lastPage) {
        if (shownPage == 0) {
            view.getPrevious().setEnabled(false);
        } else {
            view.getPrevious().setEnabled(true);
        }
        if (shownPage == lastPage) {
            view.getNext().setEnabled(false);
        } else {
            view.getNext().setEnabled(true);
        }
        ArrayList<PaginatorButton> buttons = view.getButtons();
        for (int i = 0; i < buttons.size(); i++) {
            PaginatorButton b = buttons.get(i);
            if (shownPage == i) {
                b.setEnabled(false);
            } else {
                b.setEnabled(true);
            }
        }
    }
}
