package gwt.czarodziejka.model.wyszukiwarka.stroj;

/**
 *
 * @author Administrator
 */
public enum Pas {

    XS(0),
    S(1),
    M(2),
    L(3),
    XL(4),
    XXL(5);
    private int nr;

    Pas(int nr) {
        this.nr = nr;
    }

    public static int getNr(String name) {
        return Pas.valueOf(name).nr;
    }

    public static String getString(int nr) {
        for (Pas pas : values()) {
            if (pas.nr == nr) {
                return pas.toString();
            }
        }
        return "";
    }

    public int getNr() {
        return nr;
    }
}
