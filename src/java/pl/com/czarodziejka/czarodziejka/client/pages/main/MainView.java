package pl.com.czarodziejka.czarodziejka.client.pages.main;

import pl.com.czarodziejka.czarodziejka.client.components.calendar.v.CalendarView;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.components.page.CanShow;

/**
 *
 * @author Adam Mazur
 */
public class MainView extends VerticalPanel implements CanShow {

    public MainView() {
        setStylePrimaryName("glowna");
        add(new HTML("<p style=\"text-indent: 45px;\">Zapraszamy Państwa do skorzystania z oferty naszej wypożyczalni. Posiadamy stroje karnawałowe, teatralne, na Jasełka i Haloween w rozmiarach od 80 cm dla dzieci do rozmiarów XXL dla dorosłych.</p>"
                + "<p>Spora część kostiumów to własne wzory uwzględniające sugestie i potrzeby klientów.</p>"
                + "<p>Prezentowane zdjęcia są częścią tego co możecie Państwo u nas wypożyczyć. Na bieżąco powiększamy naszą kolekcję, aby sprostać oczekiwaniom dzieci i dorosłych.</p>"
                + "<p style=\"width:100%;font-size:21px; color:red;font-weight:bold;text-align:center;margin-top:16px;margin-bottom:16px;\">"
//                + "Istnieje możliwość rezerwacji strojów.<br/>"
                + "Podczas karnawału nie przyjmujemy rezerwacji na stroje dziecięce.</p>"

                + "<p style=\"font-size: 21px;margin-bottom:0px;\">Godziny pracy wypożyczalni:</p>"));
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
