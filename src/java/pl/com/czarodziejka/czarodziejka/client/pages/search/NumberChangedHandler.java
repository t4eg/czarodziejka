package pl.com.czarodziejka.czarodziejka.client.pages.search;

import com.google.gwt.event.dom.client.KeyPressEvent;

/**
 *
 * @author Adam Mazur
 */
public class NumberChangedHandler extends FilterChangedHandler {

    private static final String anyCharButNumber = "[a-zA-z\n ./<>?;:\\\"'`!@#$%^&*()\\[\\]{},_+=-~ążśźćęńłóĄŻŚŹĆŃŁÓĘ|\\\\-]";

    @Override
    public void onKeyPress(KeyPressEvent event) {
        String cc = Character.toString(event.getCharCode());
        if (cc.matches(anyCharButNumber)) {
            event.preventDefault();
        } else if (!cc.matches("[0-9]")) {
            super.onKeyPress(event);
        }
    }
}
