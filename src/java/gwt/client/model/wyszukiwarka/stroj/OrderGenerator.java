package gwt.client.model.wyszukiwarka.stroj;

import java.util.HashMap;

/**
 *
 * @author Administrator
 */
public class OrderGenerator {

    private static final HashMap<Character, String> map = new HashMap<Character, String>();

    static {
        map.put(' ', "00");
        map.put('0', "01");
        map.put('1', "02");
        map.put('2', "03");
        map.put('3', "04");
        map.put('4', "05");
        map.put('5', "06");
        map.put('6', "07");
        map.put('7', "08");
        map.put('8', "09");
        map.put('9', "10");
        map.put('a', "11");
        map.put('ą', "12");
        map.put('b', "13");
        map.put('c', "14");
        map.put('ć', "15");
        map.put('d', "16");
        map.put('e', "17");
        map.put('ę', "18");
        map.put('f', "19");
        map.put('g', "20");
        map.put('h', "21");
        map.put('i', "22");
        map.put('j', "23");
        map.put('k', "24");
        map.put('l', "25");
        map.put('ł', "26");
        map.put('m', "27");
        map.put('n', "28");
        map.put('ń', "29");
        map.put('o', "30");
        map.put('ó', "31");
        map.put('p', "32");
        map.put('q', "33");
        map.put('r', "34");
        map.put('s', "35");
        map.put('ś', "36");
        map.put('t', "37");
        map.put('u', "38");
        map.put('v', "39");
        map.put('w', "40");
        map.put('x', "41");
        map.put('y', "42");
        map.put('z', "43");
        map.put('ź', "44");
        map.put('ż', "45");
    }

    public static String getOrder(String name) {
        StringBuilder sb = new StringBuilder();
        char[] chars = name.toCharArray();
        for (char c : chars) {
            String toAdd = map.get(Character.toLowerCase(c));
            if (toAdd != null) {
                sb.append(toAdd);
            }
        }
        return sb.toString();
    }
}
