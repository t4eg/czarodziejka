package pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public enum Category {

    Bajki,
    Dziki_zachód,
    Film_i_scena,
    Historyczne,
    Lata_20_i_30,
    Lata_50_i_60,
    Lata_70_i_80,
    Narodowościowe,
    Owoce_i_warzywa,
    Pirackie,
    Sexy,
    Super_bohaterowie,
    Zawody,
    Zwierzęta,
    Inne;

    @Override
    public String toString() {
        return super.toString().replace('_', ' ');
    }

    public static Category get(String name) {
        return valueOf(name.replace(' ', '_'));
    }

    public static Category[] get(String[] name) {
        ArrayList<Category> result = new ArrayList<Category>();
        for (String s : name) {
            result.add(get(s));
        }
        return result.toArray(new Category[result.size()]);
    }
}
