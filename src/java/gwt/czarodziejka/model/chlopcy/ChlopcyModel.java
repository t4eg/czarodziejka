package gwt.czarodziejka.model.chlopcy;

import gwt.czarodziejka.model.wyszukiwarka.Filters;
import gwt.czarodziejka.model.wyszukiwarka.RecordsMatcher;
import gwt.czarodziejka.model.wyszukiwarka.stroj.*;
import gwt.czarodziejka.view.chlopcy.ChlopcyView;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class ChlopcyModel {

    private ChlopcyView view;

    public ChlopcyModel(ChlopcyView view) {
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
        filtry.setDorosly(false);
        filtry.setDziecko(true);
        filtry.setForPair(true);
        filtry.setNoPair(true);
        filtry.setMale(true);
        filtry.setFemale(false);
        filtry.setHeightFrom(Wzrost.getMin().getHeight());
        filtry.setHeightTo(Wzrost.getMax().getHeight());
        filtry.setKategoria(Kategoria.values());
        filtry.setOkazja(Okazja.values());
        return filtry;
    }
}
