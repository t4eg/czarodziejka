package pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume;

/**
 *
 * @author Adam Mazur
 */
public class Photo {

    private final Integer number;
    private final boolean isHorizontal;

    public Photo(Integer number, Boolean isHorizontal) {
        this.number = number;
        this.isHorizontal = isHorizontal;
    }

    public Integer getNumber() {
        return number;
    }

    public boolean isHorizontal() {
        return isHorizontal;
    }

    @Override
    public String toString() {
        return number.toString();
    }
}
