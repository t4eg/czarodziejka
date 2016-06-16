package pl.com.czarodziejka.czarodziejka.client.pages.rules;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.components.page.CanShow;

/**
 *
 * @author Administrator
 */
public class RegulaminView extends VerticalPanel implements CanShow {

    public RegulaminView() {
        add(new HTML("<ol>"
                + "<li>Wypożyczalnia strojów jest czynna przez cały rok.</li>"
                + "<li>Aktualne godziny pracy wypożyczalni są zamieszczone na stronie internetowej z wyprzedzeniem jednego miesiąca.</li>"
                + "<li>Przy wypożyczeniu stroju niezbędny jest dokument tożsamości z aktualnym adresem zamieszkania. W przypadku braku dokumentu wypożyczalnia pobiera wyższą kaucję zwrotną.</li>"
                + "<li>W momencie wypożyczenia należy uiścić opłatę za wypożyczenie oraz kaucję zwrotną ustalaną indywidualnie dla każdego stroju.</li>"
                + "<li>Opłata za wypożyczenie obejmuje czas od 1 do 3 dni wliczając dzień w którym strój został wypożyczony.</li>"
                + "<li>Termin zwrotu stroju jest każdorazowo ustalany z klientem. Po przekroczeniu terminu zwrotu wypożyczalnia pobiera dodatkową opłatę. Jej wysokość uzależniona jest od czasu przetrzymania stroju przez klienta.</li>"
                + "<li>Jeżeli istnieje potrzeba przedłużenia terminu zwrotu stroju należy uzgodnić to z pracownikiem wypożyczalni przed upływem tego terminu.</li>"
                + "<li>Przyjmujemy rezerwacje telefonicznie i mailowo. Rezerwacja jest przyjęta po potwierdzeniu przez pracownika wypożyczalni.</li>"
                + "<li>Przyjmujemy zamówienia zbiorowe.</li>"
                + "<li>Rabat dla zamówień zbiorowych jest ustalany indywidualnie dla każdego zamówienia.</li>"
                + "<li>Wypożyczalnia oświadcza, że wszystkie stroje są czyste i w dobrym stanie.</li>"
                + "<li>Klient jest zobowiązany do używania stroju zgodnie z jego przeznaczeniem.</li>"
                + "<li>Dokonywanie zmian i przeróbek stroju musi być wcześniej uzgodnione z wypożyczalnią.</li>"
                + "<li>Za uszkodzenia stroju wykraczające poza normalne zużycie klient ponosi odpowiedzialność finansową adekwatną do kosztów przywrócenia go do poprzedniego stanu.</li>"
                + "<li>Za zagubienie części lub całego stroju oraz  akcesoriów wypożyczalnia pobiera opłatę w wysokości kosztów jego uszycia lub zakupu.</li>"
                + "<li>Stroje pierze wypożyczalnia.</li>"
                + "<li>Zabrania się prania strojów. Za ewentualne szkody powstałe w wyniku prania stroju przez klienta odpowiedzialność ponosi klient.</li>"
                + "<li>Wypożyczenie stroju oznacza akceptację regulaminu wypożyczalni.</li>"
                + "<li>Strój uważa się za wypożyczony w momencie opuszczenia przez klienta terenu wypożyczalni.</li>"
                + "<li>W niektórych przypadkach zamiana stroju na inny możliwa jest po uzgodnieniu z pracownikiem wypozyczalni.</li>"
                + "<li>Treść regulaminu jest dostępna na stronie internetowej www.czarodziejka.com.pl oraz w siedzibie wypożyczalni: Warszawa ul.Popularna 29A.</li>"
                + "</ol>"));
    }

    @Override
    public void onShow() {
    }
}
