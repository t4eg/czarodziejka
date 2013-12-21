package gwt.czarodziejka.view.regulamin;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import gwt.czarodziejka.view.CanShow;

/**
 *
 * @author Administrator
 */
public class RegulaminView extends VerticalPanel implements CanShow {

    public RegulaminView() {
        setStylePrimaryName("regulaminPage");
        add(new HTML(""
                + "1. Wypożyczalnia strojów jest czynna przez cały rok.<br>"
                + "2. Aktualne godziny pracy wypożyczalni są zamieszczone na stronie internetowej z wyprzedzeniem 1-go miesiąca.<br>"
                + "3. Przy wypożyczeniu stroju niezbędny jest dokument tożsamości z aktualnym adresem zamieszkania. W przypadku braku dokumentu wypożyczalnia pobiera wyższą kaucję zwrotną.<br>"
                + "4. W momencie wypożyczenia należy uiścić opłatę za wypożyczenie oraz kaucję zwrotną ustalaną indywidualnie dla każdego stroju.<br>"
                + "5. Opłata za wypożyczenie obejmuje czas od 1 do 3 dni wliczając dzień w którym strój został wypożyczony.<br>"
                + "6. Termin zwrotu stroju jest każdorazowo ustalany z klientem. Po przekroczeniu terminu zwrotu wypożyczalnia pobiera dodatkową opłatę. Jej wysokość uzależniona jest od czasu przetrzymania stroju przez klienta.<br>"
                + "7. Jeżeli istnieje potrzeba przedłużenia terminu zwrotu stroju należy uzgodnić to z pracownikiem wypożyczalni przed upływem tego terminu.<br>"
                + "8. Przyjmujemy rezerwacje telefonicznie i mailowo. Rezerwacja jest przyjęta po potwierdzeniu przez pracownika wypożyczalni.<br>"
                + "9. Przyjmujemy zamówienia zbiorowe.<br>"
                + "10. Rabat dla zamówień zbiorowych jest ustalany indywidualnie dla każdego zamówienia.<br>"
                + "11. Wypożyczalnia oświadcza, że wszystkie stroje są czyste i w dobrym stanie.<br>"
                + "12. Klient jest zobowiązany do używania stroju zgodnie z jego przeznaczeniem.<br>"
                + "13. Dokonywanie zmian i przeróbek stroju musi być wcześniej uzgodnione z wypożyczalnią.<br>"
                + "14. Za uszkodzenia stroju wykraczające poza normalne zużycie klient ponosi odpowiedzialność finansową adekwatną do kosztów przywrócenia go do poprzedniego stanu.<br>"
                + "15. Za zagubienie części lub całego stroju oraz  akcesoriów wypożyczalnia pobiera opłatę w wysokości kosztów jego uszycia lub zakupu.<br>"
                + "16. Stroje pierze wypożyczalnia.<br>"
                + "17. Zabrania się prania strojów. Za ewentualne szkody powstałe w wyniku prania stroju przez klienta odpowiedzialność ponosi klient.<br>"
                + "18. Wypożyczenie stroju oznacza akceptację regulaminu wypożyczalni.<br>"
                + "19. Strój uważa się za wypożyczony w momencie opuszczenia przez klienta terenu wypożyczalni.<br>"
                + "20. W niektórych przypadkach zamiana stroju na inny możliwa jest po uzgodnieniu z pracownikiem wypozyczalni.<br>"
                + "21. Treść regulaminu jest dostępna na stronie internetowej www.czarodziejka.com.pl oraz w siedzibie wypożyczalni: Warszawa ul.Popularna 29A.<br>"
                + ""));
    }

    @Override
    public void onShow() {
    }
}
