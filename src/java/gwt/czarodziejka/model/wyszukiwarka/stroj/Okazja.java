/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gwt.czarodziejka.model.wyszukiwarka.stroj;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public enum Okazja {

    Andrzejki,
    Halloween,
    Jasełka,
    Mikołajki,
    Inne;

    public static Okazja get(String name) {
        return valueOf(name);
    }

    public static Okazja[] get(String[] name) {
        List<Okazja> result = new ArrayList<Okazja>();
        for (String s : name) {
            result.add(valueOf(s));
        }
        return result.toArray(new Okazja[result.size()]);
    }
}
