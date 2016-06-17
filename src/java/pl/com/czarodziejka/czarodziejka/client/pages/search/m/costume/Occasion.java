package pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume;

import java.util.ArrayList;

/**
 *
 * @author Adam Mazur
 */
public enum Occasion {

    Andrzejki,
    Halloween,
    Jasełka,
    Mikołajki,
    Inne;

    public static Occasion get(String name) {
        return valueOf(name);
    }

    public static Occasion[] get(String[] name) {
        ArrayList<Occasion> result = new ArrayList<>();
        for (String s : name) {
            result.add(valueOf(s));
        }
        return result.toArray(new Occasion[result.size()]);
    }
}
