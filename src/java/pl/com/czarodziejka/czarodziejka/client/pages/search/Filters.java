package pl.com.czarodziejka.czarodziejka.client.pages.search;

import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Category;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Occasion;

/**
 *
 * @author Adam Mazur
 */
public class Filters {

    private Integer number;
    private String name;
    private Boolean child;
    private Boolean adult;
    private Boolean male;
    private Boolean female;
    private Boolean forPair;
    private Boolean noPair;
    private Integer heightFrom;
    private Integer heightTo;
    private Integer beltFrom;
    private Integer beltTo;
    private Occasion[] occasions;
    private Category[] categories;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public Occasion[] getOccasions() {
        return occasions;
    }

    public void setOccasions(Occasion[] occasions) {
        this.occasions = occasions;
    }

    public Category[] getCategories() {
        return categories;
    }

    public void setCategories(Category[] categories) {
        this.categories = categories;
    }

    public Boolean getChild() {
        return child;
    }

    public void setChild(Boolean child) {
        this.child = child;
    }

    public Boolean getAdult() {
        return adult;
    }

    public void setAdult(Boolean adult) {
        this.adult = adult;
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
