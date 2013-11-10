package gwt.czarodziejka.view.wyszukiwarka.components;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 *
 * @author Administrator
 */
public class TitleHorizontalPanel extends HorizontalPanel {
    
    public TitleHorizontalPanel(String title, Widget w) {
        super.add(new HTML(title + ":"));
        super.add(w);
    }
}
