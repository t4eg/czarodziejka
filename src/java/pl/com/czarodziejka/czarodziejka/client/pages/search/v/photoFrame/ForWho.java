package pl.com.czarodziejka.czarodziejka.client.pages.search.v.photoFrame;

import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Costume;

/**
 *
 * @author Administrator
 */
class ForWho extends HorizontalPanel {

    public ForWho(Costume costume) {
        if (costume.isLongName()) {
            super.setStylePrimaryName("photoForWhoLower");
        } else {
            super.setStylePrimaryName("photoForWho");
        }
        switch (costume.getSex()) {
            case FEMALE:
                switch (costume.getAge()) {
                    case ADULT:
                        addWoman();
                        break;
                    case CHILD:
                        addGirl();
                        break;
                    case CHILD_ADULT:
                        addGirl();
                        addWoman();
                        break;
                }
                break;
            case MALE:
                switch (costume.getAge()) {
                    case ADULT:
                        addMan();
                        break;
                    case CHILD:
                        addBoy();
                        break;
                    case CHILD_ADULT:
                        addBoy();
                        addMan();
                        break;
                }
                break;
            case BOTH:
                switch (costume.getAge()) {
                    case ADULT:
                        addWoman();
                        addMan();
                        break;
                    case CHILD:
                        addGirl();
                        addBoy();
                        break;
                    case CHILD_ADULT:
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
