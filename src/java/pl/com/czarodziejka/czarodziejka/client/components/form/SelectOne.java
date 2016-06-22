package pl.com.czarodziejka.czarodziejka.client.components.form;

import com.google.gwt.user.client.ui.ListBox;

/**
 *
 * @author Adam Mazur
 */
public class SelectOne extends ListBox {

    public SelectOne() {
        super(false);
    }

    public String getSelected() {
        return getValue(getSelectedIndex());
    }
}
