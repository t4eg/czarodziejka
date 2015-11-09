package pl.com.czarodziejka.czarodziejka.client.presenter.wyszukiwarka.photosTable.paginator;

import pl.com.czarodziejka.czarodziejka.client.view.wyszukiwarka.photosTable.paginator.Paginator;
import pl.com.czarodziejka.czarodziejka.client.view.wyszukiwarka.photosTable.paginator.PaginatorButton;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class PaginatorPresenter {

    private final Paginator view;

    public PaginatorPresenter(Paginator view) {
        this.view = view;
    }

    public void refreshComponents(int shownPage, int lastPage) {
        if (shownPage == 0) {
            view.getPoprzednia().setEnabled(false);
        } else {
            view.getPoprzednia().setEnabled(true);
        }
        if (shownPage == lastPage) {
            view.getNastepna().setEnabled(false);
        } else {
            view.getNastepna().setEnabled(true);
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
