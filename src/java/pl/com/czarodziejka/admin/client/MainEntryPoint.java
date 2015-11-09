package pl.com.czarodziejka.admin.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextArea;
import pl.com.czarodziejka.admin.client.view.DodajStrojView;

/**
 * Main entry point.
 *
 * @author Administrator
 */
public class MainEntryPoint implements EntryPoint {

    private static TextArea javaCode = new TextArea();

    @Override
    public void onModuleLoad() {
        RootPanel.get().add(new DodajStrojView());
        RootPanel.get().add(new HTML("<hr width=\"100%\"/>"));
        RootPanel.get().add(javaCode);

        javaCode.setWidth("100%");
        javaCode.setHeight("400px");
    }

    public static TextArea getJavaCode() {
        return javaCode;
    }
}
