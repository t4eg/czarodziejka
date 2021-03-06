package pl.com.czarodziejka.czarodziejka.client.pages.search;

import com.google.gwt.user.client.ui.*;
import pl.com.czarodziejka.czarodziejka.client.components.page.CanShow;
import pl.com.czarodziejka.czarodziejka.client.components.form.SelectMany;
import pl.com.czarodziejka.czarodziejka.client.components.form.SelectOne;
import pl.com.czarodziejka.czarodziejka.client.components.form.TitleVeritcalPanel;
import pl.com.czarodziejka.czarodziejka.client.pages.search.photosTable.PhotosTableView;

/**
 *
 * @author Adam Mazur
 */
public class SearchView extends VerticalPanel implements CanShow {

    private static SearchView instance;
    private final Label recordsCount = new Label();
    private final Button show = new Button();
    private final Button reset = new Button();
    private final SuggestBox number = new SuggestBox(new NumberSuggestion());
    private final SuggestBox name = new SuggestBox(new NameSuggestion());
    private final CheckBox child = new CheckBox("dziecka");
    private final CheckBox adult = new CheckBox("dorosłego");
    private final CheckBox male = new CheckBox("męski");
    private final CheckBox female = new CheckBox("damski");
    private final CheckBox forPair = new CheckBox("dla pary");
    private final CheckBox noPair = new CheckBox("bez pary");
    private final SelectOne heightFrom = new SelectOne();
    private final SelectOne heightTo = new SelectOne();
    private final SelectOne beltFrom = new SelectOne();
    private final SelectOne beltTo = new SelectOne();
    private final SelectMany ocasion = new SelectMany();
    private final SelectMany category = new SelectMany();
    private final ClothCountInfo clothCountInfo = new ClothCountInfo();
    private final PhotosTableView photosTable = new PhotosTableView(true);

    public static SearchView getInstance() {
        if (instance == null) {
            instance = new SearchView();
        }
        return instance;
    }

    private SearchView() {
        setStylePrimaryName("wyszukiwarka");
        show.setPixelSize(70, 24);
        show.setText("Pokaż");
        reset.setPixelSize(70, 24);
        reset.setText("Reset");

        HorizontalPanel bottom = new HorizontalPanel();
        bottom.setStylePrimaryName("searchBottom");
        bottom.setSpacing(10);
        recordsCount.setWidth("168px");
        recordsCount.setStylePrimaryName("recordsCount");
        bottom.add(recordsCount);
        bottom.add(show);
        bottom.add(reset);

        add(getFiltersPanel());
        add(bottom);
        add(clothCountInfo);
        add(new HTML("<hr width=\"628px\"/>"));
        add(photosTable);

        super.setWidth("647px");
        setTabOrder();
    }

    private void setTabOrder() {
        number.setTabIndex(1);
        name.setTabIndex(2);
        child.setTabIndex(3);
        adult.setTabIndex(4);
        female.setTabIndex(5);
        male.setTabIndex(6);
        heightFrom.setTabIndex(7);
        heightTo.setTabIndex(8);
        beltFrom.setTabIndex(9);
        beltTo.setTabIndex(10);
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

        HorizontalPanel from = new HorizontalPanel();
        from.setStylePrimaryName("selectManyCheckbox");
        from.add(new HTML("od&nbsp;"));
        from.add(heightFrom);
        from.add(new HTML("cm"));
        HorizontalPanel to = new HorizontalPanel();
        to.setStylePrimaryName("selectManyCheckbox");
        to.add(new HTML("do&nbsp;"));
        to.add(heightTo);
        to.add(new HTML("cm"));
        VerticalPanel heightPanel = new VerticalPanel();
        heightPanel.add(from);
        heightPanel.add(to);
        result.add(new TitleVeritcalPanel("Wzrost", heightPanel));

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

        HorizontalPanel from = new HorizontalPanel();
        from.setStylePrimaryName("selectManyCheckbox");
        from.add(new HTML("od&nbsp;"));
        from.add(beltFrom);
        HorizontalPanel to = new HorizontalPanel();
        to.setStylePrimaryName("selectManyCheckbox");
        to.add(new HTML("do&nbsp;"));
        to.add(beltTo);
        VerticalPanel beltPanel = new VerticalPanel();
        beltPanel.add(from);
        beltPanel.add(to);
        result.add(new TitleVeritcalPanel("Rozmiar", beltPanel));

        return result;
    }

    private VerticalPanel getCol3() {
        VerticalPanel result = new VerticalPanel();
        TitleVeritcalPanel ocasionPanel = new TitleVeritcalPanel("Okazja", ocasion);
        ocasionPanel.setStylePrimaryName("row3");
        result.add(ocasionPanel);

        VerticalPanel pairsPanel = new VerticalPanel();
        pairsPanel.setStylePrimaryName("row");
        pairsPanel.add(new HTML("Pary:"));
        pairsPanel.add(forPair);
        pairsPanel.add(noPair);
        forPair.setStylePrimaryName("selectManyCheckbox");
        noPair.setStylePrimaryName("selectManyCheckbox");
        result.add(pairsPanel);

        return result;
    }

    public Button getSearch() {
        return show;
    }

    public SuggestBox getName() {
        return name;
    }

    public final void setRecordsCount(int recordsCount) {
        this.recordsCount.setText("Znaleziono strojów: " + recordsCount);
    }

    public SuggestBox getNumber() {
        return number;
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

    public SelectOne getHeightFrom() {
        return heightFrom;
    }

    public SelectOne getHeightTo() {
        return heightTo;
    }

    public SelectOne getBeltFrom() {
        return beltFrom;
    }

    public SelectOne getBeltTo() {
        return beltTo;
    }

    public SelectMany getOcasion() {
        return ocasion;
    }

    public SelectMany getCategory() {
        return category;
    }

    public Button getReset() {
        return reset;
    }

    @Override
    public void onShow() {
    }

    public CheckBox getForPair() {
        return forPair;
    }

    public CheckBox getNoPair() {
        return noPair;
    }

    public ClothCountInfo getClothCountInfo() {
        return clothCountInfo;
    }

    public PhotosTableView getPhotosTable() {
        return photosTable;
    }
}
