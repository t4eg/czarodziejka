package gwt.dodaj.view.image;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class AddImages extends HorizontalPanel {

    private ArrayList<ImageInstance> list = new ArrayList<ImageInstance>();
    private Button add = new Button("+");
    private Button remove = new Button("-");
    private HorizontalPanel imagesPanel = new HorizontalPanel();
    private VerticalPanel addRemove = new VerticalPanel();

    public AddImages() {
        super.add(imagesPanel);
        super.add(addRemove);
        super.setHeight((int)(114 + 200 * ImageInstance.POWIEKSZENIE) + "px");

        addRemove.setSpacing(10);
        addRemove.add(add);
        addRemove.add(remove);

        reset();

        add.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(ClickEvent event) {
                ImageInstance newImg = new ImageInstance();
                imagesPanel.add(newImg);
                list.add(newImg);
            }
        });
        remove.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(ClickEvent event) {
                if (!list.isEmpty()) {
                    ImageInstance toRemove = list.get(list.size() - 1);
                    imagesPanel.remove(toRemove);
                    list.remove(list.size() - 1);
                }
            }
        });
    }

    public String getPhotoNumbers() {
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            String photoNumber = list.get(i).getPhotoNumber();
            result += photoNumber;
            if (photoNumber != null && !photoNumber.isEmpty() && i < list.size() - 1) {
                result += ", ";
            }
        }
        return result;
    }

    public final void reset() {
        list.clear();
        imagesPanel.clear();
        ImageInstance first = new ImageInstance();
        list.add(first);
        imagesPanel.add(first);
    }

    public boolean validate() {
        boolean result = true;
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).validate()) {
                result = false;
            }
        }
        return result;
    }

    public void clearErrors() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).clearError();
        }
    }
}
