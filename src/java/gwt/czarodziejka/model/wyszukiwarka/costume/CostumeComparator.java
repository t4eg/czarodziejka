package gwt.czarodziejka.model.wyszukiwarka.costume;

import java.util.Comparator;

/**
 *
 * @author Administrator
 */
public class CostumeComparator implements Comparator<Costume> {

    @Override
    public int compare(Costume o1, Costume o2) {
        return o1.getOrder().compareTo(o2.getOrder());
    }
}
