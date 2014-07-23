package gwt.czarodziejka.model.wyszukiwarka.costume;

/**
 *
 * @author Administrator
 */
public enum Height {

    cm_86(86),
    cm_92(92),
    cm_98(98),
    cm_104(104),
    cm_110(110),
    cm_116(116),
    cm_122(122),
    cm_128(128),
    cm_134(134),
    cm_140(140),
    cm_146(146),
    cm_152(152),
    cm_158(158),
    cm_164(164),
    cm_170(170),
    cm_176(176),
    cm_182(182),
    cm_188(188),
    cm_194(194);
    private int height;

    Height(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return Integer.toString(height);
    }

    public static Height getMin() {
        return Height.cm_86;
    }

    public static Height getMax() {
        return Height.cm_194;
    }

    public static Height valueOf(int val) {
        for (Height w : values()) {
            if (w.getHeight() == val) {
                return w;
            }
        }
        return null;
    }
}
