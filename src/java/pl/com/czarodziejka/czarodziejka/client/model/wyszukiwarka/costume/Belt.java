package pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume;

/**
 *
 * @author Administrator
 */
public enum Belt {

    XS(0),
    S(1),
    M(2),
    L(3),
    XL(4),
    XXL(5),
    XXXL(6),
    XXXXL(7);
    private int nr;

    Belt(int nr) {
        this.nr = nr;
    }

    public static int getNr(String name) {
        return Belt.valueOf(name).nr;
    }

    public static String getString(int nr) {
        for (Belt pas : values()) {
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
