package gwt.client.model.dzieci;

import gwt.client.model.wyszukiwarka.*;
import gwt.client.model.wyszukiwarka.stroj.*;
import gwt.client.view.dzieci.DzieciView;
import gwt.client.view.wyszukiwarka.photoFrame.Frame;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class DzieciModel {

    private DzieciView view;
    private List<Strój> matchingRecords;

    public DzieciModel(DzieciView view) {
        this.view = view;
    }

    public void findMachingRecords() {
        Filters data = getFiltry();
        matchingRecords = RecordsMatcher.getInstance().match(data);
    }

    public void addRecordsToLayout() {
        view.clear();
        view.resize((int) Math.ceil(matchingRecords.size() / 4.), 4);

        for (int i = 0; i < matchingRecords.size(); i++) {
            int col = i % 4;
            int row = (int) Math.floor(i / 4.);
            view.setWidget(row, col, new Frame(matchingRecords.get(i)));
        }
    }

    private Filters getFiltry() {
        Filters filtry = new Filters();
        filtry.setBeltFrom(Pas.XS.getNr());
        filtry.setBeltTo(Pas.XXL.getNr());
        filtry.setDorosly(false);
        filtry.setDziecko(true);
        filtry.setFemale(true);
        filtry.setMale(true);
        filtry.setHeightFrom(Wzrost.getMin().getHeight());
        filtry.setHeightTo(Wzrost.getMax().getHeight());
        filtry.setKategoria(Kategoria.values());
        filtry.setOkazja(Okazja.values());
        return filtry;
    }
}
