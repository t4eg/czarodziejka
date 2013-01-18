package gwt.client.model.wyszukiwarka;

import gwt.client.model.wyszukiwarka.stroj.Kategoria;
import gwt.client.model.wyszukiwarka.stroj.Okazja;
import gwt.client.model.wyszukiwarka.stroj.Rozmiar;
import gwt.client.model.wyszukiwarka.stroj.Strój;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class RecordsMatcher {

    private static RecordsMatcher instance;
    private Filters filters;
    private Strój stroj;

    public static RecordsMatcher getInstance() {
        if (instance == null) {
            instance = new RecordsMatcher();
        }
        return instance;
    }

    private RecordsMatcher() {
    }

    public List<Strój> match(Filters filters) {
        this.filters = filters;
        List<Strój> result = new ArrayList<Strój>();
        List<Strój> stroje = Database.getInstance().getStroje();
        for (Strój str : stroje) {
            stroj = str;
            if (isCategoryOk()
                    && isNameOk()
                    && isNumberOk()
                    && isOcasionOk()
                    && isSexOk()
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
        Kategoria[] filterCategories = filters.getKategoria();
        for (Kategoria filterCategory : filterCategories) {
            for (Kategoria strojCategory : stroj.getKategoria()) {
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
        Okazja[] filterOcasions = filters.getOkazja();
        for (Okazja filterOcasion : filterOcasions) {
            for (Okazja strojOcasion : stroj.getOkazja()) {
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

    private boolean isSizeOk() {
        Rozmiar[] sizes = stroj.getRozmiar();
        switch (stroj.getWiek()) {
            case DOROSŁY:
                for (Rozmiar size : sizes) {
                    if (isInRange(size.getWzrostOd(), size.getWzrostDo(), filters.getHeightFrom(), filters.getHeightTo())
                            && isInRange(size.getPasOd(), size.getPasDo(), filters.getBeltFrom(), filters.getBeltTo())) {
                        return true;
                    }
                }
                break;
            default: //dziecko i miesznay
                for (Rozmiar size : sizes) {
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
