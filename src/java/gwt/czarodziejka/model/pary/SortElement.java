package gwt.czarodziejka.model.pary;

import gwt.czarodziejka.model.wyszukiwarka.stroj.Strój;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class SortElement extends ArrayList<Strój> {

    private int group;

    SortElement(int group) {
        this.group = group;
    }

    public int getGroup() {
        return group;
    }
}
