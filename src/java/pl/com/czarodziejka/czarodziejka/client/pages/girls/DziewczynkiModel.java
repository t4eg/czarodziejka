package pl.com.czarodziejka.czarodziejka.client.pages.girls;

import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Category;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Height;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Costume;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Belt;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Occasion;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.Filters;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.RecordsMatcher;
import pl.com.czarodziejka.czarodziejka.client.pages.girls.DziewczynkiView;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DziewczynkiModel {

    private DziewczynkiView view;

    public DziewczynkiModel(DziewczynkiView view) {
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
        filtry.setDorosly(false);
        filtry.setDziecko(true);
        filtry.setForPair(true);
        filtry.setNoPair(true);
        filtry.setMale(false);
        filtry.setFemale(true);
        filtry.setHeightFrom(Height.getMin().getHeight());
        filtry.setHeightTo(Height.getMax().getHeight());
        filtry.setKategoria(Category.values());
        filtry.setOkazja(Occasion.values());
        return filtry;
    }
}
