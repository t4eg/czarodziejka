package pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume;

/**
 *
 * @author Administrator
 */
public class Size {

    private int sizeFrom;
    private int sizeTo;
    private int beltFrom;
    private int beltTo;

    public Size(Height height) {
        storeHeight(height, height);
    }

    public Size(Height heightFrom, Height heightTo) {
        storeHeight(heightFrom, heightTo);
    }

    public Size(Height height, Belt belt) {
        storeHeight(height, height);
        storeBelt(belt, belt);
    }

    public Size(Height heightFrom, Height heightTo, Belt belt) {
        storeHeight(heightFrom, heightTo);
        storeBelt(belt, belt);
    }

    public Size(Height h, Belt beltFrom, Belt beltTo) {
        storeHeight(h, h);
        storeBelt(beltFrom, beltTo);
    }

    public Size(Height heightFrom, Height heightTo, Belt beltFrom, Belt beltTo) {
        storeHeight(heightFrom, heightTo);
        storeBelt(beltFrom, beltTo);
    }

    private void storeHeight(Height from, Height to) {
        this.sizeFrom = from.getHeight();
        this.sizeTo = to.getHeight();
        if (from.getHeight() > to.getHeight()) {
            throw new RuntimeException("Height 'From' is higher than 'To'.");
        }
    }

    private void storeBelt(Belt from, Belt to) {
        this.beltFrom = from.getId();
        this.beltTo = to.getId();
        if (from.getId() > to.getId()) {
            throw new RuntimeException("Belt 'From' is higher than 'To'.");
        }
    }

    public int getSizeFrom() {
        return sizeFrom;
    }

    public int getSizeTo() {
        return sizeTo;
    }

    public int getBeltFrom() {
        return beltFrom;
    }

    public int getBeltTo() {
        return beltTo;
    }
}
