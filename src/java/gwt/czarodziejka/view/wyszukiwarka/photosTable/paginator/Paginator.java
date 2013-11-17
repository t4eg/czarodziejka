package gwt.czarodziejka.view.wyszukiwarka.photosTable.paginator;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import gwt.czarodziejka.model.wyszukiwarka.photosTable.PhotosTableModel;
import gwt.czarodziejka.presenter.wyszukiwarka.photosTable.paginator.NextClickHandler;
import gwt.czarodziejka.presenter.wyszukiwarka.photosTable.paginator.PaginatorPresenter;
import gwt.czarodziejka.presenter.wyszukiwarka.photosTable.paginator.PreviousClickHandler;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Paginator extends FlowPanel {

    private ArrayList<PaginatorButton> buttons;
    private PaginatorPresenter presenter = new PaginatorPresenter(this);
    private Button poprzednia = new Button("poprzednia");
    private Button nastepna = new Button("następna");

    public Paginator(PhotosTableModel model, int pagesCount) {
        super.setWidth("647px");
        super.setStylePrimaryName("paginator");

        poprzednia.addClickHandler(new PreviousClickHandler(model));
        nastepna.addClickHandler(new NextClickHandler(model));

        poprzednia.setStylePrimaryName("big");
        nastepna.setStylePrimaryName("big");

        buttons = new ArrayList<PaginatorButton>();
        for (int i = 0; i < pagesCount; i++) {
            buttons.add(new PaginatorButton(model, i));
        }
    }

    public void setShownPage(int number) {
        super.clear();
        super.add(poprzednia);
        for (Button b : buttons) {
            super.add(b);
        }
        super.add(nastepna);
    }

    public PaginatorPresenter getPresenter() {
        return presenter;
    }

    public ArrayList<PaginatorButton> getButtons() {
        return buttons;
    }

    public Button getPoprzednia() {
        return poprzednia;
    }

    public Button getNastepna() {
        return nastepna;
    }
}
