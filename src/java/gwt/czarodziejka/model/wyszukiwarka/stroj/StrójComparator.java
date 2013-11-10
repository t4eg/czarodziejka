package gwt.czarodziejka.model.wyszukiwarka.stroj;

import java.util.Comparator;

/**
 *
 * @author Administrator
 */
public class StrójComparator implements Comparator<Strój> {

    @Override
    public int compare(Strój o1, Strój o2) {
        return o1.getOrder().compareTo(o2.getOrder());
    }
}
