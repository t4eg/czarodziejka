package pl.com.czarodziejka.czarodziejka.client.components.menu;

import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.components.page.Page;

/**
 *
 * @author Adam Mazur
 */
public class Menu extends VerticalPanel {

    private final MenuLink main = new MenuLink("Strona główna", Page.MAIN);
    private final MenuLink girls = new MenuLink("Dla dziewczynek", Page.FOR_GIRLS);
    private final MenuLink boys = new MenuLink("Dla chłopców", Page.FOR_BOYS);
    private final MenuLink women = new MenuLink("Dla kobiet", Page.FOR_WOMEN);
    private final MenuLink men = new MenuLink("Dla mężczyzn", Page.FOR_MEN);
    private final MenuLink pairs = new MenuLink("Dla par", Page.FOR_PAIRS);
    private final MenuLink search = new MenuLink("Wyszukiwarka", Page.SEARCH);
    private final MenuLink rules = new MenuLink("Regulamin", Page.RULES);
    private final MenuLink contact = new MenuLink("Kontakt", Page.CONTACT);

    public Menu() {
        add(main);
        add(girls);
        add(boys);
        add(women);
        add(men);
        add(pairs);
        add(search);
        add(rules);
        add(contact);
    }
}
