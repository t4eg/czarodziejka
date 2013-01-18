package gwt.client.model.wyszukiwarka.stroj;

/**
 *
 * @author Administrator
 */
public class Strój {

    private Integer numer;
    private String nazwa;
    private Płeć płeć;
    private Wiek wiek;
    private Zdjęcie[] zdjęcie;
    private Okazja[] okazja;
    private Kategoria[] kategoria;
    private Rozmiar[] rozmiar;
    private String order;
    private boolean długaNazwa;

    public Strój(Integer numer) {
        this.numer = numer;
    }

    public Strój setDługaNazwa() {
        długaNazwa = true;
        return this;
    }

    public Integer getNumer() {
        return numer;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Strój setNazwa(String nazwa) {
        this.order = OrderGenerator.getOrder(nazwa);
        this.nazwa = uppercaseFirstLetters(nazwa);
        return this;
    }

    public Płeć getPłeć() {
        return płeć;
    }

    public Strój setPłeć(Płeć płeć) {
        this.płeć = płeć;
        return this;
    }

    public Wiek getWiek() {
        return wiek;
    }

    public Strój setWiek(Wiek wiek) {
        this.wiek = wiek;
        return this;
    }

    public Zdjęcie[] getZdjęcie() {
        return zdjęcie;
    }

    public Strój setZdjęcie(Integer... zdjęcia) {
        this.zdjęcie = new Zdjęcie[zdjęcia.length];
        for (int i = 0; i < zdjęcia.length; i++) {
            this.zdjęcie[i] = new Zdjęcie(zdjęcia[i], Boolean.FALSE);
        }
        return this;
    }

    public Strój setZdjęcie(Zdjęcie... zdjęcia) {
        this.zdjęcie = zdjęcia;
        return this;
    }

    public Okazja[] getOkazja() {
        return okazja;
    }

    public Strój setOkazja(Okazja... okazja) {
        this.okazja = okazja;
        return this;
    }

    public Kategoria[] getKategoria() {
        return kategoria;
    }

    public Strój setKategoria(Kategoria... kategoria) {
        this.kategoria = kategoria;
        return this;
    }

    public Rozmiar[] getRozmiar() {
        return rozmiar;
    }

    public Strój setRozmiar(Rozmiar... rozmiar) {
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

    public boolean isDługaNazwa() {
        return długaNazwa;
    }
}
