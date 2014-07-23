package gwt.czarodziejka.model.wyszukiwarka;

import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import gwt.czarodziejka.model.wyszukiwarka.costume.Costume;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class NumberSuggestion extends MultiWordSuggestOracle {

    public NumberSuggestion() {
        ArrayList<Costume> stroje = Database.getInstance().getStroje();
        for (Costume stroj : stroje) {
            super.add(Integer.toString(stroj.getNumer()));
        }
    }
}
