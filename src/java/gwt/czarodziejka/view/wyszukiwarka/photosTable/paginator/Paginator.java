package gwt.czarodziejka.view.wyszukiwarka.photosTable.paginator;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import gwt.czarodziejka.model.wyszukiwarka.photosTable.PhotosTableModel;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Paginator extends HorizontalPanel {

    private ArrayList<Button> buttons;

    public Paginator(PhotosTableModel model, int pagesCount) {
        buttons = new ArrayList<Button>();
        for (int i = 0; i < pagesCount; i++) {
            buttons.add(new PaginatorButton(model, i));
        }
    }

    public void setShownPage(int number) {
        super.clear();
        for (Button b : buttons) {
            super.add(b);
        }
    }
}
