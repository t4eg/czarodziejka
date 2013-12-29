package gwt.dodaj.view;

import com.google.gwt.user.client.ui.*;
import gwt.czarodziejka.model.wyszukiwarka.stroj.Kategoria;
import gwt.dodaj.model.DodajStrojModel;
import gwt.dodaj.view.components.SelectManySimple;
import gwt.dodaj.view.components.TitleVeritcalPanelError;
import gwt.dodaj.view.image.AddImages;
import gwt.dodaj.view.rozmiar.AddRozmiary;
import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class DodajStrojView extends VerticalPanel {

    private AddImages addImages = new AddImages();
    private AddRozmiary addRozmiary = new AddRozmiary(this);
    private TextBox number = new TextBox();
    private TextBox name = new TextBox();
    private CheckBox child = new CheckBox("dziecka");
    private CheckBox adult = new CheckBox("dorosłego");
    private CheckBox male = new CheckBox("męski");
    private CheckBox female = new CheckBox("damski");
    private CheckBox forPair = new CheckBox("dla pary");
    private SelectManySimple ocasion = new SelectManySimple();
    private SelectManySimple category = new SelectManySimple();
    private Button save = new Button();
    private Button reset = new Button();
    private VerticalPanel agePanel = new VerticalPanel();
    private VerticalPanel sexPanel = new VerticalPanel();
    private TitleVeritcalPanelError zdjeciaPanel = new TitleVeritcalPanelError("Zdjęcia", addImages);
    private TitleVeritcalPanelError numberPanel = new TitleVeritcalPanelError("Numer", number);
    private TitleVeritcalPanelError namePanel = new TitleVeritcalPanelError("Nazwa", name);
    private TitleVeritcalPanelError okazjaPanel = new TitleVeritcalPanelError("Okazja", ocasion);
    private TitleVeritcalPanelError kategoriaPanel = new TitleVeritcalPanelError("Kategoria", category);
    private TitleVeritcalPanelError wiekPanel = new TitleVeritcalPanelError("Dla", agePanel);
    private TitleVeritcalPanelError plecPanel = new TitleVeritcalPanelError("Strój", sexPanel);
    private TitleVeritcalPanelError rozmiaryPanel = new TitleVeritcalPanelError("Rozmiary", addRozmiary);
    private DodajStrojModel model;

    public DodajStrojView() {
        setStylePrimaryName("marginAuto");
        save.setPixelSize(70, 24);
        save.setText("Zapisz");
        reset.setPixelSize(70, 24);
        reset.setText("Reset");

        HorizontalPanel bottom = new HorizontalPanel();
        bottom.setSpacing(10);
        bottom.add(save);
        bottom.add(reset);

        add(zdjeciaPanel);
        add(getFiltersPanel());
        add(rozmiaryPanel);
        add(bottom);

        super.setWidth("647px");

        model = new DodajStrojModel(this);
        model.setData();
    }

    public boolean validate() {
        boolean result = addImages.validate() & addRozmiary.validate();

        if (number.getValue() == null || number.getValue().isEmpty()) {
            numberPanel.showError("Wpisz numer stroju.");
            result = false;
        } else {
            numberPanel.hideError();
        }
        if (name.getValue() == null || name.getValue().isEmpty()) {
            namePanel.showError("Wpisz nazwę stroju.");
            result = false;
        } else {
            namePanel.hideError();
        }
        if (ocasion.getSelected().length == 0) {
            okazjaPanel.showError("Zaznacz co najmniej jedną okazję.");
            result = false;
        } else {
            okazjaPanel.hideError();
        }
        if (category.getSelected().length == 0) {
            kategoriaPanel.showError("Zaznacz co najmniej jedną kategorię.");
            result = false;
        } else if (Arrays.asList(category.getSelected()).contains(Kategoria.Inne.toString()) && category.getSelected().length > 1) {
            kategoriaPanel.showError("Kategoria '" + Kategoria.Inne.toString() + "' może być zaznaczona tylko jako jedyna.");
            result = false;
        } else {
            kategoriaPanel.hideError();
        }
        boolean childSelected = child.getValue() != null && child.getValue();
        boolean adultSelected = adult.getValue() != null && adult.getValue();
        if (!childSelected && !adultSelected) {
            wiekPanel.showError("Zaznacz co najmniej jeden.");
            result = false;
        } else {
            wiekPanel.hideError();
        }
        boolean maleSelected = male.getValue() != null && male.getValue();
        boolean femaleSelected = female.getValue() != null && female.getValue();
        if (!maleSelected && !femaleSelected) {
            plecPanel.showError("Zaznacz co najmniej jeden.");
            result = false;
        } else {
            plecPanel.hideError();
        }
        if (addRozmiary.getRozmiary().trim().isEmpty()) {
            rozmiaryPanel.showError("Dodaj rozmiar.");
            result = false;
        } else {
            rozmiaryPanel.hideError();
        }

        return result;
    }

    public void clearErrors() {
        addImages.clearErrors();
        addRozmiary.clearErrors();
        numberPanel.hideError();
        namePanel.hideError();
        okazjaPanel.hideError();
        kategoriaPanel.hideError();
        wiekPanel.hideError();
        plecPanel.hideError();
        rozmiaryPanel.hideError();
    }

    private HorizontalPanel getFiltersPanel() {
        HorizontalPanel result = new HorizontalPanel();
        result.setSpacing(10);
        result.setHorizontalAlignment(ALIGN_CENTER);
        result.add(getCol1());
        result.add(getCol2());
        result.add(getCol3());
        result.add(kategoriaPanel);
        ocasion.setWidth("140px");
        ocasion.setHeight("50px");
        category.setWidth("160px");
        category.setHeight("189px");

        return result;
    }

    private VerticalPanel getCol1() {
        VerticalPanel result = new VerticalPanel();

        number.setWidth("145px");
        number.setStylePrimaryName("inputText");
        numberPanel.setStylePrimaryName("row");
        result.add(numberPanel);

        agePanel.setStylePrimaryName("row");
        agePanel.add(child);
        agePanel.add(adult);
        child.setStylePrimaryName("selectManyCheckbox");
        adult.setStylePrimaryName("selectManyCheckbox");
        result.add(wiekPanel);

        return result;
    }

    private VerticalPanel getCol2() {
        VerticalPanel result = new VerticalPanel();

        namePanel.setStylePrimaryName("row");
        name.setStylePrimaryName("inputText");
        name.setWidth("145px");
        result.add(namePanel);

        sexPanel.setStylePrimaryName("row");
        sexPanel.add(female);
        sexPanel.add(male);
        female.setStylePrimaryName("selectManyCheckbox");
        male.setStylePrimaryName("selectManyCheckbox");
        result.add(plecPanel);

        return result;
    }

    private VerticalPanel getCol3() {
        VerticalPanel result = new VerticalPanel();
        okazjaPanel.setStylePrimaryName("row3");
        result.add(okazjaPanel);

        VerticalPanel pairsPanel = new VerticalPanel();
        pairsPanel.setStylePrimaryName("row");
        pairsPanel.add(new HTML("Pary:"));
        pairsPanel.add(forPair);
        forPair.setStylePrimaryName("selectManyCheckbox");
        result.add(pairsPanel);

        return result;
    }

    public AddImages getAddImages() {
        return addImages;
    }

    public AddRozmiary getAddRozmiary() {
        return addRozmiary;
    }

    public TextBox getNumber() {
        return number;
    }

    public TextBox getName() {
        return name;
    }

    public CheckBox getChild() {
        return child;
    }

    public CheckBox getAdult() {
        return adult;
    }

    public CheckBox getMale() {
        return male;
    }

    public CheckBox getFemale() {
        return female;
    }

    public CheckBox getForPair() {
        return forPair;
    }

    public SelectManySimple getOcasion() {
        return ocasion;
    }

    public SelectManySimple getCategory() {
        return category;
    }

    public Button getSave() {
        return save;
    }

    public Button getReset() {
        return reset;
    }

    public DodajStrojModel getModel() {
        return model;
    }
}
