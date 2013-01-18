package gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import gwt.client.model.wyszukiwarka.WyszukiwarkaModel;
import gwt.client.presenter.wyszukiwarka.WyszukiwarkaPresenter;
import gwt.client.view.Content;
import gwt.client.view.menu.Menu;

/**
 * Main entry point.
 *
 * @author Administrator
 */
public class MainEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {
        WyszukiwarkaPresenter.getInstance();
        WyszukiwarkaModel.getInstance().setData();

        RootPanel.get("tresc").add(Content.getInstance());
        RootPanel.get("menu").add(new Menu());
    }
}
