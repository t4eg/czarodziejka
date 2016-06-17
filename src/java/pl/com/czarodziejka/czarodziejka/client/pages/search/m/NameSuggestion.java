package pl.com.czarodziejka.czarodziejka.client.pages.search.m;

import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Costume;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class NameSuggestion extends MultiWordSuggestOracle {

    public NameSuggestion() {
        ArrayList<Costume> costumes = Database.getInstance().getCostumes();
        for (Costume c : costumes) {
            super.add(c.getName());
        }
    }
}
