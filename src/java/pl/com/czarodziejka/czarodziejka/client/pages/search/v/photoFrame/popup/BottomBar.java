package pl.com.czarodziejka.czarodziejka.client.pages.search.v.photoFrame.popup;

import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Photo;
import pl.com.czarodziejka.czarodziejka.client.pages.search.p.photoFrame.popup.PhotoNumberLinkClickHandler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public class BottomBar extends HorizontalPanel {

    private Map<Photo, Label> buttons = new HashMap<Photo, Label>();
    private HorizontalPanel content = new HorizontalPanel();

    BottomBar(PhotoPopup parent, Photo[] photos) {
        setWidth("100%");
        setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
        add(content);

        for (int i = 0; i < photos.length; i++) {
            Label label = new Label();
            label.setText(Integer.toString(i + 1));
            label.setStylePrimaryName("bottomImgLink");
            label.addClickHandler(new PhotoNumberLinkClickHandler(parent, photos[i]));

            buttons.put(photos[i], label);
            content.add(label);
        }
    }

    public void setCurrentlyDisplayedImage(Photo photo) {
        Iterator<Photo> it = buttons.keySet().iterator();
        while (it.hasNext()) {
            Photo loopPhoto = it.next();
            if (loopPhoto == photo) {
                buttons.get(photo).setStylePrimaryName("bottomImgLinkDisabled");
            } else {
                buttons.get(loopPhoto).setStylePrimaryName("bottomImgLink");
            }
        }
    }
}
