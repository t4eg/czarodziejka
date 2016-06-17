package pl.com.czarodziejka.czarodziejka.client.pages.search.m;

import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Costume;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class NumberSuggestion extends MultiWordSuggestOracle {

    public NumberSuggestion() {
        ArrayList<Costume> stroje = Database.getInstance().getCostumes();
        for (Costume stroj : stroje) {
            super.add(Integer.toString(stroj.getNumber()));
        }
    }
}
