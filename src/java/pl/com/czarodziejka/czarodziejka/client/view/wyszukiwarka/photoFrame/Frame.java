package pl.com.czarodziejka.czarodziejka.client.view.wyszukiwarka.photoFrame;

import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Costume;
import pl.com.czarodziejka.czarodziejka.client.presenter.wyszukiwarka.photoFrame.RozmiaryClickHandler;

/**
 *
 * @author Administrator
 */
public class Frame extends DecoratorPanel {

    private VerticalPanel layout = new VerticalPanel();
    private Label rozmiary = new Label("zobacz rozmiary");

    public Frame(Costume stroj, boolean showForWho) {
        setWidget(layout);
        super.setStylePrimaryName("photoFrame");

        Label name = new Label(stroj.getNazwa());
        name.setStylePrimaryName("photoName");

        Label number = new Label(Integer.toString(stroj.getNumer()));
        if (stroj.isDlugaNazwa()) {
            number.setStylePrimaryName("photoNumberLower");
        } else {
            number.setStylePrimaryName("photoNumber");
        }

        layout.add(name);
        layout.add(number);
        layout.add(new Photo(stroj));
        if (showForWho && stroj.getPłeć() != null && stroj.getWiek() != null) {
            layout.add(new ForWho(stroj));
        }
        layout.add(rozmiary);
        rozmiary.setStylePrimaryName("frameRozmiary");
        rozmiary.addClickHandler(new RozmiaryClickHandler(stroj));
    }

    public Label getRozmiary() {
        return rozmiary;
    }
}
