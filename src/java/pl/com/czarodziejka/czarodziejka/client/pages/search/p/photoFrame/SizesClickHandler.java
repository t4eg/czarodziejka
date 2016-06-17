package pl.com.czarodziejka.czarodziejka.client.pages.search.p.photoFrame;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Costume;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.photoFrame.SizePopup;

/**
 *
 * @author Adam Mazur
 */
public class SizesClickHandler implements ClickHandler {

    private final Costume stroj;
    private SizePopup popup;

    public SizesClickHandler(Costume stroj) {
        this.stroj = stroj;
    }

    @Override
    public void onClick(ClickEvent event) {
        Widget source = (Label) event.getSource();
        int left = source.getAbsoluteLeft();
        int top = source.getAbsoluteTop();

        if (popup == null) {
            popup = new SizePopup(stroj);
            popup.setPopupPosition(left-1, top);
        }
        popup.show();
    }
}
