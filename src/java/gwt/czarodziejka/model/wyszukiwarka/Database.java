package gwt.czarodziejka.model.wyszukiwarka;

import gwt.czarodziejka.model.wyszukiwarka.costume.Category;
import gwt.czarodziejka.model.wyszukiwarka.costume.Height;
import gwt.czarodziejka.model.wyszukiwarka.costume.CostumeComparator;
import gwt.czarodziejka.model.wyszukiwarka.costume.Costume;
import gwt.czarodziejka.model.wyszukiwarka.costume.Age;
import gwt.czarodziejka.model.wyszukiwarka.costume.Belt;
import gwt.czarodziejka.model.wyszukiwarka.costume.Photo;
import gwt.czarodziejka.model.wyszukiwarka.costume.Occasion;
import gwt.czarodziejka.model.wyszukiwarka.costume.Size;
import gwt.czarodziejka.model.wyszukiwarka.costume.Sex;
import com.google.gwt.user.client.Timer;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Administrator
 */
public class Database {

    private static Database instance;
    private ArrayList<Costume> stroje = new ArrayList<>();

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
                Collections.sort(instance.stroje, new CostumeComparator());
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
        dodaj(new Costume(1).setZdjęcie(1).setNazwa("pirat").setDlaPary(1).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Pirackie).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.L),
                new Size(Height.cm_176, Height.cm_182, Belt.M),
                new Size(Height.cm_176, Height.cm_182, Belt.S)));

        dodaj(new Costume(2).setZdjęcie(2).setNazwa("pirat").setDlaPary(1).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Pirackie).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.S),
                new Size(Height.cm_182, Height.cm_188, Belt.M)));

        dodaj(new Costume(3).setZdjęcie(3).setNazwa("muszkieter").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_170, Belt.S),
                new Size(Height.cm_170, Belt.XL)));

        dodaj(new Costume(4).setZdjęcie(4).setNazwa("Robin Hood").setDlaPary(3).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.M),
                new Size(Height.cm_182, Height.cm_188, Belt.L),
                new Size(Height.cm_182, Height.cm_188, Belt.XL),
                new Size(Height.cm_182, Height.cm_188, Belt.XXL)));

        dodaj(new Costume(5).setZdjęcie(5).setNazwa("indianin").setDlaPary(2).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Dziki_zachód, Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.M),
                new Size(Height.cm_182, Height.cm_188, Belt.L),
                new Size(Height.cm_182, Height.cm_188, Belt.XL),
                new Size(Height.cm_182, Height.cm_188, Belt.XXL)));

        dodaj(new Costume(6).setZdjęcie(6).setNazwa("Meksykanin").setDlaPary(4).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Dziki_zachód).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.XXL)));

        dodaj(new Costume(7).setZdjęcie(7).setNazwa("Obi-Wan Kenobi").setDlaPary(5).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_164, Belt.S, Belt.L),
                new Size(Height.cm_170, Belt.S, Belt.L)));

        dodaj(new Costume(8).setZdjęcie(8).setNazwa("Arab").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(9).setZdjęcie(9).setNazwa("Żołnierz Rzymski").setDlaPary(39).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.M),
                new Size(Height.cm_170, Height.cm_182, Belt.L),
                new Size(Height.cm_170, Height.cm_182, Belt.XL),
                new Size(Height.cm_170, Height.cm_182, Belt.S)));

        dodaj(new Costume(10).setZdjęcie(10).setNazwa("Kowboj").setDlaPary(2).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Film_i_scena, Category.Dziki_zachód).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.M),
                new Size(Height.cm_176, Height.cm_182, Belt.L),
                new Size(Height.cm_176, Height.cm_182, Belt.S)));

        dodaj(new Costume(11).setZdjęcie(11).setNazwa("traper").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Dziki_zachód).setRozmiar(
                new Size(Height.cm_170, Height.cm_194, Belt.S, Belt.XXL)));

        dodaj(new Costume(12).setZdjęcie(12, 131).setNazwa("Samuraj").setDlaPary(7).setWiek(Age.DOROSŁY).setDlugaNazwa().setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_176, Belt.M),
                new Size(Height.cm_176, Belt.L),
                new Size(Height.cm_176, Belt.S)));

        dodaj(new Costume(13).setZdjęcie(13).setNazwa("rycerz").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.M),
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L),
                new Size(Height.cm_176, Height.cm_182, Belt.L, Belt.XL)));

        dodaj(new Costume(16).setZdjęcie(16).setNazwa("diabeł").setDlaPary(8).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Halloween, Occasion.Jasełka).setKategoria(Category.Film_i_scena, Category.Bajki).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.L)));

        dodaj(new Costume(17).setZdjęcie(17).setNazwa("Drakula").setDlaPary(9).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.L)));

        dodaj(new Costume(18).setZdjęcie(18).setNazwa("truskawka").setWiek(Age.DZIECKO_DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Owoce_i_warzywa).setRozmiar(
                new Size(Height.cm_116, Height.cm_158, Belt.S, Belt.L)));

        dodaj(new Costume(19).setZdjęcie(19).setNazwa("Drakula").setDlaPary(9).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.S),
                new Size(Height.cm_170, Height.cm_182, Belt.M),
                new Size(Height.cm_170, Height.cm_182, Belt.L),
                new Size(Height.cm_170, Height.cm_176, Belt.XL)));

        dodaj(new Costume(20).setZdjęcie(20).setNazwa("burak").setWiek(Age.DZIECKO_DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Owoce_i_warzywa).setRozmiar(
                new Size(Height.cm_128, Height.cm_170, Belt.S, Belt.XL)));

        dodaj(new Costume(21).setZdjęcie(21).setNazwa("Śmierć").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_176, Height.cm_188, Belt.S, Belt.XXL)));

        dodaj(new Costume(22).setZdjęcie(22).setNazwa("Fiona").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_158, Height.cm_164, Belt.S),
                new Size(Height.cm_158, Height.cm_164, Belt.XL)));

        dodaj(new Costume(23).setZdjęcie(23).setNazwa("Józef").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_176, Height.cm_188, Belt.S, Belt.XXL),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.XL)));

        dodaj(new Costume(24).setZdjęcie(24).setNazwa("mnich").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Film_i_scena, Category.Zawody).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.L, Belt.XXL),
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.XL)));

        dodaj(new Costume(25).setZdjęcie(25).setNazwa("ksiądz").setDlaPary(10).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Film_i_scena, Category.Zawody).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.M, Belt.L)));

        dodaj(new Costume(26).setZdjęcie(26).setNazwa("książe wschodni").setDlaPary(11).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.L, Belt.XXL),
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.XL)));

        dodaj(new Costume(27).setZdjęcie(27).setNazwa("clown").setDlaPary(12).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody, Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_182, Height.cm_194, Belt.L, Belt.XXL),
                new Size(Height.cm_182, Height.cm_194, Belt.M, Belt.XL)));

        dodaj(new Costume(28).setZdjęcie(28).setNazwa("Batman").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Super_bohaterowie).setRozmiar(
                new Size(Height.cm_176, Height.cm_188, Belt.L),
                new Size(Height.cm_176, Height.cm_188, Belt.M),
                new Size(Height.cm_176, Height.cm_188, Belt.S),
                new Size(Height.cm_176, Height.cm_188, Belt.XL)));

        dodaj(new Costume(29).setZdjęcie(29).setNazwa("Spiderman").setDlaPary(33).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Super_bohaterowie).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.M)));

        dodaj(new Costume(30).setZdjęcie(30).setNazwa("pszczoła").setDlaPary(13).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta, Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.XL)));

        dodaj(new Costume(31).setZdjęcie(31).setNazwa("hipis").setDlaPary(14).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80, Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.S),
                new Size(Height.cm_182, Height.cm_194, Belt.M)));

        dodaj(new Costume(33).setZdjęcie(33).setNazwa("kontusz szlechecki").setDlaPary(15).setWiek(Age.DOROSŁY).setDlugaNazwa().setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_176, Height.cm_188, Belt.L)));

        dodaj(new Costume(34).setZdjęcie(34).setNazwa("hipis").setDlaPary(14).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80, Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L)));

        dodaj(new Costume(36).setZdjęcie(36).setNazwa("zombie").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.M, Belt.L)));

        dodaj(new Costume(37).setZdjęcie(37).setNazwa("duch mężczyzny").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L),
                new Size(Height.cm_182, Height.cm_188, Belt.L, Belt.XL)));

        dodaj(new Costume(39).setZdjęcie(39).setNazwa("jaskiniowiec").setDlaPary(17).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.M, Belt.L)));

        dodaj(new Costume(40).setZdjęcie(40, 41).setNazwa("zając").setWiek(Age.DOROSŁY).setDlaPary(18).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_158, Height.cm_164, Belt.S, Belt.M),
                new Size(Height.cm_170, Height.cm_182, Belt.XXL)));

        dodaj(new Costume(43).setZdjęcie(43).setNazwa("wilk").setDlaPary(18).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.XL)));

        dodaj(new Costume(44).setZdjęcie(44).setNazwa("tancerka turecka").setDlaPary(11).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_158, Height.cm_164, Belt.XS, Belt.S)));

        dodaj(new Costume(45).setZdjęcie(45, 46).setNazwa("tygrys").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.XL)));

        dodaj(new Costume(47).setZdjęcie(47).setNazwa("lew").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.XL)));

        dodaj(new Costume(48).setZdjęcie(48).setNazwa("sowa").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.XXL),
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.XL)));

        dodaj(new Costume(50).setZdjęcie(50).setNazwa("Żaba").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.XL),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.L),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.XL),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.XL)));

        dodaj(new Costume(52).setZdjęcie(52).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(53).setZdjęcie(53).setNazwa("czarownica").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Andrzejki, Occasion.Halloween).setKategoria(Category.Film_i_scena, Category.Bajki).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.L, Belt.XL)));

        dodaj(new Costume(54).setZdjęcie(54).setNazwa("jesień").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(55).setZdjęcie(55).setNazwa("wiosna").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(56).setZdjęcie(56).setNazwa("czarownica").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween, Occasion.Andrzejki).setKategoria(Category.Film_i_scena, Category.Bajki).setRozmiar(
                new Size(Height.cm_158, Height.cm_170, Belt.S),
                new Size(Height.cm_158, Height.cm_170, Belt.M)));

        dodaj(new Costume(59).setZdjęcie(59).setNazwa("hipiska").setDlaPary(14).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.L)));

        dodaj(new Costume(60).setZdjęcie(60).setNazwa("hipiska").setDlaPary(14).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.L)));

        dodaj(new Costume(62).setZdjęcie(62).setNazwa("mieszczka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        dodaj(new Costume(63).setZdjęcie(63).setNazwa("diablica").setDlaPary(8).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Jasełka, Occasion.Halloween).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_158, Height.cm_164, Belt.S)));

        dodaj(new Costume(64).setZdjęcie(64).setNazwa("Disco").setDlaPary(20).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.L)));

        dodaj(new Costume(66).setZdjęcie(66).setNazwa("czarownica").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Andrzejki, Occasion.Halloween).setKategoria(Category.Film_i_scena, Category.Bajki).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.L),
                new Size(Height.cm_170, Height.cm_176, Belt.XL)));

        dodaj(new Costume(67).setZdjęcie(67).setNazwa("czarownica").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Andrzejki, Occasion.Halloween).setKategoria(Category.Film_i_scena, Category.Bajki).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.M)));

        dodaj(new Costume(68).setZdjęcie(68).setNazwa("Królewna Śnieżka").setDlaPary(21).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.L),
                new Size(Height.cm_164, Height.cm_170, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.XL)));

        dodaj(new Costume(69).setZdjęcie(1032).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.M)));

        dodaj(new Costume(70).setZdjęcie(1138).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S)));

        dodaj(new Costume(71).setZdjęcie(71).setNazwa("szlachecki").setDlaPary(15).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Film_i_scena, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.S),
                new Size(Height.cm_164, Height.cm_176, Belt.M),
                new Size(Height.cm_164, Height.cm_176, Belt.L),
                new Size(Height.cm_164, Height.cm_176, Belt.XL)));

        dodaj(new Costume(72).setZdjęcie(72).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        dodaj(new Costume(73).setZdjęcie(73).setNazwa("suknia z Dzikiego zachodu").setWiek(Age.DOROSŁY).setDlugaNazwa().setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        dodaj(new Costume(74).setZdjęcie(1132, 1133).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        dodaj(new Costume(75).setZdjęcie(75).setNazwa("cyganka").setDlaPary(19).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Bajki).setRozmiar(
                new Size(Height.cm_158, Height.cm_170, Belt.S)));

        dodaj(new Costume(78).setZdjęcie(78, 135).setNazwa("królowa").setDlaPary(22).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.L, Belt.XL),
                new Size(Height.cm_158, Height.cm_164, Belt.S, Belt.M)));

        dodaj(new Costume(79).setZdjęcie(79).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.L)));

        dodaj(new Costume(82).setZdjęcie(82).setNazwa("anioł").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Bajki, Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.L),
                new Size(Height.cm_164, Height.cm_170, Belt.M),
                new Size(Height.cm_158, Height.cm_164, Belt.S),
                new Size(Height.cm_158, Height.cm_164, Belt.M)));

        dodaj(new Costume(81).setZdjęcie(81).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        dodaj(new Costume(83).setZdjęcie(83, 84).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        dodaj(new Costume(86).setZdjęcie(86).setNazwa("clown").setDlaPary(12).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody, Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.XL)));

        dodaj(new Costume(88).setZdjęcie(88).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S)));

        dodaj(new Costume(90).setZdjęcie(90).setNazwa("spódnica rock and roll").setWiek(Age.DOROSŁY).setDlugaNazwa().setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_50_i_60).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.L)));

        dodaj(new Costume(92).setZdjęcie(92).setNazwa("hinduska").setDlaPary(23).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(93).setZdjęcie(93).setNazwa("hipiska").setDlaPary(14).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(96).setZdjęcie(96).setNazwa("czarownica").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Andrzejki, Occasion.Halloween).setKategoria(Category.Film_i_scena, Category.Bajki).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.L)));

        dodaj(new Costume(102).setZdjęcie(102).setNazwa("tancerka turecka").setDlaPary(11).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.M)));

        dodaj(new Costume(103).setZdjęcie(103, 132).setNazwa("arlekin").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S),
                new Size(Height.cm_170, Height.cm_176, Belt.L)));

        dodaj(new Costume(104).setZdjęcie(1141).setNazwa("szlachecki").setDlaPary(15).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Historyczne, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_158, Height.cm_164, Belt.S)));

        dodaj(new Costume(112).setZdjęcie(112).setNazwa("cyganka").setDlaPary(19).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Bajki).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(114).setZdjęcie(114).setNazwa("krówka").setDlaPary(25).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.XL)));

        dodaj(new Costume(122).setZdjęcie(122).setNazwa("cyganka").setDlaPary(19).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Bajki).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        dodaj(new Costume(123).setZdjęcie(1150).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        dodaj(new Costume(130).setZdjęcie(129).setNazwa("kontusz szlachecki").setDlaPary(15).setDlugaNazwa().setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.XL)));

        dodaj(new Costume(135).setZdjęcie(137).setNazwa("suknia").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_20_i_30).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        dodaj(new Costume(136).setZdjęcie(138).setNazwa("suknia").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_20_i_30).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.L)));

        dodaj(new Costume(137).setZdjęcie(139).setNazwa("suknia").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_20_i_30).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.XL)));

        dodaj(new Costume(146).setZdjęcie(148, 150).setNazwa("Michael Jackson").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134)));

        dodaj(new Costume(147).setZdjęcie(149).setNazwa("cyganka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Bajki).setRozmiar(
                new Size(Height.cm_146, Height.cm_152)));

        dodaj(new Costume(148).setZdjęcie(151).setNazwa("pastuszek").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146)));

        dodaj(new Costume(149).setZdjęcie(153).setNazwa("pastuszek").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140)));

        dodaj(new Costume(150).setZdjęcie(154).setNazwa("Józef").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_98),
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(151).setZdjęcie(152).setNazwa("diablica").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween, Occasion.Jasełka).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        dodaj(new Costume(152).setZdjęcie(155, 156).setNazwa("król").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_116, Height.cm_122)));

        dodaj(new Costume(153).setZdjęcie(157, 158).setNazwa("szlachcic").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_146),
                new Size(Height.cm_158),
                new Size(Height.cm_164)));

        dodaj(new Costume(154).setZdjęcie(159).setNazwa("książe").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        dodaj(new Costume(155).setZdjęcie(160).setNazwa("kosmonauta").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(156).setZdjęcie(161).setNazwa("strażak").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128)));

        dodaj(new Costume(157).setZdjęcie(162, 163).setNazwa("anioł").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_98),
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146),
                new Size(Height.cm_152)));

        dodaj(new Costume(158).setZdjęcie(164).setNazwa("duch").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116)));

        dodaj(new Costume(159).setZdjęcie(165, 166).setNazwa("Piotruś Pan").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        dodaj(new Costume(160).setZdjęcie(167, 168).setNazwa("król").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(161).setZdjęcie(169, 170).setNazwa("dworzanin").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(162).setZdjęcie(171, 172).setNazwa("diabeł").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_134),
                new Size(Height.cm_122)));

        dodaj(new Costume(163).setZdjęcie(173).setNazwa("superman").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Bajki, Category.Super_bohaterowie).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140)));

        dodaj(new Costume(164).setZdjęcie(174).setNazwa("góral").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Narodowościowe, Category.Bajki).setRozmiar(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        dodaj(new Costume(165).setZdjęcie(175).setNazwa("góral").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Narodowościowe, Category.Bajki).setRozmiar(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        dodaj(new Costume(166).setZdjęcie(176, 177).setNazwa("krakowiak").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146),
                new Size(Height.cm_152)));

        dodaj(new Costume(167).setZdjęcie(178, 179).setNazwa("król").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(168).setZdjęcie(180, 181).setNazwa("król").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(169).setZdjęcie(182, 183).setNazwa("zając").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(170).setZdjęcie(184, 185).setNazwa("rycerz").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Historyczne).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_104),
                new Size(Height.cm_110)));

        dodaj(new Costume(172).setZdjęcie(189).setNazwa("rekin").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122)));

        dodaj(new Costume(173).setZdjęcie(190, 191, 192, 193).setNazwa("wilk").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116, Height.cm_122)));

        dodaj(new Costume(174).setZdjęcie(194, 195).setNazwa("małpka").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_98),
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_146)));

        dodaj(new Costume(176).setZdjęcie(196).setNazwa("czarownica").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_116, Height.cm_122)));

        dodaj(new Costume(177).setZdjęcie(197, 198).setNazwa("lis").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        dodaj(new Costume(178).setZdjęcie(199, 200).setNazwa("syrenka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_116)));

        dodaj(new Costume(181).setZdjęcie(203).setNazwa("gąska").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_122)));

        dodaj(new Costume(182).setZdjęcie(204, 205).setNazwa("kurczątko").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(183).setZdjęcie(206, 208, 313).setNazwa("hiszpanka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146)));

        dodaj(new Costume(184).setZdjęcie(207).setNazwa("Żołnierz").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140)));

        dodaj(new Costume(187).setZdjęcie(211).setNazwa("Jasmina").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_140)));

        dodaj(new Costume(189).setZdjęcie(213).setNazwa("ninja").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_98),
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146)));

        dodaj(new Costume(190).setZdjęcie(214, 216).setNazwa("dama").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_140),
                new Size(Height.cm_128)));

        dodaj(new Costume(191).setZdjęcie(217).setNazwa("suknia wizytowa").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_128)));

        dodaj(new Costume(193).setZdjęcie(218).setNazwa("diablica").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_152)));

        dodaj(new Costume(194).setZdjęcie(219).setNazwa("hiszpanka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146)));

        dodaj(new Costume(195).setZdjęcie(220, 222).setNazwa("Łabędź").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_140, Height.cm_158)));

        dodaj(new Costume(196).setZdjęcie(221).setNazwa("suknia wizytowa").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_128),
                new Size(Height.cm_146)));

        dodaj(new Costume(197).setZdjęcie(224, 226).setNazwa("diablica").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(198).setZdjęcie(225).setNazwa("suknia wizytowa").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_128),
                new Size(Height.cm_146)));

        dodaj(new Costume(221).setZdjęcie(228).setNazwa("indyk").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(201).setZdjęcie(231).setNazwa("dama").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        dodaj(new Costume(202).setZdjęcie(232, 234).setNazwa("krówka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_122, Height.cm_128)));

        dodaj(new Costume(203).setZdjęcie(236).setNazwa("wróżka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Andrzejki).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116)));

        dodaj(new Costume(205).setZdjęcie(238, 240).setNazwa("kura").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(207).setZdjęcie(242).setNazwa("czarownica").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_116)));

        dodaj(new Costume(208).setZdjęcie(243).setNazwa("czarownica").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        dodaj(new Costume(209).setZdjęcie(244).setNazwa("pająk").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_104)));

        dodaj(new Costume(211).setZdjęcie(246).setNazwa("czarownica").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_116)));

        dodaj(new Costume(212).setZdjęcie(247).setNazwa("cyganka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_146, Height.cm_152)));

        dodaj(new Costume(214).setZdjęcie(248, 250).setNazwa("bocian").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        dodaj(new Costume(216).setZdjęcie(252).setNazwa("byk").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(217).setZdjęcie(254, 256).setNazwa("czarownica").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_116)));

        dodaj(new Costume(218).setZdjęcie(255).setNazwa("disco").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_146)));

        dodaj(new Costume(219).setZdjęcie(257, 328).setNazwa("motyl").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140)));

        dodaj(new Costume(220).setZdjęcie(259).setNazwa("piratka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Pirackie).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        dodaj(new Costume(222).setZdjęcie(new Photo(262, false), new Photo(264, true)).setNazwa("niedźwiadek").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        dodaj(new Costume(223).setZdjęcie(263).setNazwa("piratka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Pirackie).setRozmiar(
                new Size(Height.cm_140)));

        dodaj(new Costume(225).setZdjęcie(261).setNazwa("Disco").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(226).setZdjęcie(266, 268).setNazwa("czarownica").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        dodaj(new Costume(227).setZdjęcie(267).setNazwa("syrenka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_128)));

        dodaj(new Costume(229).setZdjęcie(270).setNazwa("Żaba").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_98),
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_152, Height.cm_158)));

        dodaj(new Costume(230).setZdjęcie(271).setNazwa("sukienka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_20_i_30).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        dodaj(new Costume(231).setZdjęcie(272, 274).setNazwa("lew").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_152, Height.cm_158)));

        dodaj(new Costume(232).setZdjęcie(273).setNazwa("hiszpanka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146)));

        dodaj(new Costume(233).setZdjęcie(275).setNazwa("cyganka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_140)));

        dodaj(new Costume(234).setZdjęcie(277).setNazwa("jasmina").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        dodaj(new Costume(235).setZdjęcie(281).setNazwa("jasmina").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        dodaj(new Costume(237).setZdjęcie(278).setNazwa("orzeł").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(238).setZdjęcie(279).setNazwa("disco").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_152)));

        dodaj(new Costume(239).setZdjęcie(280, 282).setNazwa("wiosna").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_116)));

        dodaj(new Costume(240).setZdjęcie(283).setNazwa("disco").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_146),
                new Size(Height.cm_152)));

        dodaj(new Costume(241).setZdjęcie(new Photo(284, Boolean.TRUE), new Photo(286, Boolean.FALSE)).setNazwa("wąż").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_140)));

        dodaj(new Costume(242).setZdjęcie(285).setNazwa("dama").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(243).setZdjęcie(287).setNazwa("królowa").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        dodaj(new Costume(244).setZdjęcie(288).setNazwa("wróżka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_116)));

        dodaj(new Costume(245).setZdjęcie(289).setNazwa("dama").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(247).setZdjęcie(297).setNazwa("dama").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_128)));

        dodaj(new Costume(248).setZdjęcie(290, 292).setNazwa("indianka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(249).setZdjęcie(291).setNazwa("królowa").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(250).setZdjęcie(294, 296).setNazwa("Disco").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_122)));

        dodaj(new Costume(251).setZdjęcie(295).setNazwa("syrenka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Pirackie).setRozmiar(
                new Size(Height.cm_140)));

        dodaj(new Costume(252).setZdjęcie(298, 300).setNazwa("motyl").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        dodaj(new Costume(253).setZdjęcie(299).setNazwa("dama").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_152)));

        dodaj(new Costume(254).setZdjęcie(301).setNazwa("dama").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_128)));

        dodaj(new Costume(256).setZdjęcie(303).setNazwa("szlachcianka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_140),
                new Size(Height.cm_146)));

        dodaj(new Costume(257).setZdjęcie(305).setNazwa("szlachcianka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(258).setZdjęcie(306).setNazwa("disco").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(260).setZdjęcie(311).setNazwa("indianka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Dziki_zachód).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        dodaj(new Costume(259).setZdjęcie(307).setNazwa("indianka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Dziki_zachód).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(261).setZdjęcie(315).setNazwa("indianka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Dziki_zachód).setRozmiar(
                new Size(Height.cm_152, Height.cm_158)));

        dodaj(new Costume(262).setZdjęcie(308).setNazwa("pielęgniarka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_128)));

        dodaj(new Costume(263).setZdjęcie(309).setNazwa("piratka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Pirackie).setRozmiar(
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(264).setZdjęcie(310, 312, 314).setNazwa("suknia do walca").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_116)));

        dodaj(new Costume(265).setZdjęcie(316).setNazwa("Maryja").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_98),
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146),
                new Size(Height.cm_152)));

        dodaj(new Costume(266).setZdjęcie(317).setNazwa("cyganka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(267).setZdjęcie(318).setNazwa("Anioł").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_98),
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146),
                new Size(Height.cm_152)));

        dodaj(new Costume(268).setZdjęcie(320).setNazwa("księżniczka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_116)));

        dodaj(new Costume(270).setZdjęcie(322).setNazwa("syrenka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_116)));

        dodaj(new Costume(271).setZdjęcie(323).setNazwa("cyganka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_128)));

        dodaj(new Costume(274).setZdjęcie(329).setNazwa("cyganka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(275).setZdjęcie(324).setNazwa("Królewna Śnieżka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_98),
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146),
                new Size(Height.cm_152)));

        dodaj(new Costume(276).setZdjęcie(325).setNazwa("Królewna").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        dodaj(new Costume(279).setZdjęcie(330, 331).setNazwa("księżniczka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116)));

        dodaj(new Costume(280).setZdjęcie(332).setNazwa("księżniczka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        dodaj(new Costume(281).setZdjęcie(337, 338).setNazwa("księżniczka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(282).setZdjęcie(333, 346, 347).setNazwa("Roszpunka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_122),
                new Size(Height.cm_134)));

        dodaj(new Costume(283).setZdjęcie(334).setNazwa("motyl").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_122)));

        dodaj(new Costume(284).setZdjęcie(335, 336).setNazwa("królowa").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_116)));

        dodaj(new Costume(285).setZdjęcie(339, 340).setNazwa("księżniczka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_98),
                new Size(Height.cm_104),
                new Size(Height.cm_116)));

        dodaj(new Costume(286).setZdjęcie(341).setNazwa("krakowianka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146),
                new Size(Height.cm_152)));

        dodaj(new Costume(287).setZdjęcie(342, 413).setNazwa("pszczółka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_134)));

        dodaj(new Costume(288).setZdjęcie(343).setNazwa("biedronka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        dodaj(new Costume(291).setZdjęcie(348, 349).setNazwa("kotek").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122)));

        dodaj(new Costume(292).setZdjęcie(new Photo(350, Boolean.TRUE)).setNazwa("myszka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122)));

        dodaj(new Costume(293).setZdjęcie(new Photo(351, Boolean.FALSE), new Photo(352, Boolean.TRUE)).setNazwa("wiewiórka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        dodaj(new Costume(294).setZdjęcie(353, 354, 355).setNazwa("Łabędź").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        dodaj(new Costume(295).setZdjęcie(356, 357).setNazwa("tancerka turecka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_152)));

        dodaj(new Costume(296).setZdjęcie(358, 359).setNazwa("czarownica").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_152)));

        dodaj(new Costume(297).setZdjęcie(360, 361, 362).setNazwa("cyganka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_152, Height.cm_158)));

        dodaj(new Costume(298).setZdjęcie(363).setNazwa("czarownica").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_152, Height.cm_158)));

        dodaj(new Costume(299).setZdjęcie(364).setNazwa("sukienka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_20_i_30).setRozmiar(
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(300).setZdjęcie(365).setNazwa("Lady Safari").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(301).setZdjęcie(366).setNazwa("diablica").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        dodaj(new Costume(302).setZdjęcie(368).setNazwa("dalmatyńczyk").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_140, Height.cm_146)));

        dodaj(new Costume(304).setZdjęcie(370).setNazwa("królik").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_152, Height.cm_158)));

        dodaj(new Costume(305).setZdjęcie(1007).setNazwa("traper").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Dziki_zachód).setRozmiar(
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        dodaj(new Costume(306).setZdjęcie(372).setNazwa("kowboj").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Dziki_zachód).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_134),
                new Size(Height.cm_122)));

        dodaj(new Costume(307).setZdjęcie(373).setNazwa("indianin").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Dziki_zachód).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_134),
                new Size(Height.cm_122)));

        dodaj(new Costume(308).setZdjęcie(374).setNazwa("Fazi z Ulicy Sezamkowej").setDlugaNazwa().setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_110, Height.cm_116)));

        dodaj(new Costume(310).setZdjęcie(376).setNazwa("cyganka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_146, Height.cm_152)));

        dodaj(new Costume(311).setZdjęcie(377).setNazwa("cyganka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_140, Height.cm_146)));

        dodaj(new Costume(312).setZdjęcie(378).setNazwa("cyganka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_152, Height.cm_158)));

        dodaj(new Costume(313).setZdjęcie(380).setNazwa("czarownica").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        dodaj(new Costume(315).setZdjęcie(382).setNazwa("kierowca rajdowy").setDlugaNazwa().setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        dodaj(new Costume(316).setZdjęcie(381, 388).setNazwa("czarownica").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_146, Height.cm_152)));

        dodaj(new Costume(317).setZdjęcie(384).setNazwa("spiderman").setDlaPary(33).setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Super_bohaterowie).setRozmiar(
                new Size(Height.cm_98),
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_110)));

        dodaj(new Costume(318).setZdjęcie(385).setNazwa("czarodziejka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Andrzejki).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_110),
                new Size(Height.cm_134),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(319).setZdjęcie(386).setNazwa("wróżka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Andrzejki).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_152),
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(321).setZdjęcie(389).setNazwa("księżniczka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(322).setZdjęcie(390).setNazwa("disco").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_146, Height.cm_158)));

        dodaj(new Costume(323).setZdjęcie(391).setNazwa("cyganka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(325).setZdjęcie(394).setNazwa("czirliderki").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_152, Height.cm_158)));

        dodaj(new Costume(326).setZdjęcie(395).setNazwa("czarownica").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_152, Height.cm_158)));

        dodaj(new Costume(327).setZdjęcie(new Photo(396, Boolean.TRUE)).setNazwa("sarenka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_134)));

        dodaj(new Costume(328).setZdjęcie(397).setNazwa("stańczyk").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_140)));

        dodaj(new Costume(329).setZdjęcie(398).setNazwa("wróżka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_140)));

        dodaj(new Costume(330).setZdjęcie(399).setNazwa("czarodziejka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Andrzejki).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_110),
                new Size(Height.cm_134),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));
    }

    private void addData2() {
        dodaj(new Costume(332).setZdjęcie(401).setNazwa("rycerz").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Historyczne).setRozmiar(
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(333).setZdjęcie(403).setNazwa("legionista rzymski").setWiek(Age.DZIECKO).setDlugaNazwa().setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(334).setZdjęcie(404).setNazwa("suknia").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_128),
                new Size(Height.cm_116),
                new Size(Height.cm_140)));

        dodaj(new Costume(335).setZdjęcie(405).setNazwa("tygrys").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_152, Height.cm_158)));

        dodaj(new Costume(336).setZdjęcie(407).setNazwa("miś").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104, Height.cm_110)));

        dodaj(new Costume(337).setZdjęcie(408).setNazwa("kotek").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_98),
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        dodaj(new Costume(338).setZdjęcie(409).setNazwa("clown").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_98),
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_110)));

        dodaj(new Costume(339).setZdjęcie(414).setNazwa("pszczoła").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116, Height.cm_122)));

        dodaj(new Costume(340).setZdjęcie(415).setNazwa("Samuraj").setWiek(Age.DZIECKO).setDlugaNazwa().setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_140)));

        dodaj(new Costume(341).setZdjęcie(416).setNazwa("indianin").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Dziki_zachód).setRozmiar(
                new Size(Height.cm_140)));

        dodaj(new Costume(342).setZdjęcie(417).setNazwa("pirat").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Pirackie).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(343).setZdjęcie(418).setNazwa("chińczyk").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_134, Height.cm_140)));

        dodaj(new Costume(345).setZdjęcie(420).setNazwa("karateka").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(346).setZdjęcie(421).setNazwa("kowboj").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Dziki_zachód).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(347).setZdjęcie(422).setNazwa("japonka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_122)));

        dodaj(new Costume(348).setZdjęcie(423).setNazwa("indianin").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Dziki_zachód).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(351).setZdjęcie(428).setNazwa("diabliczka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Bajki, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_98),
                new Size(Height.cm_104)));

        dodaj(new Costume(352).setZdjęcie(430).setNazwa("dworzanin").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Historyczne).setRozmiar(
                new Size(Height.cm_104, Height.cm_110)));

        dodaj(new Costume(353).setZdjęcie(436).setNazwa("indianin").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Dziki_zachód).setRozmiar(
                new Size(Height.cm_116)));

        dodaj(new Costume(354).setZdjęcie(437).setNazwa("rycerz").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_152, Height.cm_158),
                new Size(Height.cm_164)));

        dodaj(new Costume(355).setZdjęcie(438).setNazwa("ułan").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140)));

        dodaj(new Costume(356).setZdjęcie(439, 440).setNazwa("pirat").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Pirackie).setRozmiar(
                new Size(Height.cm_86),
                new Size(Height.cm_92),
                new Size(Height.cm_98)));

        dodaj(new Costume(357).setZdjęcie(441).setNazwa("indianin").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Dziki_zachód, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_86),
                new Size(Height.cm_92),
                new Size(Height.cm_98)));

        dodaj(new Costume(358).setZdjęcie(442).setNazwa("Robin Hood").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_92),
                new Size(Height.cm_98),
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_152, Height.cm_158),
                new Size(Height.cm_164, Height.cm_170)));

        dodaj(new Costume(361).setZdjęcie(445).setNazwa("kapitan Hak").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Pirackie).setRozmiar(
                new Size(Height.cm_98, Height.cm_104),
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        dodaj(new Costume(362).setZdjęcie(447).setNazwa("król").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Bajki, Category.Historyczne).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        dodaj(new Costume(364).setZdjęcie(700).setNazwa("dzięcioł").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Height.cm_188, Belt.XS, Belt.XL)));

        dodaj(new Costume(365).setZdjęcie(701).setNazwa("papuga").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.XS, Belt.XL)));

        dodaj(new Costume(366).setZdjęcie(702).setNazwa("słowik").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Height.cm_188, Belt.XS, Belt.XL)));

        dodaj(new Costume(367).setZdjęcie(703).setNazwa("zebra").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(369).setZdjęcie(705).setNazwa("indyk").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Height.cm_182, Belt.S, Belt.L)));

        dodaj(new Costume(370).setZdjęcie(706).setNazwa("Żyrafa").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(371).setZdjęcie(new Photo(708, Boolean.TRUE)).setNazwa("wąż").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.L)));

        dodaj(new Costume(372).setZdjęcie(710).setNazwa("kaczka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.XL)));

        dodaj(new Costume(373).setZdjęcie(711).setNazwa("kogut").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.M, Belt.XL)));

        dodaj(new Costume(374).setZdjęcie(712, 713).setNazwa("konik morski").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.XXL)));

        dodaj(new Costume(375).setZdjęcie(714).setNazwa("Świnka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.L)));

        dodaj(new Costume(41).setZdjęcie(715).setNazwa("grzyb kania").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Owoce_i_warzywa).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(376).setZdjęcie(718, 719).setNazwa("łabędź").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Height.cm_182, Belt.S, Belt.L)));

        dodaj(new Costume(377).setZdjęcie(720).setNazwa("niedźwiedź").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.L)));

        dodaj(new Costume(378).setZdjęcie(721).setNazwa("gąska").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.L)));

        dodaj(new Costume(379).setZdjęcie(722).setNazwa("Słowik").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.XL)));

        dodaj(new Costume(381).setZdjęcie(724).setNazwa("kura").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.XL)));

        dodaj(new Costume(382).setZdjęcie(725).setNazwa("mrówka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.L)));

        dodaj(new Costume(383).setZdjęcie(726).setNazwa("brzydkie kaczątko").setDlugaNazwa().setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.L)));

        dodaj(new Costume(384).setZdjęcie(727).setNazwa("wilk").setDlaPary(18).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.L)));

        dodaj(new Costume(385).setZdjęcie(728).setNazwa("kukułka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.L)));

        dodaj(new Costume(386).setZdjęcie(729).setNazwa("kret").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.L)));

        dodaj(new Costume(387).setZdjęcie(730).setNazwa("koń").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.M, Belt.XL)));

        dodaj(new Costume(388).setZdjęcie(731).setNazwa("małpka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.XS, Belt.L)));

        dodaj(new Costume(389).setZdjęcie(732).setNazwa("wiewiórka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.L)));

        dodaj(new Costume(390).setZdjęcie(733).setNazwa("mysz").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.L)));

        dodaj(new Costume(391).setZdjęcie(734).setNazwa("Kubuś Puchatek").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_158, Height.cm_170, Belt.S, Belt.L)));

        dodaj(new Costume(392).setZdjęcie(736).setNazwa("rak").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_158, Height.cm_170, Belt.S, Belt.L)));

        dodaj(new Costume(394).setZdjęcie(1160).setNazwa("piratka").setDlaPary(1).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Pirackie, Category.Historyczne).setRozmiar(
                new Size(Height.cm_164, Height.cm_182, Belt.XL, Belt.XXL)));

        dodaj(new Costume(395).setZdjęcie(1159).setNazwa("piratka").setDlaPary(1).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Pirackie, Category.Historyczne).setRozmiar(
                new Size(Height.cm_164, Height.cm_182, Belt.XL, Belt.XXL)));

        dodaj(new Costume(397).setZdjęcie(1027).setNazwa("kopciuszek").setDlaPary(26).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Historyczne).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        dodaj(new Costume(399).setZdjęcie(743).setNazwa("meksykanka").setDlaPary(4).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.L)));

        dodaj(new Costume(400).setZdjęcie(746).setNazwa("meksykanka").setDlaPary(4).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.L)));

        dodaj(new Costume(401).setZdjęcie(744).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.XL)));

        dodaj(new Costume(402).setZdjęcie(974).setNazwa("szkot").setDlaPary(27).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_176, Height.cm_188, Belt.M, Belt.XL)));

        dodaj(new Costume(406).setZdjęcie(750, 1090).setNazwa("królowa zima").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.L, Belt.XL)));

        dodaj(new Costume(407).setZdjęcie(751).setNazwa("szata").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.L)));

        dodaj(new Costume(412).setZdjęcie(757).setNazwa("jaskiniowiec").setDlaPary(17).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_158, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(414).setZdjęcie(759).setNazwa("śnieżynka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Jasełka, Occasion.Mikołajki).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(415).setZdjęcie(760).setNazwa("milicjant").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(416).setZdjęcie(990).setNazwa("marynarz").setDlaPary(28).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_170, Belt.S),
                new Size(Height.cm_170, Belt.M)));

        dodaj(new Costume(417).setZdjęcie(762).setNazwa("duch").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.XL)));

        dodaj(new Costume(418).setZdjęcie(980).setNazwa("szkotka").setDlaPary(27).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_170, Belt.S),
                new Size(Height.cm_170, Belt.L)));

        dodaj(new Costume(419).setZdjęcie(1084).setNazwa("piratka").setDlaPary(1).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy, Category.Pirackie).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        dodaj(new Costume(420).setZdjęcie(770).setNazwa("policjantka").setDlaPary(29).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy, Category.Zawody).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(421).setZdjęcie(771).setNazwa("stewardessa").setDlaPary(30).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy, Category.Zawody).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(422).setZdjęcie(773).setNazwa("papuga").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_128, Belt.S, Belt.L),
                new Size(Height.cm_140, Belt.S, Belt.L)));

        dodaj(new Costume(423).setZdjęcie(774).setNazwa("japonka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_122, Belt.S, Belt.L)));

        dodaj(new Costume(425).setZdjęcie(776).setNazwa("dwórka").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_152, Height.cm_158, Belt.S)));

        dodaj(new Costume(426).setZdjęcie(778).setNazwa("policjant").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140)));

        dodaj(new Costume(428).setZdjęcie(780).setNazwa("bokser").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        dodaj(new Costume(429).setZdjęcie(782).setNazwa("muszkieterka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_116, Belt.S, Belt.M),
                new Size(Height.cm_128, Belt.S, Belt.M)));

        dodaj(new Costume(430).setZdjęcie(803).setNazwa("kierowca rajdowy").setDlugaNazwa().setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_104, Height.cm_110, Belt.S, Belt.M),
                new Size(Height.cm_116, Height.cm_122, Belt.S, Belt.M),
                new Size(Height.cm_128, Height.cm_134, Belt.S, Belt.M),
                new Size(Height.cm_140, Height.cm_146, Belt.S, Belt.M)));

        dodaj(new Costume(431).setZdjęcie(785).setNazwa("disco").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_116, Belt.S, Belt.L),
                new Size(Height.cm_128, Belt.S, Belt.L),
                new Size(Height.cm_140, Belt.S, Belt.L),
                new Size(Height.cm_152, Belt.S, Belt.L),
                new Size(Height.cm_164, Belt.S, Belt.L)));

        dodaj(new Costume(433).setZdjęcie(787).setNazwa("Śnieżynka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Mikołajki).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_158, Height.cm_170, Belt.XS, Belt.S)));

        dodaj(new Costume(434).setZdjęcie(788, 789).setNazwa("disco").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152),
                new Size(Height.cm_164)));

        dodaj(new Costume(435).setZdjęcie(791).setNazwa("muszkieterka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_116, Height.cm_122)));

        dodaj(new Costume(436).setZdjęcie(792).setNazwa("calineczka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S)));

        dodaj(new Costume(437).setZdjęcie(793).setNazwa("policjant").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(438).setZdjęcie(794).setNazwa("kwiatek").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_128)));

        dodaj(new Costume(439).setZdjęcie(795).setNazwa("piotruś pan").setDlaPary(32).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        dodaj(new Costume(441).setZdjęcie(798).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_158, Height.cm_164, Belt.XS, Belt.S)));

        dodaj(new Costume(442).setZdjęcie(799).setNazwa("harry potter").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(447).setZdjęcie(804).setNazwa("wonder woman").setDlaPary(33).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Super_bohaterowie, Category.Sexy).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.XS, Belt.S)));

        dodaj(new Costume(448).setZdjęcie(1077).setNazwa("piratka").setDlaPary(1).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Pirackie, Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(449).setZdjęcie(806).setNazwa("superman").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Super_bohaterowie).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        dodaj(new Costume(450).setZdjęcie(807).setNazwa("wiosna").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140)));

        dodaj(new Costume(451).setZdjęcie(808).setNazwa("wiking").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(452).setZdjęcie(809).setNazwa("gąska").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_158, Height.cm_164, Belt.S)));

        dodaj(new Costume(453).setZdjęcie(811).setNazwa("napoleon").setDlaPary(34).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        dodaj(new Costume(455).setZdjęcie(959).setNazwa("Ślimak").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_128)));

        dodaj(new Costume(456).setZdjęcie(814).setNazwa("Żyrafa").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        dodaj(new Costume(457).setZdjęcie(815).setNazwa("rycerz").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(458).setZdjęcie(816, 817).setNazwa("Żółw").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        dodaj(new Costume(459).setZdjęcie(818).setNazwa("księżniczka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_134),
                new Size(Height.cm_140)));

        dodaj(new Costume(460).setZdjęcie(819).setNazwa("ułan").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_158, Height.cm_164, Belt.S, Belt.M)));

        dodaj(new Costume(461).setZdjęcie(820).setNazwa("diablica").setDlaPary(8).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(462).setZdjęcie(821, 822, 823).setNazwa("spiderman").setDlaPary(33).setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Super_bohaterowie).setRozmiar(
                new Size(Height.cm_128)));

        dodaj(new Costume(463).setZdjęcie(824).setNazwa("drakulaura").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_134),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(465).setZdjęcie(826).setNazwa("Śmierć").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Halloween, Occasion.Jasełka).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.L)));

        dodaj(new Costume(466).setZdjęcie(827).setNazwa("myszka mini").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_104)));

        dodaj(new Costume(467).setZdjęcie(829).setNazwa("hawajka").setDlaPary(35).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_158, Height.cm_170, Belt.XS, Belt.M)));

        dodaj(new Costume(468).setZdjęcie(830).setNazwa("Kościotrup").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.XS, Belt.M)));

        dodaj(new Costume(469).setZdjęcie(831).setNazwa("obi wan kenobi").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152),
                new Size(Height.cm_164)));

        dodaj(new Costume(470).setZdjęcie(832).setNazwa("clawdeen wolf").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(471).setZdjęcie(836).setNazwa("frankie stein").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(472).setZdjęcie(833).setNazwa("suknia empire").setDlaPary(34).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L),
                new Size(Height.cm_158, Height.cm_164, Belt.XS, Belt.M)));

        dodaj(new Costume(473).setZdjęcie(837).setNazwa("suknia empire").setDlaPary(34).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        dodaj(new Costume(476).setZdjęcie(835).setNazwa("anakin").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(477).setZdjęcie(840).setNazwa("anakin").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(479).setZdjęcie(842).setNazwa("cyganka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        dodaj(new Costume(480).setZdjęcie(843).setNazwa("diabeł").setDlaPary(8).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Halloween, Occasion.Jasełka).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_170, Height.cm_194, Belt.M, Belt.XXL)));

        dodaj(new Costume(482).setZdjęcie(845, 851, 853).setNazwa("Darth Vader").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140)));

        dodaj(new Costume(483).setZdjęcie(847).setNazwa("niezapominajka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_122)));

        dodaj(new Costume(484).setZdjęcie(848).setNazwa("al capone").setDlaPary(37).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(485).setZdjęcie(849).setNazwa("Samuraj").setDlaPary(7).setDlugaNazwa().setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        dodaj(new Costume(486).setZdjęcie(850).setNazwa("słonecznik").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_122, Height.cm_128)));

        dodaj(new Costume(89).setZdjęcie(new Photo(857, Boolean.FALSE), new Photo(113, Boolean.FALSE), new Photo(854, Boolean.TRUE)).setNazwa("teletubiś").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.L)));

        dodaj(new Costume(91).setZdjęcie(new Photo(855, Boolean.FALSE), new Photo(854, Boolean.TRUE)).setNazwa("teletubiś").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.L)));

        dodaj(new Costume(94).setZdjęcie(new Photo(856, Boolean.FALSE), new Photo(854, Boolean.TRUE)).setNazwa("teletubiś").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.L),
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.L)));

        dodaj(new Costume(488).setZdjęcie(new Photo(858, Boolean.FALSE), new Photo(854, Boolean.TRUE)).setNazwa("teletubiś").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.L)));

        dodaj(new Costume(490).setZdjęcie(862, 864).setNazwa("krasnoludek").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116)));

        dodaj(new Costume(491).setZdjęcie(863, 864).setNazwa("krasnoludek").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140)));

        dodaj(new Costume(492).setZdjęcie(new Photo(865, Boolean.FALSE), new Photo(869, Boolean.TRUE)).setDlaPary(21).setNazwa("krasnoludek").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.L)));

        dodaj(new Costume(493).setZdjęcie(new Photo(867, Boolean.FALSE), new Photo(869, Boolean.TRUE)).setDlaPary(21).setNazwa("krasnoludek").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.L)));

        dodaj(new Costume(494).setZdjęcie(new Photo(868, Boolean.FALSE), new Photo(869, Boolean.TRUE)).setDlaPary(21).setNazwa("krasnoludek").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.M)));

        dodaj(new Costume(495).setZdjęcie(870).setNazwa("klon").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(496).setZdjęcie(871).setNazwa("kankan").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_122, Height.cm_134)));

        dodaj(new Costume(497).setZdjęcie(874).setNazwa("kankan").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_122, Height.cm_134)));

        dodaj(new Costume(498).setZdjęcie(876).setNazwa("kankan").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_134, Height.cm_146)));

        dodaj(new Costume(499).setZdjęcie(878).setNazwa("kankan").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_134, Height.cm_146)));

        dodaj(new Costume(501).setZdjęcie(872).setNazwa("wojownik").setDlaPary(39).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_170, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(502).setZdjęcie(879).setNazwa("pirat").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Pirackie).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(503).setZdjęcie(881).setNazwa("kankan").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_134, Height.cm_146)));

        dodaj(new Costume(504).setZdjęcie(883).setNazwa("kwiatek").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_122, Height.cm_134)));

        dodaj(new Costume(506).setZdjęcie(887).setNazwa("kleopatra").setDlaPary(65).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_158, Height.cm_164, Belt.XS, Belt.S)));

        dodaj(new Costume(507).setZdjęcie(888).setNazwa("biały niedźwiedź").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_128)));

        dodaj(new Costume(508).setZdjęcie(889).setNazwa("koń").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_128)));

        dodaj(new Costume(509).setZdjęcie(890).setNazwa("wiosna").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_158, Height.cm_170, Belt.XS, Belt.M)));

        dodaj(new Costume(513).setZdjęcie(894).setNazwa("buzz astral").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_116)));

        dodaj(new Costume(514).setZdjęcie(896).setNazwa("książę wschodni").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(515).setZdjęcie(897).setNazwa("barbie").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_134, Height.cm_146)));

        dodaj(new Costume(516).setZdjęcie(898).setNazwa("Kierowca Rajdowy").setDlugaNazwa().setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(517).setZdjęcie(900, 901).setNazwa("batman").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Super_bohaterowie).setRozmiar(
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(518).setZdjęcie(902).setNazwa("lisiczka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(520).setZdjęcie(906).setNazwa("kleopatra").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_128)));

        dodaj(new Costume(521).setZdjęcie(908).setNazwa("diabeł").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Halloween, Occasion.Jasełka).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_152, Height.cm_158),
                new Size(Height.cm_164, Height.cm_170)));

        dodaj(new Costume(523).setZdjęcie(910).setNazwa("czarownica").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween, Occasion.Andrzejki).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        dodaj(new Costume(524).setZdjęcie(911).setNazwa("królewna śnieżka").setDlaPary(21).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        dodaj(new Costume(525).setZdjęcie(912).setNazwa("pilot").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(526).setZdjęcie(913).setNazwa("czarownica").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween, Occasion.Andrzejki).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(527).setZdjęcie(914).setNazwa("Żołnierz rzymski").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Historyczne).setRozmiar(
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(528).setZdjęcie(915).setNazwa("hipiska").setDlaPary(14).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_158, Height.cm_164, Belt.XS, Belt.S)));

        dodaj(new Costume(529).setZdjęcie(917).setNazwa("dzwoneczek").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_134)));

        dodaj(new Costume(530).setZdjęcie(918).setNazwa("strażak").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(531).setZdjęcie(920).setNazwa("Żołnierz rzymski").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_128)));

        dodaj(new Costume(532).setZdjęcie(922).setNazwa("czarownica").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween, Occasion.Andrzejki).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_152, Height.cm_158)));

        dodaj(new Costume(533).setZdjęcie(923).setNazwa("marylin monroe").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_158, Height.cm_164, Belt.XS, Belt.S)));

        dodaj(new Costume(534).setZdjęcie(924).setNazwa("król").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(536).setZdjęcie(926).setNazwa("marynarz").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_128)));

        dodaj(new Costume(537).setZdjęcie(927).setNazwa("królowa").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Historyczne).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(538).setZdjęcie(929).setNazwa("Śmierć").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Jasełka, Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(539).setZdjęcie(930).setNazwa("kowbojka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Dziki_zachód).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_140),
                new Size(Height.cm_128),
                new Size(Height.cm_152)));

        dodaj(new Costume(540).setZdjęcie(931).setNazwa("babcia").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_158, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(541).setZdjęcie(932).setNazwa("robin hood").setDlaPary(3).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.L)));

        dodaj(new Costume(542).setZdjęcie(933).setNazwa("indianka").setDlaPary(2).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Dziki_zachód, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.L)));

        dodaj(new Costume(543).setZdjęcie(934).setNazwa("hipiska").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_140),
                new Size(Height.cm_128)));

        dodaj(new Costume(544).setZdjęcie(935).setNazwa("Albus Dumbledore").setDlugaNazwa().setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_134)));

        dodaj(new Costume(545).setZdjęcie(936).setNazwa("bawarka").setDlaPary(41).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS),
                new Size(Height.cm_164, Height.cm_170, Belt.L)));

        dodaj(new Costume(546).setZdjęcie(937).setNazwa("sukienka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_50_i_60).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS),
                new Size(Height.cm_164, Height.cm_170, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        dodaj(new Costume(547).setZdjęcie(938).setNazwa("krokodyl").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(548).setZdjęcie(939).setNazwa("tancerka turecka").setDlaPary(11).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.M)));

        dodaj(new Costume(549).setZdjęcie(940).setNazwa("kaczka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        dodaj(new Costume(550).setZdjęcie(941).setNazwa("sukienka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_50_i_60).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(551).setZdjęcie(943).setNazwa("rak").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146),
                new Size(Height.cm_152)));

        dodaj(new Costume(552).setZdjęcie(944).setNazwa("muszkietarka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_128)));

        dodaj(new Costume(553).setZdjęcie(945).setNazwa("indianka").setDlaPary(2).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Dziki_zachód, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(554).setZdjęcie(946).setNazwa("Żołnierz").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(556).setZdjęcie(947).setNazwa("bałwan").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(557).setZdjęcie(950).setNazwa("zebra").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(558).setZdjęcie(951).setNazwa("zombie").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(559).setZdjęcie(952).setNazwa("dworzanin").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.M),
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L)));

        dodaj(new Costume(560).setZdjęcie(953).setNazwa("kangur").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_122, Height.cm_128),
                new Size(Height.cm_134, Height.cm_140)));

        dodaj(new Costume(561).setZdjęcie(954).setNazwa("kubuś puchatek").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_110, Height.cm_116),
                new Size(Height.cm_122, Height.cm_128),
                new Size(Height.cm_134, Height.cm_140)));

        dodaj(new Costume(562).setZdjęcie(955).setNazwa("dworzanin").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L)));

        dodaj(new Costume(563).setZdjęcie(956).setNazwa("sarenka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        dodaj(new Costume(564).setZdjęcie(957).setNazwa("jelonek").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        dodaj(new Costume(565).setZdjęcie(958).setNazwa("owieczka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        dodaj(new Costume(566).setZdjęcie(961).setNazwa("cytryna").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Owoce_i_warzywa).setRozmiar(
                new Size(Height.cm_110, Height.cm_152)));

        dodaj(new Costume(567).setZdjęcie(962).setNazwa("książe").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_134)));

        dodaj(new Costume(568).setZdjęcie(963).setNazwa("pippi").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_122, Height.cm_140)));

        dodaj(new Costume(569).setZdjęcie(964, 965).setNazwa("smerf").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(570).setZdjęcie(965).setNazwa("smerfetka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(571).setZdjęcie(966).setNazwa("sułtan").setDlaPary(43).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Bajki).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L)));

        dodaj(new Costume(572).setZdjęcie(967).setNazwa("aladyn").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_128, Height.cm_140)));

        dodaj(new Costume(573).setZdjęcie(968).setNazwa("słoneczko").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_122, Height.cm_134)));

        dodaj(new Costume(574).setZdjęcie(969, 970).setNazwa("bokser").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_128, Height.cm_140)));

        dodaj(new Costume(576).setZdjęcie(972).setNazwa("wróbelek").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        dodaj(new Costume(577).setZdjęcie(973).setNazwa("ptak").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_128, Height.cm_146)));

        dodaj(new Costume(578).setZdjęcie(975).setNazwa("mak").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        dodaj(new Costume(579).setZdjęcie(977).setNazwa("kaczka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(580).setZdjęcie(978).setNazwa("jaskiniowiec").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(581).setZdjęcie(979, 981).setNazwa("diabeł").setDlaPary(8).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Halloween, Occasion.Jasełka).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_182, Height.cm_194, Belt.M, Belt.L),
                new Size(Height.cm_176, Height.cm_188, Belt.XL, Belt.XXL)));

        dodaj(new Costume(582).setZdjęcie(982).setNazwa("duch").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(583).setZdjęcie(983).setNazwa("koziołek matołek").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_110, Height.cm_116)));

        dodaj(new Costume(584).setZdjęcie(984).setNazwa("dama").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(585).setZdjęcie(985).setNazwa("królowa").setDlaPary(22).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        dodaj(new Costume(586).setZdjęcie(986).setNazwa("zielony groszek").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Owoce_i_warzywa).setRozmiar(
                new Size(Height.cm_122, Height.cm_134)));

        dodaj(new Costume(587).setZdjęcie(987).setNazwa("disco").setDlaPary(20).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L)));

        dodaj(new Costume(588).setZdjęcie(988).setNazwa("ninja").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_140),
                new Size(Height.cm_146),
                new Size(Height.cm_152)));

        dodaj(new Costume(589).setZdjęcie(989).setNazwa("wiosna").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.L)));

        dodaj(new Costume(590).setZdjęcie(991).setNazwa("disco").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.M),
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L),
                new Size(Height.cm_176, Height.cm_182, Belt.L, Belt.XL)));

        dodaj(new Costume(591).setZdjęcie(994).setNazwa("disco").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.M),
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L),
                new Size(Height.cm_176, Height.cm_182, Belt.L, Belt.XL)));

        dodaj(new Costume(592).setZdjęcie(1024).setNazwa("disco").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.M),
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L),
                new Size(Height.cm_176, Height.cm_182, Belt.L, Belt.XL)));

        dodaj(new Costume(593).setZdjęcie(992).setNazwa("laguna blue").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(594).setZdjęcie(993).setNazwa("kominiarz").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_122, Height.cm_128)));

        dodaj(new Costume(595).setZdjęcie(995).setNazwa("piratka").setDlaPary(1).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy, Category.Pirackie).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(596).setZdjęcie(996, 1023).setNazwa("suknia empire").setDlaPary(34).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(61).setZdjęcie(997).setNazwa("pirat").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Pirackie).setRozmiar(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_152, Height.cm_158),
                new Size(Height.cm_164)));

        dodaj(new Costume(597).setZdjęcie(998, 65, 91).setNazwa("diablica").setDlaPary(8).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_158, Height.cm_164, Belt.S, Belt.M)));

        dodaj(new Costume(598).setZdjęcie(999).setNazwa("gwiazdka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_122, Height.cm_140)));

        dodaj(new Costume(599).setZdjęcie(1000).setNazwa("pirat").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Pirackie).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_110),
                new Size(Height.cm_122)));

        dodaj(new Costume(600).setZdjęcie(1002, 1001).setNazwa("sexy lady").setDlaPary(44).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(601).setZdjęcie(1003, 1001).setNazwa("sutener").setDlaPary(44).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.M),
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L),
                new Size(Height.cm_176, Height.cm_182, Belt.L, Belt.XL)));

        dodaj(new Costume(602).setZdjęcie(1005).setNazwa("rumianek").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(603).setZdjęcie(1006, 1008).setDlaPary(22).setNazwa("królowa").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(604).setZdjęcie(1008, 1009).setNazwa("król").setDlaPary(22).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_182, Height.cm_194, Belt.S, Belt.M),
                new Size(Height.cm_182, Height.cm_194, Belt.L, Belt.XL)));

        dodaj(new Costume(46).setZdjęcie(1010, 1158).setNazwa("muszkieter").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_110)));

        dodaj(new Costume(605).setZdjęcie(1012).setNazwa("Elvis Presley").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.M)));

        dodaj(new Costume(607).setZdjęcie(1014).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        dodaj(new Costume(608).setZdjęcie(1017).setNazwa("chinka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(609).setZdjęcie(1018).setNazwa("dr. watson").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.L, Belt.XL)));

        dodaj(new Costume(610).setZdjęcie(1020).setNazwa("al capone").setDlaPary(37).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_20_i_30).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.L),
                new Size(Height.cm_182, Height.cm_188, Belt.XXL),
                new Size(Height.cm_182, Height.cm_188, Belt.XL),
                new Size(Height.cm_182, Height.cm_188, Belt.M)));

        dodaj(new Costume(611).setZdjęcie(1019).setNazwa("kan-kan").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Lata_20_i_30).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.L),
                new Size(Height.cm_164, Height.cm_176, Belt.M)));

        dodaj(new Costume(612).setZdjęcie(1021).setNazwa("czarownica").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween, Occasion.Andrzejki).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_158, Height.cm_176, Belt.L),
                new Size(Height.cm_158, Height.cm_176, Belt.S)));

        dodaj(new Costume(613).setZdjęcie(1025).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S)));

        dodaj(new Costume(614).setZdjęcie(1026).setNazwa("disco").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.M),
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L),
                new Size(Height.cm_176, Height.cm_182, Belt.L, Belt.XL)));

        dodaj(new Costume(615).setZdjęcie(1028).setNazwa("smerfetka").setDlaPary(46).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(616).setZdjęcie(1029).setNazwa("byk").setDlaPary(25).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.XL)));

        dodaj(new Costume(617).setZdjęcie(1031).setNazwa("marynarz").setDlaPary(28).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.M)));

        dodaj(new Costume(618).setZdjęcie(1033).setNazwa("dunka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_158, Height.cm_170, Belt.S),
                new Size(Height.cm_158, Height.cm_170, Belt.XS)));

        dodaj(new Costume(619).setZdjęcie(1034).setNazwa("jesień").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.XS, Belt.M)));

        dodaj(new Costume(620).setZdjęcie(1035).setNazwa("sułtanka").setDlaPary(43).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.XS, Belt.M)));

        dodaj(new Costume(621).setZdjęcie(1036).setNazwa("mak").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.L)));

        dodaj(new Costume(622).setZdjęcie(1037).setNazwa("Żółw").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(623).setZdjęcie(1038).setNazwa("hipiska").setDlaPary(14).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_158, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(625).setZdjęcie(1040).setNazwa("syrena").setWiek(Age.DOROSŁY).setDlaPary(53).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_158, Height.cm_164, Belt.XS)));

        dodaj(new Costume(626).setZdjęcie(1042).setNazwa("czirliderka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_158, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(627).setZdjęcie(1044).setNazwa("kominiarz").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.M)));

        dodaj(new Costume(628).setZdjęcie(1045).setNazwa("piratka").setDlaPary(1).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Pirackie).setRozmiar(
                new Size(Height.cm_158, Height.cm_170, Belt.XS, Belt.S)));

        dodaj(new Costume(630).setZdjęcie(1047).setNazwa("topielica").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_158, Height.cm_164, Belt.XS, Belt.S)));

        dodaj(new Costume(631).setZdjęcie(1048).setNazwa("muszkieter").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.M)));

        dodaj(new Costume(632).setZdjęcie(1049).setNazwa("rzymianka").setDlaPary(39).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Historyczne).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(633).setZdjęcie(1050).setNazwa("Sherlock Holmes").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        dodaj(new Costume(634).setZdjęcie(1051).setNazwa("barbi").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        dodaj(new Costume(635).setZdjęcie(1052).setNazwa("wilk").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_110, Height.cm_116),
                new Size(Height.cm_122, Height.cm_128),
                new Size(Height.cm_134, Height.cm_140)));

        dodaj(new Costume(636).setZdjęcie(1053).setNazwa("dinozaur").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116, Height.cm_122)));

        dodaj(new Costume(637).setZdjęcie(1054).setNazwa("kucharz").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.L),
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.L),
                new Size(Height.cm_182, Height.cm_188, Belt.L, Belt.XXL)));

        dodaj(new Costume(638).setZdjęcie(1056).setNazwa("myszka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(639).setZdjęcie(1057).setNazwa("słoń").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.XL)));

        dodaj(new Costume(640).setZdjęcie(1058).setNazwa("bocian").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L)));

        dodaj(new Costume(641).setZdjęcie(1059).setNazwa("Świnka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(642).setZdjęcie(1060).setNazwa("rycerz").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_140),
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        dodaj(new Costume(643).setZdjęcie(1061).setNazwa("zając").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_140),
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        dodaj(new Costume(644).setZdjęcie(1062).setNazwa("suknia do walca").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_122)));

        dodaj(new Costume(645).setZdjęcie(1063).setNazwa("stokrotka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(646).setZdjęcie(1064).setNazwa("pirat Jack Sparrow").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Pirackie, Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_140),
                new Size(Height.cm_146),
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        dodaj(new Costume(647).setZdjęcie(1065).setNazwa("panterka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_140),
                new Size(Height.cm_128)));

        dodaj(new Costume(648).setZdjęcie(1066).setNazwa("czarownica").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween, Occasion.Andrzejki).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_140),
                new Size(Height.cm_128),
                new Size(Height.cm_116),
                new Size(Height.cm_104)));

        dodaj(new Costume(649).setZdjęcie(1067).setNazwa("czarownica").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween, Occasion.Andrzejki).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.L)));

        dodaj(new Costume(650).setZdjęcie(1068).setNazwa("czarownica").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween, Occasion.Andrzejki).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_128)));

        dodaj(new Costume(651).setZdjęcie(1069).setNazwa("mnich").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.L)));

        dodaj(new Costume(652).setZdjęcie(1070).setNazwa("kwiatek").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_122, Height.cm_128),
                new Size(Height.cm_134, Height.cm_140)));

        dodaj(new Costume(653).setZdjęcie(1072).setNazwa("dominikanin").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L)));

        dodaj(new Costume(654).setZdjęcie(1075).setNazwa("diablica").setDlaPary(8).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(655).setZdjęcie(1076).setNazwa("krasnoludek").setDlaPary(21).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_176, Height.cm_188, Belt.M, Belt.L)));

        dodaj(new Costume(656).setZdjęcie(1078).setNazwa("biskup").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L)));

        dodaj(new Costume(657).setZdjęcie(1079).setNazwa("kan-kan").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Lata_20_i_30).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(658).setZdjęcie(1080).setNazwa("król").setDlaPary(22).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Bajki, Category.Historyczne).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L)));

        dodaj(new Costume(660).setZdjęcie(1082).setNazwa("mikołaj").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Mikołajki).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_188, Height.cm_194, Belt.M, Belt.XXL),
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.XXL),
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.XXL),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.XL)));

        dodaj(new Costume(661).setZdjęcie(1086).setNazwa("hawajka").setDlaPary(35).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(662).setZdjęcie(1087).setNazwa("szeherezada").setDlaPary(11).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Bajki).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(663).setZdjęcie(1085).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Bajki).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(664).setZdjęcie(1074).setNazwa("muszkieter").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.L, Belt.XL)));

        dodaj(new Costume(665).setZdjęcie(1071).setNazwa("czarownica").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Andrzejki, Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        dodaj(new Costume(666).setZdjęcie(1073).setNazwa("suknia").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Andrzejki, Occasion.Halloween).setKategoria(Category.Lata_20_i_30).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(667).setZdjęcie(1041).setNazwa("cyganka").setDlaPary(19).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Andrzejki).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_158, Height.cm_164, Belt.XS, Belt.S)));
    }

    private void addData3() {
        dodaj(new Costume(668).setZdjęcie(1088).setNazwa("szop").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_122, Height.cm_128)));

        dodaj(new Costume(669).setZdjęcie(1089).setNazwa("hindus").setDlaPary(23).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.XS, Belt.S)));

        dodaj(new Costume(670).setZdjęcie(1091).setNazwa("tygrys").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_122, Height.cm_128)));

        dodaj(new Costume(671).setZdjęcie(1092).setNazwa("pirat").setDlaPary(1).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Pirackie).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.L, Belt.XL)));

        dodaj(new Costume(672).setZdjęcie(1093).setNazwa("mikołaj").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Mikołajki).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_140, Height.cm_152),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_152, Height.cm_158)));

        dodaj(new Costume(673).setZdjęcie(1094).setNazwa("czarownica").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Andrzejki, Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        dodaj(new Costume(674).setZdjęcie(1095).setNazwa("dama").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.L)));

        dodaj(new Costume(84).setZdjęcie(1096).setNazwa("wilk").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_122, Height.cm_128)));

        dodaj(new Costume(675).setZdjęcie(1097).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.L),
                new Size(Height.cm_170, Height.cm_176, Belt.XL)));

        dodaj(new Costume(676).setZdjęcie(1098).setNazwa("król").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.M)));

        dodaj(new Costume(677).setZdjęcie(1099, 1100).setNazwa("krokodyl").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116, Height.cm_122)));

        dodaj(new Costume(679).setZdjęcie(1103).setNazwa("duch").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.M)));

        dodaj(new Costume(680).setZdjęcie(1104).setNazwa("myśliwy").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(681).setZdjęcie(1105).setNazwa("nietoperz").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(682).setZdjęcie(1106).setNazwa("hipiska").setDlaPary(14).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.L, Belt.XL)));

        dodaj(new Costume(683).setZdjęcie(1115).setNazwa("hipiska").setDlaPary(14).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.L, Belt.XL)));

        dodaj(new Costume(684).setZdjęcie(1107).setNazwa("piesek").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(685).setZdjęcie(1108).setNazwa("avatar neytiri").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(686).setZdjęcie(1109).setNazwa("świnka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(687).setZdjęcie(1110).setNazwa("kotek").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(688).setZdjęcie(1111).setNazwa("avatar jake sully").setDlaPary(49).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        dodaj(new Costume(689).setZdjęcie(1112).setNazwa("lew").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(690).setZdjęcie(1113).setNazwa("król").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_98),
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        dodaj(new Costume(691).setZdjęcie(1114).setNazwa("batman").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L)));

        dodaj(new Costume(692).setZdjęcie(1116).setNazwa("kot w butach").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(693).setZdjęcie(1117, 1118).setNazwa("zebra").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_122, Height.cm_128)));

        dodaj(new Costume(694).setZdjęcie(1119).setNazwa("wróżka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Andrzejki).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.XS, Belt.S)));

        dodaj(new Costume(695).setZdjęcie(1120, 1121).setNazwa("śnieżynka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(697).setZdjęcie(1126).setNazwa("śnieżynka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        dodaj(new Costume(698).setZdjęcie(1127, 1111).setNazwa("avatar neytiri").setDlaPary(49).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(87).setZdjęcie(1122).setNazwa("superman").setDlaPary(33).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Super_bohaterowie).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L)));

        dodaj(new Costume(699).setZdjęcie(1122).setNazwa("supergirl").setDlaPary(33).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Super_bohaterowie).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(700).setZdjęcie(1124).setNazwa("wonder women").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Super_bohaterowie).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        dodaj(new Costume(701).setZdjęcie(1128).setNazwa("hiszpanka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(702).setZdjęcie(1129).setNazwa("gandalf").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_188, Height.cm_194, Belt.M, Belt.XL)));

        dodaj(new Costume(703).setZdjęcie(1130).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S)));

        dodaj(new Costume(704).setZdjęcie(1131).setNazwa("czarownica").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Andrzejki, Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(705).setZdjęcie(1134).setNazwa("tygrys").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(707).setZdjęcie(1136, 1137).setNazwa("Żyrafa").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(708).setZdjęcie(1139, 1140).setNazwa("lis").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_122, Height.cm_128)));

        dodaj(new Costume(709).setZdjęcie(1142).setNazwa("elf").setDlaPary(32).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S)));

        dodaj(new Costume(710).setZdjęcie(1143).setNazwa("leia").setDlaPary(5).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(711).setZdjęcie(1144).setNazwa("konik").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104, Height.cm_110)));

        dodaj(new Costume(712).setZdjęcie(1145).setNazwa("małpka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104, Height.cm_110)));

        dodaj(new Costume(713).setZdjęcie(1146).setNazwa("łoś").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104, Height.cm_110)));

        dodaj(new Costume(714).setZdjęcie(1149).setNazwa("pingwin").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104, Height.cm_110)));

        dodaj(new Costume(715).setZdjęcie(1151).setNazwa("tygrysek").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104, Height.cm_110)));

        dodaj(new Costume(716).setZdjęcie(1147, 1148).setNazwa("anioł").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(717).setZdjęcie(1156).setNazwa("sukienka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_50_i_60).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(718).setZdjęcie(1152, 1153).setNazwa("pirat").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Pirackie).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_98)));

        dodaj(new Costume(719).setZdjęcie(1154).setNazwa("król").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_116)));

        dodaj(new Costume(720).setZdjęcie(1155).setNazwa("król").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(721).setZdjęcie(1157).setNazwa("diabełek").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116)));

        dodaj(new Costume(722).setZdjęcie(1161).setNazwa("jabłko").setWiek(Age.DZIECKO_DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Owoce_i_warzywa).setRozmiar(
                new Size(Height.cm_128, Height.cm_164)));

        dodaj(new Costume(724).setZdjęcie(1163).setNazwa("kotka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween, Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        dodaj(new Costume(725).setZdjęcie(1168).setNazwa("pszczółka").setDlaPary(13).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(726).setZdjęcie(1234).setNazwa("suknia").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(37).setOkazja(Occasion.Inne).setKategoria(Category.Lata_20_i_30).setRozmiar(
                new Size(Height.cm_158, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_158, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_158, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(727).setZdjęcie(1236).setNazwa("suknia").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(37).setOkazja(Occasion.Inne).setKategoria(Category.Lata_20_i_30).setRozmiar(
                new Size(Height.cm_158, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_158, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_158, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(728).setZdjęcie(1237).setNazwa("Papa Smurf").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setDlaPary(46).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_176, Height.cm_188, Belt.S, Belt.L)));

        dodaj(new Costume(729).setZdjęcie(1332).setNazwa("Turek").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setDlaPary(11).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.M, Belt.L)));

        dodaj(new Costume(730).setZdjęcie(1318).setNazwa("ananas").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Owoce_i_warzywa).setRozmiar(
                new Size(Height.cm_170, Height.cm_194, Belt.M, Belt.XXL)));

        dodaj(new Costume(732).setZdjęcie(1166).setNazwa("policjantka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy, Category.Zawody).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS),
                new Size(Height.cm_164, Height.cm_170, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        dodaj(new Costume(733).setZdjęcie(1170).setNazwa("hiszpanka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(52).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_158, Height.cm_164, Belt.S, Belt.M)));

        dodaj(new Costume(734).setZdjęcie(1169, 1418).setNazwa("kocica").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween, Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        dodaj(new Costume(735).setZdjęcie(1232).setNazwa("Rzymianin").setDlaPary(39).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.L)));

        dodaj(new Costume(736).setZdjęcie(1235).setNazwa("Posejdon").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setDlaPary(53).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Historyczne).setRozmiar(
                new Size(Height.cm_170, Height.cm_188, Belt.S, Belt.L)));

        dodaj(new Costume(737).setZdjęcie(1233).setNazwa("pszczółka").setDlaPary(13).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.M)));

        dodaj(new Costume(739).setZdjęcie(1230).setNazwa("Leprechaun").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_152, Belt.XS),
                new Size(Height.cm_158, Belt.L),
                new Size(Height.cm_164, Belt.M)));

        dodaj(new Costume(740).setZdjęcie(1242, 1243).setNazwa("Lady Marion").setDlaPary(3).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(741).setZdjęcie(1313).setNazwa("truskawka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Owoce_i_warzywa).setRozmiar(
                new Size(Height.cm_164, Height.cm_182, Belt.S, Belt.XL)));

        dodaj(new Costume(742).setZdjęcie(1326).setNazwa("pastuszek").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setDlaPary(55).setOkazja(Occasion.Jasełka, Occasion.Inne).setKategoria(Category.Bajki, Category.Historyczne).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(743).setZdjęcie(1314).setNazwa("smoking").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Lata_20_i_30).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(744).setZdjęcie(1315).setNazwa("marchewka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Owoce_i_warzywa).setRozmiar(
                new Size(Height.cm_176, Height.cm_194, Belt.S, Belt.XL)));

        dodaj(new Costume(745).setZdjęcie(1328).setNazwa("dworzanin").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_176, Belt.M)));

        dodaj(new Costume(748).setZdjęcie(1323).setNazwa("biedronka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(749).setZdjęcie(1319).setNazwa("smoking").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Lata_20_i_30).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(750).setZdjęcie(1240).setNazwa("Wilma Flinstone").setDlaPary(17).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Inne).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.M),
                new Size(Height.cm_164, Height.cm_176, Belt.L),
                new Size(Height.cm_164, Height.cm_176, Belt.XL)));

        dodaj(new Costume(751).setZdjęcie(1251).setNazwa("cyganka").setDlaPary(19).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.M)));

        dodaj(new Costume(752).setZdjęcie(1252).setNazwa("cyganka").setDlaPary(19).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        dodaj(new Costume(753).setZdjęcie(1288).setNazwa("hipiska").setDlaPary(14).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        dodaj(new Costume(754).setZdjęcie(1278).setNazwa("Rzymianka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(39).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(821).setZdjęcie(1378, 1217).setNazwa("Policjantka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(29).setOkazja(Occasion.Inne).setKategoria(Category.Sexy, Category.Zawody).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        dodaj(new Costume(756).setZdjęcie(1264, 1265).setNazwa("strój do samby czerwony").setDlugaNazwa().setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Inne).setRozmiar(
                new Size(Height.cm_158, Height.cm_170, Belt.XS, Belt.S)));

        dodaj(new Costume(757).setZdjęcie(1265).setNazwa("strój do samby czarny").setDlugaNazwa().setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Inne).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(758).setZdjęcie(1263).setNazwa("strój do samby zielony").setDlugaNazwa().setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Inne).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        dodaj(new Costume(759).setZdjęcie(1226).setNazwa("kowbojka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(2).setOkazja(Occasion.Inne).setKategoria(Category.Dziki_zachód, Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS),
                new Size(Height.cm_164, Height.cm_170, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.L)));

        dodaj(new Costume(760).setZdjęcie(1162).setNazwa("jabłko").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Owoce_i_warzywa).setRozmiar(
                new Size(Height.cm_116, Height.cm_158)));

        dodaj(new Costume(761).setZdjęcie(1320).setNazwa("Wiking").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        dodaj(new Costume(762).setZdjęcie(1277).setNazwa("Japonka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(7).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.L)));

        dodaj(new Costume(763).setZdjęcie(1305).setNazwa("hipiska").setDlaPary(14).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(764).setZdjęcie(1283).setNazwa("chinka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_170, Belt.XS, Belt.S)));

        dodaj(new Costume(765).setZdjęcie(1299).setNazwa("hinduska").setDlaPary(23).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.XS, Belt.S)));

        dodaj(new Costume(766).setZdjęcie(1261, 1267).setNazwa("biedronka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.XS, Belt.S),
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(767).setZdjęcie(1190, 1201).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_158, Height.cm_164, Belt.S, Belt.M),
                new Size(Height.cm_158, Height.cm_164, Belt.M, Belt.L)));

        dodaj(new Costume(768).setZdjęcie(1174).setNazwa("skinhead").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.L)));

        dodaj(new Costume(769).setZdjęcie(1293).setNazwa("turczynka").setDlaPary(11).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_158, Height.cm_164, Belt.S, Belt.M)));

        dodaj(new Costume(770).setZdjęcie(1211).setNazwa("czarny anioł").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(8).setOkazja(Occasion.Halloween, Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(771).setZdjęcie(1212).setNazwa("diablica").setDlaPary(8).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween, Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.M)));

        dodaj(new Costume(772).setZdjęcie(1204).setNazwa("diablica").setDlaPary(8).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(773).setZdjęcie(1286, 1290).setNazwa("szkotka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(27).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.M)));

        dodaj(new Costume(775).setZdjęcie(1296).setNazwa("mieszczka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Historyczne).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L),
                new Size(Height.cm_170, Height.cm_176, Belt.L, Belt.XL),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(776).setZdjęcie(1177).setNazwa("Robin Hood").setDlaPary(3).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Sexy).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(777).setZdjęcie(1173).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_164, Belt.L)));

        dodaj(new Costume(778).setZdjęcie(1171).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_164, Belt.M),
                new Size(Height.cm_164, Belt.L)));

        dodaj(new Costume(779).setZdjęcie(1172, 841).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_158, Belt.XS, Belt.S)));

        dodaj(new Costume(780).setZdjęcie(1193).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_158, Belt.XS, Belt.S)));

        dodaj(new Costume(781).setZdjęcie(1284).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(782).setZdjęcie(1280).setNazwa("dama").setDlaPary(16).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_176, Belt.XL)));

        dodaj(new Costume(783).setZdjęcie(1279).setNazwa("wróżka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_170, Belt.L)));

        dodaj(new Costume(784).setZdjęcie(1333, 1334).setNazwa("kowbojka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(2).setOkazja(Occasion.Inne).setKategoria(Category.Dziki_zachód).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(785).setZdjęcie(1301).setNazwa("agentka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(787).setZdjęcie(1306).setNazwa("pasterka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(55).setOkazja(Occasion.Jasełka, Occasion.Inne).setKategoria(Category.Bajki, Category.Historyczne).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_170, Height.cm_176, Belt.L, Belt.XL)));

        dodaj(new Costume(789).setZdjęcie(1247, 1246).setNazwa("hiszpanka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(52).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S),
                new Size(Height.cm_170, Height.cm_176, Belt.M),
                new Size(Height.cm_170, Height.cm_176, Belt.L)));

        dodaj(new Costume(790).setZdjęcie(1228, 1229).setNazwa("zakonnica").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(10).setOkazja(Occasion.Halloween, Occasion.Inne).setKategoria(Category.Zawody, Category.Inne).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.L)));

        dodaj(new Costume(792).setZdjęcie(1274, 1273).setNazwa("hinduska").setDlaPary(23).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S),
                new Size(Height.cm_170, Height.cm_176, Belt.M),
                new Size(Height.cm_170, Height.cm_176, Belt.L),
                new Size(Height.cm_170, Height.cm_176, Belt.XL)));

        dodaj(new Costume(794).setZdjęcie(1181).setNazwa("pokojówka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_170, Belt.XS, Belt.S)));

        dodaj(new Costume(795).setZdjęcie(1189).setNazwa("czarownica").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Andrzejki, Occasion.Halloween, Occasion.Inne).setKategoria(Category.Bajki, Category.Inne).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(796).setZdjęcie(1178).setNazwa("wilk").setDlaPary(18).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_158, Height.cm_164, Belt.S, Belt.L)));

        dodaj(new Costume(797).setZdjęcie(1266).setNazwa("ośmiornica").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.M, Belt.L)));

        dodaj(new Costume(798).setZdjęcie(1302).setNazwa("toga akademicka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(799).setZdjęcie(1196).setNazwa("biedronka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(800).setZdjęcie(1208).setNazwa("chomik").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.L)));

        dodaj(new Costume(801).setZdjęcie(1294).setNazwa("lis").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.L)));

        dodaj(new Costume(802).setZdjęcie(1262).setNazwa("wilk").setDlaPary(18).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne, Occasion.Halloween).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.L)));

        dodaj(new Costume(629).setZdjęcie(1290).setNazwa("szkot").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setDlaPary(27).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.S),
                new Size(Height.cm_176, Height.cm_182, Belt.L)));

        dodaj(new Costume(535).setZdjęcie(1260).setNazwa("wilk").setDlaPary(18).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Halloween, Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.L)));

        dodaj(new Costume(505).setZdjęcie(1272).setNazwa("jesienne liście").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.L)));

        dodaj(new Costume(487).setZdjęcie(1308).setNazwa("Morticia").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween, Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_176, Belt.S)));

        dodaj(new Costume(478).setZdjęcie(1327).setNazwa("mysz").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Belt.S, Belt.L)));

        dodaj(new Costume(363).setZdjęcie(1309).setNazwa("panterka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.M)));

        dodaj(new Costume(746).setZdjęcie(1224).setNazwa("Robin Hood damski").setDlugaNazwa().setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(3).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(731).setZdjęcie(1224, 1243).setNazwa("Robin Hood męski").setDlugaNazwa().setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setDlaPary(3).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.XS),
                new Size(Height.cm_176, Height.cm_182, Belt.S),
                new Size(Height.cm_176, Height.cm_182, Belt.M),
                new Size(Height.cm_176, Height.cm_182, Belt.L),
                new Size(Height.cm_176, Height.cm_182, Belt.XL)));

        dodaj(new Costume(723).setZdjęcie(1256).setNazwa("Morticia").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween, Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_170, Belt.XS, Belt.S)));

        dodaj(new Costume(678).setZdjęcie(1275).setNazwa("Hermes").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_158, Height.cm_170, Belt.XS, Belt.M)));

        dodaj(new Costume(555).setZdjęcie(1270).setNazwa("rekin").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_182, Height.cm_194, Belt.M, Belt.XL)));

        dodaj(new Costume(511).setZdjęcie(1185).setNazwa("króliczek").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        dodaj(new Costume(500).setZdjęcie(1184).setNazwa("króliczek").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        dodaj(new Costume(475).setZdjęcie(1209).setNazwa("Czerwony Kapturek").setWiek(Age.DZIECKO).setDlugaNazwa().setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        dodaj(new Costume(474).setZdjęcie(1271).setNazwa("Stańczyk").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Historyczne).setRozmiar(
                new Size(Height.cm_176, Height.cm_188, Belt.M, Belt.XL)));

        dodaj(new Costume(454).setZdjęcie(1192).setNazwa("gorset").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        dodaj(new Costume(446).setZdjęcie(1194).setNazwa("gorset").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        dodaj(new Costume(443).setZdjęcie(1188).setNazwa("gorset").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        dodaj(new Costume(432).setZdjęcie(1182).setNazwa("kotek").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween, Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_128)));

        dodaj(new Costume(427).setZdjęcie(1175).setNazwa("Monster High Skelita").setDlugaNazwa().setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Bajki, Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(424).setZdjęcie(1176).setNazwa("Monster High Frankie Stein").setDlugaNazwa().setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Bajki, Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_128)));

        dodaj(new Costume(413).setZdjęcie(1165).setNazwa("kościotrup").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_128, Height.cm_134)));

        dodaj(new Costume(411).setZdjęcie(1200).setNazwa("Monster High Drakulaura Sweet").setDlugaNazwa().setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Bajki, Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(410).setZdjęcie(1340).setNazwa("Szkot").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setDlaPary(27).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        dodaj(new Costume(408).setZdjęcie(1186).setNazwa("Monster High Cleo De Nile").setDlugaNazwa().setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Bajki, Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(405).setZdjęcie(1179).setNazwa("Monster High Abby").setDlugaNazwa().setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Bajki, Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(404).setZdjęcie(1216).setNazwa("rybka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_134, Height.cm_140)));

        dodaj(new Costume(403).setZdjęcie(1167).setNazwa("owieczka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Jasełka).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_128)));

        dodaj(new Costume(398).setZdjęcie(1164).setNazwa("kościotrup").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(396).setZdjęcie(1183).setNazwa("biedronka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_134)));

        dodaj(new Costume(393).setZdjęcie(1187).setNazwa("Hello Kitty").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_128)));

        dodaj(new Costume(380).setZdjęcie(1203).setNazwa("pszczółka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_110),
                new Size(Height.cm_128)));

        dodaj(new Costume(368).setZdjęcie(1198, 1197).setNazwa("dynia").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116)));

        dodaj(new Costume(360).setZdjęcie(1195).setNazwa("czarownica").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Andrzejki, Occasion.Halloween).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_116)));

        dodaj(new Costume(324).setZdjęcie(1205).setNazwa("muchomor").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_152)));

        dodaj(new Costume(314).setZdjęcie(1214).setNazwa("ptak").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_110, Height.cm_146)));

        dodaj(new Costume(272).setZdjęcie(1180).setNazwa("biedronka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128)));

        dodaj(new Costume(236).setZdjęcie(1191).setNazwa("biedronka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        dodaj(new Costume(215).setZdjęcie(1218).setNazwa("Zorro").setWiek(Age.DZIECKO).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(213).setZdjęcie(1213).setNazwa("rybka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        dodaj(new Costume(192).setZdjęcie(1269).setNazwa("Czerwony Kapturek").setDlaPary(18).setDlugaNazwa().setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_152, Height.cm_158, Belt.XS, Belt.S),
                new Size(Height.cm_158, Height.cm_164, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.L),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.XL)));

        dodaj(new Costume(186).setZdjęcie(1291).setNazwa("Królewna").setDlaPary(22).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Historyczne).setRozmiar(
                new Size(Height.cm_170, Belt.S),
                new Size(Height.cm_170, Belt.L)));

        dodaj(new Costume(185).setZdjęcie(1253, 1254).setNazwa("kombinezon").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(175).setZdjęcie(1282).setNazwa("Kapitan").setDlaPary(28).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Zawody).setRozmiar(
                new Size(Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(145).setZdjęcie(1250, 1249).setNazwa("więzień").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setDlaPary(29).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_182, Height.cm_194, Belt.S, Belt.M),
                new Size(Height.cm_182, Height.cm_194, Belt.L, Belt.XL)));

        dodaj(new Costume(144).setZdjęcie(1229).setNazwa("Ksiądz").setDlaPary(10).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Film_i_scena, Category.Zawody).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S),
                new Size(Height.cm_176, Height.cm_182, Belt.M),
                new Size(Height.cm_182, Height.cm_188, Belt.L)));

        dodaj(new Costume(143).setZdjęcie(1289).setNazwa("kocica").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Andrzejki, Occasion.Halloween).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(142).setZdjęcie(1339).setNazwa("kotek").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Andrzejki, Occasion.Halloween).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.L)));

        dodaj(new Costume(141).setZdjęcie(1241, 1239).setNazwa("Fred Flinstone").setDlaPary(17).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_182, Height.cm_194, Belt.M, Belt.XL)));

        dodaj(new Costume(140).setZdjęcie(1334, 1331).setNazwa("kowboj").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setDlaPary(2).setOkazja(Occasion.Inne).setKategoria(Category.Dziki_zachód, Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.XS, Belt.S),
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.M),
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L)));

        dodaj(new Costume(139).setZdjęcie(1341).setNazwa("Mary Poppins").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.M),
                new Size(Height.cm_170, Height.cm_176, Belt.L),
                new Size(Height.cm_170, Height.cm_176, Belt.XXL)));

        dodaj(new Costume(138).setZdjęcie(1347).setNazwa("kufel piwa").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.XL)));

        dodaj(new Costume(133).setZdjęcie(1345).setNazwa("disco").setDlaPary(20).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.S),
                new Size(Height.cm_176, Height.cm_182, Belt.M)));

        dodaj(new Costume(132).setZdjęcie(1343).setNazwa("Meksykanin").setDlaPary(4).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_182, Belt.S, Belt.M)));

        dodaj(new Costume(131).setZdjęcie(1338).setNazwa("Cezar").setDlaPary(39).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Historyczne, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        dodaj(new Costume(128).setZdjęcie(1335).setNazwa("Egipcjanin").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setDlaPary(65).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Historyczne, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        dodaj(new Costume(127).setZdjęcie(1324).setNazwa("kierowca rajdowy").setDlugaNazwa().setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.M),
                new Size(Height.cm_170, Height.cm_182, Belt.L, Belt.XL)));

        dodaj(new Costume(126).setZdjęcie(1292).setNazwa("marynarz Papaj").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.L)));

        dodaj(new Costume(124).setZdjęcie(1300).setNazwa("Samuraj").setDlugaNazwa().setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setDlaPary(7).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L)));

        dodaj(new Costume(121).setZdjęcie(1255).setNazwa("Egipcjanin").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        dodaj(new Costume(119).setZdjęcie(1245, 1246).setNazwa("Hiszpan").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setDlaPary(52).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Narodowościowe, Category.Zawody).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.M),
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L)));

        dodaj(new Costume(117).setZdjęcie(1257).setNazwa("lis").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.XL)));

        dodaj(new Costume(116).setZdjęcie(1281).setNazwa("Spiderman").setDlaPary(33).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Super_bohaterowie).setRozmiar(
                new Size(Height.cm_176, Height.cm_188, Belt.S, Belt.L)));

        dodaj(new Costume(115).setZdjęcie(1298).setNazwa("Aladyn").setDlaPary(11).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.XS, Belt.S)));

        dodaj(new Costume(113).setZdjęcie(1344).setNazwa("disco").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setDlaPary(20).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.M)));

        dodaj(new Costume(111).setZdjęcie(1287).setNazwa("Grabarz").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Halloween, Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_176, Height.cm_188, Belt.S, Belt.M),
                new Size(Height.cm_176, Height.cm_188, Belt.L)));

        dodaj(new Costume(107).setZdjęcie(1337).setNazwa("lekarz").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_176, Height.cm_188, Belt.S, Belt.M)));

        dodaj(new Costume(106).setZdjęcie(1285).setNazwa("pilot").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setDlaPary(30).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L)));

        dodaj(new Costume(105).setZdjęcie(1317).setNazwa("król").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setDlaPary(22).setOkazja(Occasion.Jasełka).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_182, Height.cm_194, Belt.L, Belt.XXL)));

        dodaj(new Costume(100).setZdjęcie(1348).setNazwa("dozorca").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_176, Belt.S, Belt.M)));

        dodaj(new Costume(99).setZdjęcie(1307).setNazwa("Pinokio").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_182, Height.cm_194, Belt.M, Belt.L)));

        dodaj(new Costume(95).setZdjęcie(1310).setNazwa("żołnierz").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(85).setZdjęcie(1248, 1249).setNazwa("policjantka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(29).setOkazja(Occasion.Inne).setKategoria(Category.Sexy, Category.Zawody).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.XS, Belt.S),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(77).setZdjęcie(1222, 1221, 1223).setNazwa("Hawajczyk").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setDlaPary(35).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_158, Height.cm_164, Belt.XS, Belt.S),
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.L),
                new Size(Height.cm_182, Height.cm_194, Belt.L, Belt.XXL)));

        dodaj(new Costume(51).setZdjęcie(1422, 1215).setNazwa("żołnierz").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(49).setZdjęcie(1258).setNazwa("zebra").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.L)));

        dodaj(new Costume(42).setZdjęcie(1330).setNazwa("ptak").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKO_MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.L)));

        dodaj(new Costume(35).setZdjęcie(1322).setNazwa("policjant").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setDlaPary(29).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_176, Height.cm_182, Belt.XL, Belt.XXL)));

        dodaj(new Costume(32).setZdjęcie(1312).setNazwa("Elvis Presley").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Lata_70_i_80).setRozmiar(
                new Size(Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(15).setZdjęcie(1311).setNazwa("Szewc Dratewka").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_188, Height.cm_194, Belt.L, Belt.XXL)));

        dodaj(new Costume(290).setZdjęcie(1043).setNazwa("Żołnierz Rzymski").setDlaPary(39).setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne).setRozmiar(
                new Size(Height.cm_170, Belt.S)));

        dodaj(new Costume(273).setZdjęcie(1083).setNazwa("piratka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(1).setOkazja(Occasion.Inne).setKategoria(Category.Pirackie).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(224).setZdjęcie(1016).setNazwa("cygan").setDlaPary(19).setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_176, Height.cm_188, Belt.S, Belt.M),
                new Size(Height.cm_176, Height.cm_188, Belt.M, Belt.L),
                new Size(Height.cm_176, Height.cm_188, Belt.L, Belt.XL),
                new Size(Height.cm_176, Height.cm_188, Belt.XL, Belt.XXL)));

        dodaj(new Costume(188).setZdjęcie(960).setNazwa("Książe").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setDlaPary(16).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.M),
                new Size(Height.cm_182, Height.cm_188, Belt.L, Belt.XL)));

        dodaj(new Costume(179).setZdjęcie(1011).setNazwa("piratka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(1).setOkazja(Occasion.Inne).setKategoria(Category.Pirackie, Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.XS, Belt.M)));

        dodaj(new Costume(134).setZdjęcie(1015).setNazwa("piratka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(1).setOkazja(Occasion.Inne).setKategoria(Category.Pirackie, Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.XS, Belt.M)));

        dodaj(new Costume(464).setZdjęcie(1273).setNazwa("hindus").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setDlaPary(23).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.M),
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L),
                new Size(Height.cm_182, Height.cm_188, Belt.L, Belt.XL)));

        dodaj(new Costume(65).setZdjęcie(1244).setNazwa("pirat").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setDlaPary(1).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Historyczne, Category.Pirackie).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L),
                new Size(Height.cm_182, Height.cm_188, Belt.L, Belt.XL),
                new Size(Height.cm_182, Height.cm_188, Belt.XL, Belt.XXL)));

        dodaj(new Costume(118).setZdjęcie(1244).setNazwa("piratka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(1).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Historyczne, Category.Pirackie).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.M)));

        dodaj(new Costume(120).setZdjęcie(1227).setNazwa("bawarczyk").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setDlaPary(41).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.M),
                new Size(Height.cm_170, Height.cm_182, Belt.L, Belt.XL)));

        dodaj(new Costume(444).setZdjęcie(1227).setNazwa("bawarka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(41).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.L, Belt.XL)));

        dodaj(new Costume(803).setZdjęcie(1427, 1349).setNazwa("Evil Mad Hatter").setWiek(Age.DOROSŁY).setPłeć(Sex.MĘSKI).setDlaPary(9).setOkazja(Occasion.Halloween).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.M),
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L),
                new Size(Height.cm_182, Height.cm_188, Belt.L, Belt.XL)));

        dodaj(new Costume(804).setZdjęcie(1350).setNazwa("Alicja z Krainy Czarów").setDlugaNazwa().setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(805).setZdjęcie(1351).setNazwa("Piratka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(1).setOkazja(Occasion.Inne).setKategoria(Category.Pirackie, Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        dodaj(new Costume(806).setZdjęcie(1352).setNazwa("Policjantka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(29).setOkazja(Occasion.Inne).setKategoria(Category.Sexy, Category.Zawody).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XL)));

        dodaj(new Costume(807).setZdjęcie(1353, 1354, 1355, 1356).setNazwa("sukienka lata XX-te").setDlugaNazwa().setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(37).setOkazja(Occasion.Inne).setKategoria(Category.Lata_20_i_30, Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.S),
                new Size(Height.cm_164, Height.cm_176, Belt.M),
                new Size(Height.cm_164, Height.cm_176, Belt.L),
                new Size(Height.cm_164, Height.cm_176, Belt.XL)));

        dodaj(new Costume(808).setZdjęcie(1357, 1358).setNazwa("Hipiska").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(14).setOkazja(Occasion.Inne).setKategoria(Category.Lata_70_i_80, Category.Sexy).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.XS, Belt.S),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(809).setZdjęcie(1359, 1360).setNazwa("Wampirzyca").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(9).setOkazja(Occasion.Halloween).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(810).setZdjęcie(1361, 1362).setNazwa("Wampirzyca").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(9).setOkazja(Occasion.Halloween).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(811).setZdjęcie(1365, 1366).setNazwa("Kopciuszek").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(26).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(812).setZdjęcie(1367).setNazwa("Greczynka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Sexy).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        dodaj(new Costume(813).setZdjęcie(1368).setNazwa("Wojowniczka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(39).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Sexy).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(814).setZdjęcie(1369).setNazwa("Ninja").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Sexy).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(815).setZdjęcie(1370).setNazwa("Smoczyca").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        dodaj(new Costume(816).setZdjęcie(1371, 1372).setNazwa("Motyl").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(817).setZdjęcie(1373).setNazwa("uczennica").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(818).setZdjęcie(1374, 1375).setNazwa("Jaskiniowiec").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(17).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(819).setZdjęcie(1376).setNazwa("Piratka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(1).setOkazja(Occasion.Inne).setKategoria(Category.Pirackie, Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(820).setZdjęcie(1377).setNazwa("greczynka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(76).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(822).setZdjęcie(1379).setNazwa("wojowniczka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(39).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        dodaj(new Costume(823).setZdjęcie(1380).setNazwa("smok").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(824).setZdjęcie(1381, 1382).setNazwa("smok").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(825).setZdjęcie(1383).setNazwa("piratka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(1).setOkazja(Occasion.Inne).setKategoria(Category.Pirackie, Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.XL, Belt.XXL)));

        dodaj(new Costume(826).setZdjęcie(1384).setNazwa("mieszczka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Historyczne).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(827).setZdjęcie(1385).setNazwa("greczynka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(76).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.L, Belt.XL)));

        dodaj(new Costume(828).setZdjęcie(1386, 1387).setNazwa("smok").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_110, Height.cm_116),
                new Size(Height.cm_122, Height.cm_128)));

        dodaj(new Costume(829).setZdjęcie(1388, 1389).setNazwa("zebra").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_122, Height.cm_128),
                new Size(Height.cm_134, Height.cm_140),
                new Size(Height.cm_146, Height.cm_152)));

        dodaj(new Costume(830).setZdjęcie(1390).setNazwa("policjantka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zawody).setRozmiar(
                new Size(Height.cm_110, Height.cm_116),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        dodaj(new Costume(831).setZdjęcie(1391, 1392, 1393).setNazwa("lew").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        dodaj(new Costume(832).setZdjęcie(1394, 1395).setNazwa("wampirzyca").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Bajki, Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_146),
                new Size(Height.cm_152)));

        dodaj(new Costume(833).setZdjęcie(1396, 1397).setNazwa("piratka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Pirackie).setRozmiar(
                new Size(Height.cm_152)));

        dodaj(new Costume(834).setZdjęcie(1398, 1399).setNazwa("Robin Hood").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(3).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena, Category.Sexy).setRozmiar(
                new Size(Height.cm_158, Height.cm_164, Belt.S)));

        dodaj(new Costume(835).setZdjęcie(1400).setNazwa("jaskiniowiec").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_146),
                new Size(Height.cm_152)));

        dodaj(new Costume(836).setZdjęcie(1401).setNazwa("czarownica").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Bajki).setRozmiar(
                new Size(Height.cm_140),
                new Size(Height.cm_146)));

        dodaj(new Costume(837).setZdjęcie(1403).setNazwa("Czerwony Kapturek").setWiek(Age.DOROSŁY).setDlugaNazwa().setPłeć(Sex.DAMSKI).setDlaPary(18).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(838).setZdjęcie(1405).setNazwa("Robin Hood").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(3).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.L),
                new Size(Height.cm_164, Height.cm_170, Belt.XL)));

        dodaj(new Costume(839).setZdjęcie(1406).setNazwa("Panterka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(840).setZdjęcie(1407).setNazwa("Tygrys").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy, Category.Zwierzęta).setRozmiar(
                new Size(Height.cm_170, Belt.S, Belt.M)));

        dodaj(new Costume(841).setZdjęcie(1408).setNazwa("Króliczek").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.L)));

        dodaj(new Costume(842).setZdjęcie(1409).setNazwa("cyganka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(19).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        dodaj(new Costume(848).setZdjęcie(1424).setNazwa("cigarettes girl").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        dodaj(new Costume(849).setZdjęcie(1428).setNazwa("Różowy potwór").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_152)));

        dodaj(new Costume(850).setZdjęcie(1429).setNazwa("Fioletowy potwór").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Bajki, Category.Film_i_scena).setRozmiar(
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        dodaj(new Costume(851).setZdjęcie(1432).setNazwa("Zombie").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Halloween).setKategoria(Category.Inne).setRozmiar(
                new Size(Height.cm_140),
                new Size(Height.cm_146)));

        dodaj(new Costume(852).setZdjęcie(1435).setNazwa("piratka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Pirackie).setRozmiar(
                new Size(Height.cm_146, Height.cm_152),
                new Size(Height.cm_158, Height.cm_164),
                new Size(Height.cm_152, Height.cm_158)));

        dodaj(new Costume(853).setZdjęcie(1437).setNazwa("Cyganka").setWiek(Age.DZIECKO).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Narodowościowe).setRozmiar(
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        dodaj(new Costume(854).setZdjęcie(1438).setNazwa("Pokojówka").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Inne).setKategoria(Category.Sexy).setRozmiar(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L),
                new Size(Height.cm_170, Height.cm_176, Belt.L, Belt.XL)));

        dodaj(new Costume(855).setZdjęcie(1440).setNazwa("Cyganka").setWiek(Age.DOROSŁY).setDlaPary(19).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Andrzejki, Occasion.Inne).setKategoria(Category.Narodowościowe, Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.XL, Belt.XXL)));

        dodaj(new Costume(856).setZdjęcie(1441).setNazwa("Czerwona Królowa").setDlugaNazwa().setWiek(Age.DOROSŁY).setDlaPary(22).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Andrzejki, Occasion.Inne).setKategoria(Category.Bajki, Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.XL, Belt.XXL)));

        dodaj(new Costume(857).setZdjęcie(1442).setNazwa("Kleopatra").setWiek(Age.DOROSŁY).setPłeć(Sex.DAMSKI).setDlaPary(65).setOkazja(Occasion.Inne).setKategoria(Category.Historyczne, Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.XL, Belt.XXL)));

        dodaj(new Costume(858).setZdjęcie(1443).setNazwa("Czerwony Kapturek").setDlugaNazwa().setWiek(Age.DOROSŁY).setDlaPary(18).setPłeć(Sex.DAMSKI).setOkazja(Occasion.Andrzejki, Occasion.Inne).setKategoria(Category.Bajki, Category.Sexy).setRozmiar(
                new Size(Height.cm_164, Height.cm_176, Belt.XL, Belt.XXL)));

    }

    private void dodaj(Costume s) {
        stroje.add(s);
    }

    public ArrayList<Costume> getStroje() {
        return stroje;
    }
}
