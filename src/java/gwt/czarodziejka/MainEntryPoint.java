package gwt.czarodziejka;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import gwt.czarodziejka.model.wyszukiwarka.Database;
import gwt.czarodziejka.view.Content;
import gwt.czarodziejka.view.menu.Menu;

/**
 * Main entry point.
 *
 * @author Administrator
 */
public class MainEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {
        RootPanel.get("tresc").add(Content.getInstance());
        RootPanel.get("menu").add(new Menu());
        Database.getInstance(); // wczytaj stroje
    }
}
