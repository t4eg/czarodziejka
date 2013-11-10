package gwt.dodaj;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import gwt.dodaj.view.DodajStrojView;

/**
 * Main entry point.
 *
 * @author Administrator
 */
public class MainEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {
        RootPanel.get().add(new DodajStrojView());
    }
}
