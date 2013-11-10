package gwt.dodaj.view.components;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 *
 * @author Administrator
 */
public class TitleVeritcalPanelError extends VerticalPanel {

    private ErrorImage img = new ErrorImage();

    public TitleVeritcalPanelError(String title, Widget w) {
        HorizontalPanel t = new HorizontalPanel();

        img.setVisible(false);
        t.add(img);
        t.add(new HTML(title + ":"));

        super.add(t);
        super.add(w);
    }

    public void showError(String msg) {
        img.setTitle(msg);
        img.setVisible(true);
    }

    public void hideError() {
        img.setVisible(false);
    }
}
