package gwt.czarodziejka.model.wyszukiwarka;

import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import gwt.czarodziejka.model.wyszukiwarka.stroj.Strój;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class NumberSuggestion extends MultiWordSuggestOracle {

    public NumberSuggestion() {
        ArrayList<Strój> stroje = Database.getInstance().getStroje();
        for (Strój stroj : stroje) {
            super.add(Integer.toString(stroj.getNumer()));
        }
    }
}
