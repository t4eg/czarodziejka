package gwt.client.view;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;
import gwt.client.model.wyszukiwarka.WyszukiwarkaModel;
import gwt.client.presenter.wyszukiwarka.WyszukiwarkaPresenter;
import gwt.client.view.dodajStroj.DodajStrojView;
import gwt.client.view.dojazd.DojazdView;
import gwt.client.view.dorosli.DorosliView;
import gwt.client.view.dzieci.DzieciView;
import gwt.client.view.glowna.GlownaView;
import gwt.client.view.kontakt.KontaktView;
import gwt.client.view.wyszukiwarka.WyszukiwarkaView;
import java.util.EnumMap;
import java.util.Map;

/**
 *
 * @author Administrator
 */
public class Content extends FlowPanel {

    private static Content instance;
    private Map<Page, Widget> pages = new EnumMap<Page, Widget>(Page.class);
    private Page shown;

    public static Content getInstance() {
        if (instance == null) {
            instance = new Content();
        }
        return instance;
    }

    private Content() {
        pages.put(Page.GLOWNA, new GlownaView());
        pages.put(Page.DLA_DZIECI, new DzieciView());
        pages.put(Page.DLA_DOROSLYCH, new DorosliView());
        pages.put(Page.WYSZUKIWARKA, WyszukiwarkaView.getInstance());
        pages.put(Page.DOJAZD, new DojazdView());
        pages.put(Page.KONTAKT, new KontaktView());
        pages.put(Page.DODAJ_STROJ, new DodajStrojView());

        shown = Page.GLOWNA;
        super.add(pages.get(shown));
    }

    public void show(Page page) {
        if (page != shown) {
            if (page == Page.WYSZUKIWARKA) {
                WyszukiwarkaPresenter.getInstance();
                WyszukiwarkaModel.getInstance().setData();
            }
            super.remove(pages.get(shown));
            super.add(pages.get(page));
            ((CanShow) pages.get(page)).onShow();
            shown = page;
        }
    }
}
