package pl.com.czarodziejka.czarodziejka.client.pages.search;

import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Costume;
import java.util.ArrayList;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.Database;

/**
 *
 * @author Adam Mazur
 */
public class NumberSuggestion extends MultiWordSuggestOracle {

    public NumberSuggestion() {
        ArrayList<Costume> stroje = Database.getInstance().getCostumes();
        for (Costume stroj : stroje) {
            super.add(Integer.toString(stroj.getNumber()));
        }
    }
}
