package gwt.czarodziejka.view;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;
import gwt.czarodziejka.model.wyszukiwarka.WyszukiwarkaModel;
import gwt.czarodziejka.presenter.wyszukiwarka.WyszukiwarkaPresenter;
import gwt.czarodziejka.view.dojazd.DojazdView;
import gwt.czarodziejka.view.dorosli.DorosliView;
import gwt.czarodziejka.view.dzieci.DzieciView;
import gwt.czarodziejka.view.glowna.GlownaView;
import gwt.czarodziejka.view.kontakt.KontaktView;
import gwt.czarodziejka.view.wyszukiwarka.WyszukiwarkaView;

/**
 *
 * @author Administrator
 */
public class Content extends FlowPanel {

    private static Content instance;
    private Page shown;
    private GlownaView glowna;
    private DzieciView dzieci;
    private DorosliView dorosli;
    private WyszukiwarkaView wyszukiwarka;
    private DojazdView dojazd;
    private KontaktView kontakt;

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
            case DLA_DOROSLYCH:
                if (dorosli == null) {
                    dorosli = new DorosliView();
                }
                return dorosli;
            case DLA_DZIECI:
                if (dzieci == null) {
                    dzieci = new DzieciView();
                }
                return dzieci;
            case DOJAZD:
                if (dojazd == null) {
                    dojazd = new DojazdView();
                }
                return dojazd;
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
