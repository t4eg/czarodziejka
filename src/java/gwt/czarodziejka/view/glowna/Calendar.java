package gwt.czarodziejka.view.glowna;

import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import gwt.czarodziejka.model.glowna.CalendarModel;

/**
 *
 * @author Administrator
 */
public class Calendar extends Grid {

    public Calendar() {
        setWidth("100%");
        CalendarModel.getInstance().setData(this);
    }

    public void addHeader() {
        setWidget(0, 0, getDayWidget("Poniedziałek"));
        setWidget(0, 1, getDayWidget("Wtorek"));
        setWidget(0, 2, getDayWidget("Środa"));
        setWidget(0, 3, getDayWidget("Czwartek"));
        setWidget(0, 4, getDayWidget("Piątek"));
        setWidget(0, 5, getDayWidget("Sobota"));
        setWidget(0, 6, getDayWidget("Niedziela"));
    }

    private HTML getDayWidget(String dayName) {
        HTML result = new HTML(dayName);
        result.setStylePrimaryName("center");
        return result;
    }
}
