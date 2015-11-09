package pl.com.czarodziejka.czarodziejka.client.components.calendar.v;

import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.components.calendar.m.CalendarModel;

/**
 *
 * @author Administrator
 */
public class CalendarView extends VerticalPanel {

    private final CalendarModel m = new CalendarModel();

    public CalendarView() {
        for (MonthView month : m.getMonths()) {
            super.add(month);
        }
    }

}
