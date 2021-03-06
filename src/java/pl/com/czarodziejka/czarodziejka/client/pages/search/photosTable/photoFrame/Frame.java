package pl.com.czarodziejka.czarodziejka.client.pages.search.photosTable.photoFrame;

import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Costume;

/**
 *
 * @author Adam Mazur
 */
public class Frame extends DecoratorPanel {

    private final VerticalPanel layout = new VerticalPanel();
    private final Label sizes = new Label("zobacz rozmiary");

    public Frame(Costume costume, boolean showForWho) {
        setWidget(layout);
        super.setStylePrimaryName("photoFrame");

        Label name = new Label(costume.getName());
        name.setStylePrimaryName("photoName");

        Label number = new Label(Integer.toString(costume.getNumber()));
        if (costume.isLongName()) {
            number.setStylePrimaryName("photoNumberLower");
        } else {
            number.setStylePrimaryName("photoNumber");
        }

        layout.add(name);
        layout.add(number);
        layout.add(new Photo(costume));
        if (showForWho && costume.getSex() != null && costume.getAge() != null) {
            layout.add(new ForWho(costume));
        }
        layout.add(sizes);
        sizes.setStylePrimaryName("frameRozmiary");
        sizes.addClickHandler(new SizesClickHandler(costume));
    }

    public Label getSizes() {
        return sizes;
    }
}
