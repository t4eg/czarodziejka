package gwt.czarodziejka.components.calendar.m;

import com.google.gwt.i18n.client.DateTimeFormat;
import gwt.czarodziejka.components.calendar.v.MonthView;
import gwt.czarodziejka.model.glowna.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gwt.user.datepicker.client.CalendarUtil;

/**
 *
 * @author Administrator
 */
public class CalendarModel {

    private final List<MonthView> months;
    private final Date today = new Date();
    public static final Map<String, Time[]> specialDays = new HashMap<>();

    static {
        specialDays.put("2015.06.04", null);
        specialDays.put("2015.08.15", null);
        specialDays.put("2015.08.31", new Time[]{new Time(10), new Time(19)});
        specialDays.put("2015.11.01", null);
        specialDays.put("2015.11.11", null);
        specialDays.put("2015.12.25", null);
        specialDays.put("2015.12.26", null);
        specialDays.put("2015.12.31", new Time[]{new Time(10), new Time(15)});
    }

    public CalendarModel() {
        int monthsToShow = 2;
        months = new ArrayList<>(1);

        for (int i = 0; i < monthsToShow; i++) {
            months.add(new MonthView(this, CalendarUtil.copyDate(today)));
            CalendarUtil.addMonthsToDate(today, 1);
        }
    }

    DateTimeFormat dayInMonthPattern = DateTimeFormat.getFormat("d");

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
        } else if (DateUtils.isBetween(date, "2015.07.11", "2015.08.19")) {
            return null;
        } else if (DateUtils.isBetween(date, "2015.08.20", "2015.08.30")) {
            switch (DateUtils.getWeekDay(date)) {
                case Sat:
                case Sun:
                    return null;
                default:
                    return new Time[]{new Time(10), new Time(18)};
            }
        } else if (DateUtils.isLipiec(date)) {
            switch (DateUtils.getWeekDay(date)) {
                case Sat:
                case Sun:
                    return null;
                case Mon:
                case Tue:
                case Wed:
                case Thu:
                case Fri:
                default:
                    return new Time[]{new Time(10), new Time(18)};
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
