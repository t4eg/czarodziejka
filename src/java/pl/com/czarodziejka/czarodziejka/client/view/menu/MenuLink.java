package pl.com.czarodziejka.czarodziejka.client.view.menu;

import com.google.gwt.user.client.ui.HTML;
import pl.com.czarodziejka.czarodziejka.client.presenter.menu.ShowPageClickHandler;
import pl.com.czarodziejka.czarodziejka.client.view.Page;

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
