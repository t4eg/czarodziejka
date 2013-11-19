package gwt.czarodziejka.model.dorosli;

import gwt.czarodziejka.model.wyszukiwarka.Filters;
import gwt.czarodziejka.model.wyszukiwarka.RecordsMatcher;
import gwt.czarodziejka.model.wyszukiwarka.stroj.*;
import gwt.czarodziejka.view.dorosli.DorosliView;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DorosliModel {

    private DorosliView view;

    public DorosliModel(DorosliView view) {
        this.view = view;
    }

    public void setData() {
        Filters data = getFiltry();
        ArrayList<Strój> matchingRecords = RecordsMatcher.getInstance().match(data);
        view.getPhotosTable().getModel().setStrojToTable(matchingRecords);
    }

    private Filters getFiltry() {
        Filters filtry = new Filters();
        filtry.setBeltFrom(Pas.XS.getNr());
        filtry.setBeltTo(Pas.XXL.getNr());
        filtry.setDorosly(true);
        filtry.setDziecko(false);
        filtry.setFemale(true);
        filtry.setMale(true);
        filtry.setForPair(true);
        filtry.setNoPair(true);
        filtry.setHeightFrom(Wzrost.getMin().getHeight());
        filtry.setHeightTo(Wzrost.getMax().getHeight());
        filtry.setKategoria(Kategoria.values());
        filtry.setOkazja(Okazja.values());
        return filtry;
    }
}
