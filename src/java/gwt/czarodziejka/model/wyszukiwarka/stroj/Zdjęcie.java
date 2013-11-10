package gwt.czarodziejka.model.wyszukiwarka.stroj;

/**
 *
 * @author Administrator
 */
public class Zdjęcie {

    private Integer number;
    private boolean poziomy;

    public Zdjęcie(Integer number, Boolean poziomy) {
        this.number = number;
        this.poziomy = poziomy;
    }

    public Integer getNumber() {
        return number;
    }

    public boolean getPoziomy() {
        return poziomy;
    }
}
