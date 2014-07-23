package gwt.czarodziejka.model.pary;

import gwt.czarodziejka.model.wyszukiwarka.costume.Costume;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class SortElement extends ArrayList<Costume> {

    private int group;

    SortElement(int group) {
        this.group = group;
    }

    public int getGroup() {
        return group;
    }
}
