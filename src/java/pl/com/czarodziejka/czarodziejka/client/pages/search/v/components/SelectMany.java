package pl.com.czarodziejka.czarodziejka.client.pages.search.v.components;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.pages.search.p.FilterChangedHandler;
import java.util.*;

/**
 *
 * @author Administrator
 */
public class SelectMany extends VerticalPanel {

    private final Map<String, CheckBox> map = new HashMap<>();
    private final SelectManyAnyChangedHandler refreshAll = new SelectManyAnyChangedHandler();
    private final CheckBox all = new CheckBox("[wszystkie]");
    private FilterChangedHandler handler;

    public SelectMany() {
        all.setValue(Boolean.TRUE);
        all.setStylePrimaryName("selectManyCheckboxBold");
        all.addValueChangeHandler(new SelectManyAllChangedHandler());
        super.add(all);
    }

    public final void add(String item) {
        CheckBox itemCheckbox = new CheckBox(item);
        itemCheckbox.setStylePrimaryName("selectManyCheckbox");
        if (handler != null) {
            itemCheckbox.addValueChangeHandler(handler);
        }
        itemCheckbox.addValueChangeHandler(refreshAll);
        map.put(item, itemCheckbox);
        super.add(itemCheckbox);
    }

    public String[] getSelected() {
        List<String> result = new ArrayList<>();
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

    public void addValueChangeHandler(FilterChangedHandler handler) {
        this.handler = handler;
        Set<String> keys = map.keySet();
        for (String key : keys) {
            map.get(key).addValueChangeHandler(handler);
        }
    }

    @Override
    public void clear() {
        all.setValue(Boolean.TRUE);
        Set<String> keys = map.keySet();
        for (String key : keys) {
            super.remove(map.get(key));
        }
    }

    private class SelectManyAnyChangedHandler implements ValueChangeHandler<Boolean> {

        @Override
        public void onValueChange(ValueChangeEvent<Boolean> vce) {
            if (isAllSelected()) {
                all.setValue(Boolean.TRUE);
            } else {
                all.setValue(Boolean.FALSE);
            }
        }

        private boolean isAllSelected() {
            Set<String> keys = map.keySet();
            for (String key : keys) {
                if (!map.get(key).getValue()) {
                    return false;
                }
            }
            return true;
        }
    }

    private class SelectManyAllChangedHandler implements ValueChangeHandler<Boolean> {

        @Override
        public void onValueChange(ValueChangeEvent<Boolean> vce) {
            if (vce.getValue()) {
                setSelectedAll();
            } else {
                setSelectedNone();
            }
            if (handler != null) {
                handler.invoke();
            }
        }
    }
}
