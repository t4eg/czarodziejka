package pl.com.czarodziejka.czarodziejka.client.pages.search.v.components;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 *
 * @author Adam Mazur
 */
public class TitleVeritcalPanel extends VerticalPanel {
    
    public TitleVeritcalPanel(String title, Widget w) {
        super.add(new HTML(title + ":"));
        super.add(w);
    }
}
