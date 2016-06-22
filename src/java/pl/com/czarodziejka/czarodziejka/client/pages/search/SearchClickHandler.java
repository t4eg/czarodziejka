package pl.com.czarodziejka.czarodziejka.client.pages.search;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Costume;
import pl.com.czarodziejka.czarodziejka.client.pages.search.photosTable.PhotosTableView;
import java.util.ArrayList;

/**
 *
 * @author Adam Mazur
 */
public class SearchClickHandler implements ClickHandler {

    @Override
    public void onClick(ClickEvent event) {
        ArrayList<Costume> stroje = SearchModel.getInstance().findMachingCostume();
        PhotosTableView photosTable = SearchView.getInstance().getPhotosTable();
        photosTable.getModel().setData(stroje);
    }
}
