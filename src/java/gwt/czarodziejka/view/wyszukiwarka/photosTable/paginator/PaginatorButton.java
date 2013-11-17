package gwt.czarodziejka.view.wyszukiwarka.photosTable.paginator;

import com.google.gwt.user.client.ui.Button;
import gwt.czarodziejka.model.wyszukiwarka.photosTable.PhotosTableModel;
import gwt.czarodziejka.presenter.wyszukiwarka.photosTable.paginator.PaginatorButtonClickHandler;

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
