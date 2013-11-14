package gwt.czarodziejka.model.wyszukiwarka.stroj;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public enum Kategoria {

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

    public static Kategoria get(String name) {
        return valueOf(name.replace(' ', '_'));
    }

    public static Kategoria[] get(String[] name) {
        ArrayList<Kategoria> result = new ArrayList<Kategoria>();
        for (String s : name) {
            result.add(get(s));
        }
        return result.toArray(new Kategoria[result.size()]);
    }
}
