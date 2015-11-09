package pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka;

import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Costume;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class NameSuggestion extends MultiWordSuggestOracle {

    public NameSuggestion() {
        ArrayList<Costume> stroje = Database.getInstance().getStroje();
        for (Costume stroj : stroje) {
            super.add(stroj.getNazwa());
        }
    }
}
