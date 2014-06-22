package gwt.czarodziejka.model.wyszukiwarka;

import com.google.gwt.user.client.Timer;
import gwt.czarodziejka.model.wyszukiwarka.stroj.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Administrator
 */
public class Database {

    private static Database instance;
    private ArrayList<Strój> stroje = new ArrayList<Strój>();

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    private Database() {
        final Timer t3 = new Timer() {

            @Override
            public void run() {
                addData3();
                Collections.sort(instance.stroje, new StrójComparator());
//                DatabaseTest test = new DatabaseTest(instance.stroje);
//                new PrintDataForAsia().print(stroje);
            }
        };
        final Timer t2 = new Timer() {

            @Override
            public void run() {
                addData2();
                t3.schedule(10);
            }
        };
        final Timer t1 = new Timer() {

            @Override
            public void run() {
                addData1();
                t2.schedule(10);
            }
        };
        t1.schedule(10);
    }

    private void addData1() {
        dodaj(new Strój(1).setZdjęcie(1).setNazwa("pirat").setDlaPary(1).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Pirackie).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.L),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.M),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.S)));

        dodaj(new Strój(2).setZdjęcie(2).setNazwa("pirat").setDlaPary(1).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Pirackie).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.S),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M)));

        dodaj(new Strój(3).setZdjęcie(3).setNazwa("muszkieter").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Pas.S),
                new Rozmiar(Wzrost.cm_170, Pas.XL)));

        dodaj(new Strój(4).setZdjęcie(4).setNazwa("Robin Hood").setDlaPary(3).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.L),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.XL),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.XXL)));

        dodaj(new Strój(5).setZdjęcie(5).setNazwa("indianin").setDlaPary(2).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Dziki_zachód, Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.L),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.XL),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.XXL)));

        dodaj(new Strój(6).setZdjęcie(6).setNazwa("Meksykanin").setDlaPary(4).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Dziki_zachód).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.S, Pas.XXL)));

        dodaj(new Strój(7).setZdjęcie(7).setNazwa("Obi-Wan Kenobi").setDlaPary(5).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Pas.S, Pas.L),
                new Rozmiar(Wzrost.cm_170, Pas.S, Pas.L)));

        dodaj(new Strój(8).setZdjęcie(8).setNazwa("Arab").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(9).setZdjęcie(9).setNazwa("Żołnierz Rzymski").setDlaPary(39).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.M),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.L),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.XL),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.S)));

        dodaj(new Strój(10).setZdjęcie(10).setNazwa("Kowboj").setDlaPary(2).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Film_i_scena, Kategoria.Dziki_zachód).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.M),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.L),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.S)));

        dodaj(new Strój(11).setZdjęcie(11).setNazwa("traper").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Dziki_zachód).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_194, Pas.S, Pas.XXL)));

        dodaj(new Strój(12).setZdjęcie(12, 131).setNazwa("Samuraj").setDlaPary(7).setWiek(Wiek.DOROSŁY).setDlugaNazwa().setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Pas.M),
                new Rozmiar(Wzrost.cm_176, Pas.L),
                new Rozmiar(Wzrost.cm_176, Pas.S)));

        dodaj(new Strój(13).setZdjęcie(13).setNazwa("rycerz").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.M, Pas.L),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.L, Pas.XL)));

        dodaj(new Strój(14).setZdjęcie(14).setNazwa("król").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.M, Pas.XL)));

        dodaj(new Strój(16).setZdjęcie(16).setNazwa("diabeł").setDlaPary(8).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween, Okazja.Jasełka).setKategoria(Kategoria.Film_i_scena, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.S, Pas.L)));

        dodaj(new Strój(17).setZdjęcie(17).setNazwa("Drakula").setDlaPary(9).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.S, Pas.L)));

        dodaj(new Strój(18).setZdjęcie(18).setNazwa("truskawka").setWiek(Wiek.DZIECKO_DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Owoce_i_warzywa).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_158, Pas.S, Pas.L)));

        dodaj(new Strój(19).setZdjęcie(19).setNazwa("Drakula").setDlaPary(9).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.S),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.M),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.L),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.XL)));

        dodaj(new Strój(20).setZdjęcie(20).setNazwa("burak").setWiek(Wiek.DZIECKO_DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Owoce_i_warzywa).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_170, Pas.S, Pas.XL)));

        dodaj(new Strój(21).setZdjęcie(21).setNazwa("Śmierć").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_188, Pas.S, Pas.XXL)));

        dodaj(new Strój(22).setZdjęcie(22).setNazwa("Fiona").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.S),
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.XL)));

        dodaj(new Strój(23).setZdjęcie(23).setNazwa("Józef").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_188, Pas.S, Pas.XXL),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.XL)));

        dodaj(new Strój(24).setZdjęcie(24).setNazwa("mnich").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Film_i_scena, Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.L, Pas.XXL),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.S, Pas.XL)));

        dodaj(new Strój(25).setZdjęcie(25).setNazwa("ksiądz").setDlaPary(10).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Film_i_scena, Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.M, Pas.L)));

        dodaj(new Strój(26).setZdjęcie(26).setNazwa("książe wschodni").setDlaPary(11).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.L, Pas.XXL),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M, Pas.XL)));

        dodaj(new Strój(27).setZdjęcie(27).setNazwa("clown").setDlaPary(12).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_194, Pas.L, Pas.XXL),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_194, Pas.M, Pas.XL)));

        dodaj(new Strój(28).setZdjęcie(28).setNazwa("Batman").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Super_bohaterowie).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_188, Pas.L),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_188, Pas.M),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_188, Pas.S),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_188, Pas.XL)));

        dodaj(new Strój(29).setZdjęcie(29).setNazwa("Spiderman").setDlaPary(33).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Super_bohaterowie).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.S, Pas.M)));

        dodaj(new Strój(30).setZdjęcie(30).setNazwa("pszczoła").setDlaPary(13).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.S, Pas.XL)));

        dodaj(new Strój(31).setZdjęcie(31).setNazwa("hipis").setDlaPary(14).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.S),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_194, Pas.M)));

        dodaj(new Strój(33).setZdjęcie(33).setNazwa("kontusz szlechecki").setDlaPary(15).setWiek(Wiek.DOROSŁY).setDlugaNazwa().setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_188, Pas.L)));

        dodaj(new Strój(34).setZdjęcie(34).setNazwa("hipis").setDlaPary(14).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M, Pas.L)));

        dodaj(new Strój(36).setZdjęcie(36).setNazwa("zombie").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.M, Pas.L)));

        dodaj(new Strój(37).setZdjęcie(37).setNazwa("duch mężczyzny").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M, Pas.L),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.L, Pas.XL)));

        dodaj(new Strój(38).setZdjęcie(38).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.XS, Pas.S)));

        dodaj(new Strój(39).setZdjęcie(39).setNazwa("jaskiniowiec").setDlaPary(17).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.M, Pas.L)));

        dodaj(new Strój(40).setZdjęcie(40, 41).setNazwa("zając").setWiek(Wiek.DOROSŁY).setDlaPary(18).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.M, Pas.L),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.XXL)));

        dodaj(new Strój(43).setZdjęcie(43).setNazwa("wilk").setDlaPary(18).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.M, Pas.XL)));

        dodaj(new Strój(44).setZdjęcie(44).setNazwa("tancerka turecka").setDlaPary(11).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.XS, Pas.S)));

        dodaj(new Strój(45).setZdjęcie(45, 46).setNazwa("tygrys").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.M, Pas.XL)));

        dodaj(new Strój(47).setZdjęcie(47).setNazwa("lew").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.M, Pas.XL)));

        dodaj(new Strój(48).setZdjęcie(48).setNazwa("sowa").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.M, Pas.XXL),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S, Pas.XL)));

        dodaj(new Strój(50).setZdjęcie(50).setNazwa("Żaba").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.M, Pas.XL),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.L),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.XL),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.XL)));

        dodaj(new Strój(52).setZdjęcie(52).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(53).setZdjęcie(53).setNazwa("czarownica").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Andrzejki, Okazja.Halloween).setKategoria(Kategoria.Film_i_scena, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.L, Pas.XL)));

        dodaj(new Strój(54).setZdjęcie(54).setNazwa("jesień").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(55).setZdjęcie(55).setNazwa("wiosna").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(56).setZdjęcie(56).setNazwa("czarownica").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween, Okazja.Andrzejki).setKategoria(Kategoria.Film_i_scena, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_170, Pas.S),
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_170, Pas.M)));

        dodaj(new Strój(57).setZdjęcie(57).setNazwa("cyganka").setDlaPary(19).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.L, Pas.XL)));

        dodaj(new Strój(58).setZdjęcie(58, 96, 99).setNazwa("czarownica").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Andrzejki, Okazja.Halloween).setKategoria(Kategoria.Film_i_scena, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.L)));

        dodaj(new Strój(59).setZdjęcie(59).setNazwa("hipiska").setDlaPary(14).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.L)));

        dodaj(new Strój(60).setZdjęcie(60).setNazwa("hipiska").setDlaPary(14).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.L)));

        dodaj(new Strój(62).setZdjęcie(62).setNazwa("mieszczka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(63).setZdjęcie(63).setNazwa("diablica").setDlaPary(8).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Jasełka, Okazja.Halloween).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.S)));

        dodaj(new Strój(64).setZdjęcie(64).setNazwa("Disco").setDlaPary(20).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.L)));

        dodaj(new Strój(66).setZdjęcie(66).setNazwa("czarownica").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Andrzejki, Okazja.Halloween).setKategoria(Kategoria.Film_i_scena, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.L),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.XL)));

        dodaj(new Strój(67).setZdjęcie(67).setNazwa("czarownica").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Andrzejki, Okazja.Halloween).setKategoria(Kategoria.Film_i_scena, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(68).setZdjęcie(68).setNazwa("Królewna Śnieżka").setDlaPary(21).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.L),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XL)));

        dodaj(new Strój(69).setZdjęcie(1032).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M)));

        dodaj(new Strój(70).setZdjęcie(1138).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S)));

        dodaj(new Strój(71).setZdjęcie(71).setNazwa("szlachecki").setDlaPary(15).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Film_i_scena, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.L),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.XL)));

        dodaj(new Strój(72).setZdjęcie(72).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M)));

        dodaj(new Strój(73).setZdjęcie(73).setNazwa("suknia z Dzikiego zachodu").setWiek(Wiek.DOROSŁY).setDlugaNazwa().setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M)));

        dodaj(new Strój(74).setZdjęcie(1132, 1133).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M)));

        dodaj(new Strój(75).setZdjęcie(75).setNazwa("cyganka").setDlaPary(19).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_170, Pas.S)));

        dodaj(new Strój(76).setZdjęcie(76).setNazwa("piratka").setDlaPary(1).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Pirackie, Kategoria.Bajki, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S)));

        dodaj(new Strój(78).setZdjęcie(78, 135).setNazwa("królowa").setDlaPary(22).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.L, Pas.XL),
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.S, Pas.M)));

        dodaj(new Strój(79).setZdjęcie(79).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.L)));

        dodaj(new Strój(82).setZdjęcie(82).setNazwa("anioł").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.L),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M),
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.S),
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.M)));

        dodaj(new Strój(81).setZdjęcie(81).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M)));

        dodaj(new Strój(83).setZdjęcie(83, 84).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M)));

        dodaj(new Strój(86).setZdjęcie(86).setNazwa("clown").setDlaPary(12).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.XL)));

        dodaj(new Strój(88).setZdjęcie(88).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S)));

        dodaj(new Strój(90).setZdjęcie(90).setNazwa("spódnica rock and roll").setWiek(Wiek.DOROSŁY).setDlugaNazwa().setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_50_i_60).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S, Pas.L)));

        dodaj(new Strój(92).setZdjęcie(92).setNazwa("hinduska").setDlaPary(23).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(93).setZdjęcie(93).setNazwa("hipiska").setDlaPary(14).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(97).setZdjęcie(97, 98).setNazwa("suknia").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_20_i_30).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S)));

        dodaj(new Strój(96).setZdjęcie(96).setNazwa("czarownica").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Andrzejki, Okazja.Halloween).setKategoria(Kategoria.Film_i_scena, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.L)));

        dodaj(new Strój(101).setZdjęcie(101).setNazwa("suknia").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M)));

        dodaj(new Strój(102).setZdjęcie(102).setNazwa("tancerka turecka").setDlaPary(11).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.M)));

        dodaj(new Strój(103).setZdjęcie(103, 132).setNazwa("arlekin").setDlaPary(24).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.L)));

        dodaj(new Strój(104).setZdjęcie(1141).setNazwa("szlachecki").setDlaPary(15).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Historyczne, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.S)));

        dodaj(new Strój(112).setZdjęcie(112).setNazwa("cyganka").setDlaPary(19).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(114).setZdjęcie(114).setNazwa("krówka").setDlaPary(25).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.XL)));

        dodaj(new Strój(122).setZdjęcie(122).setNazwa("cyganka").setDlaPary(19).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M)));

        dodaj(new Strój(123).setZdjęcie(1150).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M)));

        dodaj(new Strój(125).setZdjęcie(125).setNazwa("pokojówka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy, Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.XS, Pas.S)));

        dodaj(new Strój(130).setZdjęcie(129).setNazwa("kontusz szlachecki").setDlaPary(15).setDlugaNazwa().setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.XL)));

        dodaj(new Strój(135).setZdjęcie(137).setNazwa("suknia").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_20_i_30).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M)));

        dodaj(new Strój(136).setZdjęcie(138).setNazwa("suknia").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_20_i_30).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.L)));

        dodaj(new Strój(137).setZdjęcie(139).setNazwa("suknia").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_20_i_30).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.XL)));

        dodaj(new Strój(146).setZdjęcie(148, 150).setNazwa("Michael Jackson").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134)));

        dodaj(new Strój(147).setZdjęcie(149).setNazwa("cyganka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_146, Wzrost.cm_152)));

        dodaj(new Strój(148).setZdjęcie(151).setNazwa("pastuszek").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_146)));

        dodaj(new Strój(149).setZdjęcie(153).setNazwa("pastuszek").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(150).setZdjęcie(154).setNazwa("Józef").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_98),
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(151).setZdjęcie(152).setNazwa("diablica").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween, Okazja.Jasełka).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146)));

        dodaj(new Strój(152).setZdjęcie(155, 156).setNazwa("król").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122)));

        dodaj(new Strój(153).setZdjęcie(157, 158).setNazwa("szlachcic").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_158),
                new Rozmiar(Wzrost.cm_164)));

        dodaj(new Strój(154).setZdjęcie(159).setNazwa("książe").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(155).setZdjęcie(160).setNazwa("kosmonauta").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(156).setZdjęcie(161).setNazwa("strażak").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(157).setZdjęcie(162, 163).setNazwa("anioł").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_98),
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(158).setZdjęcie(164).setNazwa("duch").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116)));

        dodaj(new Strój(159).setZdjęcie(165, 166).setNazwa("Piotruś Pan").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(160).setZdjęcie(167, 168).setNazwa("król").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(161).setZdjęcie(169, 170).setNazwa("dworzanin").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(162).setZdjęcie(171, 172).setNazwa("diabeł").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_122)));

        dodaj(new Strój(163).setZdjęcie(173).setNazwa("superman").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Bajki, Kategoria.Super_bohaterowie).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(164).setZdjęcie(174).setNazwa("góral").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Narodowościowe, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146)));

        dodaj(new Strój(165).setZdjęcie(175).setNazwa("góral").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Narodowościowe, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146)));

        dodaj(new Strój(166).setZdjęcie(176, 177).setNazwa("krakowiak").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(167).setZdjęcie(178, 179).setNazwa("król").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(168).setZdjęcie(180, 181).setNazwa("król").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(169).setZdjęcie(182, 183).setNazwa("zając").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(170).setZdjęcie(184, 185).setNazwa("rycerz").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110)));

        dodaj(new Strój(171).setZdjęcie(187, 188).setNazwa("muszkieter").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110)));

        dodaj(new Strój(172).setZdjęcie(189).setNazwa("rekin").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122)));

        dodaj(new Strój(173).setZdjęcie(190, 191, 192, 193).setNazwa("wilk").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122)));

        dodaj(new Strój(174).setZdjęcie(194, 195).setNazwa("małpka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_98),
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_146)));

        dodaj(new Strój(176).setZdjęcie(196).setNazwa("czarownica").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122)));

        dodaj(new Strój(177).setZdjęcie(197, 198).setNazwa("lis").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(178).setZdjęcie(199, 200).setNazwa("syrenka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116)));

        dodaj(new Strój(180).setZdjęcie(201, 202).setNazwa("czarownica").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116), new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(181).setZdjęcie(203).setNazwa("gąska").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122)));

        dodaj(new Strój(182).setZdjęcie(204, 205).setNazwa("kurczątko").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(183).setZdjęcie(206, 208, 313).setNazwa("hiszpanka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_146)));

        dodaj(new Strój(184).setZdjęcie(207).setNazwa("Żołnierz").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(187).setZdjęcie(211).setNazwa("Jasmina").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(189).setZdjęcie(213).setNazwa("ninja").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_98),
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_146)));

        dodaj(new Strój(190).setZdjęcie(214, 216).setNazwa("dama").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(191).setZdjęcie(217).setNazwa("suknia wizytowa").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(193).setZdjęcie(218).setNazwa("diablica").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(194).setZdjęcie(219).setNazwa("hiszpanka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_146)));

        dodaj(new Strój(195).setZdjęcie(220, 222).setNazwa("Łabędź").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_158)));

        dodaj(new Strój(196).setZdjęcie(221).setNazwa("suknia wizytowa").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_146)));

        dodaj(new Strój(197).setZdjęcie(224, 226).setNazwa("diablica").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(198).setZdjęcie(225).setNazwa("suknia wizytowa").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_146)));

        dodaj(new Strój(199).setZdjęcie(227).setNazwa("biedronka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_152)));

        dodaj(new Strój(221).setZdjęcie(228).setNazwa("indyk").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(200).setZdjęcie(230).setNazwa("Disco").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(201).setZdjęcie(231).setNazwa("dama").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(202).setZdjęcie(232, 234).setNazwa("krówka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_128)));

        dodaj(new Strój(203).setZdjęcie(236).setNazwa("wróżka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Andrzejki).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_116)));

        dodaj(new Strój(204).setZdjęcie(237).setNazwa("księżniczka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Andrzejki).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(205).setZdjęcie(238, 240).setNazwa("kura").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(206).setZdjęcie(241).setNazwa("Disco").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(207).setZdjęcie(242).setNazwa("czarownica").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116)));

        dodaj(new Strój(208).setZdjęcie(243).setNazwa("czarownica").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(209).setZdjęcie(244).setNazwa("pająk").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_104)));

        dodaj(new Strój(210).setZdjęcie(245).setNazwa("dama").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(211).setZdjęcie(246).setNazwa("czarownica").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116)));

        dodaj(new Strój(212).setZdjęcie(247).setNazwa("cyganka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_146, Wzrost.cm_152)));

        dodaj(new Strój(214).setZdjęcie(248, 250).setNazwa("bocian").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146)));

        dodaj(new Strój(216).setZdjęcie(252).setNazwa("byk").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(217).setZdjęcie(254, 256).setNazwa("czarownica").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116)));

        dodaj(new Strój(218).setZdjęcie(255).setNazwa("disco").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_146)));

        dodaj(new Strój(219).setZdjęcie(257, 328).setNazwa("motyl").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(220).setZdjęcie(259).setNazwa("piratka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Pirackie).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146)));

        dodaj(new Strój(222).setZdjęcie(new Zdjęcie(262, false), new Zdjęcie(264, true)).setNazwa("niedźwiadek").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146)));

        dodaj(new Strój(223).setZdjęcie(263).setNazwa("piratka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Pirackie).setRozmiar(
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(225).setZdjęcie(261).setNazwa("Disco").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(226).setZdjęcie(266, 268).setNazwa("czarownica").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(227).setZdjęcie(267).setNazwa("syrenka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(228).setZdjęcie(269).setNazwa("samba").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(229).setZdjęcie(270).setNazwa("Żaba").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_98),
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_152, Wzrost.cm_158)));

        dodaj(new Strój(230).setZdjęcie(271).setNazwa("sukienka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_20_i_30).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(231).setZdjęcie(272, 274).setNazwa("lew").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_152, Wzrost.cm_158)));

        dodaj(new Strój(232).setZdjęcie(273).setNazwa("hiszpanka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_146)));

        dodaj(new Strój(233).setZdjęcie(275).setNazwa("cyganka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(234).setZdjęcie(277).setNazwa("jasmina").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(235).setZdjęcie(281).setNazwa("jasmina").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(237).setZdjęcie(278).setNazwa("orzeł").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(238).setZdjęcie(279).setNazwa("disco").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(239).setZdjęcie(280, 282).setNazwa("wiosna").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_116)));

        dodaj(new Strój(240).setZdjęcie(283).setNazwa("disco").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(241).setZdjęcie(new Zdjęcie(284, Boolean.TRUE), new Zdjęcie(286, Boolean.FALSE)).setNazwa("wąż").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(242).setZdjęcie(285).setNazwa("dama").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(243).setZdjęcie(287).setNazwa("królowa").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(244).setZdjęcie(288).setNazwa("wróżka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116)));

        dodaj(new Strój(245).setZdjęcie(289).setNazwa("dama").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(246).setZdjęcie(293).setNazwa("dama").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(247).setZdjęcie(297).setNazwa("dama").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(248).setZdjęcie(290, 292).setNazwa("indianka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(249).setZdjęcie(291).setNazwa("królowa").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(250).setZdjęcie(294, 296).setNazwa("Disco").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_122)));

        dodaj(new Strój(251).setZdjęcie(295).setNazwa("syrenka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Pirackie).setRozmiar(
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(252).setZdjęcie(298, 300).setNazwa("motyl").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(253).setZdjęcie(299).setNazwa("dama").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(254).setZdjęcie(301).setNazwa("dama").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(255).setZdjęcie(302, 304).setNazwa("motyl").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116)));

        dodaj(new Strój(256).setZdjęcie(303).setNazwa("szlachcianka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_146)));

        dodaj(new Strój(257).setZdjęcie(305).setNazwa("szlachcianka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(258).setZdjęcie(306).setNazwa("disco").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(260).setZdjęcie(311).setNazwa("indianka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Dziki_zachód).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(259).setZdjęcie(307).setNazwa("indianka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Dziki_zachód).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(261).setZdjęcie(315).setNazwa("indianka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Dziki_zachód).setRozmiar(
                new Rozmiar(Wzrost.cm_152, Wzrost.cm_158)));

        dodaj(new Strój(262).setZdjęcie(308).setNazwa("pielęgniarka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(263).setZdjęcie(309).setNazwa("piratka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Pirackie).setRozmiar(
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(264).setZdjęcie(310, 312, 314).setNazwa("suknia do walca").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_116)));

        dodaj(new Strój(265).setZdjęcie(316).setNazwa("Maryja").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_98),
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(266).setZdjęcie(317).setNazwa("cyganka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(267).setZdjęcie(318).setNazwa("Anioł").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_98),
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(268).setZdjęcie(320).setNazwa("księżniczka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116)));

        dodaj(new Strój(269).setZdjęcie(321).setNazwa("wróżka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(270).setZdjęcie(322).setNazwa("syrenka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116)));

        dodaj(new Strój(271).setZdjęcie(323).setNazwa("cyganka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(274).setZdjęcie(329).setNazwa("cyganka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(275).setZdjęcie(324).setNazwa("Królewna Śnieżka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_98),
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(276).setZdjęcie(325).setNazwa("Królewna").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(277).setZdjęcie(326).setNazwa("dama").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(278).setZdjęcie(327).setNazwa("wróżka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(279).setZdjęcie(330, 331).setNazwa("księżniczka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116)));

        dodaj(new Strój(280).setZdjęcie(332).setNazwa("księżniczka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(281).setZdjęcie(337, 338).setNazwa("księżniczka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(282).setZdjęcie(333, 346, 347).setNazwa("Roszpunka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_134)));

        dodaj(new Strój(283).setZdjęcie(334).setNazwa("motyl").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_122)));

        dodaj(new Strój(284).setZdjęcie(335, 336).setNazwa("królowa").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_116)));

        dodaj(new Strój(285).setZdjęcie(339, 340).setNazwa("księżniczka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_98),
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_116)));

        dodaj(new Strój(286).setZdjęcie(341).setNazwa("krakowianka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(287).setZdjęcie(342, 413).setNazwa("pszczółka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134)));

        dodaj(new Strój(288).setZdjęcie(343).setNazwa("biedronka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(289).setZdjęcie(344, 345).setNazwa("smok").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116)));

        dodaj(new Strój(291).setZdjęcie(348, 349).setNazwa("kotek").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122)));

        dodaj(new Strój(292).setZdjęcie(new Zdjęcie(350, Boolean.TRUE)).setNazwa("myszka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122)));

        dodaj(new Strój(293).setZdjęcie(new Zdjęcie(351, Boolean.FALSE), new Zdjęcie(352, Boolean.TRUE)).setNazwa("wiewiórka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146)));

        dodaj(new Strój(294).setZdjęcie(353, 354, 355).setNazwa("Łabędź").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(295).setZdjęcie(356, 357).setNazwa("tancerka turecka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(296).setZdjęcie(358, 359).setNazwa("czarownica").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(297).setZdjęcie(360, 361, 362).setNazwa("cyganka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_152, Wzrost.cm_158)));

        dodaj(new Strój(298).setZdjęcie(363).setNazwa("czarownica").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_152, Wzrost.cm_158)));

        dodaj(new Strój(299).setZdjęcie(364).setNazwa("sukienka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_20_i_30).setRozmiar(
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(300).setZdjęcie(365).setNazwa("Lady Safari").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(301).setZdjęcie(366).setNazwa("diablica").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(302).setZdjęcie(368).setNazwa("dalmatyńczyk").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146)));

        dodaj(new Strój(303).setZdjęcie(367, 379).setNazwa("wróżka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Andrzejki).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(304).setZdjęcie(370).setNazwa("królik").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_152, Wzrost.cm_158)));

        dodaj(new Strój(305).setZdjęcie(1007).setNazwa("traper").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Dziki_zachód).setRozmiar(
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(306).setZdjęcie(372).setNazwa("kowboj").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Dziki_zachód).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_122)));

        dodaj(new Strój(307).setZdjęcie(373).setNazwa("indianin").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Dziki_zachód).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_122)));

        dodaj(new Strój(308).setZdjęcie(374).setNazwa("Fazi z Ulicy Sezamkowej").setDlugaNazwa().setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_110, Wzrost.cm_116)));

        dodaj(new Strój(309).setZdjęcie(375).setNazwa("hiszpanka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(310).setZdjęcie(376).setNazwa("cyganka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_146, Wzrost.cm_152)));

        dodaj(new Strój(311).setZdjęcie(377).setNazwa("cyganka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146)));

        dodaj(new Strój(312).setZdjęcie(378).setNazwa("cyganka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_152, Wzrost.cm_158)));

        dodaj(new Strój(313).setZdjęcie(380).setNazwa("czarownica").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(315).setZdjęcie(382).setNazwa("kierowca rajdowy").setDlugaNazwa().setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(316).setZdjęcie(381, 388).setNazwa("czarownica").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_146, Wzrost.cm_152)));

        dodaj(new Strój(317).setZdjęcie(384).setNazwa("spiderman").setDlaPary(33).setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Super_bohaterowie).setRozmiar(
                new Rozmiar(Wzrost.cm_98),
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_110)));

        dodaj(new Strój(318).setZdjęcie(385).setNazwa("czarodziejka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Andrzejki).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(319).setZdjęcie(386).setNazwa("wróżka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Andrzejki).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_152),
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(320).setZdjęcie(387).setNazwa("księżniczka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_128)));

        dodaj(new Strój(321).setZdjęcie(389).setNazwa("księżniczka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(322).setZdjęcie(390).setNazwa("disco").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_146, Wzrost.cm_158)));

        dodaj(new Strój(323).setZdjęcie(391).setNazwa("cyganka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(325).setZdjęcie(394).setNazwa("czirliderki").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_152, Wzrost.cm_158)));

        dodaj(new Strój(326).setZdjęcie(395).setNazwa("czarownica").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_152, Wzrost.cm_158)));

        dodaj(new Strój(327).setZdjęcie(new Zdjęcie(396, Boolean.TRUE)).setNazwa("sarenka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_134)));

        dodaj(new Strój(328).setZdjęcie(397).setNazwa("stańczyk").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(329).setZdjęcie(398).setNazwa("wróżka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(330).setZdjęcie(399).setNazwa("czarodziejka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Andrzejki).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));
    }

    private void addData2() {
        dodaj(new Strój(331).setZdjęcie(400).setNazwa("wodnik").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(332).setZdjęcie(401).setNazwa("rycerz").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(333).setZdjęcie(403).setNazwa("legionista rzymski").setWiek(Wiek.DZIECKO).setDlugaNazwa().setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(334).setZdjęcie(404).setNazwa("suknia").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(335).setZdjęcie(405).setNazwa("tygrys").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_152, Wzrost.cm_158)));

        dodaj(new Strój(336).setZdjęcie(407).setNazwa("miś").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110)));

        dodaj(new Strój(337).setZdjęcie(408).setNazwa("kotek").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_98),
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(338).setZdjęcie(409).setNazwa("clown").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_98),
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_110)));

        dodaj(new Strój(339).setZdjęcie(414).setNazwa("pszczoła").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122)));

        dodaj(new Strój(340).setZdjęcie(415).setNazwa("Samuraj").setWiek(Wiek.DZIECKO).setDlugaNazwa().setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(341).setZdjęcie(416).setNazwa("indianin").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Dziki_zachód).setRozmiar(
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(342).setZdjęcie(417).setNazwa("pirat").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Pirackie).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(343).setZdjęcie(418).setNazwa("chińczyk").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_134, Wzrost.cm_140)));

        dodaj(new Strój(344).setZdjęcie(419).setNazwa("dama").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(345).setZdjęcie(420).setNazwa("karateka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(346).setZdjęcie(421).setNazwa("kowboj").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Dziki_zachód).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(347).setZdjęcie(422).setNazwa("japonka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_122)));

        dodaj(new Strój(348).setZdjęcie(423).setNazwa("indianin").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Dziki_zachód).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(349).setZdjęcie(425).setNazwa("suknia").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(350).setZdjęcie(426).setNazwa("Aladyn").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_146)));

        dodaj(new Strój(351).setZdjęcie(428).setNazwa("diabliczka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Bajki, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_98),
                new Rozmiar(Wzrost.cm_104)));

        dodaj(new Strój(352).setZdjęcie(430).setNazwa("dworzanin").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110)));

        dodaj(new Strój(353).setZdjęcie(436).setNazwa("indianin").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Dziki_zachód).setRozmiar(
                new Rozmiar(Wzrost.cm_116)));

        dodaj(new Strój(354).setZdjęcie(437).setNazwa("rycerz").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_152, Wzrost.cm_158),
                new Rozmiar(Wzrost.cm_164)));

        dodaj(new Strój(355).setZdjęcie(438).setNazwa("ułan").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(356).setZdjęcie(439, 440).setNazwa("pirat").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Pirackie).setRozmiar(
                new Rozmiar(Wzrost.cm_86),
                new Rozmiar(Wzrost.cm_92),
                new Rozmiar(Wzrost.cm_98)));

        dodaj(new Strój(357).setZdjęcie(441).setNazwa("indianin").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Dziki_zachód, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_86),
                new Rozmiar(Wzrost.cm_92),
                new Rozmiar(Wzrost.cm_98)));

        dodaj(new Strój(358).setZdjęcie(442).setNazwa("Robin Hood").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_92),
                new Rozmiar(Wzrost.cm_98),
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_152, Wzrost.cm_158),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170)));

        dodaj(new Strój(359).setZdjęcie(443).setNazwa("król").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110)));

        dodaj(new Strój(361).setZdjęcie(445).setNazwa("kapitan Hak").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Pirackie).setRozmiar(
                new Rozmiar(Wzrost.cm_98, Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146)));

        dodaj(new Strój(362).setZdjęcie(447).setNazwa("król").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Bajki, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(364).setZdjęcie(700).setNazwa("dzięcioł").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_188, Pas.XS, Pas.XL)));

        dodaj(new Strój(365).setZdjęcie(701).setNazwa("papuga").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.XS, Pas.XL)));

        dodaj(new Strój(366).setZdjęcie(702).setNazwa("słowik").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_188, Pas.XS, Pas.XL)));

        dodaj(new Strój(367).setZdjęcie(703).setNazwa("zebra").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(369).setZdjęcie(705).setNazwa("indyk").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_182, Pas.S, Pas.L)));

        dodaj(new Strój(370).setZdjęcie(706).setNazwa("Żyrafa").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(371).setZdjęcie(new Zdjęcie(708, Boolean.TRUE)).setNazwa("wąż").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.L)));

        dodaj(new Strój(372).setZdjęcie(710).setNazwa("kaczka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S, Pas.XL)));

        dodaj(new Strój(373).setZdjęcie(711).setNazwa("kogut").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.M, Pas.XL)));

        dodaj(new Strój(374).setZdjęcie(712, 713).setNazwa("konik morski").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.M, Pas.XXL)));

        dodaj(new Strój(375).setZdjęcie(714).setNazwa("Świnka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.S, Pas.L)));

        dodaj(new Strój(41).setZdjęcie(715).setNazwa("grzyb kania").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Owoce_i_warzywa).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(376).setZdjęcie(718, 719).setNazwa("łabędź").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_182, Pas.S, Pas.L)));

        dodaj(new Strój(377).setZdjęcie(720).setNazwa("niedźwiedź").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.S, Pas.L)));

        dodaj(new Strój(378).setZdjęcie(721).setNazwa("gąska").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.S, Pas.L)));

        dodaj(new Strój(379).setZdjęcie(722).setNazwa("Słowik").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.S, Pas.XL)));

        dodaj(new Strój(381).setZdjęcie(724).setNazwa("kura").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S, Pas.XL)));

        dodaj(new Strój(382).setZdjęcie(725).setNazwa("mrówka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S, Pas.L)));

        dodaj(new Strój(383).setZdjęcie(726).setNazwa("brzydkie kaczątko").setDlugaNazwa().setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S, Pas.L)));

        dodaj(new Strój(384).setZdjęcie(727).setNazwa("wilk").setDlaPary(18).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.L)));

        dodaj(new Strój(385).setZdjęcie(728).setNazwa("kukułka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S, Pas.L)));

        dodaj(new Strój(386).setZdjęcie(729).setNazwa("kret").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S, Pas.L)));

        dodaj(new Strój(387).setZdjęcie(730).setNazwa("koń").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.M, Pas.XL)));

        dodaj(new Strój(388).setZdjęcie(731).setNazwa("małpka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.XS, Pas.L)));

        dodaj(new Strój(389).setZdjęcie(732).setNazwa("wiewiórka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.L)));

        dodaj(new Strój(390).setZdjęcie(733).setNazwa("mysz").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S, Pas.L)));

        dodaj(new Strój(391).setZdjęcie(734).setNazwa("Kubuś Puchatek").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_170, Pas.S, Pas.L)));

        dodaj(new Strój(392).setZdjęcie(736).setNazwa("rak").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_170, Pas.S, Pas.L)));

        dodaj(new Strój(394).setZdjęcie(1160).setNazwa("piratka").setDlaPary(1).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Pirackie, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_182, Pas.XL, Pas.XXL)));

        dodaj(new Strój(395).setZdjęcie(1159).setNazwa("piratka").setDlaPary(1).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Pirackie, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_182, Pas.XL, Pas.XXL)));

        dodaj(new Strój(397).setZdjęcie(1027).setNazwa("kopciuszek").setDlaPary(26).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M)));

        dodaj(new Strój(399).setZdjęcie(743).setNazwa("meksykanka").setDlaPary(4).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.S, Pas.L)));

        dodaj(new Strój(400).setZdjęcie(746).setNazwa("meksykanka").setDlaPary(4).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.S, Pas.L)));

        dodaj(new Strój(401).setZdjęcie(744).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.XL)));

        dodaj(new Strój(402).setZdjęcie(974).setNazwa("szkot").setDlaPary(27).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_188, Pas.M, Pas.XL)));

        dodaj(new Strój(406).setZdjęcie(750, 1090).setNazwa("królowa zima").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.L, Pas.XL)));

        dodaj(new Strój(407).setZdjęcie(751).setNazwa("szata").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.L)));

        dodaj(new Strój(412).setZdjęcie(757).setNazwa("jaskiniowiec").setDlaPary(17).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(414).setZdjęcie(759).setNazwa("śnieżynka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Jasełka, Okazja.Mikołajki).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(415).setZdjęcie(760).setNazwa("milicjant").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(416).setZdjęcie(990).setNazwa("marynarz").setDlaPary(28).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Pas.S),
                new Rozmiar(Wzrost.cm_170, Pas.M)));

        dodaj(new Strój(417).setZdjęcie(762).setNazwa("duch").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.S, Pas.XL)));

        dodaj(new Strój(418).setZdjęcie(980).setNazwa("szkotka").setDlaPary(27).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Pas.S),
                new Rozmiar(Wzrost.cm_170, Pas.L)));

        dodaj(new Strój(419).setZdjęcie(1084).setNazwa("piratka").setDlaPary(1).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy, Kategoria.Pirackie).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(420).setZdjęcie(770).setNazwa("policjantka").setDlaPary(29).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy, Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(421).setZdjęcie(771).setNazwa("stewardessa").setDlaPary(30).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy, Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(422).setZdjęcie(773).setNazwa("papuga").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Pas.S, Pas.L),
                new Rozmiar(Wzrost.cm_140, Pas.S, Pas.L)));

        dodaj(new Strój(423).setZdjęcie(774).setNazwa("japonka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_122, Pas.S, Pas.L)));

        dodaj(new Strój(425).setZdjęcie(776).setNazwa("dwórka").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_152, Wzrost.cm_158, Pas.S)));

        dodaj(new Strój(426).setZdjęcie(778).setNazwa("policjant").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(428).setZdjęcie(780).setNazwa("bokser").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(429).setZdjęcie(782).setNazwa("muszkieterka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_128, Pas.S, Pas.M)));

        dodaj(new Strój(430).setZdjęcie(803).setNazwa("kierowca rajdowy").setDlugaNazwa().setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146, Pas.S, Pas.M)));

        dodaj(new Strój(431).setZdjęcie(785).setNazwa("disco").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Pas.S, Pas.L),
                new Rozmiar(Wzrost.cm_128, Pas.S, Pas.L),
                new Rozmiar(Wzrost.cm_140, Pas.S, Pas.L),
                new Rozmiar(Wzrost.cm_152, Pas.S, Pas.L),
                new Rozmiar(Wzrost.cm_164, Pas.S, Pas.L)));

        dodaj(new Strój(433).setZdjęcie(787).setNazwa("Śnieżynka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Mikołajki).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_170, Pas.XS, Pas.S)));

        dodaj(new Strój(434).setZdjęcie(788, 789).setNazwa("disco").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_152),
                new Rozmiar(Wzrost.cm_164)));

        dodaj(new Strój(435).setZdjęcie(791).setNazwa("muszkieterka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122)));

        dodaj(new Strój(436).setZdjęcie(792).setNazwa("calineczka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S)));

        dodaj(new Strój(437).setZdjęcie(793).setNazwa("policjant").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(438).setZdjęcie(794).setNazwa("kwiatek").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(439).setZdjęcie(795).setNazwa("piotruś pan").setDlaPary(32).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(441).setZdjęcie(798).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.XS, Pas.S)));

        dodaj(new Strój(442).setZdjęcie(799).setNazwa("harry potter").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(445).setZdjęcie(802).setNazwa("wojownik grecki").setDlaPary(76).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S, Pas.L)));

        dodaj(new Strój(447).setZdjęcie(804).setNazwa("wonder woman").setDlaPary(33).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Super_bohaterowie, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.XS, Pas.S)));

        dodaj(new Strój(448).setZdjęcie(1077).setNazwa("piratka").setDlaPary(1).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Pirackie, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(449).setZdjęcie(806).setNazwa("superman").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Super_bohaterowie).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(450).setZdjęcie(807).setNazwa("wiosna").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(451).setZdjęcie(808).setNazwa("wiking").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(452).setZdjęcie(809).setNazwa("gąska").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.S)));

        dodaj(new Strój(453).setZdjęcie(811).setNazwa("napoleon").setDlaPary(34).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(455).setZdjęcie(959).setNazwa("Ślimak").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(456).setZdjęcie(814).setNazwa("Żyrafa").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146)));

        dodaj(new Strój(457).setZdjęcie(815).setNazwa("rycerz").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(458).setZdjęcie(816, 817).setNazwa("Żółw").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146)));

        dodaj(new Strój(459).setZdjęcie(818).setNazwa("księżniczka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(460).setZdjęcie(819).setNazwa("ułan").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.S, Pas.M)));

        dodaj(new Strój(461).setZdjęcie(820).setNazwa("diablica").setDlaPary(8).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(462).setZdjęcie(821, 822, 823).setNazwa("spiderman").setDlaPary(33).setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Super_bohaterowie).setRozmiar(
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(463).setZdjęcie(824).setNazwa("drakulaura").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(465).setZdjęcie(826).setNazwa("Śmierć").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween, Okazja.Jasełka).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.S, Pas.L)));

        dodaj(new Strój(466).setZdjęcie(827).setNazwa("myszka mini").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_104)));

        dodaj(new Strój(467).setZdjęcie(829).setNazwa("hawajka").setDlaPary(35).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_170, Pas.XS, Pas.M)));

        dodaj(new Strój(468).setZdjęcie(830).setNazwa("Kościotrup").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.XS, Pas.M)));

        dodaj(new Strój(469).setZdjęcie(831).setNazwa("obi wan kenobi").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_152),
                new Rozmiar(Wzrost.cm_164)));

        dodaj(new Strój(470).setZdjęcie(832).setNazwa("clawdeen wolf").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(471).setZdjęcie(836).setNazwa("frankie stein").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(472).setZdjęcie(833).setNazwa("suknia empire").setDlaPary(34).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L),
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.XS, Pas.M)));

        dodaj(new Strój(473).setZdjęcie(837).setNazwa("suknia empire").setDlaPary(34).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S)));

        dodaj(new Strój(476).setZdjęcie(835).setNazwa("anakin").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(477).setZdjęcie(840).setNazwa("anakin").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(479).setZdjęcie(842).setNazwa("cyganka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146)));

        dodaj(new Strój(480).setZdjęcie(843).setNazwa("diabeł").setDlaPary(8).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween, Okazja.Jasełka).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_194, Pas.M, Pas.XXL)));

        dodaj(new Strój(481).setZdjęcie(846).setNazwa("diablica").setDlaPary(8).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween, Okazja.Jasełka).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(482).setZdjęcie(845, 851, 853).setNazwa("Darth Vader").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(483).setZdjęcie(847).setNazwa("niezapominajka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122)));

        dodaj(new Strój(484).setZdjęcie(848).setNazwa("al capone").setDlaPary(37).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(485).setZdjęcie(849).setNazwa("Samuraj").setDlaPary(7).setDlugaNazwa().setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(486).setZdjęcie(850).setNazwa("słonecznik").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_128)));

        dodaj(new Strój(89).setZdjęcie(new Zdjęcie(857, Boolean.FALSE), new Zdjęcie(113, Boolean.FALSE), new Zdjęcie(854, Boolean.TRUE)).setNazwa("teletubiś").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.L)));

        dodaj(new Strój(91).setZdjęcie(new Zdjęcie(855, Boolean.FALSE), new Zdjęcie(854, Boolean.TRUE)).setNazwa("teletubiś").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S, Pas.L)));

        dodaj(new Strój(94).setZdjęcie(new Zdjęcie(856, Boolean.FALSE), new Zdjęcie(854, Boolean.TRUE)).setNazwa("teletubiś").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.L),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.S, Pas.L)));

        dodaj(new Strój(488).setZdjęcie(new Zdjęcie(858, Boolean.FALSE), new Zdjęcie(854, Boolean.TRUE)).setNazwa("teletubiś").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.L)));

        dodaj(new Strój(80).setZdjęcie(859, 861).setNazwa("golfista").setDlaPary(38).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.L, Pas.XL)));

        dodaj(new Strój(490).setZdjęcie(862, 864).setNazwa("krasnoludek").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116)));

        dodaj(new Strój(489).setZdjęcie(860, 861).setNazwa("golfistka").setDlaPary(38).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.XS, Pas.M)));

        dodaj(new Strój(491).setZdjęcie(863, 864).setNazwa("krasnoludek").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(492).setZdjęcie(new Zdjęcie(865, Boolean.FALSE), new Zdjęcie(869, Boolean.TRUE)).setDlaPary(21).setNazwa("krasnoludek").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.L)));

        dodaj(new Strój(493).setZdjęcie(new Zdjęcie(867, Boolean.FALSE), new Zdjęcie(869, Boolean.TRUE)).setDlaPary(21).setNazwa("krasnoludek").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.L)));

        dodaj(new Strój(494).setZdjęcie(new Zdjęcie(868, Boolean.FALSE), new Zdjęcie(869, Boolean.TRUE)).setDlaPary(21).setNazwa("krasnoludek").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.M)));

        dodaj(new Strój(495).setZdjęcie(870).setNazwa("klon").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(496).setZdjęcie(871).setNazwa("kankan").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_134)));

        dodaj(new Strój(497).setZdjęcie(874).setNazwa("kankan").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_134)));

        dodaj(new Strój(498).setZdjęcie(876).setNazwa("kankan").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_134, Wzrost.cm_146)));

        dodaj(new Strój(499).setZdjęcie(878).setNazwa("kankan").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_134, Wzrost.cm_146)));

        dodaj(new Strój(501).setZdjęcie(872).setNazwa("wojownik").setDlaPary(39).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(502).setZdjęcie(879).setNazwa("pirat").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Pirackie).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(503).setZdjęcie(881).setNazwa("kankan").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_134, Wzrost.cm_146)));

        dodaj(new Strój(504).setZdjęcie(883).setNazwa("kwiatek").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_134)));

        dodaj(new Strój(506).setZdjęcie(887).setNazwa("kleopatra").setDlaPary(65).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.XS, Pas.S)));

        dodaj(new Strój(507).setZdjęcie(888).setNazwa("biały niedźwiedź").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(508).setZdjęcie(889).setNazwa("koń").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(509).setZdjęcie(890).setNazwa("wiosna").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_170, Pas.XS, Pas.M)));

        dodaj(new Strój(512).setZdjęcie(893).setNazwa("turek").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(513).setZdjęcie(894).setNazwa("buzz astral").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116)));

        dodaj(new Strój(514).setZdjęcie(896).setNazwa("książę wschodni").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(515).setZdjęcie(897).setNazwa("barbie").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_134, Wzrost.cm_146)));

        dodaj(new Strój(516).setZdjęcie(898).setNazwa("Kierowca Rajdowy").setDlugaNazwa().setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(517).setZdjęcie(900, 901).setNazwa("batman").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Super_bohaterowie).setRozmiar(
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(518).setZdjęcie(902).setNazwa("lisiczka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(519).setZdjęcie(905).setNazwa("drakula").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(520).setZdjęcie(906).setNazwa("kleopatra").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(521).setZdjęcie(908).setNazwa("diabeł").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween, Okazja.Jasełka).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_152, Wzrost.cm_158),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170)));

        dodaj(new Strój(522).setZdjęcie(909).setNazwa("motyl").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_128)));

        dodaj(new Strój(523).setZdjęcie(910).setNazwa("czarownica").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween, Okazja.Andrzejki).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M)));

        dodaj(new Strój(524).setZdjęcie(911).setNazwa("królewna śnieżka").setDlaPary(21).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S)));

        dodaj(new Strój(525).setZdjęcie(912).setNazwa("pilot").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(526).setZdjęcie(913).setNazwa("czarownica").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween, Okazja.Andrzejki).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(527).setZdjęcie(914).setNazwa("Żołnierz rzymski").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(528).setZdjęcie(915).setNazwa("hipiska").setDlaPary(14).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.XS, Pas.S)));

        dodaj(new Strój(529).setZdjęcie(917).setNazwa("dzwoneczek").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_134)));

        dodaj(new Strój(530).setZdjęcie(918).setNazwa("strażak").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(531).setZdjęcie(920).setNazwa("Żołnierz rzymski").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(532).setZdjęcie(922).setNazwa("czarownica").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween, Okazja.Andrzejki).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_152, Wzrost.cm_158)));

        dodaj(new Strój(533).setZdjęcie(923).setNazwa("marylin monroe").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.XS, Pas.S)));

        dodaj(new Strój(534).setZdjęcie(924).setNazwa("król").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(536).setZdjęcie(926).setNazwa("marynarz").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(537).setZdjęcie(927).setNazwa("królowa").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(538).setZdjęcie(929).setNazwa("Śmierć").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Jasełka, Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(539).setZdjęcie(930).setNazwa("kowbojka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Dziki_zachód).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(540).setZdjęcie(931).setNazwa("babcia").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(541).setZdjęcie(932).setNazwa("robin hood").setDlaPary(3).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.L)));

        dodaj(new Strój(542).setZdjęcie(933).setNazwa("indianka").setDlaPary(2).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Dziki_zachód, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.L)));

        dodaj(new Strój(543).setZdjęcie(934).setNazwa("hipiska").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(544).setZdjęcie(935).setNazwa("Albus Dumbledore").setDlugaNazwa().setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(545).setZdjęcie(936).setNazwa("bawarka").setDlaPary(41).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.L)));

        dodaj(new Strój(546).setZdjęcie(937).setNazwa("sukienka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_50_i_60).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M)));

        dodaj(new Strój(547).setZdjęcie(938).setNazwa("krokodyl").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(548).setZdjęcie(939).setNazwa("tancerka turecka").setDlaPary(11).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.M)));

        dodaj(new Strój(549).setZdjęcie(940).setNazwa("kaczka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146)));

        dodaj(new Strój(550).setZdjęcie(941).setNazwa("sukienka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_50_i_60).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(551).setZdjęcie(943).setNazwa("rak").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(552).setZdjęcie(944).setNazwa("muszkietarka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(553).setZdjęcie(945).setNazwa("indianka").setDlaPary(2).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Dziki_zachód, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(554).setZdjęcie(946).setNazwa("Żołnierz").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(556).setZdjęcie(947).setNazwa("bałwan").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(557).setZdjęcie(950).setNazwa("zebra").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(558).setZdjęcie(951).setNazwa("zombie").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(559).setZdjęcie(952).setNazwa("dworzanin").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M, Pas.L)));

        dodaj(new Strój(560).setZdjęcie(953).setNazwa("kangur").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134, Wzrost.cm_140)));

        dodaj(new Strój(561).setZdjęcie(954).setNazwa("kubuś puchatek").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_110, Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134, Wzrost.cm_140)));

        dodaj(new Strój(562).setZdjęcie(955).setNazwa("dworzanin").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M, Pas.L)));

        dodaj(new Strój(563).setZdjęcie(956).setNazwa("sarenka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146)));

        dodaj(new Strój(564).setZdjęcie(957).setNazwa("jelonek").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146)));

        dodaj(new Strój(565).setZdjęcie(958).setNazwa("owieczka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146)));

        dodaj(new Strój(566).setZdjęcie(961).setNazwa("cytryna").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Owoce_i_warzywa).setRozmiar(
                new Rozmiar(Wzrost.cm_110, Wzrost.cm_152)));

        dodaj(new Strój(567).setZdjęcie(962).setNazwa("książe").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_134)));

        dodaj(new Strój(568).setZdjęcie(963).setNazwa("pippi").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_140)));

        dodaj(new Strój(569).setZdjęcie(964, 965).setNazwa("smerf").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(570).setZdjęcie(965).setNazwa("smerfetka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(571).setZdjęcie(966).setNazwa("sułtan").setDlaPary(43).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M, Pas.L)));

        dodaj(new Strój(572).setZdjęcie(967).setNazwa("aladyn").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_140)));

        dodaj(new Strój(573).setZdjęcie(968).setNazwa("słoneczko").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_134)));

        dodaj(new Strój(574).setZdjęcie(969, 970).setNazwa("bokser").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_140)));

        dodaj(new Strój(575).setZdjęcie(971).setNazwa("księżniczka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_122)));

        dodaj(new Strój(576).setZdjęcie(972).setNazwa("wróbelek").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146)));

        dodaj(new Strój(577).setZdjęcie(973).setNazwa("ptak").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_146)));

        dodaj(new Strój(578).setZdjęcie(975).setNazwa("mak").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146)));

        dodaj(new Strój(579).setZdjęcie(977).setNazwa("kaczka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(580).setZdjęcie(978).setNazwa("jaskiniowiec").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(581).setZdjęcie(979, 981).setNazwa("diabeł").setDlaPary(8).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween, Okazja.Jasełka).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_194, Pas.M, Pas.L),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_188, Pas.XL, Pas.XXL)));

        dodaj(new Strój(582).setZdjęcie(982).setNazwa("duch").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(583).setZdjęcie(983).setNazwa("koziołek matołek").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_110, Wzrost.cm_116)));

        dodaj(new Strój(584).setZdjęcie(984).setNazwa("dama").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(585).setZdjęcie(985).setNazwa("królowa").setDlaPary(22).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(586).setZdjęcie(986).setNazwa("zielony groszek").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Owoce_i_warzywa).setRozmiar(
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_134)));

        dodaj(new Strój(587).setZdjęcie(987).setNazwa("disco").setDlaPary(20).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.M, Pas.L)));

        dodaj(new Strój(588).setZdjęcie(988).setNazwa("ninja").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(589).setZdjęcie(989).setNazwa("wiosna").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S, Pas.L)));

        dodaj(new Strój(590).setZdjęcie(991).setNazwa("disco").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.M, Pas.L),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.L, Pas.XL)));

        dodaj(new Strój(591).setZdjęcie(994).setNazwa("disco").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.M, Pas.L),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.L, Pas.XL)));

        dodaj(new Strój(592).setZdjęcie(1024).setNazwa("disco").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.M, Pas.L),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.L, Pas.XL)));

        dodaj(new Strój(593).setZdjęcie(992).setNazwa("laguna blue").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(594).setZdjęcie(993).setNazwa("kominiarz").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_128)));

        dodaj(new Strój(595).setZdjęcie(995).setNazwa("piratka").setDlaPary(1).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy, Kategoria.Pirackie).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(596).setZdjęcie(996, 1023).setNazwa("suknia empire").setDlaPary(34).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(61).setZdjęcie(997).setNazwa("pirat").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Pirackie).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_152, Wzrost.cm_158),
                new Rozmiar(Wzrost.cm_164)));

        dodaj(new Strój(597).setZdjęcie(998, 65, 91).setNazwa("diablica").setDlaPary(8).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.S, Pas.M)));

        dodaj(new Strój(598).setZdjęcie(999).setNazwa("gwiazdka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_140)));

        dodaj(new Strój(599).setZdjęcie(1000).setNazwa("pirat").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Pirackie).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_122)));

        dodaj(new Strój(600).setZdjęcie(1002, 1001).setNazwa("sexy lady").setDlaPary(44).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(601).setZdjęcie(1003, 1001).setNazwa("sutener").setDlaPary(44).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.M, Pas.L),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.L, Pas.XL)));

        dodaj(new Strój(602).setZdjęcie(1005).setNazwa("rumianek").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(603).setZdjęcie(1006, 1008).setDlaPary(22).setNazwa("królowa").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(604).setZdjęcie(1008, 1009).setNazwa("król").setDlaPary(22).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_194, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_194, Pas.L, Pas.XL)));

        dodaj(new Strój(46).setZdjęcie(1010, 1158).setNazwa("muszkieter").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_110)));

        dodaj(new Strój(605).setZdjęcie(1012).setNazwa("Elvis Presley").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M)));

        dodaj(new Strój(606).setZdjęcie(1013).setNazwa("disco").setDlaPary(20).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.L)));

        dodaj(new Strój(607).setZdjęcie(1014).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(608).setZdjęcie(1017).setNazwa("chinka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(609).setZdjęcie(1018).setNazwa("dr. watson").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.L, Pas.XL)));

        dodaj(new Strój(610).setZdjęcie(1020).setNazwa("al capone").setDlaPary(37).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_20_i_30).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.L),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.XXL),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.XL),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M)));

        dodaj(new Strój(611).setZdjęcie(1019).setNazwa("kan-kan").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Lata_20_i_30).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.L),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.M)));

        dodaj(new Strój(612).setZdjęcie(1021).setNazwa("czarownica").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween, Okazja.Andrzejki).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_176, Pas.L),
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_176, Pas.S)));

        dodaj(new Strój(613).setZdjęcie(1025).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S)));

        dodaj(new Strój(614).setZdjęcie(1026).setNazwa("disco").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.M, Pas.L),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.L, Pas.XL)));

        dodaj(new Strój(615).setZdjęcie(1028).setNazwa("smerfetka").setDlaPary(46).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(616).setZdjęcie(1029).setNazwa("byk").setDlaPary(25).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M, Pas.XL)));

        dodaj(new Strój(617).setZdjęcie(1031).setNazwa("marynarz").setDlaPary(28).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.S, Pas.M)));

        dodaj(new Strój(618).setZdjęcie(1033).setNazwa("dunka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_170, Pas.S),
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_170, Pas.XS)));

        dodaj(new Strój(619).setZdjęcie(1034).setNazwa("jesień").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.XS, Pas.M)));

        dodaj(new Strój(620).setZdjęcie(1035).setNazwa("sułtanka").setDlaPary(43).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.XS, Pas.M)));

        dodaj(new Strój(621).setZdjęcie(1036).setNazwa("mak").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S, Pas.L)));

        dodaj(new Strój(622).setZdjęcie(1037).setNazwa("Żółw").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(623).setZdjęcie(1038).setNazwa("hipiska").setDlaPary(14).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(624).setZdjęcie(1039).setNazwa("syrena").setWiek(Wiek.DOROSŁY).setDlaPary(53).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M)));

        dodaj(new Strój(625).setZdjęcie(1040).setNazwa("syrena").setWiek(Wiek.DOROSŁY).setDlaPary(53).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.XS)));

        dodaj(new Strój(626).setZdjęcie(1042).setNazwa("czirliderka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(627).setZdjęcie(1044).setNazwa("kominiarz").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.S, Pas.M)));

        dodaj(new Strój(628).setZdjęcie(1045).setNazwa("piratka").setDlaPary(1).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Pirackie).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_170, Pas.XS, Pas.S)));

        dodaj(new Strój(630).setZdjęcie(1047).setNazwa("topielica").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.XS, Pas.S)));

        dodaj(new Strój(631).setZdjęcie(1048).setNazwa("muszkieter").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.S, Pas.M)));

        dodaj(new Strój(632).setZdjęcie(1049).setNazwa("rzymianka").setDlaPary(39).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(633).setZdjęcie(1050).setNazwa("Sherlock Holmes").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(634).setZdjęcie(1051).setNazwa("barbi").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S)));

        dodaj(new Strój(635).setZdjęcie(1052).setNazwa("wilk").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_110, Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134, Wzrost.cm_140)));

        dodaj(new Strój(636).setZdjęcie(1053).setNazwa("dinozaur").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122)));

        dodaj(new Strój(637).setZdjęcie(1054).setNazwa("kucharz").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.L),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.S, Pas.L),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.L, Pas.XXL)));

        dodaj(new Strój(638).setZdjęcie(1056).setNazwa("myszka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(639).setZdjęcie(1057).setNazwa("słoń").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M, Pas.XL)));

        dodaj(new Strój(640).setZdjęcie(1058).setNazwa("bocian").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M, Pas.L)));

        dodaj(new Strój(641).setZdjęcie(1059).setNazwa("Świnka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(642).setZdjęcie(1060).setNazwa("rycerz").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(643).setZdjęcie(1061).setNazwa("zając").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(644).setZdjęcie(1062).setNazwa("suknia do walca").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_122)));

        dodaj(new Strój(645).setZdjęcie(1063).setNazwa("stokrotka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(646).setZdjęcie(1064).setNazwa("pirat Jack Sparrow").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Pirackie, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(647).setZdjęcie(1065).setNazwa("panterka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(648).setZdjęcie(1066).setNazwa("czarownica").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween, Okazja.Andrzejki).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_104)));

        dodaj(new Strój(649).setZdjęcie(1067).setNazwa("czarownica").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween, Okazja.Andrzejki).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.L)));

        dodaj(new Strój(650).setZdjęcie(1068).setNazwa("czarownica").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween, Okazja.Andrzejki).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(651).setZdjęcie(1069).setNazwa("mnich").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.S, Pas.L)));

        dodaj(new Strój(652).setZdjęcie(1070).setNazwa("kwiatek").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134, Wzrost.cm_140)));

        dodaj(new Strój(653).setZdjęcie(1072).setNazwa("dominikanin").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M, Pas.L)));

        dodaj(new Strój(654).setZdjęcie(1075).setNazwa("diablica").setDlaPary(8).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(655).setZdjęcie(1076).setNazwa("krasnoludek").setDlaPary(21).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_188, Pas.M, Pas.L)));

        dodaj(new Strój(656).setZdjęcie(1078).setNazwa("biskup").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M, Pas.L)));

        dodaj(new Strój(657).setZdjęcie(1079).setNazwa("kan-kan").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Lata_20_i_30).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(658).setZdjęcie(1080).setNazwa("król").setDlaPary(22).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Bajki, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M, Pas.L)));

        dodaj(new Strój(659).setZdjęcie(1081).setNazwa("diablica").setDlaPary(8).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(660).setZdjęcie(1082).setNazwa("mikołaj").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Mikołajki).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_188, Wzrost.cm_194, Pas.M, Pas.XXL),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M, Pas.XXL),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.M, Pas.XXL),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.XL)));

        dodaj(new Strój(661).setZdjęcie(1086).setNazwa("hawajka").setDlaPary(35).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(662).setZdjęcie(1087).setNazwa("szeherezada").setDlaPary(11).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(663).setZdjęcie(1085).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(664).setZdjęcie(1074).setNazwa("muszkieter").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.L, Pas.XL)));

        dodaj(new Strój(665).setZdjęcie(1071).setNazwa("czarownica").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Andrzejki, Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M)));

        dodaj(new Strój(666).setZdjęcie(1073).setNazwa("suknia").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Andrzejki, Okazja.Halloween).setKategoria(Kategoria.Lata_20_i_30).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(667).setZdjęcie(1041).setNazwa("cyganka").setDlaPary(19).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Andrzejki).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.XS, Pas.S)));
    }

    private void addData3() {
        dodaj(new Strój(668).setZdjęcie(1088).setNazwa("szop").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_128)));

        dodaj(new Strój(669).setZdjęcie(1089).setNazwa("hindus").setDlaPary(23).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.XS, Pas.S)));

        dodaj(new Strój(670).setZdjęcie(1091).setNazwa("tygrys").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_128)));

        dodaj(new Strój(671).setZdjęcie(1092).setNazwa("pirat").setDlaPary(1).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Pirackie).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.L, Pas.XL)));

        dodaj(new Strój(672).setZdjęcie(1093).setNazwa("mikołaj").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Mikołajki).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_152),
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_152, Wzrost.cm_158)));

        dodaj(new Strój(673).setZdjęcie(1094).setNazwa("czarownica").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Andrzejki, Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M)));

        dodaj(new Strój(674).setZdjęcie(1095).setNazwa("dama").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.L)));

        dodaj(new Strój(84).setZdjęcie(1096).setNazwa("wilk").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_128)));

        dodaj(new Strój(675).setZdjęcie(1097).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.L),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.XL)));

        dodaj(new Strój(676).setZdjęcie(1098).setNazwa("król").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.S, Pas.M)));

        dodaj(new Strój(677).setZdjęcie(1099, 1100).setNazwa("krokodyl").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122)));

        dodaj(new Strój(679).setZdjęcie(1103).setNazwa("duch").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.S, Pas.M)));

        dodaj(new Strój(680).setZdjęcie(1104).setNazwa("myśliwy").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(681).setZdjęcie(1105).setNazwa("nietoperz").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(682).setZdjęcie(1106).setNazwa("hipiska").setDlaPary(14).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.L, Pas.XL)));

        dodaj(new Strój(683).setZdjęcie(1115).setNazwa("hipiska").setDlaPary(14).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.L, Pas.XL)));

        dodaj(new Strój(684).setZdjęcie(1107).setNazwa("piesek").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(685).setZdjęcie(1108).setNazwa("avatar neytiri").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(686).setZdjęcie(1109).setNazwa("świnka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(687).setZdjęcie(1110).setNazwa("kotek").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(688).setZdjęcie(1111).setNazwa("avatar jake sully").setDlaPary(49).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(689).setZdjęcie(1112).setNazwa("lew").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(690).setZdjęcie(1113).setNazwa("król").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_98),
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(691).setZdjęcie(1114).setNazwa("batman").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.M, Pas.L)));

        dodaj(new Strój(692).setZdjęcie(1116).setNazwa("kot w butach").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(693).setZdjęcie(1117, 1118).setNazwa("zebra").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_128)));

        dodaj(new Strój(694).setZdjęcie(1119).setNazwa("wróżka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Andrzejki).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.XS, Pas.S)));

        dodaj(new Strój(695).setZdjęcie(1120, 1121).setNazwa("śnieżynka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(696).setZdjęcie(1123).setNazwa("śnieżynka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(697).setZdjęcie(1126).setNazwa("śnieżynka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(698).setZdjęcie(1127, 1111).setNazwa("avatar neytiri").setDlaPary(49).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(87).setZdjęcie(1122).setNazwa("superman").setDlaPary(33).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Super_bohaterowie).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M, Pas.L)));

        dodaj(new Strój(699).setZdjęcie(1122).setNazwa("supergirl").setDlaPary(33).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Super_bohaterowie).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(700).setZdjęcie(1124).setNazwa("wonder women").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Super_bohaterowie).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(701).setZdjęcie(1128).setNazwa("hiszpanka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(702).setZdjęcie(1129).setNazwa("gandalf").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_188, Wzrost.cm_194, Pas.M, Pas.XL)));

        dodaj(new Strój(703).setZdjęcie(1130).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S)));

        dodaj(new Strój(704).setZdjęcie(1131).setNazwa("czarownica").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Andrzejki, Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(705).setZdjęcie(1134).setNazwa("tygrys").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(706).setZdjęcie(1135).setNazwa("ogień").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.S)));

        dodaj(new Strój(707).setZdjęcie(1136, 1137).setNazwa("Żyrafa").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(708).setZdjęcie(1139, 1140).setNazwa("lis").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_128)));

        dodaj(new Strój(709).setZdjęcie(1142).setNazwa("elf").setDlaPary(32).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S)));

        dodaj(new Strój(710).setZdjęcie(1143).setNazwa("leia").setDlaPary(5).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(711).setZdjęcie(1144).setNazwa("konik").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110)));

        dodaj(new Strój(712).setZdjęcie(1145).setNazwa("małpka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110)));

        dodaj(new Strój(713).setZdjęcie(1146).setNazwa("łoś").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110)));

        dodaj(new Strój(714).setZdjęcie(1149).setNazwa("pingwin").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110)));

        dodaj(new Strój(715).setZdjęcie(1151).setNazwa("tygrysek").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110)));

        dodaj(new Strój(716).setZdjęcie(1147, 1148).setNazwa("anioł").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(717).setZdjęcie(1156).setNazwa("sukienka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_50_i_60).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(718).setZdjęcie(1152, 1153).setNazwa("pirat").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Pirackie).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_98)));

        dodaj(new Strój(719).setZdjęcie(1154).setNazwa("król").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_116)));

        dodaj(new Strój(720).setZdjęcie(1155).setNazwa("król").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(721).setZdjęcie(1157).setNazwa("diabełek").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116)));

        dodaj(new Strój(722).setZdjęcie(1161).setNazwa("jabłko").setWiek(Wiek.DZIECKO_DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Owoce_i_warzywa).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_164)));

        dodaj(new Strój(724).setZdjęcie(1163).setNazwa("kotka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween, Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(725).setZdjęcie(1168).setNazwa("pszczółka").setDlaPary(13).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(726).setZdjęcie(1234).setNazwa("suknia").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(37).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_20_i_30).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_170, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_170, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(727).setZdjęcie(1236).setNazwa("suknia").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(37).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_20_i_30).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_170, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_170, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(728).setZdjęcie(1237).setNazwa("Papa Smurf").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(46).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_188, Pas.S, Pas.L)));

        dodaj(new Strój(729).setZdjęcie(1332).setNazwa("Turek").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(11).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.M, Pas.L)));

        dodaj(new Strój(730).setZdjęcie(1318).setNazwa("ananas").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Owoce_i_warzywa).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_194, Pas.M, Pas.XXL)));

        dodaj(new Strój(732).setZdjęcie(1166).setNazwa("policjantka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy, Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M)));

        dodaj(new Strój(733).setZdjęcie(1170).setNazwa("hiszpanka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(52).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.S, Pas.M)));

        dodaj(new Strój(734).setZdjęcie(1169, 1418).setNazwa("kocica").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween, Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(735).setZdjęcie(1232).setNazwa("Rzymianin").setDlaPary(39).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.S, Pas.L)));

        dodaj(new Strój(736).setZdjęcie(1235).setNazwa("Posejdon").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(53).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_188, Pas.S, Pas.L)));

        dodaj(new Strój(737).setZdjęcie(1233).setNazwa("pszczółka").setDlaPary(13).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.M)));

        dodaj(new Strój(738).setZdjęcie(1231).setNazwa("pasterka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.L),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XL)));

        dodaj(new Strój(739).setZdjęcie(1230).setNazwa("Leprechaun").setDlaPary(54).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_152, Pas.XS),
                new Rozmiar(Wzrost.cm_158, Pas.L),
                new Rozmiar(Wzrost.cm_164, Pas.M)));

        dodaj(new Strój(740).setZdjęcie(1242, 1243).setNazwa("Lady Marion").setDlaPary(3).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(741).setZdjęcie(1313).setNazwa("truskawka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Owoce_i_warzywa).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_182, Pas.S, Pas.XL)));

        dodaj(new Strój(742).setZdjęcie(1326).setNazwa("pastuszek").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(55).setOkazja(Okazja.Jasełka, Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(743).setZdjęcie(1314).setNazwa("smoking").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Lata_20_i_30).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(744).setZdjęcie(1315).setNazwa("marchewka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Owoce_i_warzywa).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_194, Pas.S, Pas.XL)));

        dodaj(new Strój(745).setZdjęcie(1328).setNazwa("dworzanin").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Pas.M)));

        dodaj(new Strój(747).setZdjęcie(1321).setNazwa("skinhead").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80, Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Pas.XS, Pas.S)));

        dodaj(new Strój(748).setZdjęcie(1323).setNazwa("biedronka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(749).setZdjęcie(1319).setNazwa("smoking").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Lata_20_i_30).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(750).setZdjęcie(1240).setNazwa("Wilma Flinstone").setDlaPary(17).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.L),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.XL)));

        dodaj(new Strój(751).setZdjęcie(1251).setNazwa("cyganka").setDlaPary(19).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M)));

        dodaj(new Strój(752).setZdjęcie(1252).setNazwa("cyganka").setDlaPary(19).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S)));

        dodaj(new Strój(753).setZdjęcie(1288).setNazwa("hipiska").setDlaPary(14).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S)));

        dodaj(new Strój(754).setZdjęcie(1278).setNazwa("Rzymianka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(39).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(821).setZdjęcie(1378, 1217).setNazwa("Policjantka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(29).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy, Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S)));

        dodaj(new Strój(756).setZdjęcie(1264, 1265).setNazwa("strój do samby czerwony").setDlugaNazwa().setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_170, Pas.XS, Pas.S)));

        dodaj(new Strój(757).setZdjęcie(1265).setNazwa("strój do samby czarny").setDlugaNazwa().setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(758).setZdjęcie(1263).setNazwa("strój do samby zielony").setDlugaNazwa().setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S)));

        dodaj(new Strój(759).setZdjęcie(1226).setNazwa("kowbojka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(2).setOkazja(Okazja.Inne).setKategoria(Kategoria.Dziki_zachód, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.L)));

        dodaj(new Strój(760).setZdjęcie(1162).setNazwa("jabłko").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Owoce_i_warzywa).setRozmiar(
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_158)));

        dodaj(new Strój(761).setZdjęcie(1320).setNazwa("Wiking").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(762).setZdjęcie(1277).setNazwa("Japonka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(7).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.L)));

        dodaj(new Strój(763).setZdjęcie(1305).setNazwa("hipiska").setDlaPary(14).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(764).setZdjęcie(1283).setNazwa("chinka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Pas.XS, Pas.S)));

        dodaj(new Strój(765).setZdjęcie(1299).setNazwa("hinduska").setDlaPary(23).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.XS, Pas.S)));

        dodaj(new Strój(766).setZdjęcie(1261, 1267).setNazwa("biedronka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(767).setZdjęcie(1190, 1201).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.M, Pas.L)));

        dodaj(new Strój(768).setZdjęcie(1174).setNazwa("skinhead").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.L)));

        dodaj(new Strój(769).setZdjęcie(1293).setNazwa("turczynka").setDlaPary(11).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.S, Pas.M)));

        dodaj(new Strój(770).setZdjęcie(1211).setNazwa("czarny anioł").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(8).setOkazja(Okazja.Halloween, Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(771).setZdjęcie(1212).setNazwa("diablica").setDlaPary(8).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween, Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.M)));

        dodaj(new Strój(772).setZdjęcie(1204).setNazwa("diablica").setDlaPary(8).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(773).setZdjęcie(1286, 1290).setNazwa("szkotka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(27).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M)));

        dodaj(new Strój(774).setZdjęcie(1297, 1295).setNazwa("panna młoda").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(775).setZdjęcie(1296).setNazwa("mieszczka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.L, Pas.XL),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(776).setZdjęcie(1177).setNazwa("Robin Hood").setDlaPary(3).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(777).setZdjęcie(1173).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Pas.L)));

        dodaj(new Strój(778).setZdjęcie(1171).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Pas.M),
                new Rozmiar(Wzrost.cm_164, Pas.L)));

        dodaj(new Strój(779).setZdjęcie(1172, 841).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Pas.XS, Pas.S)));

        dodaj(new Strój(780).setZdjęcie(1193).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Pas.XS, Pas.S)));

        dodaj(new Strój(781).setZdjęcie(1284).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(782).setZdjęcie(1280).setNazwa("dama").setDlaPary(16).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Pas.XL)));

        dodaj(new Strój(783).setZdjęcie(1279).setNazwa("wróżka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Pas.L)));

        dodaj(new Strój(784).setZdjęcie(1333, 1334).setNazwa("kowbojka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(2).setOkazja(Okazja.Inne).setKategoria(Kategoria.Dziki_zachód).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(785).setZdjęcie(1301).setNazwa("agentka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(786).setZdjęcie(1304).setNazwa("pink baby").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(787).setZdjęcie(1306).setNazwa("pasterka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(55).setOkazja(Okazja.Jasełka, Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.L, Pas.XL)));

        dodaj(new Strój(788).setZdjęcie(1329).setNazwa("wampirzyca").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(9).setOkazja(Okazja.Halloween, Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(789).setZdjęcie(1247, 1246).setNazwa("hiszpanka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(52).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.L)));

        dodaj(new Strój(790).setZdjęcie(1228, 1229).setNazwa("zakonnica").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(10).setOkazja(Okazja.Halloween, Okazja.Inne).setKategoria(Kategoria.Zawody, Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.L)));

        dodaj(new Strój(791).setZdjęcie(1276).setNazwa("dzidziuś").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(792).setZdjęcie(1274, 1273).setNazwa("hinduska").setDlaPary(23).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.L),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.XL)));

        dodaj(new Strój(793).setZdjęcie(1206).setNazwa("kobieta-mężczyzna").setDlugaNazwa().setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M)));

        dodaj(new Strój(794).setZdjęcie(1181).setNazwa("pokojówka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Pas.XS, Pas.S)));

        dodaj(new Strój(795).setZdjęcie(1189).setNazwa("czarownica").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Andrzejki, Okazja.Halloween, Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(796).setZdjęcie(1178).setNazwa("wilk").setDlaPary(18).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.S, Pas.L)));

        dodaj(new Strój(797).setZdjęcie(1266).setNazwa("ośmiornica").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.M, Pas.L)));

        dodaj(new Strój(798).setZdjęcie(1302).setNazwa("toga akademicka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(799).setZdjęcie(1196).setNazwa("biedronka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(800).setZdjęcie(1208).setNazwa("chomik").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.L)));

        dodaj(new Strój(801).setZdjęcie(1294).setNazwa("lis").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.L)));

        dodaj(new Strój(802).setZdjęcie(1262).setNazwa("wilk").setDlaPary(18).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne, Okazja.Halloween).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.S, Pas.L)));

        dodaj(new Strój(629).setZdjęcie(1290).setNazwa("szkot").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(27).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.S),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.L)));

        dodaj(new Strój(535).setZdjęcie(1260).setNazwa("wilk").setDlaPary(18).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween, Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.S, Pas.L)));

        dodaj(new Strój(510).setZdjęcie(1259).setNazwa("pszczółka").setDlaPary(13).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(505).setZdjęcie(1272).setNazwa("jesienne liście").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.L)));

        dodaj(new Strój(487).setZdjęcie(1308).setNazwa("Morticia").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween, Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Pas.S)));

        dodaj(new Strój(478).setZdjęcie(1327).setNazwa("mysz").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Pas.S, Pas.L)));

        dodaj(new Strój(363).setZdjęcie(1309).setNazwa("panterka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M)));

        dodaj(new Strój(746).setZdjęcie(1224).setNazwa("Robin Hood damski").setDlugaNazwa().setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(3).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(731).setZdjęcie(1224, 1243).setNazwa("Robin Hood męski").setDlugaNazwa().setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(3).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.XS),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.S),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.M),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.L),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.XL)));

        dodaj(new Strój(723).setZdjęcie(1256).setNazwa("Morticia").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween, Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Pas.XS, Pas.S)));

        dodaj(new Strój(678).setZdjęcie(1275).setNazwa("Hermes").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_170, Pas.XS, Pas.M)));

        dodaj(new Strój(555).setZdjęcie(1270).setNazwa("rekin").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_194, Pas.M, Pas.XL)));

        dodaj(new Strój(511).setZdjęcie(1185).setNazwa("króliczek").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S)));

        dodaj(new Strój(500).setZdjęcie(1184).setNazwa("króliczek").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S)));

        dodaj(new Strój(475).setZdjęcie(1209).setNazwa("Czerwony Kapturek").setWiek(Wiek.DZIECKO).setDlugaNazwa().setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146)));

        dodaj(new Strój(474).setZdjęcie(1271).setNazwa("Stańczyk").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_188, Pas.M, Pas.XL)));

        dodaj(new Strój(454).setZdjęcie(1192).setNazwa("gorset").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S)));

        dodaj(new Strój(446).setZdjęcie(1194).setNazwa("gorset").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S)));

        dodaj(new Strój(443).setZdjęcie(1188).setNazwa("gorset").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S)));

        dodaj(new Strój(432).setZdjęcie(1182).setNazwa("kotek").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween, Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(427).setZdjęcie(1175).setNazwa("Monster High Skelita").setDlugaNazwa().setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(424).setZdjęcie(1176).setNazwa("Monster High Frankie Stein").setDlugaNazwa().setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(413).setZdjęcie(1165).setNazwa("kościotrup").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134)));

        dodaj(new Strój(411).setZdjęcie(1200).setNazwa("Monster High Drakulaura Sweet").setDlugaNazwa().setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(410).setZdjęcie(1340).setNazwa("Szkot").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(27).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(409).setZdjęcie(1342).setNazwa("skate punk").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_152, Wzrost.cm_158)));

        dodaj(new Strój(408).setZdjęcie(1186).setNazwa("Monster High Cleo De Nile").setDlugaNazwa().setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(405).setZdjęcie(1179).setNazwa("Monster High Abby").setDlugaNazwa().setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(404).setZdjęcie(1216).setNazwa("rybka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_134, Wzrost.cm_140)));

        dodaj(new Strój(403).setZdjęcie(1167).setNazwa("owieczka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(398).setZdjęcie(1164).setNazwa("kościotrup").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(396).setZdjęcie(1183).setNazwa("biedronka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_134)));

        dodaj(new Strój(393).setZdjęcie(1187).setNazwa("Hello Kitty").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(380).setZdjęcie(1203).setNazwa("pszczółka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(368).setZdjęcie(1198, 1197).setNazwa("dynia").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116)));

        dodaj(new Strój(360).setZdjęcie(1195).setNazwa("czarownica").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Andrzejki, Okazja.Halloween).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_116)));

        dodaj(new Strój(324).setZdjęcie(1205).setNazwa("muchomor").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_104, Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116, Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(314).setZdjęcie(1214).setNazwa("ptak").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_110, Wzrost.cm_146)));

        dodaj(new Strój(272).setZdjęcie(1180).setNazwa("biedronka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_104),
                new Rozmiar(Wzrost.cm_110),
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(236).setZdjęcie(1191).setNazwa("biedronka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(215).setZdjęcie(1218).setNazwa("Zorro").setWiek(Wiek.DZIECKO).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(213).setZdjęcie(1213).setNazwa("rybka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128)));

        dodaj(new Strój(192).setZdjęcie(1269).setNazwa("Czerwony Kapturek").setDlaPary(18).setDlugaNazwa().setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_152, Wzrost.cm_158, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.L),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.XL)));

        dodaj(new Strój(186).setZdjęcie(1291).setNazwa("Królewna").setDlaPary(22).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Pas.S),
                new Rozmiar(Wzrost.cm_170, Pas.L)));

        dodaj(new Strój(185).setZdjęcie(1253, 1254).setNazwa("kombinezon").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(175).setZdjęcie(1282).setNazwa("Kapitan").setDlaPary(28).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(145).setZdjęcie(1250, 1249).setNazwa("więzień").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(29).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_194, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_194, Pas.L, Pas.XL)));

        dodaj(new Strój(144).setZdjęcie(1229).setNazwa("Ksiądz").setDlaPary(10).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Film_i_scena, Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.M),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.L)));

        dodaj(new Strój(143).setZdjęcie(1289).setNazwa("kocica").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Andrzejki, Okazja.Halloween).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(142).setZdjęcie(1339).setNazwa("kotek").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Andrzejki, Okazja.Halloween).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.L)));

        dodaj(new Strój(141).setZdjęcie(1241, 1239).setNazwa("Fred Flinstone").setDlaPary(17).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_194, Pas.M, Pas.XL)));

        dodaj(new Strój(140).setZdjęcie(1334, 1331).setNazwa("kowboj").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(2).setOkazja(Okazja.Inne).setKategoria(Kategoria.Dziki_zachód, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.M, Pas.L)));

        dodaj(new Strój(139).setZdjęcie(1341).setNazwa("Mary Poppins").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.L),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.XXL)));

        dodaj(new Strój(138).setZdjęcie(1347).setNazwa("kufel piwa").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.S, Pas.XL)));

        dodaj(new Strój(133).setZdjęcie(1345).setNazwa("disco").setDlaPary(20).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.S),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.M)));

        dodaj(new Strój(132).setZdjęcie(1343).setNazwa("Meksykanin").setDlaPary(4).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Pas.S, Pas.M)));

        dodaj(new Strój(131).setZdjęcie(1338).setNazwa("Cezar").setDlaPary(39).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Historyczne, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(128).setZdjęcie(1335).setNazwa("Egipcjanin").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(65).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Historyczne, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(127).setZdjęcie(1324).setNazwa("kierowca rajdowy").setDlugaNazwa().setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.L, Pas.XL)));

        dodaj(new Strój(126).setZdjęcie(1292).setNazwa("marynarz Papaj").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.S, Pas.L)));

        dodaj(new Strój(124).setZdjęcie(1300).setNazwa("Samuraj").setDlugaNazwa().setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(7).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.M, Pas.L)));

        dodaj(new Strój(121).setZdjęcie(1255).setNazwa("Egipcjanin").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(119).setZdjęcie(1245, 1246).setNazwa("Hiszpan").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(52).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Narodowościowe, Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.M, Pas.L)));

        dodaj(new Strój(117).setZdjęcie(1257).setNazwa("lis").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M, Pas.XL)));

        dodaj(new Strój(116).setZdjęcie(1281).setNazwa("Spiderman").setDlaPary(33).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Super_bohaterowie).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_188, Pas.S, Pas.L)));

        dodaj(new Strój(115).setZdjęcie(1298).setNazwa("Aladyn").setDlaPary(11).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.XS, Pas.S)));

        dodaj(new Strój(113).setZdjęcie(1344).setNazwa("disco").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(20).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.S, Pas.M)));

        dodaj(new Strój(111).setZdjęcie(1287).setNazwa("Grabarz").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Halloween, Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_188, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_188, Pas.L)));

        dodaj(new Strój(110).setZdjęcie(1346).setNazwa("Zorro").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(52).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(109).setZdjęcie(1336).setNazwa("pirat").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(1).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Pirackie).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_188, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_188, Pas.M, Pas.L)));

        dodaj(new Strój(108).setZdjęcie(1303).setNazwa("leśniczy").setDlaPary(18).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M, Pas.XL)));

        dodaj(new Strój(107).setZdjęcie(1337).setNazwa("lekarz").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_188, Pas.S, Pas.M)));

        dodaj(new Strój(106).setZdjęcie(1285).setNazwa("pilot").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(30).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.M, Pas.L)));

        dodaj(new Strój(105).setZdjęcie(1317).setNazwa("król").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(22).setOkazja(Okazja.Jasełka).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_194, Pas.L, Pas.XXL)));

        dodaj(new Strój(100).setZdjęcie(1348).setNazwa("dozorca").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(99).setZdjęcie(1307).setNazwa("Pinokio").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_194, Pas.M, Pas.L)));

        dodaj(new Strój(98).setZdjęcie(1325).setNazwa("nutki").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S, Pas.L)));

        dodaj(new Strój(95).setZdjęcie(1310).setNazwa("żołnierz").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(85).setZdjęcie(1248, 1249).setNazwa("policjantka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(29).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy, Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(77).setZdjęcie(1222, 1221, 1223).setNazwa("Hawajczyk").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(35).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.L),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_194, Pas.L, Pas.XXL)));

        dodaj(new Strój(51).setZdjęcie(1422, 1215).setNazwa("żołnierz").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(49).setZdjęcie(1258).setNazwa("zebra").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.L)));

        dodaj(new Strój(42).setZdjęcie(1330).setNazwa("ptak").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKO_MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S, Pas.L)));

        dodaj(new Strój(35).setZdjęcie(1322).setNazwa("policjant").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(29).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_182, Pas.XL, Pas.XXL)));

        dodaj(new Strój(32).setZdjęcie(1312).setNazwa("Elvis Presley").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Lata_70_i_80).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(15).setZdjęcie(1311).setNazwa("Szewc Dratewka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_188, Wzrost.cm_194, Pas.L, Pas.XXL)));

        dodaj(new Strój(290).setZdjęcie(1043).setNazwa("Żołnierz Rzymski").setDlaPary(39).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Pas.S)));

        dodaj(new Strój(273).setZdjęcie(1083).setNazwa("piratka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(1).setOkazja(Okazja.Inne).setKategoria(Kategoria.Pirackie).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(224).setZdjęcie(1016).setNazwa("cygan").setDlaPary(19).setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_188, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_188, Pas.M, Pas.L),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_188, Pas.L, Pas.XL),
                new Rozmiar(Wzrost.cm_176, Wzrost.cm_188, Pas.XL, Pas.XXL)));

        dodaj(new Strój(188).setZdjęcie(960).setNazwa("Książe").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(16).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.L, Pas.XL)));

        dodaj(new Strój(179).setZdjęcie(1011).setNazwa("piratka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(1).setOkazja(Okazja.Inne).setKategoria(Kategoria.Pirackie, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.XS, Pas.M)));

        dodaj(new Strój(134).setZdjęcie(1015).setNazwa("piratka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(1).setOkazja(Okazja.Inne).setKategoria(Kategoria.Pirackie, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.XS, Pas.M)));

        dodaj(new Strój(129).setZdjęcie(1022).setNazwa("hiszpanka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(52).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(464).setZdjęcie(1273).setNazwa("hindus").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(23).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M, Pas.L),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.L, Pas.XL)));

        dodaj(new Strój(65).setZdjęcie(1244).setNazwa("pirat").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(1).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Historyczne, Kategoria.Pirackie).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M, Pas.L),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.L, Pas.XL),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.XL, Pas.XXL)));

        dodaj(new Strój(118).setZdjęcie(1244).setNazwa("piratka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(1).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Historyczne, Kategoria.Pirackie).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(120).setZdjęcie(1227).setNazwa("bawarczyk").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(41).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_182, Pas.L, Pas.XL)));

        dodaj(new Strój(444).setZdjęcie(1227).setNazwa("bawarka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(41).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.L, Pas.XL)));

        dodaj(new Strój(803).setZdjęcie(1427, 1349).setNazwa("Evil Mad Hatter").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.MĘSKI).setDlaPary(9).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.M, Pas.L),
                new Rozmiar(Wzrost.cm_182, Wzrost.cm_188, Pas.L, Pas.XL)));

        dodaj(new Strój(804).setZdjęcie(1350).setNazwa("Alicja z Krainy Czarów").setDlugaNazwa().setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(805).setZdjęcie(1351).setNazwa("Piratka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(1).setOkazja(Okazja.Inne).setKategoria(Kategoria.Pirackie, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M)));

        dodaj(new Strój(806).setZdjęcie(1352).setNazwa("Policjantka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(29).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy, Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XL)));

        dodaj(new Strój(807).setZdjęcie(1353, 1354, 1355, 1356).setNazwa("sukienka lata XX-te").setDlugaNazwa().setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(37).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_20_i_30, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.L),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.XL)));

        dodaj(new Strój(808).setZdjęcie(1357, 1358).setNazwa("Hipiska").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(14).setOkazja(Okazja.Inne).setKategoria(Kategoria.Lata_70_i_80, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(809).setZdjęcie(1359, 1360).setNazwa("Wampirzyca").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(9).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(810).setZdjęcie(1361, 1362).setNazwa("Wampirzyca").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(9).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(811).setZdjęcie(1365, 1366).setNazwa("Kopciuszek").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(26).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(812).setZdjęcie(1367).setNazwa("Greczynka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M)));

        dodaj(new Strój(813).setZdjęcie(1368).setNazwa("Wojowniczka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(39).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(814).setZdjęcie(1369).setNazwa("Ninja").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(815).setZdjęcie(1370).setNazwa("Smoczyca").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S)));

        dodaj(new Strój(816).setZdjęcie(1371, 1372).setNazwa("Motyl").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(817).setZdjęcie(1373).setNazwa("uczennica").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(818).setZdjęcie(1374, 1375).setNazwa("Jaskiniowiec").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(17).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(819).setZdjęcie(1376).setNazwa("Piratka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(1).setOkazja(Okazja.Inne).setKategoria(Kategoria.Pirackie, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(820).setZdjęcie(1377).setNazwa("greczynka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(76).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(822).setZdjęcie(1379).setNazwa("wojowniczka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(39).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M, Pas.L)));

        dodaj(new Strój(823).setZdjęcie(1380).setNazwa("smok").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(824).setZdjęcie(1381, 1382).setNazwa("smok").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(825).setZdjęcie(1383).setNazwa("piratka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(1).setOkazja(Okazja.Inne).setKategoria(Kategoria.Pirackie, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XL, Pas.XXL)));

        dodaj(new Strój(826).setZdjęcie(1384).setNazwa("mieszczka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Historyczne).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(827).setZdjęcie(1385).setNazwa("greczynka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(76).setOkazja(Okazja.Inne).setKategoria(Kategoria.Historyczne, Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.L, Pas.XL)));

        dodaj(new Strój(828).setZdjęcie(1386, 1387).setNazwa("smok").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_110, Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_128)));

        dodaj(new Strój(829).setZdjęcie(1388, 1389).setNazwa("zebra").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_122, Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_134, Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_146, Wzrost.cm_152)));

        dodaj(new Strój(830).setZdjęcie(1390).setNazwa("policjantka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zawody).setRozmiar(
                new Rozmiar(Wzrost.cm_110, Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128, Wzrost.cm_134),
                new Rozmiar(Wzrost.cm_140, Wzrost.cm_146)));

        dodaj(new Strój(831).setZdjęcie(1391, 1392, 1393).setNazwa("lew").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_116),
                new Rozmiar(Wzrost.cm_128),
                new Rozmiar(Wzrost.cm_140)));

        dodaj(new Strój(832).setZdjęcie(1394, 1395).setNazwa("wampirzyca").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(833).setZdjęcie(1396, 1397).setNazwa("piratka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Pirackie).setRozmiar(
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(834).setZdjęcie(1398, 1399).setNazwa("Robin Hood").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(3).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164, Pas.S)));

        dodaj(new Strój(835).setZdjęcie(1400).setNazwa("jaskiniowiec").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_146),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(836).setZdjęcie(1401).setNazwa("czarownica").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Bajki).setRozmiar(
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_146)));

        dodaj(new Strój(837).setZdjęcie(1403).setNazwa("Czerwony Kapturek").setWiek(Wiek.DOROSŁY).setDlugaNazwa().setPłeć(Płeć.DAMSKI).setDlaPary(18).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(838).setZdjęcie(1405).setNazwa("Robin Hood").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(3).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.L),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.XL)));

        dodaj(new Strój(839).setZdjęcie(1406).setNazwa("Panterka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(840).setZdjęcie(1407).setNazwa("Tygrys").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy, Kategoria.Zwierzęta).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Pas.S, Pas.M)));

        dodaj(new Strój(841).setZdjęcie(1408).setNazwa("Króliczek").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.XS, Pas.S),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_176, Pas.M, Pas.L)));

        dodaj(new Strój(842).setZdjęcie(1409).setNazwa("cyganka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setDlaPary(19).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe, Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M)));

        dodaj(new Strój(848).setZdjęcie(1424).setNazwa("cigarettes girl").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_164, Wzrost.cm_170, Pas.M)));

        dodaj(new Strój(849).setZdjęcie(1428).setNazwa("Różowy potwór").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(850).setZdjęcie(1429).setNazwa("Fioletowy potwór").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Bajki, Kategoria.Film_i_scena).setRozmiar(
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(851).setZdjęcie(1432).setNazwa("Zombie").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Halloween).setKategoria(Kategoria.Inne).setRozmiar(
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_146)));

        dodaj(new Strój(852).setZdjęcie(1435).setNazwa("piratka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Pirackie).setRozmiar(
                new Rozmiar(Wzrost.cm_146, Wzrost.cm_152),
                new Rozmiar(Wzrost.cm_158, Wzrost.cm_164),
                new Rozmiar(Wzrost.cm_152, Wzrost.cm_158)));

        dodaj(new Strój(853).setZdjęcie(1437).setNazwa("Cyganka").setWiek(Wiek.DZIECKO).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Narodowościowe).setRozmiar(
                new Rozmiar(Wzrost.cm_140),
                new Rozmiar(Wzrost.cm_152)));

        dodaj(new Strój(854).setZdjęcie(1438).setNazwa("Pokojówka").setWiek(Wiek.DOROSŁY).setPłeć(Płeć.DAMSKI).setOkazja(Okazja.Inne).setKategoria(Kategoria.Sexy).setRozmiar(
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.S, Pas.M),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.M, Pas.L),
                new Rozmiar(Wzrost.cm_170, Wzrost.cm_176, Pas.L, Pas.XL)));

    }

    private void dodaj(Strój s) {
        stroje.add(s);
    }

    public ArrayList<Strój> getStroje() {
        return stroje;
    }
}
