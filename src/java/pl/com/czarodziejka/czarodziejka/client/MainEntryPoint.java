package pl.com.czarodziejka.czarodziejka.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.Database;
import pl.com.czarodziejka.czarodziejka.client.view.Content;
import pl.com.czarodziejka.czarodziejka.client.view.menu.Menu;

/**
 * Main entry point.
 *
 * @author Administrator
 */
public class MainEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {
        RootPanel contentPanel = RootPanel.get("content");
        if (contentPanel != null) {
            contentPanel.add(Content.getInstance());
        }
        RootPanel menuPanel = RootPanel.get("menu");
        if (menuPanel != null) {
            menuPanel.add(new Menu());
        }
        Database.getInstance(); // wczytaj stroje
    }
}
