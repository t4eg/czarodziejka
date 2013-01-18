package gwt.client.model.wyszukiwarka;

import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import gwt.client.model.wyszukiwarka.stroj.Strój;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class NumberSuggestion extends MultiWordSuggestOracle {

    public NumberSuggestion() {
        List<Strój> stroje = Database.getInstance().getStroje();
        for (Strój stroj : stroje) {
            super.add(Integer.toString(stroj.getNumer()));
        }
    }
}
