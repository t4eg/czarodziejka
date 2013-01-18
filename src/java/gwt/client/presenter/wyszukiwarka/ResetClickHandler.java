package gwt.client.presenter.wyszukiwarka;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import gwt.client.model.wyszukiwarka.WyszukiwarkaModel;
import gwt.client.view.wyszukiwarka.WyszukiwarkaView;

/**
 *
 * @author Administrator
 */
public class ResetClickHandler implements ClickHandler {

    @Override
    public void onClick(ClickEvent event) {
        WyszukiwarkaModel.getInstance().clearData();
        WyszukiwarkaModel.getInstance().setData();
        WyszukiwarkaView.getInstance().getResultTable().clear();
    }
}
