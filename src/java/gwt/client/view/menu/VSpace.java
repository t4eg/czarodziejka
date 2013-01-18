package gwt.client.view.menu;

import com.google.gwt.user.client.ui.HTML;

/**
 *
 * @author Administrator
 */
public class VSpace extends HTML {

    public VSpace(int height) {
        super("&nbsp;");
        super.setHeight(height + "px");
    }
}
