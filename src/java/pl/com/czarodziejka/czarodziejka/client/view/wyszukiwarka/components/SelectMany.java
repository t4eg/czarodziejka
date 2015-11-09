package pl.com.czarodziejka.czarodziejka.client.view.wyszukiwarka.components;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import pl.com.czarodziejka.czarodziejka.client.presenter.wyszukiwarka.FilterChangedHandler;
import java.util.*;

/**
 *
 * @author Administrator
 */
public class SelectMany extends VerticalPanel {

    private Map<String, CheckBox> map = new HashMap<String, CheckBox>();
    private FilterChangedHandler handler;
    private SelectManyAnyChangedHandler refreshWszystkie = new SelectManyAnyChangedHandler();
    private CheckBox wszystkie = new CheckBox("[wszystkie]");

    public SelectMany() {
        wszystkie.setValue(Boolean.TRUE);
        wszystkie.setStylePrimaryName("selectManyCheckboxBold");
        wszystkie.addValueChangeHandler(new SelectManyWszystkieChangedHandler());
        super.add(wszystkie);
    }

    public final void add(String item) {
        CheckBox itemCheckbox = new CheckBox(item);
        itemCheckbox.setStylePrimaryName("selectManyCheckbox");
        if (handler != null) {
            itemCheckbox.addValueChangeHandler(handler);
        }
        itemCheckbox.addValueChangeHandler(refreshWszystkie);
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

    public void addValueChangeHandler(FilterChangedHandler handler) {
        this.handler = handler;
        Set<String> keys = map.keySet();
        for (String key : keys) {
            map.get(key).addValueChangeHandler(handler);
        }
    }

    @Override
    public void clear() {
        wszystkie.setValue(Boolean.TRUE);
        Set<String> keys = map.keySet();
        for (String key : keys) {
            super.remove(map.get(key));
        }
    }

    private class SelectManyAnyChangedHandler implements ValueChangeHandler<Boolean> {

        @Override
        public void onValueChange(ValueChangeEvent<Boolean> vce) {
            if (isAllSelected()) {
                wszystkie.setValue(Boolean.TRUE);
            } else {
                wszystkie.setValue(Boolean.FALSE);
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

    private class SelectManyWszystkieChangedHandler implements ValueChangeHandler<Boolean> {

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
