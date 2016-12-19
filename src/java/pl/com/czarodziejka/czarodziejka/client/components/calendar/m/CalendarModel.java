package pl.com.czarodziejka.czarodziejka.client.components.calendar.m;

import pl.com.czarodziejka.czarodziejka.client.components.calendar.v.MonthView;
import pl.com.czarodziejka.czarodziejka.client.pages.main.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gwt.user.datepicker.client.CalendarUtil;

/**
 *
 * @author Adam Mazur
 */
public class CalendarModel {

    private final List<MonthView> months;
    public final Date today = new Date();
    public static final Map<String, Time[]> specialDays = new HashMap<>();

    static {
        specialDays.put("2016.08.15", null);
        specialDays.put("2016.11.01", null);
        specialDays.put("2016.11.11", null);
        specialDays.put("2016.12.24", null);
        specialDays.put("2016.12.25", null);
        specialDays.put("2016.12.26", null);
        specialDays.put("2016.12.31", new Time[]{new Time(10), new Time(15)});
        
        specialDays.put("2017.01.01", null);
        specialDays.put("2017.01.06", null);
        specialDays.put("2017.04.16", null);
        specialDays.put("2017.04.17", null);
    }

    public CalendarModel() {
        int monthsToShow = 2;
        months = new ArrayList<>(monthsToShow);

        Date loopDate = CalendarUtil.copyDate(today);
        for (int i = 0; i < monthsToShow; i++) {
            months.add(new MonthView(this, CalendarUtil.copyDate(loopDate)));
            DateUtils.addMonths(loopDate, 1);
        }
    }

    public Time[] getOpenedTimeFor(Date date) {
        String dateStr = DateUtils.dateFormat.format(date);
        if (CalendarModel.specialDays.containsKey(dateStr)) {
            return CalendarModel.specialDays.get(dateStr);
        }

        if (DateUtils.isCarnival(date)) {
            switch (DateUtils.getWeekDay(date)) {
                case Sat:
                case Sun:
                    return new Time[]{new Time(10), new Time(15)};
                default:
                    return new Time[]{new Time(10), new Time(20)};
            }
        } else if (DateUtils.isGrudzien(date)) {
            switch (DateUtils.getWeekDay(date)) {
                case Sat:
                    return new Time[]{new Time(10), new Time(15)};
                case Sun:
                    return null;
                default:
                    return new Time[]{new Time(10), new Time(20)};
            }
        } else {
            switch (DateUtils.getWeekDay(date)) {
                case Sat:
                    return new Time[]{new Time(10), new Time(15)};
                case Sun:
                    return null;
                default:
                    return new Time[]{new Time(10), new Time(19)};
            }
        }
    }

    public List<MonthView> getMonths() {
        return months;
    }
}
