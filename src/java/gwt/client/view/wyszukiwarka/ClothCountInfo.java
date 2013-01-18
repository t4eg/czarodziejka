package gwt.client.view.wyszukiwarka;

import com.google.gwt.user.client.ui.HTML;
import gwt.client.model.wyszukiwarka.Database;

/**
 *
 * @author Administrator
 */
public class ClothCountInfo extends HTML {

    public ClothCountInfo() {
        super.setStylePrimaryName("clothCountInfo");
        super.setText("Do wyszukiwarki dodanych mamy " + getStrojeCountText() + " spośród około 900 dostępnych w wypożyczalni. "
                + "Jeśli nie możecie Państwo znaleść odpowiedniego stroju prosimy o kontakt.");
    }

    private String getStrojeCountText() {
        int count = Database.getInstance().getStroje().size();
        String lastLetter = Integer.toString(count);
        lastLetter = lastLetter.substring(lastLetter.length() - 1);
        int lastNumber = Integer.valueOf(lastLetter);
        switch (lastNumber) {
            case 0:
            case 1:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return count + " strojów";
            case 2:
            case 3:
            case 4:
            default:
                return count + " stroje";
        }
    }
}
