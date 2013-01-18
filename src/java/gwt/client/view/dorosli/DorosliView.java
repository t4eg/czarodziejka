package gwt.client.view.dorosli;

import com.google.gwt.user.client.ui.Grid;
import gwt.client.model.dorosli.DorosliModel;
import gwt.client.view.CanShow;

/**
 *
 * @author Administrator
 */
public class DorosliView extends Grid implements CanShow {

    private DorosliModel model = new DorosliModel(this);
    private boolean isShown;

    public DorosliView() {
        setStylePrimaryName("dorosli");
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
