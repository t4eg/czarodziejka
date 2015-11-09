package pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka;

import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Category;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Occasion;

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
    private Boolean forPair;
    private Boolean noPair;
    private Integer heightFrom;
    private Integer heightTo;
    private Integer beltFrom;
    private Integer beltTo;
    private Occasion[] okazja;
    private Category[] kategoria;

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

    public Occasion[] getOkazja() {
        return okazja;
    }

    public void setOkazja(Occasion[] okazja) {
        this.okazja = okazja;
    }

    public Category[] getKategoria() {
        return kategoria;
    }

    public void setKategoria(Category[] kategoria) {
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

    public Boolean getForPair() {
        return forPair;
    }

    public void setForPair(Boolean forPair) {
        this.forPair = forPair;
    }

    public Boolean getNoPair() {
        return noPair;
    }

    public void setNoPair(Boolean noPair) {
        this.noPair = noPair;
    }
}
