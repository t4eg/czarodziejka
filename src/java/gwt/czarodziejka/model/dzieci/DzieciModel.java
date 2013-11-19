package gwt.czarodziejka.model.dzieci;

import gwt.czarodziejka.model.wyszukiwarka.Filters;
import gwt.czarodziejka.model.wyszukiwarka.RecordsMatcher;
import gwt.czarodziejka.model.wyszukiwarka.stroj.*;
import gwt.czarodziejka.view.dzieci.DzieciView;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DzieciModel {

    private DzieciView view;

    public DzieciModel(DzieciView view) {
        this.view = view;
    }

    public void findMachingRecords() {
        Filters data = getFiltry();
        ArrayList<Strój> matchingRecords = RecordsMatcher.getInstance().match(data);
        view.getPhotosTable().getModel().setStrojToTable(matchingRecords);
    }

    private Filters getFiltry() {
        Filters filtry = new Filters();
        filtry.setBeltFrom(Pas.XS.getNr());
        filtry.setBeltTo(Pas.XXL.getNr());
        filtry.setDorosly(false);
        filtry.setDziecko(true);
        filtry.setForPair(true);
        filtry.setNoPair(true);
        filtry.setMale(true);
        filtry.setFemale(true);
        filtry.setHeightFrom(Wzrost.getMin().getHeight());
        filtry.setHeightTo(Wzrost.getMax().getHeight());
        filtry.setKategoria(Kategoria.values());
        filtry.setOkazja(Okazja.values());
        return filtry;
    }
}
