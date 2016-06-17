package pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume;

/**
 *
 * @author Adam Mazur
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
    private final int id;

    Belt(int id) {
        this.id = id;
    }

    public static int getId(String name) {
        return Belt.valueOf(name).id;
    }

    public static String getString(int nr) {
        for (Belt pas : values()) {
            if (pas.id == nr) {
                return pas.toString();
            }
        }
        return "";
    }

    public int getId() {
        return id;
    }
}
