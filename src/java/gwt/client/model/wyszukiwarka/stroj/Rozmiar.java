package gwt.client.model.wyszukiwarka.stroj;

/**
 *
 * @author Administrator
 */
public class Rozmiar {

    private int wzrostOd;
    private int wzrostDo;
    private int pasOd;
    private int pasDo;

    public Rozmiar(Wzrost wzrost) {
        storeWzrost(wzrost, wzrost);
    }

    public Rozmiar(Wzrost wzrostOd, Wzrost wzrostDo) {
        storeWzrost(wzrostOd, wzrostDo);
    }

    public Rozmiar(Wzrost wzrost, Pas pas) {
        storeWzrost(wzrost, wzrost);
        storePas(pas, pas);
    }

    public Rozmiar(Wzrost wzrostOd, Wzrost wzrostDo, Pas pas) {
        storeWzrost(wzrostOd, wzrostDo);
        storePas(pas, pas);
    }

    public Rozmiar(Wzrost wzrost, Pas pasOd, Pas pasDo) {
        storeWzrost(wzrost, wzrost);
        storePas(pasOd, pasDo);
    }

    public Rozmiar(Wzrost wzrostOd, Wzrost wzrostDo, Pas pasOd, Pas pasDo) {
        storeWzrost(wzrostOd, wzrostDo);
        storePas(pasOd, pasDo);
    }

    private void storeWzrost(Wzrost from, Wzrost to) {
        this.wzrostOd = from.getHeight();
        this.wzrostDo = to.getHeight();
        if (from.getHeight() > to.getHeight()) {
            throw new RuntimeException("Height 'From' is higher than 'To'.");
        }
    }

    private void storePas(Pas from, Pas to) {
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
