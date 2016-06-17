package pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume;

/**
 *
 * @author Administrator
 */
public class Photo {

    private Integer number;
    private boolean isHorizontal;

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
