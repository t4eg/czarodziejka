package gwt.client.view.menu;

import com.google.gwt.user.client.ui.Image;
import gwt.client.presenter.menu.ShowPageClickHandler;
import gwt.client.view.Page;

/**
 *
 * @author Administrator
 */
public class ImageButton extends Image {

    public ImageButton(String alt, final Page page) {
        super.setAltText(alt);
        super.setUrl("img/dot.png");
        super.addClickHandler(new ShowPageClickHandler(page));
    }
}
