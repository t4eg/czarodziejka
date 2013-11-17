package gwt.czarodziejka.model.wyszukiwarka;

import gwt.czarodziejka.model.wyszukiwarka.stroj.*;
import gwt.czarodziejka.presenter.wyszukiwarka.WyszukiwarkaPresenter;
import gwt.czarodziejka.view.wyszukiwarka.WyszukiwarkaView;
import gwt.czarodziejka.view.wyszukiwarka.components.SelectMany;
import gwt.czarodziejka.view.wyszukiwarka.components.SelectOne;
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

    public ArrayList<Strój> findMachingStroj() {
        Filters data = getFiltry();
        ArrayList<Strój> found = RecordsMatcher.getInstance().match(data);
        return found;
    }

    private Filters getFiltry() {
        Filters filtry = new Filters();
        if (!view.getBeltFrom().getSelected().isEmpty()) {
            filtry.setBeltFrom(Pas.getNr(view.getBeltFrom().getSelected()));
        }
        if (!view.getBeltTo().getSelected().isEmpty()) {
            filtry.setBeltTo(Pas.getNr(view.getBeltTo().getSelected()));
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
        filtry.setKategoria(Kategoria.get(view.getCategory().getSelected()));
        filtry.setNazwa(view.getName().getText());
        if (!view.getNumber().getText().isEmpty()) {
            filtry.setNumer(Integer.parseInt(view.getNumber().getText()));
        }
        filtry.setOkazja(Okazja.get(view.getOcasion().getSelected()));
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
        setValues(view.getBeltFrom(), Pas.values());
        view.getBeltFrom().setSelectedIndex(0);
        setValues(view.getBeltTo(), Pas.values());
        view.getBeltTo().setSelectedIndex(Pas.values().length - 1);
        setValues(view.getHeightFrom(), Wzrost.values());
        view.getHeightFrom().setSelectedIndex(0);
        setValues(view.getHeightTo(), Wzrost.values());
        view.getHeightTo().setSelectedIndex(Wzrost.values().length - 1);
        setValues(view.getCategory(), Kategoria.values());
        view.getCategory().setSelectedAll();
        setValues(view.getOcasion(), Okazja.values());
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
        Wzrost previouslySelected = Wzrost.valueOf(Integer.valueOf(view.getHeightTo().getSelected()));

        Wzrost[] values = Wzrost.values();
        ArrayList<Wzrost> filteredValues = new ArrayList<Wzrost>();
        for (Wzrost value : values) {
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
        Pas previouslySelected = Pas.valueOf(view.getBeltTo().getSelected());

        Pas[] values = Pas.values();
        ArrayList<Pas> filteredValues = new ArrayList<Pas>();
        for (Pas value : values) {
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
