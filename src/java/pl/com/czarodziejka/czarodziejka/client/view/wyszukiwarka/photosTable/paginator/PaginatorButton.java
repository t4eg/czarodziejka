package pl.com.czarodziejka.czarodziejka.client.view.wyszukiwarka.photosTable.paginator;

import com.google.gwt.user.client.ui.Button;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.photosTable.PhotosTableModel;
import pl.com.czarodziejka.czarodziejka.client.presenter.wyszukiwarka.photosTable.paginator.PaginatorButtonClickHandler;

/**
 *
 * @author Administrator
 */
public class PaginatorButton extends Button {

    public PaginatorButton(PhotosTableModel model, int i) {
        super(Integer.toString(i + 1));
        this.addClickHandler(new PaginatorButtonClickHandler(model, i));
        this.setStylePrimaryName("page");
    }
}
