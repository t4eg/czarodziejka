package gwt.czarodziejka.view.wyszukiwarka.photoFrame.popup;

import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import gwt.czarodziejka.model.wyszukiwarka.stroj.Zdjęcie;
import gwt.czarodziejka.presenter.wyszukiwarka.photoFrame.popup.PhotoNumberLinkClickHandler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public class BottomBar extends HorizontalPanel {

    private Map<Zdjęcie, Label> buttons = new HashMap<Zdjęcie, Label>();
    private HorizontalPanel content = new HorizontalPanel();

    BottomBar(PhotoPopup parent, Zdjęcie[] photos) {
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

    public void setCurrentlyDisplayedImage(Zdjęcie photo) {
        Iterator<Zdjęcie> it = buttons.keySet().iterator();
        while (it.hasNext()) {
            Zdjęcie loopPhoto = it.next();
            if (loopPhoto == photo) {
                buttons.get(photo).setStylePrimaryName("bottomImgLinkDisabled");
            } else {
                buttons.get(loopPhoto).setStylePrimaryName("bottomImgLink");
            }
        }
    }
}
