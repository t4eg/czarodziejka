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

        shown = Page.GLOWNA;
        super.add(pages.get(shown));
    }

    public void show(Page page) {
        if (page != shown) {
            if (page == Page.WYSZUKIWARKA) {
                WyszukiwarkaPresenter.getInstance();
                WyszukiwarkaModel.getInstance().clearData();
                WyszukiwarkaModel.getInstance().setData();
            }
            super.remove(pages.get(shown));
            super.add(pages.get(page));
            ((CanShow) pages.get(page)).onShow();
            shown = page;
        }
    }
}
