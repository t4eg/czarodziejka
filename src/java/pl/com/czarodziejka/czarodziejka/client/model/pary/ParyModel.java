package pl.com.czarodziejka.czarodziejka.client.model.pary;

import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Category;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Height;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Costume;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Belt;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Occasion;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.Filters;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.RecordsMatcher;
import pl.com.czarodziejka.czarodziejka.client.view.pary.ParyView;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class ParyModel {

    private ParyView view;

    public ParyModel(ParyView view) {
        this.view = view;
    }

    public void setData() {
        Filters data = getFiltry();
        ArrayList<Costume> matchingRecords = RecordsMatcher.getInstance().match(data);
        ArrayList<Costume> sorted = Sort.group2(matchingRecords);
        view.getPhotosTable().getModel().setStrojToTable(sorted);
    }

    private Filters getFiltry() {
        Filters filtry = new Filters();
        filtry.setBeltFrom(Belt.XS.getNr());
        filtry.setBeltTo(Belt.XXL.getNr());
        filtry.setDorosly(true);
        filtry.setDziecko(false);
        filtry.setFemale(true);
        filtry.setMale(true);
        filtry.setForPair(true);
        filtry.setNoPair(false);
        filtry.setHeightFrom(Height.getMin().getHeight());
        filtry.setHeightTo(Height.getMax().getHeight());
        filtry.setKategoria(Category.values());
        filtry.setOkazja(Occasion.values());
        return filtry;
    }
}
