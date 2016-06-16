package pl.com.czarodziejka.czarodziejka.client.pages.search.v.components;

import com.google.gwt.user.client.ui.ListBox;

/**
 *
 * @author Administrator
 */
public class SelectOne extends ListBox {

    public SelectOne() {
        super(false);
    }

    public String getSelected() {
        return getValue(getSelectedIndex());
    }
}
