package pl.com.czarodziejka.czarodziejka.client.pages.search.p;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.WyszukiwarkaModel;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Costume;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.WyszukiwarkaView;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.photosTable.PhotosTable;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class PokazClickHandler implements ClickHandler {

    @Override
    public void onClick(ClickEvent event) {
        ArrayList<Costume> stroje = WyszukiwarkaModel.getInstance().findMachingStroj();
        PhotosTable photosTable = WyszukiwarkaView.getInstance().getPhotosTable();
        photosTable.getModel().setStrojToTable(stroje);
    }
}
