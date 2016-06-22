package pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Adam Mazur
 */
public enum Category {

    FAIRY_TALES("Bajki"),
    WILD_WEST("Dziki Zachód"),
    MOVIE_STAGE("Film i scena"),
    HISTORICAL("Historyczne"),
    YEARS_20_30("Lata 20 i 30"),
    YEARS_50_60("Lata 50 i 60"),
    YEARS_70_80("Lata 70 i 80"),
    NATIONALISTIC("Narodowościowe"),
    FRUITS_VEGETABLES("Owoce i warzywa"),
    PIRATES("Pirackie"),
    SEXY("Sexy"),
    SUPER_HEROES("Super bohaterowie"),
    PROFESSIONS("Zawody"),
    ANIMALS("Zwierzęta"),
    OTHERS("Inne");

    private final String toString;
    private static final Map<String, Category> map = new HashMap<>();

    static {
        for (Category c : Category.values()) {
            map.put(c.toString(), c);
        }
    }

    Category(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }

    public static Category[] get(String[] name) {
        ArrayList<Category> result = new ArrayList<>();
        for (String s : name) {
            result.add(map.get(s));
        }
        return result.toArray(new Category[result.size()]);
    }
}
