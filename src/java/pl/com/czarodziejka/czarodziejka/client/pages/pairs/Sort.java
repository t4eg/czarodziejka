package pl.com.czarodziejka.czarodziejka.client.pages.pairs;

import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Costume;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Adam Mazur
 */
public class Sort {

    static ArrayList<Costume> group2(ArrayList<Costume> records) {
        LinkedList<Costume> list = new LinkedList<>();

        for (Costume c : records) {
            int indexOfGroup = getFirstIndexOfGroup(list, c.getGrupaPary());
            if (indexOfGroup == -1) {
                list.add(c);
            } else {
                list.add(indexOfGroup + 1, c);
            }
        }

        ArrayList<Costume> result = new ArrayList<>(records.size());
        for (Costume c : list) {
            result.add(c);
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
