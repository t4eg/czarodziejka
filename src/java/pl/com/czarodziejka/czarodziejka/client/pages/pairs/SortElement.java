package pl.com.czarodziejka.czarodziejka.client.pages.pairs;

import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Costume;
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
