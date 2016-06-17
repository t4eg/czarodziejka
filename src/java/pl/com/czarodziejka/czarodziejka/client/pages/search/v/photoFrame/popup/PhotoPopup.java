package pl.com.czarodziejka.czarodziejka.client.pages.search.v.photoFrame.popup;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Costume;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Photo;

/**
 *
 * @author Adam Mazur
 */
public class PhotoPopup extends DecoratedPopupPanel {

    private final TitleBar titleBar;
    private final Image bigPhoto;
    private BottomBar bottomBar;

    public PhotoPopup(Costume costume) {
        setStyleName("center", true);
        VerticalPanel content = new VerticalPanel();
        titleBar = new TitleBar(costume.getName(), this);
        content.add(titleBar);

        bigPhoto = new Image();
        bigPhoto.setTitle("kliknij aby zamknąć");
        bigPhoto.setStylePrimaryName("popupImg");
        bigPhoto.addClickHandler(new ClickHandler() {

            @Override
            public void onClick(ClickEvent event) {
                hide();
                clear();
            }
        });
        content.add(bigPhoto);

        if (costume.getPhotos().length > 1) {
            bottomBar = new BottomBar(this, costume.getPhotos());
            content.add(bottomBar);
        }

        this.setGlassEnabled(true);
        this.setAnimationEnabled(true);
        this.setWidget(content);
        
        updatePopup(costume.getPhotos()[0]);
    }

    public final void updatePopup(Photo photo) {
        if (bottomBar != null) {
            bottomBar.setCurrentlyDisplayedImage(photo);
        }
        int finalHeight, finalWidth;
        double maxHeight = (Window.getClientHeight() - 35) * 0.9;
        double maxWidth = (Window.getClientWidth() - 35) * 0.9;
        int imgWidth;
        int imgHeight;
        if (photo.isHorizontal()) {
            imgWidth = 900;
            imgHeight = 600;
        } else {
            imgWidth = 600;
            imgHeight = 900;
        }
        if (maxHeight / imgHeight * imgWidth < maxWidth) { //rozszerz do pionu
            finalHeight = (int) maxHeight;
            finalWidth = (int) (maxHeight / imgHeight * imgWidth);
        } else {
            finalHeight = (int) (maxWidth / imgWidth * imgHeight);
            finalWidth = (int) maxWidth;
        }
        if (finalHeight > imgHeight) {
            finalHeight = imgHeight;
            finalWidth = imgWidth;
        }
        bigPhoto.setSize(finalWidth + "px", finalHeight + "px");

        String imageUrl = "zdjecia/" + photo.getNumber() + ".jpg";
        bigPhoto.setUrl(imageUrl);
        this.center();
    }
}
