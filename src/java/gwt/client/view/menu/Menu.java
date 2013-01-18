package gwt.client.view.menu;

import com.google.gwt.user.client.ui.VerticalPanel;
import gwt.client.view.Page;

/**
 *
 * @author Administrator
 */
public class Menu extends VerticalPanel {

    private ImageButton main = new ImageButton("Strona główna", Page.GLOWNA);
    private ImageButton kids = new ImageButton("Dla dzieci", Page.DLA_DZIECI);
    private ImageButton adults = new ImageButton("Dla dorosłych", Page.DLA_DOROSLYCH);
    private ImageButton search = new ImageButton("Wyszukiwarka", Page.WYSZUKIWARKA);
    private ImageButton dojazd = new ImageButton("Dojazd", Page.DOJAZD);
    private ImageButton contact = new ImageButton("Kontakt", Page.KONTAKT);

    public Menu() {
        add(main);
        add(kids);
        add(adults);
        add(search);
        add(dojazd);
        add(contact);
//        add(new VSpace(50));
        add(new FacebookLikeButton());

        main.setSize("232px", "47px");
        kids.setSize("151px", "42px");
        adults.setSize("221px", "49px");
        search.setSize("212px", "47px");
        dojazd.setSize("113px", "45px");
        contact.setSize("127px", "43px");

        main.setStylePrimaryName("s0");
        kids.setStylePrimaryName("s1");
        adults.setStylePrimaryName("s2");
        search.setStylePrimaryName("s3");
        dojazd.setStylePrimaryName("s4");
        contact.setStylePrimaryName("s5");
    }
}
