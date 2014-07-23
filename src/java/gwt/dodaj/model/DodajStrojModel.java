package gwt.dodaj.model;

import gwt.czarodziejka.model.wyszukiwarka.costume.Category;
import gwt.czarodziejka.model.wyszukiwarka.costume.Occasion;
import gwt.czarodziejka.model.wyszukiwarka.costume.Sex;
import gwt.czarodziejka.model.wyszukiwarka.costume.Age;
import gwt.dodaj.MainEntryPoint;
import gwt.dodaj.presenter.DodajStrojPresenter;
import gwt.dodaj.view.DodajStrojView;
import gwt.dodaj.view.components.SelectManySimple;

/**
 *
 * @author Administrator
 */
public class DodajStrojModel {

    private final DodajStrojView view;
    private final DodajStrojPresenter presenter;
    private Integer strojNumber;

    public DodajStrojModel(DodajStrojView view) {
        this.view = view;
        this.presenter = new DodajStrojPresenter(view);
    }

    public void clearData() {
        view.getAddImages().reset();
        view.getNumber().setValue(null);
        view.getName().setValue(null);
        view.getChild().setValue(false);
        view.getAdult().setValue(false);
        view.getFemale().setValue(false);
        view.getMale().setValue(false);
        view.getOcasion().clear();
        view.getForPair().setValue(false);
        view.getCategory().clear();
        view.getAddRozmiary().reset();
    }

    public void setData() {
        view.getNumber().setValue(strojNumber == null ? null : (++strojNumber).toString());
        setValues(view.getCategory(), Category.values());
        setValues(view.getOcasion(), Occasion.values());
    }

    private void setValues(SelectManySimple box, Object[] values) {
        for (Object v : values) {
            box.add(v.toString());
        }
    }

    public void saveData() {
        strojNumber = Integer.parseInt(view.getNumber().getValue());

        StringBuilder sb = new StringBuilder(MainEntryPoint.getJavaCode().getValue());

        sb.append("dodaj(");
        sb.append("new Strój(").append(view.getNumber().getValue()).append(")");
        String photoNumbers = view.getAddImages().getPhotoNumbers();
        if (!photoNumbers.isEmpty()) {
            sb.append(".setZdjęcie(").append(photoNumbers).append(")");
        }
        sb.append(".setNazwa(\"").append(view.getName().getValue().trim()).append("\")");
        sb.append(".setWiek(Wiek.").append(getWiek()).append(")");
        sb.append(".setPłeć(Płeć.").append(getPlec()).append(")");
        if (view.getForPair().getValue()) {
            sb.append(".setDlaPary()");
        }
        sb.append(".setOkazja(").append(getFromArray("Okazja.", view.getOcasion().getSelected())).append(")");
        sb.append(".setKategoria(").append(getFromArray("Kategoria.", view.getCategory().getSelected())).append(")");
        sb.append(".setRozmiar(\n").append(view.getAddRozmiary().getRozmiary()).append(")");
        sb.append(");\n\n");

        MainEntryPoint.getJavaCode().setValue(sb.toString());
    }

    private String getFromArray(String sup, String[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += sup + array[i].replace(" ", "_");
            if (i != array.length - 1) {
                result += ", ";
            }
        }
        return result;
    }

    private String getWiek() {
        Boolean adult = view.getAdult().getValue();
        Boolean child = view.getChild().getValue();
        if (adult && child) {
            return Age.DZIECKO_DOROSŁY.toString();
        } else if (adult) {
            return Age.DOROSŁY.toString();
        } else if (child) {
            return Age.DZIECKO.toString();
        }
        return null;
    }

    private String getPlec() {
        Boolean female = view.getFemale().getValue();
        Boolean male = view.getMale().getValue();
        if (female && male) {
            return Sex.DAMSKO_MĘSKI.toString();
        } else if (female) {
            return Sex.DAMSKI.toString();
        } else if (male) {
            return Sex.MĘSKI.toString();
        }
        return null;
    }
}
