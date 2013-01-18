package gwt.client.model.wyszukiwarka;

import gwt.client.model.wyszukiwarka.stroj.Kategoria;
import gwt.client.model.wyszukiwarka.stroj.Okazja;

/**
 *
 * @author Administrator
 */
public class Filters {

    private Integer numer;
    private String nazwa;
    private Boolean dziecko;
    private Boolean dorosly;
    private Boolean male;
    private Boolean female;
    private Integer heightFrom;
    private Integer heightTo;
    private Integer beltFrom;
    private Integer beltTo;
    private Okazja[] okazja;
    private Kategoria[] kategoria;

    public Integer getNumer() {
        return numer;
    }

    public void setNumer(Integer numer) {
        this.numer = numer;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa.trim();
    }

    public Okazja[] getOkazja() {
        return okazja;
    }

    public void setOkazja(Okazja[] okazja) {
        this.okazja = okazja;
    }

    public Kategoria[] getKategoria() {
        return kategoria;
    }

    public void setKategoria(Kategoria[] kategoria) {
        this.kategoria = kategoria;
    }

    public Boolean getDziecko() {
        return dziecko;
    }

    public void setDziecko(Boolean dziecko) {
        this.dziecko = dziecko;
    }

    public Boolean getDorosly() {
        return dorosly;
    }

    public void setDorosly(Boolean dorosly) {
        this.dorosly = dorosly;
    }

    public Boolean getMale() {
        return male;
    }

    public void setMale(Boolean male) {
        this.male = male;
    }

    public Boolean getFemale() {
        return female;
    }

    public void setFemale(Boolean female) {
        this.female = female;
    }

    public int getHeightFrom() {
        return heightFrom;
    }

    public void setHeightFrom(Integer heightFrom) {
        this.heightFrom = heightFrom;
    }

    public Integer getHeightTo() {
        return heightTo;
    }

    public void setHeightTo(Integer heightTo) {
        this.heightTo = heightTo;
    }

    public Integer getBeltFrom() {
        return beltFrom;
    }

    public void setBeltFrom(Integer beltFrom) {
        this.beltFrom = beltFrom;
    }

    public Integer getBeltTo() {
        return beltTo;
    }

    public void setBeltTo(Integer beltTo) {
        this.beltTo = beltTo;
    }
}
