/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.czarodziejka.czarodziejka.client.components.calendar.m;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.datepicker.client.CalendarUtil;
import pl.com.czarodziejka.czarodziejka.client.components.calendar.v.CalendarCell;
import pl.com.czarodziejka.czarodziejka.client.components.calendar.v.MonthView;
import pl.com.czarodziejka.czarodziejka.client.pages.main.WeekDay;
import java.util.Date;

/**
 *
 * @author admin
 */
public class MonthModel {

    private final static int weeksToShow = 4;
    private final CalendarModel calendarModel;
    private final MonthView v;
    private final static DateTimeFormat monthPattern = DateTimeFormat.getFormat("M");
    private final static DateTimeFormat dayOfWeekPattern = DateTimeFormat.getFormat("c");
    private final static DateTimeFormat weekInYearPattern = DateTimeFormat.getFormat("w");

    public MonthModel(CalendarModel calendarModel, MonthView v) {
        this.calendarModel = calendarModel;
        this.v = v;
    }

    public void setData(Date month) {
        v.getGrid().clear();
        v.getGrid().resize(5, 7); //5 -> at least 4 weeks
        v.addHeader();

        CalendarUtil.setToFirstDayOfMonth(month);

        int startMonth = Integer.parseInt(monthPattern.format(month));
        int thisDay = getCorrectDayOfWeek(month);
        while (startMonth == Integer.parseInt(monthPattern.format(month))) {
            int row = (int) Math.ceil((thisDay + 1) / 7.);
            int col = getCorrectDayOfWeek(month);
            if (row == v.getGrid().getRowCount()) {
                v.getGrid().resizeRows(row + 1);
            }
            v.getGrid().setWidget(row, col, new CalendarCell(calendarModel, month));

            CalendarUtil.addDaysToDate(month, 1);
            thisDay++;
        }

        Date workDay = CalendarUtil.copyDate(calendarModel.today);
        CalendarUtil.addDaysToDate(workDay, -getDayOfWeek(new Date()));
        for (int week = 0; week < weeksToShow; week++) {
            for (int day = 0; day < 7; day++) {
                CalendarUtil.addDaysToDate(workDay, 1);
            }
        }
    }

    private int getCorrectDayOfWeek(Date date) {
        int num = Integer.parseInt(dayOfWeekPattern.format(date)) - 1;
        return num == -1 ? 6 : num;
    }

    private int getDayOfWeek(Date date) {
        WeekDay day = WeekDay.valueOf(DateUtils.weekDayFormat.format(date));
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

}
