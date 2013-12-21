package gwt.czarodziejka.view.menu;

import com.google.gwt.user.client.ui.HTML;
import gwt.czarodziejka.presenter.menu.ShowPageClickHandler;
import gwt.czarodziejka.view.Page;

/**
 *
 * @author Administrator
 */
public class MenuLink extends HTML {

    public MenuLink(String txt, final Page page) {
        super(txt);
        this.setStylePrimaryName("napisMenu");
        super.addClickHandler(new ShowPageClickHandler(page));
    }
}
