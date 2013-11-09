package gwt.client.view.dodajStroj;

import com.google.gwt.user.client.ui.*;
import gwt.client.model.dodajStroj.DodajStrojModel;
import gwt.client.view.CanShow;
import gwt.client.view.dodajStroj.components.SelectManySimple;
import gwt.client.view.dodajStroj.image.AddImages;
import gwt.client.view.dodajStroj.rozmiar.AddRozmiary;
import gwt.client.view.wyszukiwarka.components.TitleVeritcalPanel;

/**
 *
 * @author Administrator
 */
public class DodajStrojView extends VerticalPanel implements CanShow {

    private AddImages addImages = new AddImages();
    private AddRozmiary addRozmiary = new AddRozmiary();
    private TextBox number = new TextBox();
    private TextBox name = new TextBox();
    private CheckBox child = new CheckBox("dziecka");
    private CheckBox adult = new CheckBox("dorosłego");
    private CheckBox male = new CheckBox("męski");
    private CheckBox female = new CheckBox("damski");
    private CheckBox forPair = new CheckBox("dla pary");
    private SelectManySimple ocasion = new SelectManySimple();
    private SelectManySimple category = new SelectManySimple();
    private TextArea javaCode = new TextArea();
    private Button save = new Button();
    private Button reset = new Button();
    private DodajStrojModel model;

    public DodajStrojView() {
        setStylePrimaryName("dodajStroj");
        save.setPixelSize(70, 24);
        save.setText("Zapisz");
        reset.setPixelSize(70, 24);
        reset.setText("Reset");

        HorizontalPanel bottom = new HorizontalPanel();
        bottom.setStylePrimaryName("searchBottom");
        bottom.setSpacing(10);
        bottom.add(save);
        bottom.add(reset);

        add(new HTML("Zdjęcia:"));
        add(addImages);
        add(getFiltersPanel());
        add(new HTML("Rozmiary:"));
        add(addRozmiary);
        add(bottom);
        add(new HTML("<hr width=\"100%\"/>"));
        add(javaCode);

        javaCode.setWidth("635px");
        javaCode.setHeight("300px");
        super.setWidth("647px");
    }

    private HorizontalPanel getFiltersPanel() {
        HorizontalPanel result = new HorizontalPanel();
        result.setSpacing(10);
        result.setHorizontalAlignment(ALIGN_CENTER);
        result.add(getCol1());
        result.add(getCol2());
        result.add(getCol3());
        result.add(new TitleVeritcalPanel("Kategoria", category));
        ocasion.setWidth("140px");
        ocasion.setHeight("50px");
        category.setWidth("160px");
        category.setHeight("189px");

        return result;
    }

    private VerticalPanel getCol1() {
        VerticalPanel result = new VerticalPanel();

        TitleVeritcalPanel numberPanel = new TitleVeritcalPanel("Numer", number);
        number.setWidth("145px");
        number.setStylePrimaryName("inputText");
        numberPanel.setStylePrimaryName("row");
        result.add(numberPanel);

        VerticalPanel agePanel = new VerticalPanel();
        agePanel.setStylePrimaryName("row");
        agePanel.add(new HTML("Dla:"));
        agePanel.add(child);
        agePanel.add(adult);
        child.setStylePrimaryName("selectManyCheckbox");
        adult.setStylePrimaryName("selectManyCheckbox");
        result.add(agePanel);

        return result;
    }

    private VerticalPanel getCol2() {
        VerticalPanel result = new VerticalPanel();

        TitleVeritcalPanel namePanel = new TitleVeritcalPanel("Nazwa", name);
        namePanel.setStylePrimaryName("row");
        name.setStylePrimaryName("inputText");
        name.setWidth("145px");
        result.add(namePanel);

        VerticalPanel sexPanel = new VerticalPanel();
        sexPanel.setStylePrimaryName("row");
        sexPanel.add(new HTML("Strój:"));
        sexPanel.add(female);
        sexPanel.add(male);
        female.setStylePrimaryName("selectManyCheckbox");
        male.setStylePrimaryName("selectManyCheckbox");
        result.add(sexPanel);

        return result;
    }

    private VerticalPanel getCol3() {
        VerticalPanel result = new VerticalPanel();
        TitleVeritcalPanel okazja = new TitleVeritcalPanel("Okazja", ocasion);
        okazja.setStylePrimaryName("row3");
        result.add(okazja);

        VerticalPanel pairsPanel = new VerticalPanel();
        pairsPanel.setStylePrimaryName("row");
        pairsPanel.add(new HTML("Pary:"));
        pairsPanel.add(forPair);
        forPair.setStylePrimaryName("selectManyCheckbox");
        result.add(pairsPanel);

        return result;
    }

    @Override
    public void onShow() {
        if (model == null) {
            model = new DodajStrojModel(this);
            model.setData();
        }
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

    public TextArea getJavaCode() {
        return javaCode;
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
