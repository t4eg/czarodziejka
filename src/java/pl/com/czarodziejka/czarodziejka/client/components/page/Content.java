package pl.com.czarodziejka.czarodziejka.client.components.page;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.WyszukiwarkaModel;
import pl.com.czarodziejka.czarodziejka.client.pages.search.p.WyszukiwarkaPresenter;
import pl.com.czarodziejka.czarodziejka.client.pages.boys.ChlopcyView;
import pl.com.czarodziejka.czarodziejka.client.pages.girls.DziewczynkiView;
import pl.com.czarodziejka.czarodziejka.client.pages.main.GlownaView;
import pl.com.czarodziejka.czarodziejka.client.pages.women.KobietyView;
import pl.com.czarodziejka.czarodziejka.client.pages.contact.KontaktView;
import pl.com.czarodziejka.czarodziejka.client.pages.men.MezczyzniView;
import pl.com.czarodziejka.czarodziejka.client.pages.pairs.ParyView;
import pl.com.czarodziejka.czarodziejka.client.pages.rules.RegulaminView;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.WyszukiwarkaView;

/**
 *
 * @author Administrator
 */
public class Content extends FlowPanel {

    private static Content instance;
    private Page shown;
    private GlownaView glowna;
    private WyszukiwarkaView wyszukiwarka;
    private KontaktView kontakt;
    private RegulaminView regulamin;
    private DziewczynkiView dziewczynki;
    private ChlopcyView chlopcy;
    private KobietyView kobiety;
    private MezczyzniView mezczyzni;
    private ParyView pary;

    public static Content getInstance() {
        if (instance == null) {
            instance = new Content();
        }
        return instance;
    }

    private Content() {
        shown = Page.GLOWNA;
        super.add(getPageInstance(shown));
    }

    public void show(Page page) {
        if (page != shown) {
            if (page == Page.WYSZUKIWARKA) {
                WyszukiwarkaPresenter.getInstance();
                WyszukiwarkaModel.getInstance().clearData();
                WyszukiwarkaModel.getInstance().setData();
            }
            super.remove(getPageInstance(shown));
            super.add(getPageInstance(page));
            ((CanShow) getPageInstance(page)).onShow();
            shown = page;
        }
    }

    private Widget getPageInstance(Page page) {
        switch (page) {
            case DLA_CHLOPCOW:
                if (chlopcy == null) {
                    chlopcy = new ChlopcyView();
                }
                return chlopcy;
            case DLA_DZIEWCZYNEK:
                if (dziewczynki == null) {
                    dziewczynki = new DziewczynkiView();
                }
                return dziewczynki;
            case DLA_KOBIET:
                if (kobiety == null) {
                    kobiety = new KobietyView();
                }
                return kobiety;
            case DLA_MEZCZYZN:
                if (mezczyzni == null) {
                    mezczyzni = new MezczyzniView();
                }
                return mezczyzni;
            case DLA_PAR:
                if (pary == null) {
                    pary = new ParyView();
                }
                return pary;
            case GLOWNA:
                if (glowna == null) {
                    glowna = new GlownaView();
                }
                return glowna;
            case KONTAKT:
                if (kontakt == null) {
                    kontakt = new KontaktView();
                }
                return kontakt;
            case REGULAMIN:
                if (regulamin == null) {
                    regulamin = new RegulaminView();
                }
                return regulamin;
            case WYSZUKIWARKA:
                if (wyszukiwarka == null) {
                    wyszukiwarka = WyszukiwarkaView.getInstance();
                }
                return wyszukiwarka;
            default:
                throw new RuntimeException("Nie ma takiej strony.");
        }
    }
}
