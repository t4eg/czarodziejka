/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.czarodziejka.czarodziejka.client.components.calendar.m;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.datepicker.client.CalendarUtil;
import pl.com.czarodziejka.czarodziejka.client.model.glowna.WeekDay;
import java.util.Date;

/**
 *
 * @author admin
 */
public class DateUtils {

    public static final DateTimeFormat weekDayFormat = DateTimeFormat.getFormat("E");
    public static final DateTimeFormat dateFormat = DateTimeFormat.getFormat("yyyy.MM.dd");
    public static final DateTimeFormat monthFormat = DateTimeFormat.getFormat("MM");

    public static boolean isLipiec(Date date) {
        String month = monthFormat.format(date);
        return month.equals("07");
    }

    public static boolean isSierpien(Date date) {
        String month = monthFormat.format(date);
        return month.equals("08");
    }

    public static boolean isGrudzien(Date date) {
        String month = monthFormat.format(date);
        return month.equals("12");
    }

    public static WeekDay getWeekDay(Date date) {
        return WeekDay.valueOf(weekDayFormat.format(date));
    }

    public static boolean isCarnival(Date date) {
        return isBetween(date, "2015.12.25", "2016.02.10");
    }

    public static boolean isBetween(Date date, String from, String to) {
        Date fromDate = dateFormat.parse(from);
        Date toDate = dateFormat.parse(to);
        return date.equals(toDate) || date.equals(fromDate) || (date.after(fromDate) && date.before(toDate));
    }

    public static boolean isDayEqual(Date date1, Date date2) {
        return dateFormat.format(date1).equals(dateFormat.format(date2));
    }

    public static boolean isWeekend(Date date) {
        WeekDay day = WeekDay.valueOf(DateUtils.weekDayFormat.format(date));
        switch (day) {
            case Sat:
            case Sun:
                return true;
            default:
                return false;
        }
    }

    public static void addMonths(Date date, int count) {
        CalendarUtil.setToFirstDayOfMonth(date);
        CalendarUtil.addMonthsToDate(date, count);
    }
}
