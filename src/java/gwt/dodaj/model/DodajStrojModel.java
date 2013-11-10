package gwt.dodaj.model;

import gwt.czarodziejka.model.wyszukiwarka.stroj.Kategoria;
import gwt.czarodziejka.model.wyszukiwarka.stroj.Okazja;
import gwt.czarodziejka.model.wyszukiwarka.stroj.Płeć;
import gwt.czarodziejka.model.wyszukiwarka.stroj.Wiek;
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
        view.getNumber().setValue(strojNumber == null ? null : strojNumber.toString());
        setValues(view.getCategory(), Kategoria.values());
        setValues(view.getOcasion(), Okazja.values());
        
        presenter.refreshComponents();
    }
    
    private void setValues(SelectManySimple box, Object[] values) {
        for (Object v : values) {
            box.add(v.toString());
        }
    }
    
    public void saveData() {
        StringBuilder sb = new StringBuilder(view.getJavaCode().getValue());
        
        sb.append("dodaj(");
        sb.append("new Strój(").append(view.getNumber().getValue()).append(")");
        sb.append(".setZdjęcie(").append(view.getAddImages().getPhotoNumbers()).append(")");
        sb.append(".setNazwa(\"").append(view.getName().getValue().trim()).append("\")");
        sb.append(".setWiek(Wiek.").append(getWiek()).append(")");
        sb.append(".setPłeć(Płeć.").append(getPlec()).append(")");
        if (view.getForPair().getValue()) {
            sb.append(".setDlaPary()");
        }
        sb.append(".setOkazja(").append(getFromArray("Okazja.", view.getOcasion().getSelected())).append(")");
        sb.append(".setKategoria(").append(getFromArray("Kategoria.", view.getCategory().getSelected())).append(")");
        sb.append(".setRozmiar(\n").append(view.getAddRozmiary().getRozmiary()).append("\n)");
        sb.append(");\n\n");
        
        view.getJavaCode().setValue(sb.toString());
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
            return Wiek.DZIECKO_DOROSŁY.toString();
        } else if (adult) {
            return Wiek.DOROSŁY.toString();
        } else if (child) {
            return Wiek.DZIECKO.toString();
        }
        return null;
    }
    
    private String getPlec() {
        Boolean female = view.getFemale().getValue();
        Boolean male = view.getMale().getValue();
        if (female && male) {
            return Płeć.DAMSKO_MĘSKI.toString();
        } else if (female) {
            return Płeć.DAMSKI.toString();
        } else if (male) {
            return Płeć.MĘSKI.toString();
        }
        return null;
    }
}
