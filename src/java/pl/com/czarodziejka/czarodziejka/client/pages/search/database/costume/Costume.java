package pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume;

/**
 *
 * @author Adam Mazur
 */
public class Costume {

    private final Integer number;
    private String name;
    private Sex sex;
    private Age age;
    private Photo[] photos;
    private Occasion[] occasions;
    private Category[] categories;
    private Size[] sizes;
    private String order;
    private boolean isLongName;
    private boolean isForPair;
    private int pairGroup;

    public Costume(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Costume) {
            Costume costumeObj = (Costume) obj;
            return number.equals(costumeObj.number);
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (this.number != null ? this.number.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return number + " " + name;
    }

    public Costume setIsLongName() {
        isLongName = true;
        return this;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Costume setName(String name) {
        this.order = OrderGenerator.getOrder(name);
        this.name = uppercaseFirstLetters(name);
        return this;
    }

    public Sex getSex() {
        return sex;
    }

    public Costume setSex(Sex sex) {
        this.sex = sex;
        return this;
    }

    public Age getAge() {
        return age;
    }

    public Costume setAge(Age age) {
        this.age = age;
        return this;
    }

    public Photo[] getPhotos() {
        return photos;
    }

    public Costume setPhotos(Integer... photos) {
        this.photos = new Photo[photos.length];
        for (int i = 0; i < photos.length; i++) {
            this.photos[i] = new Photo(photos[i], Boolean.FALSE);
        }
        return this;
    }

    public Costume setPhotos(Photo... photos) {
        this.photos = photos;
        return this;
    }

    public Occasion[] getOccasions() {
        return occasions;
    }

    public Costume setOccasions(Occasion... okazja) {
        this.occasions = okazja;
        return this;
    }

    public Category[] getCategories() {
        return categories;
    }

    public Costume setCategories(Category... categories) {
        this.categories = categories;
        return this;
    }

    public Size[] getSizes() {
        return sizes;
    }

    public Costume setSizes(Size... sizes) {
        this.sizes = sizes;
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

    public boolean isLongName() {
        return isLongName;
    }

    public boolean isForPair() {
        return isForPair;
    }

    public Costume setForPair(int pairGroup) {
        this.pairGroup = pairGroup;
        this.isForPair = true;
        return this;
    }

    public int getGrupaPary() {
        return pairGroup;
    }
}
