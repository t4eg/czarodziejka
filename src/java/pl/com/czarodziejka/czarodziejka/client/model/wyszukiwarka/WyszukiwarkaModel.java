package pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka;

import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Category;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Height;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Costume;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Belt;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Occasion;
import pl.com.czarodziejka.czarodziejka.client.presenter.wyszukiwarka.WyszukiwarkaPresenter;
import pl.com.czarodziejka.czarodziejka.client.view.wyszukiwarka.WyszukiwarkaView;
import pl.com.czarodziejka.czarodziejka.client.view.wyszukiwarka.components.SelectMany;
import pl.com.czarodziejka.czarodziejka.client.view.wyszukiwarka.components.SelectOne;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class WyszukiwarkaModel {

    private static WyszukiwarkaModel instance;
    private WyszukiwarkaView view = WyszukiwarkaView.getInstance();

    public static WyszukiwarkaModel getInstance() {
        if (instance == null) {
            instance = new WyszukiwarkaModel();
        }
        return instance;
    }

    private WyszukiwarkaModel() {
    }

    public ArrayList<Costume> findMachingStroj() {
        Filters data = getFiltry();
        ArrayList<Costume> found = RecordsMatcher.getInstance().match(data);
        return found;
    }

    private Filters getFiltry() {
        Filters filtry = new Filters();
        if (!view.getBeltFrom().getSelected().isEmpty()) {
            filtry.setBeltFrom(Belt.getNr(view.getBeltFrom().getSelected()));
        }
        if (!view.getBeltTo().getSelected().isEmpty()) {
            filtry.setBeltTo(Belt.getNr(view.getBeltTo().getSelected()));
        }
        filtry.setDorosly(view.getAdult().getValue());
        filtry.setDziecko(view.getChild().getValue());
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
        filtry.setKategoria(Category.get(view.getCategory().getSelected()));
        filtry.setNazwa(view.getName().getText());
        if (!view.getNumber().getText().isEmpty()) {
            filtry.setNumer(Integer.parseInt(view.getNumber().getText()));
        }
        filtry.setOkazja(Occasion.get(view.getOcasion().getSelected()));
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
        WyszukiwarkaPresenter.getInstance().refreshComponents();
        view.setRecordsCount(WyszukiwarkaModel.getInstance().findMachingStroj().size());
        view.getClothCountInfo().setInfo(Database.getInstance().getStroje().size());
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
            if (value.getNr() >= beltFrom) {
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
