package pl.com.czarodziejka.czarodziejka.client.pages.pairs;

import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Category;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Height;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Costume;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Belt;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Occasion;
import pl.com.czarodziejka.czarodziejka.client.pages.search.Filters;
import pl.com.czarodziejka.czarodziejka.client.pages.search.RecordsMatcher;
import java.util.ArrayList;

/**
 *
 * @author Adam Mazur
 */
public class PairsModel {

    private final PairsView view;

    public PairsModel(PairsView view) {
        this.view = view;
    }

    public void setData() {
        Filters data = getFilters();
        ArrayList<Costume> matchingRecords = RecordsMatcher.getInstance().match(data);
        ArrayList<Costume> sorted = Sort.group2(matchingRecords);
        view.getPhotosTable().getModel().setData(sorted);
    }

    private Filters getFilters() {
        Filters filters = new Filters();
        filters.setBeltFrom(Belt.XS.getId());
        filters.setBeltTo(Belt.XXL.getId());
        filters.setAdult(true);
        filters.setChild(false);
        filters.setFemale(true);
        filters.setMale(true);
        filters.setForPair(true);
        filters.setNoPair(false);
        filters.setHeightFrom(Height.getMin().getHeight());
        filters.setHeightTo(Height.getMax().getHeight());
        filters.setCategories(Category.values());
        filters.setOccasions(Occasion.values());
        return filters;
    }
}
