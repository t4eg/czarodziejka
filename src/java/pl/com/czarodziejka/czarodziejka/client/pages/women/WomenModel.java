package pl.com.czarodziejka.czarodziejka.client.pages.women;

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
public class WomenModel {

    private final WomenView view;

    public WomenModel(WomenView view) {
        this.view = view;
    }

    public void setData() {
        Filters data = getFilters();
        ArrayList<Costume> matchingRecords = RecordsMatcher.getInstance().match(data);
        view.getPhotosTable().getModel().setData(matchingRecords);
    }

    private Filters getFilters() {
        Filters filters = new Filters();
        filters.setBeltFrom(Belt.XS.getId());
        filters.setBeltTo(Belt.XXL.getId());
        filters.setAdult(true);
        filters.setChild(false);
        filters.setFemale(true);
        filters.setMale(false);
        filters.setForPair(true);
        filters.setNoPair(true);
        filters.setHeightFrom(Height.getMin().getHeight());
        filters.setHeightTo(Height.getMax().getHeight());
        filters.setCategories(Category.values());
        filters.setOccasions(Occasion.values());
        return filters;
    }
}
