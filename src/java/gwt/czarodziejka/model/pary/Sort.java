package gwt.czarodziejka.model.pary;

import gwt.czarodziejka.model.wyszukiwarka.stroj.Strój;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Administrator
 */
public class Sort {

    static ArrayList<Strój> group2(ArrayList<Strój> records) {
        LinkedList<Strój> list = new LinkedList<Strój>();

        for (Strój stroj : records) {
            int indexOfGroup = getFirstIndexOfGroup(list, stroj.getGrupaPary());
            if (indexOfGroup == -1) {
                list.add(stroj);
            } else {
                list.add(indexOfGroup + 1, stroj);
            }
        }

        ArrayList<Strój> result = new ArrayList<Strój>(records.size());
        for (Strój stroj : list) {
            result.add(stroj);
        }
        return result;
    }

    private static int getFirstIndexOfGroup(LinkedList<Strój> list, int groupNumber) {
        for (Strój stroj : list) {
            if (stroj.getGrupaPary() == groupNumber) {
                return list.indexOf(stroj);
            }
        }
        return -1;
    }
}
