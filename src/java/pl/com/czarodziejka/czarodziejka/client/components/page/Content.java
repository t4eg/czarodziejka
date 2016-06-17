package pl.com.czarodziejka.czarodziejka.client.components.page;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.SearchModel;
import pl.com.czarodziejka.czarodziejka.client.pages.search.p.SearchPresenter;
import pl.com.czarodziejka.czarodziejka.client.pages.boys.BoysView;
import pl.com.czarodziejka.czarodziejka.client.pages.girls.GirlsView;
import pl.com.czarodziejka.czarodziejka.client.pages.main.MainView;
import pl.com.czarodziejka.czarodziejka.client.pages.women.WomenView;
import pl.com.czarodziejka.czarodziejka.client.pages.contact.ContactView;
import pl.com.czarodziejka.czarodziejka.client.pages.men.MenView;
import pl.com.czarodziejka.czarodziejka.client.pages.pairs.PairsView;
import pl.com.czarodziejka.czarodziejka.client.pages.rules.RulesView;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.SearchView;

/**
 *
 * @author Adam Mazur
 */
public class Content extends FlowPanel {

    private static Content instance;
    private Page shown;
    private MainView main;
    private SearchView search;
    private ContactView contact;
    private RulesView rules;
    private GirlsView girls;
    private BoysView boys;
    private WomenView women;
    private MenView men;
    private PairsView pairs;

    public static Content getInstance() {
        if (instance == null) {
            instance = new Content();
        }
        return instance;
    }

    private Content() {
        shown = Page.MAIN;
        super.add(getPageInstance(shown));
    }

    public void show(Page page) {
        if (page != shown) {
            if (page == Page.SEARCH) {
                SearchPresenter.getInstance();
                SearchModel.getInstance().clearData();
                SearchModel.getInstance().setData();
            }
            super.remove(getPageInstance(shown));
            super.add(getPageInstance(page));
            ((CanShow) getPageInstance(page)).onShow();
            shown = page;
        }
    }

    private Widget getPageInstance(Page page) {
        switch (page) {
            case FOR_BOYS:
                if (boys == null) {
                    boys = new BoysView();
                }
                return boys;
            case FOR_GIRLS:
                if (girls == null) {
                    girls = new GirlsView();
                }
                return girls;
            case FOR_WOMEN:
                if (women == null) {
                    women = new WomenView();
                }
                return women;
            case FOR_MEN:
                if (men == null) {
                    men = new MenView();
                }
                return men;
            case FOR_PAIRS:
                if (pairs == null) {
                    pairs = new PairsView();
                }
                return pairs;
            case MAIN:
                if (main == null) {
                    main = new MainView();
                }
                return main;
            case CONTACT:
                if (contact == null) {
                    contact = new ContactView();
                }
                return contact;
            case RULES:
                if (rules == null) {
                    rules = new RulesView();
                }
                return rules;
            case SEARCH:
                if (search == null) {
                    search = SearchView.getInstance();
                }
                return search;
            default:
                throw new RuntimeException("There is no such page * @author Adam Mazur.");
        }
    }
}
