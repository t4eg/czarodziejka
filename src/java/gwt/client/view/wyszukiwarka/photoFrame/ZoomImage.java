package gwt.client.view.wyszukiwarka.photoFrame;

import com.google.gwt.user.client.ui.Image;
import gwt.client.model.wyszukiwarka.stroj.Strój;
import gwt.client.presenter.wyszukiwarka.photoFrame.RozmiaryClickHandler;

/**
 *
 * @author Administrator
 */
public class ZoomImage extends Image {

    private final Strój stroj;

    public ZoomImage(Strój stroj) {
        super("img/question.png");
        setStylePrimaryName("photoSizeZoom");
        setTitle("zobacz wszystkie rozmiary");
        this.stroj = stroj;
        this.addClickHandler(new RozmiaryClickHandler(stroj));
    }

    public Strój getStroj() {
        return stroj;
    }
}
