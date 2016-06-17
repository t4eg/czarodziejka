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
    private Costume costume;

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
        ArrayList<Costume> stroje = Database.getInstance().getCostumes();
        for (Costume str : stroje) {
            costume = str;
            if (isCategoryOk()
                    && isNameOk()
                    && isNumberOk()
                    && isOcasionOk()
                    && isSexOk()
                    && isPairOk()
                    && isSizeOk()
                    && isAgeOk()) {
                result.add(costume);
            }
        }
        return result;
    }

    private boolean isCategoryOk() {
        if (costume.getCategories() == null) {
            return true;
        }
        Category[] filterCategories = filters.getCategories();
        for (Category filterCategory : filterCategories) {
            for (Category strojCategory : costume.getCategories()) {
                if (strojCategory == filterCategory) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isNameOk() {
        String name = filters.getName();
        if (name == null || name.isEmpty()) {
            return true;
        } else {
            return costume.getName().toLowerCase().startsWith(name.toLowerCase());
        }
    }

    private boolean isNumberOk() {
        if (filters.getNumber() == null || costume.getNumber() == null) {
            return true;
        } else {
            return costume.getNumber() == filters.getNumber().intValue();
        }
    }

    private boolean isOcasionOk() {
        if (costume.getOccasions() == null) {
            return true;
        }
        Occasion[] filterOcasions = filters.getOccasions();
        for (Occasion filterOcasion : filterOcasions) {
            for (Occasion strojOcasion : costume.getOccasions()) {
                if (strojOcasion == filterOcasion) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isSexOk() {
        if (costume.getSex() == null) {
            return true;
        }
        switch (costume.getSex()) {
            case FEMALE:
                return filters.getFemale();
            case BOTH:
                return filters.getMale() || filters.getFemale();
            case MALE:
                return filters.getMale();
        }
        return true;
    }

    private boolean isPairOk() {
        return (costume.isForPair() && filters.getForPair()) || (!costume.isForPair() && filters.getNoPair());
    }

    private boolean isSizeOk() {
        Size[] sizes = costume.getSizes();
        switch (costume.getAge()) {
            case ADULT:
                for (Size size : sizes) {
                    if (isInRange(size.getSizeFrom(), size.getSizeTo(), filters.getHeightFrom(), filters.getHeightTo())
                            && isInRange(size.getBeltFrom(), size.getBeltTo(), filters.getBeltFrom(), filters.getBeltTo())) {
                        return true;
                    }
                }
                break;
            default: //dziecko i miesznay
                for (Size size : sizes) {
                    if (isInRange(size.getSizeFrom(), size.getSizeTo(), filters.getHeightFrom(), filters.getHeightTo())) {
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
        if (costume.getAge() == null) {
            return true;
        }
        switch (costume.getAge()) {
            case ADULT:
                return filters.getAdult();
            case CHILD:
                return filters.getChild();
            case CHILD_ADULT:
                return filters.getAdult() || filters.getChild();
        }
        return true;
    }
}
