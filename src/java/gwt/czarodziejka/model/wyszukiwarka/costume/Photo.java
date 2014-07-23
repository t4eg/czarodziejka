package gwt.czarodziejka.model.wyszukiwarka.costume;

/**
 *
 * @author Administrator
 */
public class Photo {

    private Integer number;
    private boolean poziomy;

    public Photo(Integer number, Boolean poziomy) {
        this.number = number;
        this.poziomy = poziomy;
    }

    public Integer getNumber() {
        return number;
    }

    public boolean getPoziomy() {
        return poziomy;
    }

    @Override
    public String toString() {
        return number.toString();
    }
}
