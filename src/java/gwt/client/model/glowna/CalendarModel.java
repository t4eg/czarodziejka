package gwt.client.model.glowna;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.datepicker.client.CalendarUtil;
import gwt.client.view.glowna.Calendar;
import gwt.client.view.glowna.CalendarCell;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public class CalendarModel {

    private static CalendarModel instance;
    private final static int weeksToShow = 4;
    private static DateTimeFormat weekDayFormat = DateTimeFormat.getFormat("E");
    private static DateTimeFormat dateFormat = DateTimeFormat.getFormat("yyyy.MM.dd");
    private static DateTimeFormat monthFormat = DateTimeFormat.getFormat("MM");
    private Map<String, Time[]> specialDays = new HashMap<String, Time[]>();

    public static CalendarModel getInstance() {
        if (instance == null) {
            instance = new CalendarModel();
        }
        return instance;
    }

    private CalendarModel() {
        specialDays.put("2013.05.30", null);
        specialDays.put("2013.08.15", null);
        specialDays.put("2013.11.01", null);
        specialDays.put("2013.11.11", null);
        specialDays.put("2013.12.25", null);
        specialDays.put("2013.12.26", null);

        specialDays.put("2014.01.01", null);
        specialDays.put("2014.01.06", null);
//        specialDays.put("2012.12.25", null);
//        specialDays.put("2012.12.26", null);
//        specialDays.put("2012.12.31", new Time[]{new Time(10, 00), new Time(15, 00)});
//        specialDays.put("2013.01.01", null);
//        specialDays.put("2013.01.06", null);
    }

    public void setData(Calendar tabela) {
        tabela.clear();
        tabela.resize(weeksToShow + 1, 7);

        tabela.addHeader();

        Date workDay = new Date();
        CalendarUtil.addDaysToDate(workDay, -getDayOfWeek(new Date()));
        for (int week = 0; week < weeksToShow; week++) {
            for (int day = 0; day < 7; day++) {
                tabela.setWidget(week + 1, day, new CalendarCell(workDay));
                CalendarUtil.addDaysToDate(workDay, 1);
            }
        }
    }

    private int getDayOfWeek(Date date) {
        WeekDay day = WeekDay.valueOf(weekDayFormat.format(date));
        switch (day) {
            case Mon:
                return 0;
            case Tue:
                return 1;
            case Wed:
                return 2;
            case Thu:
                return 3;
            case Fri:
                return 4;
            case Sat:
                return 5;
            case Sun:
                return 6;
            default:
                throw new RuntimeException("No such day!");
        }
    }

    public boolean isWeekend(Date date) {
        WeekDay day = WeekDay.valueOf(weekDayFormat.format(date));
        switch (day) {
            case Sat:
            case Sun:
                return true;
            default:
                return false;
        }
    }

    public Time[] getOpenedTimeFor(Date date) {
        String dateStr = dateFormat.format(date);
        if (specialDays.containsKey(dateStr)) {
            return specialDays.get(dateStr);
        }

        if (isCarnival(date)) {
            switch (getWeekDay(date)) {
                case Sat:
                case Sun:
                    return new Time[]{new Time(10, 00), new Time(15, 00)};
                default:
                    return new Time[]{new Time(10, 00), new Time(20, 00)};
            }
        } else if (isLipiecSierpien(date)) {
            switch (getWeekDay(date)) {
                case Sat:
                case Sun:
                    return null;
                default:
                    return new Time[]{new Time(8, 00), new Time(14, 00)};
            }
        } else {
            switch (getWeekDay(date)) {
                case Sat:
                    return new Time[]{new Time(10, 00), new Time(15, 00)};
                case Sun:
                    return null;
                default:
                    return new Time[]{new Time(10, 00), new Time(19, 00)};
            }
        }
    }

    private static boolean isLipiecSierpien(Date date) {
        String month = monthFormat.format(date);
        return month.equals("07") || month.equals("08");
    }

    private WeekDay getWeekDay(Date date) {
        return WeekDay.valueOf(weekDayFormat.format(date));
    }

    private boolean isCarnival(Date date) {
        return isBetween(date, "2012.12.25", "2013.02.16")
                || isBetween(date, "2013.12.25", "2014.03.04");
    }

    private boolean isBetween(Date date, String from, String to) {
        Date fromDate = dateFormat.parse(from);
        Date toDate = dateFormat.parse(to);
        return date.equals(toDate) || date.equals(fromDate) || (date.after(fromDate) && date.before(toDate));
    }

    public boolean isDayEqual(Date date1, Date date2) {
        return dateFormat.format(date1).equals(dateFormat.format(date2));
    }
}
