package pl.com.czarodziejka.czarodziejka.client.pages.search.photosTable.paginator;

import java.util.ArrayList;

/**
 *
 * @author Adam Mazur
 */
public class PaginatorPresenter {

    private final PaginatorView view;

    public PaginatorPresenter(PaginatorView view) {
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
