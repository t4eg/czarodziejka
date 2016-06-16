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
        final ArrayList<Costume> stroje = Database.getInstance().getStroje();

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
                    for (Size rozm : stroj.getRozmiar()) {
                        sb.append(stroj.getNumer());
                        sb.append("\t");
                        sb.append(stroj.getNazwa());
                        sb.append("\t");
                        sb.append(rozm.getWzrostOd());
                        sb.append("\t");
                        sb.append(rozm.getWzrostDo());
                        sb.append("\t");
                        sb.append(Belt.getString(rozm.getPasOd()));
                        sb.append("\t");
                        sb.append(Belt.getString(rozm.getPasDo()));
                        sb.append("\t");
                        sb.append(stroj.getWiek());
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
