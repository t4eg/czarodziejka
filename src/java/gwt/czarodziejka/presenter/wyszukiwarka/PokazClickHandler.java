package gwt.czarodziejka.presenter.wyszukiwarka;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import gwt.czarodziejka.model.wyszukiwarka.WyszukiwarkaModel;
import gwt.czarodziejka.model.wyszukiwarka.costume.Costume;
import gwt.czarodziejka.view.wyszukiwarka.WyszukiwarkaView;
import gwt.czarodziejka.view.wyszukiwarka.photosTable.PhotosTable;
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
