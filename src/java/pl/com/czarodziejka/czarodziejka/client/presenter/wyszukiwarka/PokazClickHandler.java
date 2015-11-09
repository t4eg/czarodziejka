package pl.com.czarodziejka.czarodziejka.client.presenter.wyszukiwarka;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.WyszukiwarkaModel;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Costume;
import pl.com.czarodziejka.czarodziejka.client.view.wyszukiwarka.WyszukiwarkaView;
import pl.com.czarodziejka.czarodziejka.client.view.wyszukiwarka.photosTable.PhotosTable;
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
