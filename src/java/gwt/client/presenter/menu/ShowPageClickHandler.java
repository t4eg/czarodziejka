package gwt.client.presenter.menu;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import gwt.client.view.Content;
import gwt.client.view.Page;

/**
 *
 * @author Administrator
 */
public class ShowPageClickHandler implements ClickHandler {

    private final Page page;

    public ShowPageClickHandler(Page page) {
        this.page = page;
    }

    @Override
    public void onClick(ClickEvent ce) {
        Content.getInstance().show(page);
    }
}
