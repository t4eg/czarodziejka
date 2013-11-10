package gwt.czarodziejka.view.dzieci;

import com.google.gwt.user.client.ui.Grid;
import gwt.czarodziejka.model.dzieci.DzieciModel;
import gwt.czarodziejka.view.CanShow;

/**
 *
 * @author Administrator
 */
public class DzieciView extends Grid implements CanShow {

    private DzieciModel model = new DzieciModel(this);
    private boolean isShown;

    public DzieciView() {
        setStylePrimaryName("dzieci");
    }

    @Override
    public void onShow() {
        if (!isShown) {
            model.findMachingRecords();
            model.addRecordsToLayout();
            isShown = true;
        }
    }
}
