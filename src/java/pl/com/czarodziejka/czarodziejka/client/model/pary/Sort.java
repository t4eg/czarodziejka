package pl.com.czarodziejka.czarodziejka.client.model.pary;

import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Costume;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Administrator
 */
public class Sort {

    static ArrayList<Costume> group2(ArrayList<Costume> records) {
        LinkedList<Costume> list = new LinkedList<Costume>();

        for (Costume stroj : records) {
            int indexOfGroup = getFirstIndexOfGroup(list, stroj.getGrupaPary());
            if (indexOfGroup == -1) {
                list.add(stroj);
            } else {
                list.add(indexOfGroup + 1, stroj);
            }
        }

        ArrayList<Costume> result = new ArrayList<Costume>(records.size());
        for (Costume stroj : list) {
            result.add(stroj);
        }
        return result;
    }

    private static int getFirstIndexOfGroup(LinkedList<Costume> list, int groupNumber) {
        for (Costume stroj : list) {
            if (stroj.getGrupaPary() == groupNumber) {
                return list.indexOf(stroj);
            }
        }
        return -1;
    }
}
