package gwt.czarodziejka.presenter.wyszukiwarka;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import gwt.czarodziejka.model.wyszukiwarka.WyszukiwarkaModel;
import gwt.czarodziejka.view.wyszukiwarka.WyszukiwarkaView;

/**
 *
 * @author Administrator
 */
public class ResetClickHandler implements ClickHandler {

    @Override
    public void onClick(ClickEvent event) {
        WyszukiwarkaModel.getInstance().clearData();
        WyszukiwarkaModel.getInstance().setData();
        WyszukiwarkaView.getInstance().getPhotosTable().getGrid().clear();
    }
}
