package pl.com.czarodziejka.czarodziejka.client.pages.search.p;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.SearchModel;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Costume;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.SearchView;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.photosTable.PhotosTable;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class SearchClickHandler implements ClickHandler {

    @Override
    public void onClick(ClickEvent event) {
        ArrayList<Costume> stroje = SearchModel.getInstance().findMachingCostume();
        PhotosTable photosTable = SearchView.getInstance().getPhotosTable();
        photosTable.getModel().setData(stroje);
    }
}
