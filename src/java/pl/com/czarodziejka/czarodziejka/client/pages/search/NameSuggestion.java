package pl.com.czarodziejka.czarodziejka.client.pages.search;

import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Costume;
import java.util.ArrayList;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.Database;

/**
 *
 * @author Adam Mazur
 */
public class NameSuggestion extends MultiWordSuggestOracle {

    public NameSuggestion() {
        ArrayList<Costume> costumes = Database.getInstance().getCostumes();
        for (Costume c : costumes) {
            super.add(c.getName());
        }
    }
}
