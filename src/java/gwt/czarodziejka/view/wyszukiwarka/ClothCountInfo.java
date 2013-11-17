package gwt.czarodziejka.view.wyszukiwarka;

import com.google.gwt.user.client.ui.HTML;

/**
 *
 * @author Administrator
 */
public class ClothCountInfo extends HTML {

    public ClothCountInfo() {
        super.setStylePrimaryName("clothCountInfo");
    }

    public void setInfo(int strojeCount) {
        super.setText("Do wyszukiwarki dodanych mamy " + getStrojeCountText(strojeCount) + " spośród około 1200 modeli dostępnych w wypożyczalni. "
                + "Jeśli nie możecie Państwo znaleść odpowiedniego stroju prosimy o kontakt.");
    }

    private String getStrojeCountText(int strojeCount) {
        String lastLetter = Integer.toString(strojeCount);
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
                return strojeCount + " strojów";
            case 2:
            case 3:
            case 4:
            default:
                return strojeCount + " stroje";
        }
    }
}
