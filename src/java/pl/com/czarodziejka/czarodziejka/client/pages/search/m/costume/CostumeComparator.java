package pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume;

import java.util.Comparator;

/**
 *
 * @author Adam Mazur
 */
public class CostumeComparator implements Comparator<Costume> {

    @Override
    public int compare(Costume o1, Costume o2) {
        return o1.getOrder().compareTo(o2.getOrder());
    }
}
