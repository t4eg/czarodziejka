package pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume;

import java.util.ArrayList;

/**
 *
 * @author Adam Mazur
 */
public enum Category {

    FAIRY_TALES,
    WILD_WEST,
    MOVIE_STAGE,
    HISTORICAL,
    YEARS_20_30,
    YEARS_50_60,
    YEARS_70_80,
    NATIONALISTIC,
    FRUITS_VEGETABLES,
    PIRATES,
    SEXY,
    SUPER_HEROES,
    PROFESSIONS,
    ANIMALS,
    OTHERS;

    @Override
    public String toString() {
        return super.toString().replace('_', ' ');
    }

    public static Category get(String name) {
        return valueOf(name.replace(' ', '_'));
    }

    public static Category[] get(String[] name) {
        ArrayList<Category> result = new ArrayList<>();
        for (String s : name) {
            result.add(get(s));
        }
        return result.toArray(new Category[result.size()]);
    }
}
