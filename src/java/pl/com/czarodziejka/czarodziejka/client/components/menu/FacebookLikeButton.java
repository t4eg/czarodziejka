package pl.com.czarodziejka.czarodziejka.client.components.menu;

import com.google.gwt.user.client.ui.HTML;

/**
 *
 * @author Adam Mazur
 */
public class FacebookLikeButton extends HTML {

    public FacebookLikeButton() {
        super("<div class=\"fb-like\" data-href=\"http://www.facebook.com/CzarodziejkaComPl\" data-send=\"false\""
                + " data-width=\"100\" data-show-faces=\"true\" data-font=\"arial\"></div>");
//        super.setSize("100px", "100px");
    }
}
