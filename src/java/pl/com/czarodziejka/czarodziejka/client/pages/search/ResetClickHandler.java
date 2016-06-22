package pl.com.czarodziejka.czarodziejka.client.pages.search;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

/**
 *
 * @author Adam Mazur
 */
public class ResetClickHandler implements ClickHandler {

    @Override
    public void onClick(ClickEvent event) {
        SearchModel.getInstance().clearData();
        SearchModel.getInstance().setData();
        SearchView.getInstance().getPhotosTable().clear();
    }
}
