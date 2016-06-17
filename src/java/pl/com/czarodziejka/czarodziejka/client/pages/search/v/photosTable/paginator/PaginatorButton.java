package pl.com.czarodziejka.czarodziejka.client.pages.search.v.photosTable.paginator;

import com.google.gwt.user.client.ui.Button;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.photosTable.PhotosTableModel;
import pl.com.czarodziejka.czarodziejka.client.pages.search.p.photosTable.paginator.PaginatorButtonClickHandler;

/**
 *
 * @author Adam Mazur
 */
public class PaginatorButton extends Button {

    public PaginatorButton(PhotosTableModel model, int i) {
        super(Integer.toString(i + 1));
        this.addClickHandler(new PaginatorButtonClickHandler(model, i));
        this.setStylePrimaryName("page");
    }
}
