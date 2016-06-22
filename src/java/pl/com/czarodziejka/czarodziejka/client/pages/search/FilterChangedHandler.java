package pl.com.czarodziejka.czarodziejka.client.pages.search;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.SuggestOracle;

/**
 *
 * @author Adam Mazur
 */
public class FilterChangedHandler implements KeyPressHandler, ChangeHandler, ValueChangeHandler, SelectionHandler<SuggestOracle.Suggestion> {

    private static final int SCHEDULE_DELAY = 25;
    private final Timer timer = new Timer() {

        private boolean isActive = false;

        @Override
        public void run() {
            refreshRecordsCount();
            SearchPresenter.getInstance().refreshComponents();
            isActive = false;
        }

        private void refreshRecordsCount() {
            int recordsCount = SearchModel.getInstance().findMachingCostume().size();
            SearchView.getInstance().setRecordsCount(recordsCount);
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
