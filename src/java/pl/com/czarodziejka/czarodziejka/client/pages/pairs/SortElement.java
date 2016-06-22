package pl.com.czarodziejka.czarodziejka.client.pages.pairs;

import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Costume;
import java.util.ArrayList;

/**
 *
 * @author Adam Mazur
 */
public class SortElement extends ArrayList<Costume> {

    private final int group;

    SortElement(int group) {
        this.group = group;
    }

    public int getGroup() {
        return group;
    }
}
