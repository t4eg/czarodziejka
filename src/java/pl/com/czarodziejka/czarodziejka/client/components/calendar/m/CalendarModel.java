package pl.com.czarodziejka.czarodziejka.client.components.calendar.m;

import pl.com.czarodziejka.czarodziejka.client.components.calendar.v.MonthView;
import pl.com.czarodziejka.czarodziejka.client.model.glowna.Time;
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
    public final Date today = new Date();
    public static final Map<String, Time[]> specialDays = new HashMap<>();

    static {
        specialDays.put("2015.06.04", null);
        specialDays.put("2015.08.15", null);
        specialDays.put("2015.08.31", new Time[]{new Time(10), new Time(19)});
        specialDays.put("2015.11.01", null);
        specialDays.put("2015.11.11", null);
        specialDays.put("2015.12.24", null);
        specialDays.put("2015.12.25", null);
        specialDays.put("2015.12.26", null);
        specialDays.put("2015.12.31", new Time[]{new Time(10), new Time(16)});

        specialDays.put("2016.01.01", null);
        specialDays.put("2016.01.06", null);
        specialDays.put("2016.03.27", null);
        specialDays.put("2016.05.01", null);
        specialDays.put("2016.05.03", null);
        specialDays.put("2016.05.15", null);
        specialDays.put("2016.05.26", null);
        specialDays.put("2016.08.15", null);
        specialDays.put("2016.11.01", null);
        specialDays.put("2016.11.11", null);
        specialDays.put("2016.12.24", null);
        specialDays.put("2016.12.25", null);
        specialDays.put("2016.12.26", null);
        specialDays.put("2016.12.31", new Time[]{new Time(10), new Time(16)});
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
