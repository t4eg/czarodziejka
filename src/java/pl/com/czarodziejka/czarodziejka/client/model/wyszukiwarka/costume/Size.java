package pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume;

/**
 *
 * @author Administrator
 */
public class Size {

    private int wzrostOd;
    private int wzrostDo;
    private int pasOd;
    private int pasDo;

    public Size(Height wzrost) {
        storeWzrost(wzrost, wzrost);
    }

    public Size(Height wzrostOd, Height wzrostDo) {
        storeWzrost(wzrostOd, wzrostDo);
    }

    public Size(Height wzrost, Belt pas) {
        storeWzrost(wzrost, wzrost);
        storePas(pas, pas);
    }

    public Size(Height wzrostOd, Height wzrostDo, Belt pas) {
        storeWzrost(wzrostOd, wzrostDo);
        storePas(pas, pas);
    }

    public Size(Height wzrost, Belt pasOd, Belt pasDo) {
        storeWzrost(wzrost, wzrost);
        storePas(pasOd, pasDo);
    }

    public Size(Height wzrostOd, Height wzrostDo, Belt pasOd, Belt pasDo) {
        storeWzrost(wzrostOd, wzrostDo);
        storePas(pasOd, pasDo);
    }

    private void storeWzrost(Height from, Height to) {
        this.wzrostOd = from.getHeight();
        this.wzrostDo = to.getHeight();
        if (from.getHeight() > to.getHeight()) {
            throw new RuntimeException("Height 'From' is higher than 'To'.");
        }
    }

    private void storePas(Belt from, Belt to) {
        this.pasOd = from.getNr();
        this.pasDo = to.getNr();
        if (from.getNr() > to.getNr()) {
            throw new RuntimeException("Belt 'From' is higher than 'To'.");
        }
    }

    public int getWzrostOd() {
        return wzrostOd;
    }

    public int getWzrostDo() {
        return wzrostDo;
    }

    public int getPasOd() {
        return pasOd;
    }

    public int getPasDo() {
        return pasDo;
    }
}
