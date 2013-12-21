package gwt.czarodziejka.model.mezczyzni;

import gwt.czarodziejka.model.wyszukiwarka.Filters;
import gwt.czarodziejka.model.wyszukiwarka.RecordsMatcher;
import gwt.czarodziejka.model.wyszukiwarka.stroj.*;
import gwt.czarodziejka.view.mezczyzni.MezczyzniView;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class MezczyzniModel {

    private MezczyzniView view;

    public MezczyzniModel(MezczyzniView view) {
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
        filtry.setFemale(false);
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
