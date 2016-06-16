package pl.com.czarodziejka.czarodziejka.client.pages.search.m;

import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Category;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Occasion;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Size;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Costume;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class RecordsMatcher {

    private static RecordsMatcher instance;
    private Filters filters;
    private Costume stroj;

    public static RecordsMatcher getInstance() {
        if (instance == null) {
            instance = new RecordsMatcher();
        }
        return instance;
    }

    private RecordsMatcher() {
    }

    public ArrayList<Costume> match(Filters filters) {
        this.filters = filters;
        ArrayList<Costume> result = new ArrayList<Costume>();
        ArrayList<Costume> stroje = Database.getInstance().getStroje();
        for (Costume str : stroje) {
            stroj = str;
            if (isCategoryOk()
                    && isNameOk()
                    && isNumberOk()
                    && isOcasionOk()
                    && isSexOk()
                    && isPairOk()
                    && isSizeOk()
                    && isAgeOk()) {
                result.add(stroj);
            }
        }
        return result;
    }

    private boolean isCategoryOk() {
        if (stroj.getKategoria() == null) {
            return true;
        }
        Category[] filterCategories = filters.getKategoria();
        for (Category filterCategory : filterCategories) {
            for (Category strojCategory : stroj.getKategoria()) {
                if (strojCategory == filterCategory) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isNameOk() {
        String name = filters.getNazwa();
        if (name == null || name.isEmpty()) {
            return true;
        } else {
            return stroj.getNazwa().toLowerCase().startsWith(name.toLowerCase());
        }
    }

    private boolean isNumberOk() {
        if (filters.getNumer() == null || stroj.getNumer() == null) {
            return true;
        } else {
            return stroj.getNumer() == filters.getNumer().intValue();
        }
    }

    private boolean isOcasionOk() {
        if (stroj.getOkazja() == null) {
            return true;
        }
        Occasion[] filterOcasions = filters.getOkazja();
        for (Occasion filterOcasion : filterOcasions) {
            for (Occasion strojOcasion : stroj.getOkazja()) {
                if (strojOcasion == filterOcasion) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isSexOk() {
        if (stroj.getPłeć() == null) {
            return true;
        }
        switch (stroj.getPłeć()) {
            case DAMSKI:
                return filters.getFemale();
            case DAMSKO_MĘSKI:
                return filters.getMale() || filters.getFemale();
            case MĘSKI:
                return filters.getMale();
        }
        return true;
    }

    private boolean isPairOk() {
        return (stroj.isDlaPary() && filters.getForPair()) || (!stroj.isDlaPary() && filters.getNoPair());
    }

    private boolean isSizeOk() {
        Size[] sizes = stroj.getRozmiar();
        switch (stroj.getWiek()) {
            case DOROSŁY:
                for (Size size : sizes) {
                    if (isInRange(size.getWzrostOd(), size.getWzrostDo(), filters.getHeightFrom(), filters.getHeightTo())
                            && isInRange(size.getPasOd(), size.getPasDo(), filters.getBeltFrom(), filters.getBeltTo())) {
                        return true;
                    }
                }
                break;
            default: //dziecko i miesznay
                for (Size size : sizes) {
                    if (isInRange(size.getWzrostOd(), size.getWzrostDo(), filters.getHeightFrom(), filters.getHeightTo())) {
                        return true;
                    }
                }
                break;
        }
        return false;
    }

    private boolean isInRange(int fromA, int toA, int fromB, int toB) {
        return (fromA <= fromB && fromB <= toA) || (fromA <= toB && toB <= toA)
                || (fromB <= fromA && fromA <= toB) || (fromB <= toA && toA <= toB);
    }

    private boolean isAgeOk() {
        if (stroj.getWiek() == null) {
            return true;
        }
        switch (stroj.getWiek()) {
            case DOROSŁY:
                return filters.getDorosly();
            case DZIECKO:
                return filters.getDziecko();
            case DZIECKO_DOROSŁY:
                return filters.getDorosly() || filters.getDziecko();
        }
        return true;
    }
}
