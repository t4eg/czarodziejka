package gwt.client.model.dodajStroj;

import gwt.client.model.wyszukiwarka.stroj.*;
import gwt.client.presenter.dodajStroj.DodajStrojPresenter;
import gwt.client.view.dodajStroj.DodajStrojView;
import gwt.client.view.dodajStroj.components.SelectManySimple;

/**
 *
 * @author Administrator
 */
public class DodajStrojModel {

    private final DodajStrojView view;
    private final DodajStrojPresenter presenter;
    private Integer strojNumber;

    public DodajStrojModel(DodajStrojView view) {
        this.view = view;
        this.presenter = new DodajStrojPresenter(view);
    }

    public void clearData() {
        view.getAddImages().reset();
        view.getNumber().setValue(null);
        view.getName().setValue(null);
        view.getChild().setValue(false);
        view.getAdult().setValue(false);
        view.getFemale().setValue(false);
        view.getMale().setValue(false);
        view.getOcasion().clear();
        view.getForPair().setValue(false);
        view.getCategory().clear();
        view.getAddRozmiary().reset();
    }

    public void setData() {
        view.getNumber().setValue(strojNumber == null ? null : strojNumber.toString());
        setValues(view.getCategory(), Kategoria.values());
        setValues(view.getOcasion(), Okazja.values());
        
        presenter.refreshComponents();
    }

    private void setValues(SelectManySimple box, Object[] values) {
        for (Object v : values) {
            box.add(v.toString());
        }
    }
}
