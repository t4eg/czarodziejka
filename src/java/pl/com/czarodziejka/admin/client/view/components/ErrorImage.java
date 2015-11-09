package pl.com.czarodziejka.admin.client.view.components;

import com.google.gwt.user.client.ui.Image;

/**
 *
 * @author Administrator
 */
public class ErrorImage extends Image {

    public ErrorImage() {
        super("../img/error_icon.png");
        super.setStylePrimaryName("error_icon");
        super.setSize("24px", "20px");
    }
}
