package gwt.czarodziejka.presenter.wyszukiwarka.photoFrame;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import gwt.czarodziejka.model.wyszukiwarka.stroj.Strój;
import gwt.czarodziejka.view.wyszukiwarka.photoFrame.SizePopup;

/**
 *
 * @author Administrator
 */
public class RozmiaryClickHandler implements ClickHandler {

    private final Strój stroj;
    private SizePopup popup;

    public RozmiaryClickHandler(Strój stroj) {
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