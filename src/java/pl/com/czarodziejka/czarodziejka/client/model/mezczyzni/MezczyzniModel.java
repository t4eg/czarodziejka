package pl.com.czarodziejka.czarodziejka.client.model.mezczyzni;

import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Category;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Height;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Costume;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Belt;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Occasion;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.Filters;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.RecordsMatcher;
import pl.com.czarodziejka.czarodziejka.client.view.mezczyzni.MezczyzniView;
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
        ArrayList<Costume> matchingRecords = RecordsMatcher.getInstance().match(data);
        view.getPhotosTable().getModel().setStrojToTable(matchingRecords);
    }

    private Filters getFiltry() {
        Filters filtry = new Filters();
        filtry.setBeltFrom(Belt.XS.getNr());
        filtry.setBeltTo(Belt.XXL.getNr());
        filtry.setDorosly(true);
        filtry.setDziecko(false);
        filtry.setFemale(false);
        filtry.setMale(true);
        filtry.setForPair(true);
        filtry.setNoPair(true);
        filtry.setHeightFrom(Height.getMin().getHeight());
        filtry.setHeightTo(Height.getMax().getHeight());
        filtry.setKategoria(Category.values());
        filtry.setOkazja(Occasion.values());
        return filtry;
    }
}
