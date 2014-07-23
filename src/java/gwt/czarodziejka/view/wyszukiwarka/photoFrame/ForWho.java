package gwt.czarodziejka.view.wyszukiwarka.photoFrame;

import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import gwt.czarodziejka.model.wyszukiwarka.costume.Costume;

/**
 *
 * @author Administrator
 */
class ForWho extends HorizontalPanel {

    public ForWho(Costume stroj) {
        if (stroj.isDlugaNazwa()) {
            super.setStylePrimaryName("photoForWhoLower");
        } else {
            super.setStylePrimaryName("photoForWho");
        }
        switch (stroj.getPłeć()) {
            case DAMSKI:
                switch (stroj.getWiek()) {
                    case DOROSŁY:
                        addWoman();
                        break;
                    case DZIECKO:
                        addGirl();
                        break;
                    case DZIECKO_DOROSŁY:
                        addGirl();
                        addWoman();
                        break;
                }
                break;
            case MĘSKI:
                switch (stroj.getWiek()) {
                    case DOROSŁY:
                        addMan();
                        break;
                    case DZIECKO:
                        addBoy();
                        break;
                    case DZIECKO_DOROSŁY:
                        addBoy();
                        addMan();
                        break;
                }
                break;
            case DAMSKO_MĘSKI:
                switch (stroj.getWiek()) {
                    case DOROSŁY:
                        addWoman();
                        addMan();
                        break;
                    case DZIECKO:
                        addGirl();
                        addBoy();
                        break;
                    case DZIECKO_DOROSŁY:
                        addGirl();
                        addBoy();
                        addWoman();
                        addMan();
                        break;
                }
                break;
        }
    }

    private void addMan() {
        Image img = new Image("img/man.png");
        img.setTitle("strój dla mężczyzny");
        super.add(img);
    }

    private void addWoman() {
        Image img = new Image("img/woman.png");
        img.setTitle("strój dla kobiety");
        super.add(img);
    }

    private void addBoy() {
        Image img = new Image("img/boy.png");
        img.setTitle("strój dla chłopca");
        super.add(img);
    }

    private void addGirl() {
        Image img = new Image("img/girl.png");
        img.setTitle("strój dla dziewczynki");
        super.add(img);
    }
}
