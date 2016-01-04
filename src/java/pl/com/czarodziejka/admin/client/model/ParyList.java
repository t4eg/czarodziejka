/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.czarodziejka.admin.client.model;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author admin
 */
public class ParyList {

    public static final Map<Integer, String> map = new TreeMap<>();

    static {
        map.put(0, "");
        map.put(1, "piraci");
        map.put(2, "indianie, kowboj");
        map.put(3, "robin hood, marion");
        map.put(4, "meksykanin");
        map.put(5, "star wars");
        map.put(7, "wojownik japonski");
        map.put(8, "diabeł, aniol");
        map.put(9, "drakula wampir");
        map.put(10, "ksiadz zakonnica");
        map.put(11, "tancerka turecka");
        map.put(12, "clown");
        map.put(13, "pszczola");
        map.put(14, "hipis");
        map.put(15, "szlachta");
        map.put(16, "dama, dworzanin");
        map.put(17, "jaskiniowiec");
        map.put(18, "wilk zajac, kapturek");
        map.put(19, "cygan");
        map.put(20, "disco");
        map.put(21, "sniezka krasnale");
        map.put(22, "krol");
        map.put(23, "hindus");
        map.put(24, "arlekin");
        map.put(25, "krowka, byk");
        map.put(26, "kopciuszek, ksiaze");
        map.put(27, "szkot");
        map.put(28, "marynarz, kapitan");
        map.put(29, "policjant");
        map.put(30, "stewardessa, pilot");
        map.put(32, "piotrus pan");
        map.put(33, "wonder woman, superman, spiderman");
        map.put(34, "napoleon, empire");
        map.put(35, "hawajka");
        map.put(37, "al capone");
        map.put(38, "golfista");
        map.put(39, "rzymianin, wojownik");
        map.put(41, "bawarka");
        map.put(43, "sułtan");
        map.put(44, "sutener, sexy lady");
        map.put(46, "smerfy");
        map.put(49, "avatar");
        map.put(52, "hiszpanka");
        map.put(53, "posejdon, syrena");
        map.put(54, "Leprechaun");
        map.put(55, "pastuszek");
        map.put(65, "egipcjanin, kleopatra");
        map.put(67, "aladyn");
        map.put(72, "ninja");
        map.put(76, "greczynka");
    }

    public static String getIndex(String selected) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(selected)) {
                return entry.getKey().toString();
            }
        }
        return "";
    }
}
