package pl.com.czarodziejka.czarodziejka.client.pages.search.m;

import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextArea;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Costume;
import java.util.ArrayList;

/**
 *
 * @author Adam Mazur
 */
public class PrintDataForAsia {

    private StringBuilder sb = new StringBuilder();

    public void print(ArrayList<Costume> stroje) {

        add(null);

        for (Costume stroj : stroje) {
            add(stroj.getNumber());
            add(stroj.getName());
            add(stroj.getSex());
            add(stroj.getAge());
            add(toString(stroj.getPhotos()));
            add(stroj.isForPair());
        }


        TextArea textarea = new TextArea();

        RootPanel.get("content").clear();
        RootPanel.get("content").add(textarea);
    }

    private void add(Object value) {
        sb.append(value);
        sb.append("\t");
    }

    private String toString(Object[] arr) {
        String temp = "";
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i].toString();
            if (i < arr.length - 1) {
                temp += ", ";
            }
        }
        return temp;
    }
}
