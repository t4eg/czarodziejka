package gwt.czarodziejka.presenter.wyszukiwarka;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import gwt.czarodziejka.model.wyszukiwarka.WyszukiwarkaModel;
import gwt.czarodziejka.model.wyszukiwarka.stroj.Strój;
import gwt.czarodziejka.view.wyszukiwarka.WyszukiwarkaView;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class PokazClickHandler implements ClickHandler {
    
    @Override
    public void onClick(ClickEvent event) {
        ArrayList<Strój> stroje = WyszukiwarkaModel.getInstance().findMachingStroj();
        WyszukiwarkaView.getInstance().getPhotosTable().getModel().setStrojToTable(stroje);
    }
}
