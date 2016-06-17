package pl.com.czarodziejka.asia.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.Database;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Belt;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Costume;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Size;
import java.util.ArrayList;

/**
 * Main entry point.
 *
 * @author Administrator
 */
public class MainEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {
        final ArrayList<Costume> stroje = Database.getInstance().getCostumes();

        Timer t = new Timer() {

            @Override
            public void run() {
                StringBuilder sb = new StringBuilder("<textarea style=\"width:100%;height:500px;\">");
                sb.append("Numer\t");
                sb.append("Nazwa\t");
                sb.append("Wzrost Od\t");
                sb.append("Wzrost Do\t");
                sb.append("Pas Od\t");
                sb.append("Pas Do\t");
                sb.append("Wiek\n");
                for (Costume stroj : stroje) {
                    for (Size rozm : stroj.getSizes()) {
                        sb.append(stroj.getNumber());
                        sb.append("\t");
                        sb.append(stroj.getName());
                        sb.append("\t");
                        sb.append(rozm.getSizeFrom());
                        sb.append("\t");
                        sb.append(rozm.getSizeTo());
                        sb.append("\t");
                        sb.append(Belt.getString(rozm.getBeltFrom()));
                        sb.append("\t");
                        sb.append(Belt.getString(rozm.getBeltTo()));
                        sb.append("\t");
                        sb.append(stroj.getAge());
                        sb.append("\n");
                    }
                }
                sb.append("</textarea>");

                RootPanel.get().add(new HTML(sb.toString()));
            }
        };
        t.schedule(5000);
    }
}
