package gwt.dodaj.presenter;

import gwt.czarodziejka.presenter.wyszukiwarka.NumberChangedHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import gwt.dodaj.view.DodajStrojView;

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
                if (view.validate()) {
                    view.getModel().saveData();
                    view.getModel().clearData();
                    view.getModel().setData();
                }
            }
        });
    }
}
