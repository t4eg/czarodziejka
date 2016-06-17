package pl.com.czarodziejka.czarodziejka.client.pages.search.p;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.SearchModel;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.SearchView;

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
