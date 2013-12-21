package gwt.czarodziejka.view.kontakt;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;
import gwt.czarodziejka.view.CanShow;

/**
 *
 * @author Administrator
 */
public class KontaktView extends VerticalPanel implements CanShow {

    public KontaktView() {
        setStylePrimaryName("kontakt");
        add(new HTML("<p>"
                + "Telefoniczny:<br/>"
                + "<ul>"
                + "<li>(22) 662 70 34</li>"
                + "<li>502 055 758</li>"
                + "</ul>"
                + "E-mail:<br/>"
                + "<ul>"
                + "<li><a href=\"mailto:kontakt@czarodziejka.com.pl\">kontakt@czarodziejka.com.pl</a></li>"
                + "</ul>"
                + "</p>"));
        add(new DojazdView());
    }

    @Override
    public void onShow() {
    }
}
