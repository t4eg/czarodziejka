package pl.com.czarodziejka.czarodziejka.client.components.menu;

import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.components.page.Page;

/**
 *
 * @author Administrator
 */
public class Menu extends VerticalPanel {

    private MenuLink main = new MenuLink("Strona główna", Page.GLOWNA);
    private MenuLink dziewczynki = new MenuLink("Dla dziewczynek", Page.DLA_DZIEWCZYNEK);
    private MenuLink chlopcy = new MenuLink("Dla chłopców", Page.DLA_CHLOPCOW);
    private MenuLink kobiety = new MenuLink("Dla kobiet", Page.DLA_KOBIET);
    private MenuLink mezczyzni = new MenuLink("Dla mężczyzn", Page.DLA_MEZCZYZN);
    private MenuLink pary = new MenuLink("Dla par", Page.DLA_PAR);
    private MenuLink search = new MenuLink("Wyszukiwarka", Page.WYSZUKIWARKA);
    private MenuLink regulamin = new MenuLink("Regulamin", Page.REGULAMIN);
    private MenuLink contact = new MenuLink("Kontakt", Page.KONTAKT);

    public Menu() {
        add(main);
        add(dziewczynki);
        add(chlopcy);
        add(kobiety);
        add(mezczyzni);
        add(pary);
        add(search);
        add(regulamin);
        add(contact);
    }
}
