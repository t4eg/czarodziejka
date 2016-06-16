package pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume;

/**
 *
 * @author Administrator
 */
public class Costume {

    private Integer numer;
    private String nazwa;
    private Sex płeć;
    private Age wiek;
    private Photo[] zdjęcie;
    private Occasion[] okazja;
    private Category[] kategoria;
    private Size[] rozmiar;
    private String order;
    private boolean dlugaNazwa;
    private boolean dlaPary;
    private int grupaPary;

    public Costume(Integer numer) {
        this.numer = numer;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Costume) {
            Costume strojObj = (Costume) obj;
            return numer.equals(strojObj.numer);
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (this.numer != null ? this.numer.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return numer + " " + nazwa;
    }

    public Costume setDlugaNazwa() {
        dlugaNazwa = true;
        return this;
    }

    public Integer getNumer() {
        return numer;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Costume setNazwa(String nazwa) {
        this.order = OrderGenerator.getOrder(nazwa);
        this.nazwa = uppercaseFirstLetters(nazwa);
        return this;
    }

    public Sex getPłeć() {
        return płeć;
    }

    public Costume setPłeć(Sex płeć) {
        this.płeć = płeć;
        return this;
    }

    public Age getWiek() {
        return wiek;
    }

    public Costume setWiek(Age wiek) {
        this.wiek = wiek;
        return this;
    }

    public Photo[] getZdjęcie() {
        return zdjęcie;
    }

    public Costume setZdjęcie(Integer... zdjęcia) {
        this.zdjęcie = new Photo[zdjęcia.length];
        for (int i = 0; i < zdjęcia.length; i++) {
            this.zdjęcie[i] = new Photo(zdjęcia[i], Boolean.FALSE);
        }
        return this;
    }

    public Costume setZdjęcie(Photo... zdjęcia) {
        this.zdjęcie = zdjęcia;
        return this;
    }

    public Occasion[] getOkazja() {
        return okazja;
    }

    public Costume setOkazja(Occasion... okazja) {
        this.okazja = okazja;
        return this;
    }

    public Category[] getKategoria() {
        return kategoria;
    }

    public Costume setKategoria(Category... kategoria) {
        this.kategoria = kategoria;
        return this;
    }

    public Size[] getRozmiar() {
        return rozmiar;
    }

    public Costume setRozmiar(Size... rozmiar) {
        this.rozmiar = rozmiar;
        return this;
    }

    private String uppercaseFirstLetters(String str) {
        boolean prevWasWhiteSp = true;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                if (prevWasWhiteSp) {
                    chars[i] = Character.toUpperCase(chars[i]);
                }
                prevWasWhiteSp = false;
            } else {
                prevWasWhiteSp = chars[i] == ' ';
            }
        }
        return new String(chars);
    }

    public String getOrder() {
        return order;
    }

    public boolean isDlugaNazwa() {
        return dlugaNazwa;
    }

    public boolean isDlaPary() {
        return dlaPary;
    }

    public Costume setDlaPary(int grupaPary) {
        this.grupaPary = grupaPary;
        this.dlaPary = true;
        return this;
    }

    public int getGrupaPary() {
        return grupaPary;
    }
}
