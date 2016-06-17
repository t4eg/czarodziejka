package pl.com.czarodziejka.czarodziejka.client.pages.search.m;

import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Category;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Height;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Costume;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Belt;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Occasion;
import pl.com.czarodziejka.czarodziejka.client.pages.search.p.SearchPresenter;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.SearchView;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.components.SelectMany;
import pl.com.czarodziejka.czarodziejka.client.pages.search.v.components.SelectOne;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class SearchModel {

    private static SearchModel instance;
    private SearchView view = SearchView.getInstance();

    public static SearchModel getInstance() {
        if (instance == null) {
            instance = new SearchModel();
        }
        return instance;
    }

    private SearchModel() {
    }

    public ArrayList<Costume> findMachingCostume() {
        Filters filters = getFilters();
        ArrayList<Costume> found = RecordsMatcher.getInstance().match(filters);
        return found;
    }

    private Filters getFilters() {
        Filters filtry = new Filters();
        if (!view.getBeltFrom().getSelected().isEmpty()) {
            filtry.setBeltFrom(Belt.getId(view.getBeltFrom().getSelected()));
        }
        if (!view.getBeltTo().getSelected().isEmpty()) {
            filtry.setBeltTo(Belt.getId(view.getBeltTo().getSelected()));
        }
        filtry.setAdult(view.getAdult().getValue());
        filtry.setChild(view.getChild().getValue());
        filtry.setFemale(view.getFemale().getValue());
        filtry.setForPair(view.getAdult().getValue() ? view.getForPair().getValue() : true);
        filtry.setNoPair(view.getAdult().getValue() ? view.getNoPair().getValue() : true);
        filtry.setMale(view.getMale().getValue());
        if (!view.getHeightFrom().getSelected().isEmpty()) {
            filtry.setHeightFrom(Integer.parseInt(view.getHeightFrom().getSelected()));
        }
        if (!view.getHeightTo().getSelected().isEmpty()) {
            filtry.setHeightTo(Integer.parseInt(view.getHeightTo().getSelected()));
        }
        filtry.setCategories(Category.get(view.getCategory().getSelected()));
        filtry.setName(view.getName().getText());
        if (!view.getNumber().getText().isEmpty()) {
            filtry.setNumber(Integer.parseInt(view.getNumber().getText()));
        }
        filtry.setOccasions(Occasion.get(view.getOcasion().getSelected()));
        return filtry;
    }

    public void clearData() {
        view.getNumber().setValue(null);
        view.getName().setValue(null);
        view.getAdult().setValue(true);
        view.getChild().setValue(true);
        view.getFemale().setValue(true);
        view.getMale().setValue(true);
        view.getForPair().setValue(true);
        view.getNoPair().setValue(true);
        view.getBeltFrom().clear();
        view.getBeltTo().clear();
        view.getHeightFrom().clear();
        view.getHeightTo().clear();
        view.getCategory().clear();
        view.getOcasion().clear();
    }

    public void setData() {
        view.getNumber().setValue(null);
        view.getName().setValue(null);
        view.getAdult().setValue(true);
        view.getChild().setValue(true);
        view.getFemale().setValue(true);
        view.getMale().setValue(true);
        view.getForPair().setValue(true);
        view.getNoPair().setValue(true);
        setValues(view.getBeltFrom(), Belt.values());
        view.getBeltFrom().setSelectedIndex(0);
        setValues(view.getBeltTo(), Belt.values());
        view.getBeltTo().setSelectedIndex(Belt.values().length - 1);
        setValues(view.getHeightFrom(), Height.values());
        view.getHeightFrom().setSelectedIndex(0);
        setValues(view.getHeightTo(), Height.values());
        view.getHeightTo().setSelectedIndex(Height.values().length - 1);
        setValues(view.getCategory(), Category.values());
        view.getCategory().setSelectedAll();
        setValues(view.getOcasion(), Occasion.values());
        view.getOcasion().setSelectedAll();
        SearchPresenter.getInstance().refreshComponents();
        view.setRecordsCount(SearchModel.getInstance().findMachingCostume().size());
        view.getClothCountInfo().setInfo(Database.getInstance().getCostumes().size());
    }

    private void setValues(SelectOne box, Object[] values) {
        for (Object v : values) {
            box.addItem(v.toString());
        }
    }

    private void setValues(SelectMany box, Object[] values) {
        for (Object v : values) {
            box.add(v.toString());
        }
    }

    public void setHeightTo(int heightFrom) {
        Height previouslySelected = Height.valueOf(Integer.valueOf(view.getHeightTo().getSelected()));

        Height[] values = Height.values();
        ArrayList<Height> filteredValues = new ArrayList<Height>();
        for (Height value : values) {
            if (value.getHeight() >= heightFrom) {
                filteredValues.add(value);
            }
        }

        view.getHeightTo().clear();
        setValues(view.getHeightTo(), filteredValues.toArray());

        if (filteredValues.contains(previouslySelected)) {
            view.getHeightTo().setSelectedIndex(filteredValues.indexOf(previouslySelected));
        } else {
            view.getHeightTo().setSelectedIndex(0);
        }
    }

    public void setBeltTo(int beltFrom) {
        Belt previouslySelected = Belt.valueOf(view.getBeltTo().getSelected());

        Belt[] values = Belt.values();
        ArrayList<Belt> filteredValues = new ArrayList<Belt>();
        for (Belt value : values) {
            if (value.getId() >= beltFrom) {
                filteredValues.add(value);
            }
        }

        view.getBeltTo().clear();
        setValues(view.getBeltTo(), filteredValues.toArray());

        if (filteredValues.contains(previouslySelected)) {
            view.getBeltTo().setSelectedIndex(filteredValues.indexOf(previouslySelected));
        } else {
            view.getBeltTo().setSelectedIndex(0);
        }
    }
}
