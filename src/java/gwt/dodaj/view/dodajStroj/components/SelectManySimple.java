package gwt.dodaj.view.dodajStroj.components;

import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import java.util.*;

/**
 *
 * @author Administrator
 */
public class SelectManySimple extends VerticalPanel {

    private Map<String, CheckBox> map = new HashMap<String, CheckBox>();

    public final void add(String item) {
        CheckBox itemCheckbox = new CheckBox(item);
        itemCheckbox.setStylePrimaryName("selectManyCheckbox");
        map.put(item, itemCheckbox);
        super.add(itemCheckbox);
    }

    public String[] getSelected() {
        List<String> result = new ArrayList<String>();
        Set<String> keys = map.keySet();
        for (String key : keys) {
            CheckBox c = map.get(key);
            if (c.getValue()) {
                result.add(key);
            }
        }
        return result.toArray(new String[result.size()]);
    }

    public void setSelectedAll() {
        Set<String> keys = map.keySet();
        for (String key : keys) {
            map.get(key).setValue(Boolean.TRUE);
        }
    }

    public void setSelectedNone() {
        Set<String> keys = map.keySet();
        for (String key : keys) {
            map.get(key).setValue(Boolean.FALSE);
        }
    }

    @Override
    public void clear() {
        Set<String> keys = map.keySet();
        for (String key : keys) {
            super.remove(map.get(key));
        }
    }
}
