package pl.com.czarodziejka.czarodziejka.client.pages.search.p;

import pl.com.czarodziejka.czarodziejka.client.pages.search.m.SearchModel;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Belt;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.SearchView;

/**
 *
 * @author Administrator
 */
public class SearchPresenter {

    private SearchView view = SearchView.getInstance();
    private static SearchPresenter instance;

    public static SearchPresenter getInstance() {
        if (instance == null) {
            instance = new SearchPresenter();
        }
        return instance;
    }

    private SearchPresenter() {
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
        view.getForPair().addValueChangeHandler(filterChanged);
        view.getForPair().addKeyPressHandler(filterChanged);
        view.getNoPair().addValueChangeHandler(filterChanged);
        view.getNoPair().addKeyPressHandler(filterChanged);
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
        view.getSearch().addClickHandler(new SearchClickHandler());
    }

    public final void refreshComponents() {
        if (view.getAdult().getValue()) {
            view.getBeltFrom().setEnabled(true);
            view.getBeltTo().setEnabled(true);
            view.getForPair().setEnabled(true);
            view.getNoPair().setEnabled(true);
        } else {
            view.getBeltFrom().setEnabled(false);
            view.getBeltTo().setEnabled(false);
            view.getForPair().setEnabled(false);
            view.getNoPair().setEnabled(false);
        }

        SearchModel.getInstance().setHeightTo(Integer.valueOf(view.getHeightFrom().getSelected()));
        SearchModel.getInstance().setBeltTo(Belt.getId(view.getBeltFrom().getSelected()));
    }
}
