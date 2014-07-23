package gwt.czarodziejka.model.dziewczynki;

import gwt.czarodziejka.model.wyszukiwarka.costume.Category;
import gwt.czarodziejka.model.wyszukiwarka.costume.Height;
import gwt.czarodziejka.model.wyszukiwarka.costume.Costume;
import gwt.czarodziejka.model.wyszukiwarka.costume.Belt;
import gwt.czarodziejka.model.wyszukiwarka.costume.Occasion;
import gwt.czarodziejka.model.wyszukiwarka.Filters;
import gwt.czarodziejka.model.wyszukiwarka.RecordsMatcher;
import gwt.czarodziejka.view.dziewczynki.DziewczynkiView;
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
