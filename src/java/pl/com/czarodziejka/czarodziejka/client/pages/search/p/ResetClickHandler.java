package pl.com.czarodziejka.czarodziejka.client.pages.search.p;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.WyszukiwarkaModel;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.WyszukiwarkaView;

/**
 *
 * @author Administrator
 */
public class ResetClickHandler implements ClickHandler {

    @Override
    public void onClick(ClickEvent event) {
        WyszukiwarkaModel.getInstance().clearData();
        WyszukiwarkaModel.getInstance().setData();
        WyszukiwarkaView.getInstance().getPhotosTable().clear();
    }
}
