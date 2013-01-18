package gwt.client.model.wyszukiwarka;

import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import gwt.client.model.wyszukiwarka.stroj.Strój;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class NameSuggestion extends MultiWordSuggestOracle {

    public NameSuggestion() {
        List<Strój> stroje = Database.getInstance().getStroje();
        for (Strój stroj : stroje) {
            super.add(stroj.getNazwa());
        }
    }
}
