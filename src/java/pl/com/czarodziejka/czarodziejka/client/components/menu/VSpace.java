package pl.com.czarodziejka.czarodziejka.client.components.menu;

import com.google.gwt.user.client.ui.HTML;

/**
 *
 * @author Adam Mazur
 */
public class VSpace extends HTML {

    public VSpace(int height) {
        super("&nbsp;");
        super.setHeight(height + "px");
    }
}
