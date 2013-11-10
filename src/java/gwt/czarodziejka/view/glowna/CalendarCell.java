package gwt.czarodziejka.view.glowna;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import gwt.czarodziejka.model.glowna.CalendarModel;
import gwt.czarodziejka.model.glowna.Time;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class CalendarCell extends VerticalPanel {

    private DateTimeFormat dayOfMonthFormat = DateTimeFormat.getFormat("dd");

    public CalendarCell(Date day) {
        super.setStylePrimaryName(getCellStyle(day));
        addDay(day);
        addTime(day);
    }

    private String getCellStyle(Date day) {
        Date now = new Date();
        if (CalendarModel.getInstance().isDayEqual(now, day)) {
            return "CalendarToday";
        } else if (day.before(now)) {
            return "CalendarBefore";
        } else if (CalendarModel.getInstance().isWeekend(day)) {
            return "CalendarWeekend";
        } else {
            return "CalendarAfter";
        }
    }

    private void addDay(Date day) {
        HTML content = new HTML(dayOfMonthFormat.format(day));
        content.setStylePrimaryName("CalendarDay");
        add(content);
    }

    private void addTime(Date day) {
        Time[] opened = CalendarModel.getInstance().getOpenedTimeFor(day);
        String timeContent;
        if (opened == null) {
            timeContent = "nieczynne";
        } else {
            Time from = opened[0];
            Time to = opened[1];
            timeContent = formatTime(from) + " - " + formatTime(to);
        }
        HTML content = new HTML(timeContent);
        content.setStylePrimaryName("CalendarTime");
        add(content);
    }

    private String formatTime(Time t) {
        return t.getHour() + "<u class=\"CalendarMin\">" + (t.getMinute() < 10 ? "0" + t.getMinute() : t.getMinute()) + "</u>";
    }
}
