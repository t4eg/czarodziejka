package gwt.client.presenter.dodajStroj;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import gwt.client.presenter.wyszukiwarka.*;
import gwt.client.model.wyszukiwarka.WyszukiwarkaModel;
import gwt.client.model.wyszukiwarka.stroj.Pas;
import gwt.client.view.dodajStroj.DodajStrojView;
import gwt.client.view.wyszukiwarka.WyszukiwarkaView;

/**
 *
 * @author Administrator
 */
public class DodajStrojPresenter {

    private final DodajStrojView view;

    public DodajStrojPresenter(final DodajStrojView view) {
        this.view = view;
        view.getReset().addClickHandler(new ClickHandler() {

            @Override
            public void onClick(ClickEvent event) {
                view.getModel().clearData();
                view.getModel().setData();
            }
        });
        view.getNumber().addKeyPressHandler(new NumberChangedHandler());
        view.getSave().addClickHandler(new ClickHandler() {

            @Override
            public void onClick(ClickEvent event) {
                view.getModel().saveData();
            }
        });
    }

    public final void refreshComponents() {

    }
}
