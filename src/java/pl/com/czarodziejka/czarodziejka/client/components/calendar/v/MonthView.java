/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.czarodziejka.czarodziejka.client.components.calendar.v;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.components.calendar.m.CalendarModel;
import pl.com.czarodziejka.czarodziejka.client.components.calendar.m.MonthModel;
import java.util.Date;

/**
 *
 * @author admin
 */
public class MonthView extends VerticalPanel {

    private final Grid grid = new Grid();
    private final static DateTimeFormat yearPattern = DateTimeFormat.getFormat("yyyy");
    private final static DateTimeFormat monthPattern = DateTimeFormat.getFormat("MM");
    private final MonthModel m;

    public MonthView(CalendarModel calendarModel, Date month) {
        HTML title = new HTML(getMonth(monthPattern.format(month)) + " " + yearPattern.format(month));
        title.setStylePrimaryName("calendarMonthTitle");
        add(title);
        
        m = new MonthModel(calendarModel, this);
        setWidth("100%");
        m.setData(month);

        add(grid);
    }

    private String getMonth(String number) {
        switch (number) {
            case "01":
                return "Styczeń";
            case "02":
                return "Luty";
            case "03":
                return "Marzec";
            case "04":
                return "Kwiecień";
            case "05":
                return "Maj";
            case "06":
                return "Czerwiec";
            case "07":
                return "Lipiec";
            case "08":
                return "Sierpień";
            case "09":
                return "Wrzesień";
            case "10":
                return "Październik";
            case "11":
                return "Listopad";
            case "12":
                return "Grudzień";
        }
        throw new RuntimeException("wrong month");
    }

    public void addHeader() {
        getGrid().setWidget(0, 0, getDayWidget("Poniedziałek"));
        getGrid().setWidget(0, 1, getDayWidget("Wtorek"));
        getGrid().setWidget(0, 2, getDayWidget("Środa"));
        getGrid().setWidget(0, 3, getDayWidget("Czwartek"));
        getGrid().setWidget(0, 4, getDayWidget("Piątek"));
        getGrid().setWidget(0, 5, getDayWidget("Sobota"));
        getGrid().setWidget(0, 6, getDayWidget("Niedziela"));
    }

    private HTML getDayWidget(String dayName) {
        HTML result = new HTML(dayName);
        result.setStylePrimaryName("center");
        return result;
    }

    public Grid getGrid() {
        return grid;
    }
}
