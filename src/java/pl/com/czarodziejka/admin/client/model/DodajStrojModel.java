package pl.com.czarodziejka.admin.client.model;

import java.util.Map;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Category;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Occasion;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Sex;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Age;
import pl.com.czarodziejka.admin.client.MainEntryPoint;
import pl.com.czarodziejka.admin.client.presenter.DodajStrojPresenter;
import pl.com.czarodziejka.admin.client.view.DodajStrojView;
import pl.com.czarodziejka.admin.client.view.components.SelectManySimple;
import pl.com.czarodziejka.czarodziejka.client.components.form.SelectOne;

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
        view.getForPair().clear();
        view.getCategory().clear();
        view.getAddRozmiary().reset();
    }

    public void setData() {
        view.getNumber().setValue(strojNumber == null ? null : (++strojNumber).toString());
        setValues(view.getCategory(), Category.values());
        setValues(view.getOcasion(), Occasion.values());
        setValues(view.getForPair(), ParyList.map);
    }

    private void setValues(SelectOne box, Map<Integer, String> data) {
        for (Map.Entry<Integer, String> entry : data.entrySet()) {
            box.addItem(entry.getValue());
        }
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
        sb.append("new Costume(").append(view.getNumber().getValue()).append(")");
        String photoNumbers = view.getAddImages().getPhotoNumbers();
        if (!photoNumbers.isEmpty()) {
            sb.append(".setZdjęcie(").append(photoNumbers).append(")");
        }
        sb.append(".setNazwa(\"").append(view.getName().getValue().trim()).append("\")");
        sb.append(".setWiek(Age.").append(getWiek()).append(")");
        sb.append(".setPłeć(Sex.").append(getPlec()).append(")");
        if (!view.getForPair().getSelected().isEmpty()) {
            sb.append(".setDlaPary(").append(ParyList.getIndex(view.getForPair().getSelected())).append(")");
        }
        sb.append(".setOkazja(").append(getFromArray("Occasion.", view.getOcasion().getSelected())).append(")");
        sb.append(".setKategoria(").append(getFromArray("Category.", view.getCategory().getSelected())).append(")");
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
            return Age.CHILD_ADULT.toString();
        } else if (adult) {
            return Age.ADULT.toString();
        } else if (child) {
            return Age.CHILD.toString();
        }
        return null;
    }

    private String getPlec() {
        Boolean female = view.getFemale().getValue();
        Boolean male = view.getMale().getValue();
        if (female && male) {
            return Sex.BOTH.toString();
        } else if (female) {
            return Sex.FEMALE.toString();
        } else if (male) {
            return Sex.MALE.toString();
        }
        return null;
    }
}
