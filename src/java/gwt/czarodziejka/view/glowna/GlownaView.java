package gwt.czarodziejka.view.glowna;

import gwt.czarodziejka.components.calendar.v.CalendarView;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import gwt.czarodziejka.view.CanShow;

/**
 *
 * @author Administrator
 */
public class GlownaView extends VerticalPanel implements CanShow {

    public GlownaView() {
        setStylePrimaryName("glowna");
        add(new HTML("<p style=\"text-indent: 45px;\">Zapraszamy Państwa do skorzystania z oferty naszej wypożyczalni. Posiadamy stroje karnawałowe, teatralne, na Jasełka i Haloween w rozmiarach od 80 cm dla dzieci do rozmiarów XXL dla dorosłych.</p>"
                + "<p>Spora część kostiumów to własne wzory uwzględniające sugestie i potrzeby klientów.</p>"
                + "<p>Prezentowane zdjęcia są częścią tego co możecie Państwo u nas wypożyczyć. Na bieżąco powiększamy naszą kolekcję, aby sprostać oczekiwaniom dzieci i dorosłych.</p>"
                + "<p style=\"width:645px;font-size:21px; color:red;font-weight:bold;text-align:center;\">"
                + "Istnieje możliwość rezerwacji strojów.<br/><br/>"
//                + "Wypożyczalnia będzie nieczynna od 11 lipca do 19 sierpnia 2015.</p>"
                + "<p style=\"font-size: 22px;\">Godziny pracy wypożyczalni:</p>"));
        try {
            CalendarView calendar = new CalendarView();
            calendar.setStylePrimaryName("mainCalendar");
            add(calendar);
        } catch (Exception ex) {
            //suppress
        }
    }

    @Override
    public void onShow() {
    }
}
