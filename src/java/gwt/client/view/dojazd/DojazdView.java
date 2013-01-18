package gwt.client.view.dojazd;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import gwt.client.view.CanShow;

/**
 *
 * @author Administrator
 */
public class DojazdView extends VerticalPanel implements CanShow {

    public DojazdView() {
        setStylePrimaryName("dojazd");
        add(new HTML("<p>Adres wypożyczalni:"
                + "<ul>Warszawa - Włochy<br>ul. Popularna 29A</ul>"
                + "Sprawdź dojazd komunikacją miejską na stronie "
                + "<a target=\"_blank\" href=\"http://warszawa.jakdojade.pl/?tn=Czarodziejka&td=%3Ca%20href=%22http://Czarodziejka.Com.PL%22%3ECzarodziejka.Com.PL%3C/a%3E&tc=52.20473:20.92202&cid=3000\">JakDojade.pl</a><br><br>"
                + "<iframe style=\"width:644px;height:450px;border:1px black solid;\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" src=\"http://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=pl&amp;geocode=&amp;q=Popularna+29A,+Warszawa,+Polska&amp;aq=&amp;sll=52.204451,20.931015&amp;sspn=0.042344,0.111494&amp;vpsrc=6&amp;ie=UTF8&amp;hq=&amp;hnear=Popularna+29A,+Warszawa,+Mazowieckie,+Polska&amp;ll=52.204731,20.922022&amp;spn=0.021172,0.055747&amp;t=m&amp;z=14&amp;output=embed\"></iframe><br></p>"
                + "<p style=\"text-align:center;\"><a target=\"_blank\" href=\"http://maps.google.com/maps?f=q&amp;source=embed&amp;hl=pl&amp;geocode=&amp;q=Popularna+29A,+Warszawa,+Polska&amp;aq=&amp;sll=52.204451,20.931015&amp;sspn=0.042344,0.111494&amp;vpsrc=6&amp;ie=UTF8&amp;hq=&amp;hnear=Popularna+29A,+Warszawa,+Mazowieckie,+Polska&amp;ll=52.204731,20.922022&amp;spn=0.021172,0.055747&amp;t=m&amp;z=14\" style=\"color:#0000FF;text-align:left\">Wyświetl większą mapę</a></p>"));
    }

    @Override
    public void onShow() {
    }
}
