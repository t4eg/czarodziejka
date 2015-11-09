package pl.com.czarodziejka.czarodziejka.client.view.wyszukiwarka.components;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 *
 * @author Administrator
 */
public class TitleVeritcalPanel extends VerticalPanel {
    
    public TitleVeritcalPanel(String title, Widget w) {
        super.add(new HTML(title + ":"));
        super.add(w);
    }
}
