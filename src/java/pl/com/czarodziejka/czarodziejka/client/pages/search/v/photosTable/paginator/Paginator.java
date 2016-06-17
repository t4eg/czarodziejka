package pl.com.czarodziejka.czarodziejka.client.pages.search.v.photosTable.paginator;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.photosTable.PhotosTableModel;
import pl.com.czarodziejka.czarodziejka.client.pages.search.p.photosTable.paginator.NextClickHandler;
import pl.com.czarodziejka.czarodziejka.client.pages.search.p.photosTable.paginator.PaginatorPresenter;
import pl.com.czarodziejka.czarodziejka.client.pages.search.p.photosTable.paginator.PreviousClickHandler;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Paginator extends FlowPanel {

    private ArrayList<PaginatorButton> buttons;
    private PaginatorPresenter presenter = new PaginatorPresenter(this);
    private Button previous = new Button("poprzednia");
    private Button next = new Button("następna");

    public Paginator(PhotosTableModel model, int pagesCount) {
        super.setWidth("647px");
        super.setStylePrimaryName("paginator");

        previous.addClickHandler(new PreviousClickHandler(model));
        next.addClickHandler(new NextClickHandler(model));

        previous.setStylePrimaryName("big");
        next.setStylePrimaryName("big");

        buttons = new ArrayList<PaginatorButton>();
        for (int i = 0; i < pagesCount; i++) {
            buttons.add(new PaginatorButton(model, i));
        }
    }

    public void setShownPage(int number) {
        super.clear();
        super.add(previous);
        for (Button b : buttons) {
            super.add(b);
        }
        super.add(next);
    }

    public PaginatorPresenter getPresenter() {
        return presenter;
    }

    public ArrayList<PaginatorButton> getButtons() {
        return buttons;
    }

    public Button getPrevious() {
        return previous;
    }

    public Button getNext() {
        return next;
    }
}
