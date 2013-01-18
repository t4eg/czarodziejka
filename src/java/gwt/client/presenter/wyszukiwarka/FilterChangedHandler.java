package gwt.client.presenter.wyszukiwarka;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.*;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.SuggestOracle;
import gwt.client.model.wyszukiwarka.WyszukiwarkaModel;
import gwt.client.view.wyszukiwarka.WyszukiwarkaView;

/**
 *
 * @author Administrator
 */
public class FilterChangedHandler implements KeyPressHandler, ChangeHandler, ValueChangeHandler, SelectionHandler<SuggestOracle.Suggestion> {

    private static final int SCHEDULE_DELAY = 25;
    private Timer timer = new Timer() {

        private boolean isActive = false;

        @Override
        public void run() {
            refreshRecordsCount();
            WyszukiwarkaPresenter.getInstance().refreshComponents();
            isActive = false;
        }

        private void refreshRecordsCount() {
            int recordsCount = WyszukiwarkaModel.getInstance().findMachingRecords().size();
            WyszukiwarkaView.getInstance().setRecordsCount(recordsCount);
            GWT.log("uruchamiam wyszukowanie: " + System.currentTimeMillis(), null);
        }

        @Override
        public void schedule(int delayMillis) {
            if (!isActive) {
                isActive = true;
                super.schedule(delayMillis);
            }
        }
    };

    public void invoke() {
        timer.schedule(SCHEDULE_DELAY);
    }

    @Override
    public void onKeyPress(KeyPressEvent event) {
        timer.schedule(SCHEDULE_DELAY);
    }

    @Override
    public void onChange(ChangeEvent event) {
        timer.schedule(SCHEDULE_DELAY);
    }

    @Override
    public void onValueChange(ValueChangeEvent event) {
        timer.schedule(SCHEDULE_DELAY);
    }

    @Override
    public void onSelection(SelectionEvent<SuggestOracle.Suggestion> event) {
        timer.schedule(SCHEDULE_DELAY);
    }
}
