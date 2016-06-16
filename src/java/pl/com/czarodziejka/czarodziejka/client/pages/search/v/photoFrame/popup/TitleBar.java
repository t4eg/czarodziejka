package pl.com.czarodziejka.czarodziejka.client.pages.search.v.photoFrame.popup;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.DecoratedPopupPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;

/**
 *
 * @author Administrator
 */
public class TitleBar extends HorizontalPanel {

    public TitleBar(String title, DecoratedPopupPanel toClose) {
        setStylePrimaryName("popupNamePanel");

        Label label = new Label(title);
        label.setStylePrimaryName("popupName");

        add(label);
        add(getCloseImage(toClose));
    }

    private Image getCloseImage(final DecoratedPopupPanel box) {
        Image img = new Image();
        img.setUrl("img/close.png");
        img.setTitle("kliknij aby zamknąć");
        img.setStylePrimaryName("popupClose");
        img.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(ClickEvent event) {
                box.hide();
                box.clear();
            }
        });
        return img;
    }
}
