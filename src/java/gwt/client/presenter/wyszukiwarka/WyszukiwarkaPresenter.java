package gwt.client.presenter.wyszukiwarka;

import gwt.client.model.wyszukiwarka.WyszukiwarkaModel;
import gwt.client.model.wyszukiwarka.stroj.Pas;
import gwt.client.model.wyszukiwarka.stroj.Wzrost;
import gwt.client.view.wyszukiwarka.WyszukiwarkaView;

/**
 *
 * @author Administrator
 */
public class WyszukiwarkaPresenter {

    private WyszukiwarkaView view = WyszukiwarkaView.getInstance();
    private static WyszukiwarkaPresenter instance;

    public static WyszukiwarkaPresenter getInstance() {
        if (instance == null) {
            instance = new WyszukiwarkaPresenter();
        }
        return instance;
    }

    private WyszukiwarkaPresenter() {
        FilterChangedHandler filterChanged = new FilterChangedHandler();
        view.getName().addValueChangeHandler(filterChanged);
        view.getName().addKeyPressHandler(filterChanged);
        view.getName().addSelectionHandler(filterChanged);
        view.getNumber().addValueChangeHandler(filterChanged);
        view.getNumber().addKeyPressHandler(new NumberChangedHandler());
        view.getNumber().addSelectionHandler(filterChanged);
        view.getAdult().addValueChangeHandler(filterChanged);
        view.getAdult().addKeyPressHandler(filterChanged);
        view.getChild().addValueChangeHandler(filterChanged);
        view.getChild().addKeyPressHandler(filterChanged);
        view.getMale().addValueChangeHandler(filterChanged);
        view.getMale().addKeyPressHandler(filterChanged);
        view.getFemale().addValueChangeHandler(filterChanged);
        view.getFemale().addKeyPressHandler(filterChanged);
        view.getHeightFrom().addChangeHandler(filterChanged);
        view.getHeightFrom().addKeyPressHandler(filterChanged);
        view.getHeightTo().addChangeHandler(filterChanged);
        view.getHeightTo().addKeyPressHandler(filterChanged);
        view.getBeltFrom().addChangeHandler(filterChanged);
        view.getBeltFrom().addKeyPressHandler(filterChanged);
        view.getBeltTo().addChangeHandler(filterChanged);
        view.getBeltTo().addKeyPressHandler(filterChanged);
        view.getOcasion().addValueChangeHandler(filterChanged);
        view.getCategory().addValueChangeHandler(filterChanged);

        view.getReset().addClickHandler(new ResetClickHandler());
        view.getSearch().addClickHandler(new SzukajClickHandler());
    }

    public final void refreshComponents() {
        if (view.getAdult().getValue()) {
            view.getBeltFrom().setEnabled(true);
            view.getBeltTo().setEnabled(true);
        } else {
            view.getBeltFrom().setEnabled(false);
            view.getBeltTo().setEnabled(false);
        }

        WyszukiwarkaModel.getInstance().setHeightTo(Integer.valueOf(view.getHeightFrom().getSelected()));
        WyszukiwarkaModel.getInstance().setBeltTo(Pas.getNr(view.getBeltFrom().getSelected()));
    }
}
