package gwt.czarodziejka.presenter.wyszukiwarka;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import gwt.czarodziejka.model.wyszukiwarka.WyszukiwarkaModel;

/**
 *
 * @author Administrator
 */
public class SzukajClickHandler implements ClickHandler {

    @Override
    public void onClick(ClickEvent event) {
        WyszukiwarkaModel.getInstance().findMachingRecords();
        WyszukiwarkaModel.getInstance().setFoundRecordsToTable();
    }
}
