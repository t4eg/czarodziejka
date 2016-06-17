package pl.com.czarodziejka.czarodziejka.client.pages.search.m;

import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Category;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Height;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.CostumeComparator;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Costume;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Age;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Belt;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Photo;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Occasion;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Size;
import pl.com.czarodziejka.czarodziejka.client.pages.search.m.costume.Sex;
import com.google.gwt.user.client.Timer;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Adam Mazur
 */
public class Database {

    private static Database instance;
    private ArrayList<Costume> costumes = new ArrayList<>();

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
                Collections.sort(instance.costumes, new CostumeComparator());
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
        add(new Costume(1).setPhotos(1).setName("pirat").setForPair(1).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.PIRATES).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.L),
                new Size(Height.cm_176, Height.cm_182, Belt.M),
                new Size(Height.cm_176, Height.cm_182, Belt.S)));

        add(new Costume(2).setPhotos(2).setName("pirat").setForPair(1).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.PIRATES).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.S),
                new Size(Height.cm_182, Height.cm_188, Belt.M)));

        add(new Costume(3).setPhotos(3).setName("muszkieter").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_170, Belt.S),
                new Size(Height.cm_170, Belt.XL)));

        add(new Costume(5).setPhotos(5).setName("indianin").setForPair(2).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.WILD_WEST, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.M),
                new Size(Height.cm_182, Height.cm_188, Belt.L),
                new Size(Height.cm_182, Height.cm_188, Belt.XL),
                new Size(Height.cm_182, Height.cm_188, Belt.XXL)));

        add(new Costume(6).setPhotos(6).setName("Meksykanin").setForPair(4).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.WILD_WEST).setSizes(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.XXL)));

        add(new Costume(8).setPhotos(8).setName("Arab").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(9).setPhotos(9).setName("Żołnierz Rzymski").setForPair(39).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_170, Height.cm_182, Belt.M),
                new Size(Height.cm_170, Height.cm_182, Belt.L),
                new Size(Height.cm_170, Height.cm_182, Belt.XL),
                new Size(Height.cm_170, Height.cm_182, Belt.S)));

        add(new Costume(10).setPhotos(10).setName("Kowboj").setForPair(2).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.MOVIE_STAGE, Category.WILD_WEST).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.M),
                new Size(Height.cm_176, Height.cm_182, Belt.L),
                new Size(Height.cm_176, Height.cm_182, Belt.S)));

        add(new Costume(11).setPhotos(11).setName("traper").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.WILD_WEST).setSizes(
                new Size(Height.cm_170, Height.cm_194, Belt.S, Belt.XXL)));

        add(new Costume(12).setPhotos(12, 131).setName("Samuraj").setForPair(7).setAge(Age.ADULT).setIsLongName().setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_176, Belt.M),
                new Size(Height.cm_176, Belt.L),
                new Size(Height.cm_176, Belt.S)));

        add(new Costume(13).setPhotos(13).setName("rycerz").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.M),
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L),
                new Size(Height.cm_176, Height.cm_182, Belt.L, Belt.XL)));

        add(new Costume(16).setPhotos(16).setName("diabeł").setForPair(8).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Halloween, Occasion.Jasełka).setCategories(Category.MOVIE_STAGE, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.L)));

        add(new Costume(17).setPhotos(17).setName("Drakula").setForPair(9).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Halloween).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.L)));

        add(new Costume(18).setPhotos(18).setName("truskawka").setAge(Age.CHILD_ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FRUITS_VEGETABLES).setSizes(
                new Size(Height.cm_116, Height.cm_158, Belt.S, Belt.L)));

        add(new Costume(19).setPhotos(19).setName("Drakula").setForPair(9).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Halloween).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_170, Height.cm_182, Belt.S),
                new Size(Height.cm_170, Height.cm_182, Belt.M),
                new Size(Height.cm_170, Height.cm_182, Belt.L),
                new Size(Height.cm_170, Height.cm_176, Belt.XL)));

        add(new Costume(20).setPhotos(20).setName("burak").setAge(Age.CHILD_ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FRUITS_VEGETABLES).setSizes(
                new Size(Height.cm_128, Height.cm_170, Belt.S, Belt.XL)));

        add(new Costume(21).setPhotos(21).setName("Śmierć").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_176, Height.cm_188, Belt.S, Belt.XXL)));

        add(new Costume(22).setPhotos(22).setName("Fiona").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_158, Height.cm_164, Belt.S),
                new Size(Height.cm_158, Height.cm_164, Belt.XL)));

        add(new Costume(23).setPhotos(23).setName("Józef").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_176, Height.cm_188, Belt.S, Belt.XXL),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.XL)));

        add(new Costume(24).setPhotos(24).setName("mnich").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.MOVIE_STAGE, Category.PROFESSIONS).setSizes(
                new Size(Height.cm_170, Height.cm_182, Belt.L, Belt.XXL),
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.XL)));

        add(new Costume(25).setPhotos(25).setName("ksiądz").setForPair(10).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.MOVIE_STAGE, Category.PROFESSIONS).setSizes(
                new Size(Height.cm_170, Height.cm_182, Belt.M, Belt.L)));

        add(new Costume(26).setPhotos(26).setName("książe wschodni").setForPair(11).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.L, Belt.XXL),
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.XL)));

        add(new Costume(27).setPhotos(27).setName("clown").setForPair(12).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_182, Height.cm_194, Belt.L, Belt.XXL),
                new Size(Height.cm_182, Height.cm_194, Belt.M, Belt.XL)));

        add(new Costume(28).setPhotos(28).setName("Batman").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.SUPER_HEROES).setSizes(
                new Size(Height.cm_176, Height.cm_188, Belt.L),
                new Size(Height.cm_176, Height.cm_188, Belt.M),
                new Size(Height.cm_176, Height.cm_188, Belt.S),
                new Size(Height.cm_176, Height.cm_188, Belt.XL)));

        add(new Costume(29).setPhotos(29).setName("Spiderman").setForPair(33).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.SUPER_HEROES).setSizes(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.M)));

        add(new Costume(31).setPhotos(31).setName("hipis").setForPair(14).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.S),
                new Size(Height.cm_182, Height.cm_194, Belt.M)));

        add(new Costume(36).setPhotos(36).setName("zombie").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_170, Height.cm_182, Belt.M, Belt.L)));

        add(new Costume(39).setPhotos(39).setName("jaskiniowiec").setForPair(17).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_170, Height.cm_182, Belt.M, Belt.L)));

        add(new Costume(40).setPhotos(40, 41).setName("zając").setAge(Age.ADULT).setForPair(18).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_158, Height.cm_164, Belt.S, Belt.M),
                new Size(Height.cm_170, Height.cm_182, Belt.XXL)));

        add(new Costume(44).setPhotos(44).setName("tancerka turecka").setForPair(11).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_158, Height.cm_164, Belt.XS, Belt.S)));

        add(new Costume(45).setPhotos(45, 46).setName("tygrys").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.XL)));

        add(new Costume(47).setPhotos(47).setName("lew").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.XL)));

        add(new Costume(48).setPhotos(48).setName("sowa").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.XXL),
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.XL)));

        add(new Costume(50).setPhotos(50).setName("Żaba").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.XL),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.L),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.XL),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.XL)));

        add(new Costume(53).setPhotos(53).setName("czarownica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Halloween).setCategories(Category.MOVIE_STAGE, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.L, Belt.XL)));

        add(new Costume(55).setPhotos(55).setName("wiosna").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(56).setPhotos(56).setName("czarownica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween, Occasion.Andrzejki).setCategories(Category.MOVIE_STAGE, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_158, Height.cm_170, Belt.S),
                new Size(Height.cm_158, Height.cm_170, Belt.M)));

        add(new Costume(59).setPhotos(59).setName("hipiska").setForPair(14).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.L)));

        add(new Costume(60).setPhotos(60).setName("hipiska").setForPair(14).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.L)));

        add(new Costume(62).setPhotos(62).setName("mieszczka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        add(new Costume(64).setPhotos(64).setName("Disco").setForPair(20).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.YEARS_70_80).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.L)));

        add(new Costume(66).setPhotos(66).setName("czarownica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Halloween).setCategories(Category.MOVIE_STAGE, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.L),
                new Size(Height.cm_170, Height.cm_176, Belt.XL)));

        add(new Costume(67).setPhotos(67).setName("czarownica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Halloween).setCategories(Category.MOVIE_STAGE, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.M)));

        add(new Costume(68).setPhotos(68).setName("Królewna Śnieżka").setForPair(21).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.L),
                new Size(Height.cm_164, Height.cm_170, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.XL)));

        add(new Costume(69).setPhotos(1032).setName("dama").setForPair(16).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.M)));

        add(new Costume(70).setPhotos(1138).setName("dama").setForPair(16).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S)));

        add(new Costume(71).setPhotos(71).setName("szlachecki").setForPair(15).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.MOVIE_STAGE, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.S),
                new Size(Height.cm_164, Height.cm_176, Belt.M),
                new Size(Height.cm_164, Height.cm_176, Belt.L),
                new Size(Height.cm_164, Height.cm_176, Belt.XL)));

        add(new Costume(73).setPhotos(73).setName("suknia z Dzikiego zachodu").setAge(Age.ADULT).setIsLongName().setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        add(new Costume(75).setPhotos(75).setName("cyganka").setForPair(19).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_158, Height.cm_170, Belt.S)));

        add(new Costume(82).setPhotos(82).setName("anioł").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Jasełka).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.L),
                new Size(Height.cm_164, Height.cm_170, Belt.M),
                new Size(Height.cm_158, Height.cm_164, Belt.S),
                new Size(Height.cm_158, Height.cm_164, Belt.M)));

        add(new Costume(86).setPhotos(86).setName("clown").setForPair(12).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.XL)));

        add(new Costume(90).setPhotos(90).setName("spódnica rock and roll").setAge(Age.ADULT).setIsLongName().setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_50_60).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.L)));

        add(new Costume(92).setPhotos(92).setName("hinduska").setForPair(23).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(93).setPhotos(93).setName("hipiska").setForPair(14).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(96).setPhotos(96).setName("czarownica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Halloween).setCategories(Category.MOVIE_STAGE, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.L)));

        add(new Costume(102).setPhotos(102).setName("tancerka turecka").setForPair(11).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.M)));

        add(new Costume(104).setPhotos(1141).setName("szlachecki").setForPair(15).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.HISTORICAL, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_158, Height.cm_164, Belt.S)));

        add(new Costume(112).setPhotos(112).setName("cyganka").setForPair(19).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(122).setPhotos(122).setName("cyganka").setForPair(19).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        add(new Costume(123).setPhotos(1150).setName("dama").setForPair(16).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        add(new Costume(130).setPhotos(129).setName("kontusz szlachecki").setForPair(15).setIsLongName().setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.XL)));

        add(new Costume(146).setPhotos(148, 150).setName("Michael Jackson").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.YEARS_70_80).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134)));

        add(new Costume(147).setPhotos(149).setName("cyganka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_146, Height.cm_152)));

        add(new Costume(148).setPhotos(151).setName("pastuszek").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.HISTORICAL, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146)));

        add(new Costume(149).setPhotos(153).setName("pastuszek").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.HISTORICAL, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140)));

        add(new Costume(150).setPhotos(154).setName("Józef").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_98),
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(151).setPhotos(152).setName("diablica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween, Occasion.Jasełka).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(152).setPhotos(155, 156).setName("król").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Jasełka).setCategories(Category.HISTORICAL, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116, Height.cm_122)));

        add(new Costume(153).setPhotos(157, 158).setName("szlachcic").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.HISTORICAL, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_146),
                new Size(Height.cm_158),
                new Size(Height.cm_164)));

        add(new Costume(154).setPhotos(159).setName("książe").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(155).setPhotos(160).setName("kosmonauta").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(156).setPhotos(161).setName("strażak").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128)));

        add(new Costume(157).setPhotos(162, 163).setName("anioł").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.OTHERS).setSizes(
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

        add(new Costume(158).setPhotos(164).setName("duch").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116)));

        add(new Costume(159).setPhotos(165, 166).setName("Piotruś Pan").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(160).setPhotos(167, 168).setName("król").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.HISTORICAL, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(161).setPhotos(169, 170).setName("dworzanin").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(162).setPhotos(171, 172).setName("diabeł").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_134),
                new Size(Height.cm_122)));

        add(new Costume(163).setPhotos(173).setName("superman").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES, Category.SUPER_HEROES).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140)));

        add(new Costume(164).setPhotos(174).setName("góral").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.NATIONALISTIC, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(165).setPhotos(175).setName("góral").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.NATIONALISTIC, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(166).setPhotos(176, 177).setName("krakowiak").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146),
                new Size(Height.cm_152)));

        add(new Costume(167).setPhotos(178, 179).setName("król").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(168).setPhotos(180, 181).setName("król").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(169).setPhotos(182, 183).setName("zając").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(170).setPhotos(184, 185).setName("rycerz").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_104),
                new Size(Height.cm_110)));

        add(new Costume(172).setPhotos(189).setName("rekin").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122)));

        add(new Costume(173).setPhotos(190, 191, 192, 193).setName("wilk").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116, Height.cm_122)));

        add(new Costume(174).setPhotos(194, 195).setName("małpka").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_98),
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_146)));

        add(new Costume(176).setPhotos(196).setName("czarownica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116, Height.cm_122)));

        add(new Costume(177).setPhotos(197, 198).setName("lis").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(178).setPhotos(199, 200).setName("syrenka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(181).setPhotos(203).setName("gąska").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_122)));

        add(new Costume(182).setPhotos(204, 205).setName("kurczątko").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(183).setPhotos(206, 208, 313).setName("hiszpanka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146)));

        add(new Costume(187).setPhotos(211).setName("Jasmina").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_140)));

        add(new Costume(189).setPhotos(213).setName("ninja").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_98),
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146)));

        add(new Costume(190).setPhotos(214, 216).setName("dama").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_140),
                new Size(Height.cm_128)));

        add(new Costume(191).setPhotos(217).setName("suknia wizytowa").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_128)));

        add(new Costume(193).setPhotos(218).setName("diablica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_152)));

        add(new Costume(194).setPhotos(219).setName("hiszpanka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146)));

        add(new Costume(195).setPhotos(220, 222).setName("Łabędź").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_140, Height.cm_158)));

        add(new Costume(196).setPhotos(221).setName("suknia wizytowa").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_128),
                new Size(Height.cm_146)));

        add(new Costume(197).setPhotos(224, 226).setName("diablica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(198).setPhotos(225).setName("suknia wizytowa").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_128),
                new Size(Height.cm_146)));

        add(new Costume(221).setPhotos(228).setName("indyk").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(201).setPhotos(231).setName("dama").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(202).setPhotos(232, 234).setName("krówka").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_122, Height.cm_128)));

        add(new Costume(203).setPhotos(236).setName("wróżka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116)));

        add(new Costume(205).setPhotos(238, 240).setName("kura").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(207).setPhotos(242).setName("czarownica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(208).setPhotos(243).setName("czarownica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        add(new Costume(209).setPhotos(244).setName("pająk").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Halloween).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_104)));

        add(new Costume(211).setPhotos(246).setName("czarownica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(212).setPhotos(247).setName("cyganka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_146, Height.cm_152)));

        add(new Costume(214).setPhotos(248, 250).setName("bocian").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(216).setPhotos(252).setName("byk").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(217).setPhotos(254, 256).setName("czarownica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(218).setPhotos(255).setName("disco").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_146)));

        add(new Costume(219).setPhotos(257, 328).setName("motyl").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140)));

        add(new Costume(220).setPhotos(259).setName("piratka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.PIRATES).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(222).setPhotos(new Photo(262, false), new Photo(264, true)).setName("niedźwiadek").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(223).setPhotos(263).setName("piratka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.PIRATES).setSizes(
                new Size(Height.cm_140)));

        add(new Costume(225).setPhotos(261).setName("Disco").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(226).setPhotos(266, 268).setName("czarownica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        add(new Costume(227).setPhotos(267).setName("syrenka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_128)));

        add(new Costume(229).setPhotos(270).setName("Żaba").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_98),
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_152, Height.cm_158)));

        add(new Costume(230).setPhotos(271).setName("sukienka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_20_30).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        add(new Costume(231).setPhotos(272, 274).setName("lew").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_152, Height.cm_158)));

        add(new Costume(232).setPhotos(273).setName("hiszpanka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146)));

        add(new Costume(233).setPhotos(275).setName("cyganka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_140)));

        add(new Costume(234).setPhotos(277).setName("jasmina").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(235).setPhotos(281).setName("jasmina").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(237).setPhotos(278).setName("orzeł").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(238).setPhotos(279).setName("disco").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_152)));

        add(new Costume(239).setPhotos(280, 282).setName("wiosna").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(240).setPhotos(283).setName("disco").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_146),
                new Size(Height.cm_152)));

        add(new Costume(241).setPhotos(new Photo(284, Boolean.TRUE), new Photo(286, Boolean.FALSE)).setName("wąż").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_140)));

        add(new Costume(242).setPhotos(285).setName("dama").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(243).setPhotos(287).setName("królowa").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        add(new Costume(244).setPhotos(288).setName("wróżka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(245).setPhotos(289).setName("dama").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(247).setPhotos(297).setName("dama").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_128)));

        add(new Costume(248).setPhotos(290, 292).setName("indianka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(249).setPhotos(291).setName("królowa").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(250).setPhotos(294, 296).setName("Disco").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_122)));

        add(new Costume(251).setPhotos(295).setName("syrenka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.PIRATES).setSizes(
                new Size(Height.cm_140)));

        add(new Costume(252).setPhotos(298, 300).setName("motyl").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(253).setPhotos(299).setName("dama").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_152)));

        add(new Costume(254).setPhotos(301).setName("dama").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_128)));

        add(new Costume(256).setPhotos(303).setName("szlachcianka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_140),
                new Size(Height.cm_146)));

        add(new Costume(257).setPhotos(305).setName("szlachcianka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(258).setPhotos(306).setName("disco").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.YEARS_70_80).setSizes(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(260).setPhotos(311).setName("indianka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.WILD_WEST).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        add(new Costume(259).setPhotos(307).setName("indianka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.WILD_WEST).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(261).setPhotos(315).setName("indianka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.WILD_WEST).setSizes(
                new Size(Height.cm_152, Height.cm_158)));

        add(new Costume(262).setPhotos(308).setName("pielęgniarka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_128)));

        add(new Costume(263).setPhotos(309).setName("piratka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.PIRATES).setSizes(
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(264).setPhotos(310, 312, 314).setName("suknia do walca").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(265).setPhotos(316).setName("Maryja").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Jasełka).setCategories(Category.HISTORICAL).setSizes(
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

        add(new Costume(266).setPhotos(317).setName("cyganka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(267).setPhotos(318).setName("Anioł").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Jasełka).setCategories(Category.HISTORICAL).setSizes(
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

        add(new Costume(268).setPhotos(320).setName("księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(270).setPhotos(322).setName("syrenka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(271).setPhotos(323).setName("cyganka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_128)));

        add(new Costume(274).setPhotos(329).setName("cyganka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(275).setPhotos(324).setName("Królewna Śnieżka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
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

        add(new Costume(276).setPhotos(325).setName("Królewna").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        add(new Costume(279).setPhotos(330, 331).setName("księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116)));

        add(new Costume(280).setPhotos(332).setName("księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(281).setPhotos(337, 338).setName("księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(282).setPhotos(333, 346, 347).setName("Roszpunka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_122),
                new Size(Height.cm_134)));

        add(new Costume(284).setPhotos(335, 336).setName("królowa").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(285).setPhotos(339, 340).setName("księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_98),
                new Size(Height.cm_104),
                new Size(Height.cm_116)));

        add(new Costume(286).setPhotos(341).setName("krakowianka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146),
                new Size(Height.cm_152)));

        add(new Costume(287).setPhotos(342, 413).setName("pszczółka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_110, Height.cm_116),
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(291).setPhotos(348, 349).setName("kotek").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122)));

        add(new Costume(292).setPhotos(new Photo(350, Boolean.TRUE)).setName("myszka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122)));

        add(new Costume(293).setPhotos(new Photo(351, Boolean.FALSE), new Photo(352, Boolean.TRUE)).setName("wiewiórka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(294).setPhotos(353, 354, 355).setName("Łabędź").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(295).setPhotos(356, 357).setName("tancerka turecka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_152)));

        add(new Costume(296).setPhotos(358, 359).setName("czarownica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_152)));

        add(new Costume(297).setPhotos(360, 361, 362).setName("cyganka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_152, Height.cm_158)));

        add(new Costume(298).setPhotos(363).setName("czarownica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_152, Height.cm_158)));

        add(new Costume(299).setPhotos(364).setName("sukienka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_20_30).setSizes(
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(300).setPhotos(365).setName("Lady Safari").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(301).setPhotos(366).setName("diablica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        add(new Costume(302).setPhotos(368).setName("dalmatyńczyk").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(304).setPhotos(370).setName("królik").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_152, Height.cm_158)));

        add(new Costume(305).setPhotos(1007).setName("traper").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.WILD_WEST).setSizes(
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        add(new Costume(306).setPhotos(372).setName("kowboj").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.WILD_WEST).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_134),
                new Size(Height.cm_122)));

        add(new Costume(307).setPhotos(373).setName("indianin").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.WILD_WEST).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_134),
                new Size(Height.cm_122)));

        add(new Costume(308).setPhotos(374).setName("Fazi z Ulicy Sezamkowej").setIsLongName().setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_110, Height.cm_116)));

        add(new Costume(310).setPhotos(376).setName("cyganka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_146, Height.cm_152)));

        add(new Costume(311).setPhotos(377).setName("cyganka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(312).setPhotos(378).setName("cyganka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_152, Height.cm_158)));

        add(new Costume(313).setPhotos(380).setName("czarownica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        add(new Costume(316).setPhotos(381, 388).setName("czarownica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_146, Height.cm_152)));

        add(new Costume(317).setPhotos(384).setName("spiderman").setForPair(33).setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.SUPER_HEROES).setSizes(
                new Size(Height.cm_98),
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_110)));

        add(new Costume(318).setPhotos(385).setName("czarodziejka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_110),
                new Size(Height.cm_134),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(319).setPhotos(386).setName("wróżka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_152),
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(321).setPhotos(389).setName("księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(322).setPhotos(390).setName("disco").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_146, Height.cm_158)));

        add(new Costume(323).setPhotos(391).setName("cyganka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(325).setPhotos(394).setName("czirliderki").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_152, Height.cm_158)));

        add(new Costume(326).setPhotos(395).setName("czarownica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_152, Height.cm_158)));

        add(new Costume(327).setPhotos(new Photo(396, Boolean.TRUE)).setName("sarenka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_134)));

        add(new Costume(328).setPhotos(397).setName("stańczyk").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_140)));

        add(new Costume(329).setPhotos(398).setName("wróżka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_140)));

        add(new Costume(330).setPhotos(399).setName("czarodziejka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_110),
                new Size(Height.cm_134),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));
    }

    private void addData2() {

        add(new Costume(333).setPhotos(403).setName("legionista rzymski").setAge(Age.CHILD).setIsLongName().setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(334).setPhotos(404).setName("suknia").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_128),
                new Size(Height.cm_116),
                new Size(Height.cm_140)));

        add(new Costume(335).setPhotos(405).setName("tygrys").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_152, Height.cm_158)));

        add(new Costume(336).setPhotos(407).setName("miś").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104, Height.cm_110)));

        add(new Costume(337).setPhotos(408).setName("kotek").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_98),
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(338).setPhotos(409).setName("clown").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_98),
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_110)));

        add(new Costume(339).setPhotos(414).setName("pszczoła").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116, Height.cm_122)));

        add(new Costume(340).setPhotos(415).setName("Samuraj").setAge(Age.CHILD).setIsLongName().setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_140)));

        add(new Costume(341).setPhotos(416).setName("indianin").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.WILD_WEST).setSizes(
                new Size(Height.cm_140)));

        add(new Costume(343).setPhotos(418).setName("chińczyk").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_134, Height.cm_140)));

        add(new Costume(345).setPhotos(420).setName("karateka").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(346).setPhotos(421).setName("kowboj").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.WILD_WEST).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(347).setPhotos(422).setName("japonka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_122)));

        add(new Costume(348).setPhotos(423).setName("indianin").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.WILD_WEST).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(352).setPhotos(430).setName("dworzanin").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_104, Height.cm_110)));

        add(new Costume(353).setPhotos(436).setName("indianin").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.WILD_WEST).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(355).setPhotos(438).setName("ułan").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140)));

        add(new Costume(357).setPhotos(441).setName("indianin").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.WILD_WEST, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_86),
                new Size(Height.cm_92),
                new Size(Height.cm_98)));

        add(new Costume(361).setPhotos(445).setName("kapitan Hak").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.PIRATES).setSizes(
                new Size(Height.cm_98, Height.cm_104),
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(362).setPhotos(447).setName("król").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(364).setPhotos(700).setName("dzięcioł").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_164, Height.cm_188, Belt.XS, Belt.XL)));

        add(new Costume(365).setPhotos(701).setName("papuga").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.XS, Belt.XL)));

        add(new Costume(366).setPhotos(702).setName("słowik").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_164, Height.cm_188, Belt.XS, Belt.XL)));

        add(new Costume(367).setPhotos(703).setName("zebra").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(372).setPhotos(710).setName("kaczka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.XL)));

        add(new Costume(373).setPhotos(711).setName("kogut").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_170, Height.cm_182, Belt.M, Belt.XL)));

        add(new Costume(374).setPhotos(712, 713).setName("konik morski").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.XXL)));

        add(new Costume(41).setPhotos(715).setName("grzyb kania").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FRUITS_VEGETABLES).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(376).setPhotos(718, 719).setName("łabędź").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_164, Height.cm_182, Belt.S, Belt.L)));

        add(new Costume(378).setPhotos(721).setName("gąska").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.L)));

        add(new Costume(379).setPhotos(722).setName("Słowik").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.XL)));

        add(new Costume(381).setPhotos(724).setName("kura").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.XL)));

        add(new Costume(385).setPhotos(728).setName("kukułka").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.L)));

        add(new Costume(389).setPhotos(732).setName("wiewiórka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.L)));

        add(new Costume(390).setPhotos(733).setName("mysz").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.L)));

        add(new Costume(392).setPhotos(736).setName("rak").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_158, Height.cm_170, Belt.S, Belt.L)));

        add(new Costume(394).setPhotos(1160).setName("piratka").setForPair(1).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.PIRATES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_164, Height.cm_182, Belt.XL, Belt.XXL)));

        add(new Costume(395).setPhotos(1159).setName("piratka").setForPair(1).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.PIRATES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_164, Height.cm_182, Belt.XL, Belt.XXL)));

        add(new Costume(397).setPhotos(1027).setName("kopciuszek").setForPair(26).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        add(new Costume(399).setPhotos(743).setName("meksykanka").setForPair(4).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.L)));

        add(new Costume(400).setPhotos(746).setName("meksykanka").setForPair(4).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.L)));

        add(new Costume(402).setPhotos(974).setName("szkot").setForPair(27).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_176, Height.cm_188, Belt.M, Belt.XL)));

        add(new Costume(407).setPhotos(751).setName("szata").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Jasełka).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.L)));

        add(new Costume(414).setPhotos(759).setName("śnieżynka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Jasełka, Occasion.Mikołajki).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(415).setPhotos(760).setName("milicjant").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(416).setPhotos(990).setName("marynarz").setForPair(28).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_170, Belt.S),
                new Size(Height.cm_170, Belt.M)));

        add(new Costume(417).setPhotos(762).setName("duch").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.XL)));

        add(new Costume(418).setPhotos(980).setName("szkotka").setForPair(27).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Belt.S),
                new Size(Height.cm_170, Belt.L)));

        add(new Costume(419).setPhotos(1084).setName("piratka").setForPair(1).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY, Category.PIRATES).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        add(new Costume(422).setPhotos(773).setName("papuga").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_128, Belt.S, Belt.L),
                new Size(Height.cm_140, Belt.S, Belt.L)));

        add(new Costume(423).setPhotos(774).setName("japonka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_122, Belt.S, Belt.L)));

        add(new Costume(425).setPhotos(776).setName("dwórka").setForPair(16).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_152, Height.cm_158, Belt.S)));

        add(new Costume(426).setPhotos(778).setName("policjant").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140)));

        add(new Costume(428).setPhotos(780).setName("bokser").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        add(new Costume(429).setPhotos(782).setName("muszkieterka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116, Belt.S, Belt.M),
                new Size(Height.cm_128, Belt.S, Belt.M)));

        add(new Costume(430).setPhotos(803).setName("kierowca rajdowy").setIsLongName().setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_104, Height.cm_110, Belt.S, Belt.M),
                new Size(Height.cm_116, Height.cm_122, Belt.S, Belt.M),
                new Size(Height.cm_128, Height.cm_134, Belt.S, Belt.M),
                new Size(Height.cm_140, Height.cm_146, Belt.S, Belt.M)));

        add(new Costume(431).setPhotos(785).setName("disco").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_116, Belt.S, Belt.L),
                new Size(Height.cm_128, Belt.S, Belt.L),
                new Size(Height.cm_140, Belt.S, Belt.L),
                new Size(Height.cm_152, Belt.S, Belt.L),
                new Size(Height.cm_164, Belt.S, Belt.L)));

        add(new Costume(433).setPhotos(787).setName("Śnieżynka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Mikołajki).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_158, Height.cm_170, Belt.XS, Belt.S)));

        add(new Costume(434).setPhotos(788, 789).setName("disco").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152),
                new Size(Height.cm_164)));

        add(new Costume(435).setPhotos(791).setName("muszkieterka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_116, Height.cm_122)));

        add(new Costume(436).setPhotos(792).setName("calineczka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S)));

        add(new Costume(437).setPhotos(793).setName("policjant").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(438).setPhotos(794).setName("kwiatek").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_128)));

        add(new Costume(439).setPhotos(795).setName("piotruś pan").setForPair(32).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        add(new Costume(442).setPhotos(799).setName("harry potter").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(448).setPhotos(1077).setName("piratka").setForPair(1).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.PIRATES, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(450).setPhotos(807).setName("wiosna").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140)));

        add(new Costume(451).setPhotos(808).setName("wiking").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(452).setPhotos(809).setName("gąska").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_158, Height.cm_164, Belt.S)));

        add(new Costume(453).setPhotos(811).setName("napoleon").setForPair(34).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        add(new Costume(455).setPhotos(959).setName("Ślimak").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_128)));

        add(new Costume(456).setPhotos(814).setName("Żyrafa").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(458).setPhotos(816, 817).setName("Żółw").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_110, Height.cm_116),
                new Size(Height.cm_122, Height.cm_128),
                new Size(Height.cm_134, Height.cm_140)));

        add(new Costume(459).setPhotos(818).setName("księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_134),
                new Size(Height.cm_140)));

        add(new Costume(460).setPhotos(819).setName("ułan").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_158, Height.cm_164, Belt.S, Belt.M)));

        add(new Costume(462).setPhotos(821, 822, 823).setName("spiderman").setForPair(33).setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.SUPER_HEROES).setSizes(
                new Size(Height.cm_128)));

        add(new Costume(463).setPhotos(824).setName("drakulaura").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_134),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(465).setPhotos(826).setName("Śmierć").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Halloween, Occasion.Jasełka).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.L)));

        add(new Costume(466).setPhotos(827).setName("myszka mini").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_104)));

        add(new Costume(467).setPhotos(829).setName("hawajka").setForPair(35).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_158, Height.cm_170, Belt.XS, Belt.M)));

        add(new Costume(468).setPhotos(830).setName("Kościotrup").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.XS, Belt.M)));

        add(new Costume(469).setPhotos(831).setName("obi wan kenobi").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152),
                new Size(Height.cm_164)));

        add(new Costume(470).setPhotos(832).setName("clawdeen wolf").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(471).setPhotos(836).setName("frankie stein").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(472).setPhotos(833).setName("suknia empire").setForPair(34).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L),
                new Size(Height.cm_158, Height.cm_164, Belt.XS, Belt.M)));

        add(new Costume(473).setPhotos(837).setName("suknia empire").setForPair(34).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        add(new Costume(476).setPhotos(835).setName("anakin").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(477).setPhotos(840).setName("anakin").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(479).setPhotos(842).setName("cyganka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(480).setPhotos(843).setName("diabeł").setForPair(8).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Halloween, Occasion.Jasełka).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_170, Height.cm_194, Belt.M, Belt.XXL)));

        add(new Costume(482).setPhotos(845, 851, 853).setName("Darth Vader").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140)));

        add(new Costume(483).setPhotos(847).setName("niezapominajka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_122)));

        add(new Costume(484).setPhotos(848).setName("al capone").setForPair(37).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(485).setPhotos(849).setName("Samuraj").setForPair(7).setIsLongName().setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        add(new Costume(486).setPhotos(850).setName("słonecznik").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_122, Height.cm_128)));

        add(new Costume(89).setPhotos(new Photo(857, Boolean.FALSE), new Photo(113, Boolean.FALSE), new Photo(854, Boolean.TRUE)).setName("teletubiś").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.L)));

        add(new Costume(91).setPhotos(new Photo(855, Boolean.FALSE), new Photo(854, Boolean.TRUE)).setName("teletubiś").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.L)));

        add(new Costume(94).setPhotos(new Photo(856, Boolean.FALSE), new Photo(854, Boolean.TRUE)).setName("teletubiś").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.L),
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.L)));

        add(new Costume(488).setPhotos(new Photo(858, Boolean.FALSE), new Photo(854, Boolean.TRUE)).setName("teletubiś").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.L)));

        add(new Costume(490).setPhotos(862, 864).setName("krasnoludek").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116)));

        add(new Costume(491).setPhotos(863, 864).setName("krasnoludek").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140)));

        add(new Costume(492).setPhotos(new Photo(865, Boolean.FALSE), new Photo(869, Boolean.TRUE)).setForPair(21).setName("krasnoludek").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.L)));

        add(new Costume(493).setPhotos(new Photo(867, Boolean.FALSE), new Photo(869, Boolean.TRUE)).setForPair(21).setName("krasnoludek").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.L)));

        add(new Costume(494).setPhotos(new Photo(868, Boolean.FALSE), new Photo(869, Boolean.TRUE)).setForPair(21).setName("krasnoludek").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.M)));

        add(new Costume(495).setPhotos(870).setName("klon").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(496).setPhotos(871).setName("kankan").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_122, Height.cm_134)));

        add(new Costume(497).setPhotos(874).setName("kankan").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_122, Height.cm_134)));

        add(new Costume(498).setPhotos(876).setName("kankan").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_134, Height.cm_146)));

        add(new Costume(499).setPhotos(878).setName("kankan").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_134, Height.cm_146)));

        add(new Costume(501).setPhotos(872).setName("wojownik").setForPair(39).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_170, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(502).setPhotos(879).setName("pirat").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PIRATES).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(503).setPhotos(881).setName("kankan").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_134, Height.cm_146)));

        add(new Costume(504).setPhotos(883).setName("kwiatek").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_122, Height.cm_134)));

        add(new Costume(506).setPhotos(887).setName("kleopatra").setForPair(65).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_158, Height.cm_164, Belt.XS, Belt.S)));

        add(new Costume(507).setPhotos(888).setName("biały niedźwiedź").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_128)));

        add(new Costume(508).setPhotos(889).setName("koń").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_128)));

        add(new Costume(513).setPhotos(894).setName("buzz astral").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(514).setPhotos(896).setName("książę wschodni").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(515).setPhotos(897).setName("barbie").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_134, Height.cm_146)));

        add(new Costume(516).setPhotos(898).setName("Kierowca Rajdowy").setIsLongName().setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(517).setPhotos(900, 901).setName("batman").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.SUPER_HEROES).setSizes(
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(518).setPhotos(902).setName("lisiczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(520).setPhotos(906).setName("kleopatra").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_128)));

        add(new Costume(521).setPhotos(908).setName("diabeł").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Halloween, Occasion.Jasełka).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_152, Height.cm_158),
                new Size(Height.cm_164, Height.cm_170)));

        add(new Costume(523).setPhotos(910).setName("czarownica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween, Occasion.Andrzejki).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        add(new Costume(524).setPhotos(911).setName("królewna śnieżka").setForPair(21).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        add(new Costume(525).setPhotos(912).setName("pilot").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(526).setPhotos(913).setName("czarownica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween, Occasion.Andrzejki).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(527).setPhotos(914).setName("Żołnierz rzymski").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.HISTORICAL).setSizes(
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(528).setPhotos(915).setName("hipiska").setForPair(14).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_158, Height.cm_164, Belt.XS, Belt.S)));

        add(new Costume(529).setPhotos(917).setName("dzwoneczek").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_134)));

        add(new Costume(530).setPhotos(918).setName("strażak").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(531).setPhotos(920).setName("Żołnierz rzymski").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_128)));

        add(new Costume(532).setPhotos(922).setName("czarownica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween, Occasion.Andrzejki).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_152, Height.cm_158)));

        add(new Costume(533).setPhotos(923).setName("marylin monroe").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_158, Height.cm_164, Belt.XS, Belt.S)));

        add(new Costume(534).setPhotos(924).setName("król").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(536).setPhotos(926).setName("marynarz").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_128)));

        add(new Costume(537).setPhotos(927).setName("królowa").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(538).setPhotos(929).setName("Śmierć").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Jasełka, Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(539).setPhotos(930).setName("kowbojka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.WILD_WEST).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_140),
                new Size(Height.cm_128),
                new Size(Height.cm_152)));

        add(new Costume(540).setPhotos(931).setName("babcia").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_158, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(541).setPhotos(932).setName("robin hood").setForPair(3).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.L)));

        add(new Costume(542).setPhotos(933).setName("indianka").setForPair(2).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.WILD_WEST, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.L)));

        add(new Costume(543).setPhotos(934).setName("hipiska").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_140),
                new Size(Height.cm_128)));

        add(new Costume(544).setPhotos(935).setName("Albus Dumbledore").setIsLongName().setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_134)));

        add(new Costume(545).setPhotos(936).setName("Bawarka").setForPair(41).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS),
                new Size(Height.cm_164, Height.cm_170, Belt.L)));

        add(new Costume(546).setPhotos(937).setName("sukienka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_50_60).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS),
                new Size(Height.cm_164, Height.cm_170, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        add(new Costume(547).setPhotos(938).setName("krokodyl").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(549).setPhotos(940).setName("kaczka").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(550).setPhotos(941).setName("sukienka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_50_60).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(551).setPhotos(943).setName("rak").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146),
                new Size(Height.cm_152)));

        add(new Costume(552).setPhotos(944).setName("muszkietarka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_128)));

        add(new Costume(553).setPhotos(945).setName("indianka").setForPair(2).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.WILD_WEST, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(554).setPhotos(946).setName("Żołnierz").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(556).setPhotos(947).setName("bałwan").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(557).setPhotos(950).setName("zebra").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(559).setPhotos(952).setName("dworzanin").setForPair(16).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.M),
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L)));

        add(new Costume(560).setPhotos(953).setName("kangur").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_122, Height.cm_128),
                new Size(Height.cm_134, Height.cm_140)));

        add(new Costume(561).setPhotos(954).setName("kubuś puchatek").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_110, Height.cm_116),
                new Size(Height.cm_122, Height.cm_128),
                new Size(Height.cm_134, Height.cm_140)));

        add(new Costume(562).setPhotos(955).setName("dworzanin").setForPair(16).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L)));

        add(new Costume(563).setPhotos(956).setName("sarenka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(564).setPhotos(957).setName("jelonek").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(565).setPhotos(958).setName("owieczka").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(566).setPhotos(961).setName("cytryna").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FRUITS_VEGETABLES).setSizes(
                new Size(Height.cm_110, Height.cm_152)));

        add(new Costume(568).setPhotos(963).setName("pippi").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_122, Height.cm_140)));

        add(new Costume(569).setPhotos(964, 965).setName("smerf").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(570).setPhotos(965).setName("smerfetka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(571).setPhotos(966).setName("sułtan").setForPair(43).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L)));

        add(new Costume(572).setPhotos(967).setName("aladyn").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_128, Height.cm_140)));

        add(new Costume(573).setPhotos(968).setName("słoneczko").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_122, Height.cm_134)));

        add(new Costume(574).setPhotos(969, 970).setName("bokser").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_128, Height.cm_140)));

        add(new Costume(576).setPhotos(972).setName("wróbelek").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(577).setPhotos(973).setName("ptak").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_128, Height.cm_146)));

        add(new Costume(578).setPhotos(975).setName("mak").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(579).setPhotos(977).setName("kaczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(580).setPhotos(978).setName("jaskiniowiec").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(581).setPhotos(979, 981).setName("diabeł").setForPair(8).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Halloween, Occasion.Jasełka).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_182, Height.cm_194, Belt.M, Belt.L),
                new Size(Height.cm_176, Height.cm_188, Belt.XL, Belt.XXL)));

        add(new Costume(582).setPhotos(982).setName("duch").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(583).setPhotos(983).setName("koziołek matołek").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_110, Height.cm_116)));

        add(new Costume(584).setPhotos(984).setName("dama").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(585).setPhotos(985).setName("królowa").setForPair(22).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        add(new Costume(586).setPhotos(986).setName("zielony groszek").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FRUITS_VEGETABLES).setSizes(
                new Size(Height.cm_122, Height.cm_134)));

        add(new Costume(587).setPhotos(987).setName("disco").setForPair(20).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L)));

        add(new Costume(590).setPhotos(991).setName("disco").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.M),
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L),
                new Size(Height.cm_176, Height.cm_182, Belt.L, Belt.XL)));

        add(new Costume(591).setPhotos(994).setName("disco").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.M),
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L),
                new Size(Height.cm_176, Height.cm_182, Belt.L, Belt.XL)));

        add(new Costume(592).setPhotos(1024).setName("disco").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.M),
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L),
                new Size(Height.cm_176, Height.cm_182, Belt.L, Belt.XL)));

        add(new Costume(593).setPhotos(992).setName("laguna blue").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(594).setPhotos(993).setName("kominiarz").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_122, Height.cm_128)));

        add(new Costume(595).setPhotos(995).setName("piratka").setForPair(1).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY, Category.PIRATES).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(596).setPhotos(996, 1023).setName("suknia empire").setForPair(34).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(61).setPhotos(997).setName("pirat").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PIRATES).setSizes(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_152, Height.cm_158),
                new Size(Height.cm_164)));

        add(new Costume(598).setPhotos(999).setName("gwiazdka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Jasełka).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_122, Height.cm_140)));

        add(new Costume(599).setPhotos(1000).setName("pirat").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PIRATES).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_110),
                new Size(Height.cm_122)));

        add(new Costume(600).setPhotos(1002, 1001).setName("sexy lady").setForPair(44).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(601).setPhotos(1003, 1001).setName("sutener").setForPair(44).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.M),
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L),
                new Size(Height.cm_176, Height.cm_182, Belt.L, Belt.XL)));

        add(new Costume(602).setPhotos(1005).setName("rumianek").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(603).setPhotos(1006, 1008).setForPair(22).setName("królowa").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(604).setPhotos(1008, 1009).setName("król").setForPair(22).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_182, Height.cm_194, Belt.S, Belt.M),
                new Size(Height.cm_182, Height.cm_194, Belt.L, Belt.XL)));

        add(new Costume(46).setPhotos(1010, 1158).setName("muszkieter").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_110)));

        add(new Costume(605).setPhotos(1012).setName("Elvis Presley").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.M)));

        add(new Costume(607).setPhotos(1014).setName("dama").setForPair(16).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        add(new Costume(608).setPhotos(1017).setName("chinka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(609).setPhotos(1018).setName("dr. watson").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.L, Belt.XL)));

        add(new Costume(610).setPhotos(1020).setName("al capone").setForPair(37).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_20_30).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.L),
                new Size(Height.cm_182, Height.cm_188, Belt.XXL),
                new Size(Height.cm_182, Height.cm_188, Belt.XL),
                new Size(Height.cm_182, Height.cm_188, Belt.M)));

        add(new Costume(611).setPhotos(1019).setName("kan-kan").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.YEARS_20_30).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.L),
                new Size(Height.cm_164, Height.cm_176, Belt.M)));

        add(new Costume(612).setPhotos(1021).setName("czarownica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween, Occasion.Andrzejki).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_158, Height.cm_176, Belt.L),
                new Size(Height.cm_158, Height.cm_176, Belt.S)));

        add(new Costume(613).setPhotos(1025).setName("dama").setForPair(16).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S)));

        add(new Costume(614).setPhotos(1026).setName("disco").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.M),
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L),
                new Size(Height.cm_176, Height.cm_182, Belt.L, Belt.XL)));

        add(new Costume(615).setPhotos(1028).setName("smerfetka").setForPair(46).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(616).setPhotos(1029).setName("byk").setForPair(25).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.XL)));

        add(new Costume(617).setPhotos(1031).setName("marynarz").setForPair(28).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.M)));

        add(new Costume(618).setPhotos(1033).setName("dunka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_158, Height.cm_170, Belt.S),
                new Size(Height.cm_158, Height.cm_170, Belt.XS)));

        add(new Costume(619).setPhotos(1034).setName("jesień").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.XS, Belt.M)));

        add(new Costume(620).setPhotos(1035).setName("sułtanka").setForPair(43).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.XS, Belt.M)));

        add(new Costume(621).setPhotos(1036).setName("mak").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.L)));

        add(new Costume(622).setPhotos(1037).setName("Żółw").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(623).setPhotos(1038).setName("hipiska").setForPair(14).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_158, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(625).setPhotos(1040).setName("syrena").setAge(Age.ADULT).setForPair(53).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_158, Height.cm_164, Belt.XS)));

        add(new Costume(626).setPhotos(1042).setName("czirliderka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_158, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(627).setPhotos(1044).setName("kominiarz").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.M)));

        add(new Costume(628).setPhotos(1045).setName("piratka").setForPair(1).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.PIRATES).setSizes(
                new Size(Height.cm_158, Height.cm_170, Belt.XS, Belt.S)));

        add(new Costume(630).setPhotos(1047).setName("topielica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_158, Height.cm_164, Belt.XS, Belt.S)));

        add(new Costume(631).setPhotos(1048).setName("muszkieter").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.M)));

        add(new Costume(632).setPhotos(1049).setName("rzymianka").setForPair(39).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.HISTORICAL).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(633).setPhotos(1050).setName("Sherlock Holmes").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        add(new Costume(635).setPhotos(1052).setName("wilk").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_110, Height.cm_116),
                new Size(Height.cm_122, Height.cm_128),
                new Size(Height.cm_134, Height.cm_140)));

        add(new Costume(636).setPhotos(1053).setName("dinozaur").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116, Height.cm_122)));

        add(new Costume(637).setPhotos(1054).setName("kucharz").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.L),
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.L),
                new Size(Height.cm_182, Height.cm_188, Belt.L, Belt.XXL)));

        add(new Costume(638).setPhotos(1056).setName("myszka").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(639).setPhotos(1057).setName("słoń").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.XL)));

        add(new Costume(641).setPhotos(1059).setName("Świnka").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(642).setPhotos(1060).setName("rycerz").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_140),
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(643).setPhotos(1061).setName("zając").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_140),
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(644).setPhotos(1062).setName("suknia do walca").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_122)));

        add(new Costume(645).setPhotos(1063).setName("stokrotka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(646).setPhotos(1064).setName("pirat Jack Sparrow").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PIRATES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_140),
                new Size(Height.cm_146),
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(647).setPhotos(1065).setName("panterka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_140),
                new Size(Height.cm_128)));

        add(new Costume(648).setPhotos(1066).setName("czarownica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween, Occasion.Andrzejki).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_140),
                new Size(Height.cm_128),
                new Size(Height.cm_116),
                new Size(Height.cm_104)));

        add(new Costume(649).setPhotos(1067).setName("czarownica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween, Occasion.Andrzejki).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.L)));

        add(new Costume(650).setPhotos(1068).setName("czarownica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween, Occasion.Andrzejki).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_128)));

        add(new Costume(651).setPhotos(1069).setName("mnich").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.L)));

        add(new Costume(652).setPhotos(1070).setName("kwiatek").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_122, Height.cm_128),
                new Size(Height.cm_134, Height.cm_140)));

        add(new Costume(653).setPhotos(1072).setName("dominikanin").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L)));

        add(new Costume(654).setPhotos(1075).setName("diablica").setForPair(8).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(655).setPhotos(1076).setName("krasnoludek").setForPair(21).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_176, Height.cm_188, Belt.M, Belt.L)));

        add(new Costume(656).setPhotos(1078).setName("biskup").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L)));

        add(new Costume(657).setPhotos(1079).setName("kan-kan").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.YEARS_20_30).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(658).setPhotos(1080).setName("król").setForPair(22).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L)));

        add(new Costume(660).setPhotos(1082).setName("mikołaj").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Mikołajki).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_188, Height.cm_194, Belt.M, Belt.XXL),
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.XXL),
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.XXL),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.XL)));

        add(new Costume(661).setPhotos(1086).setName("hawajka").setForPair(35).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(662).setPhotos(1087).setName("szeherezada").setForPair(11).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(663).setPhotos(1085).setName("dama").setForPair(16).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(664).setPhotos(1074).setName("muszkieter").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.L, Belt.XL)));

        add(new Costume(665).setPhotos(1071).setName("czarownica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        add(new Costume(667).setPhotos(1041).setName("cyganka").setForPair(19).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_158, Height.cm_164, Belt.XS, Belt.S)));
    }

    private void addData3() {
        add(new Costume(668).setPhotos(1088).setName("szop").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_122, Height.cm_128)));

        add(new Costume(669).setPhotos(1089).setName("hindus").setForPair(23).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Height.cm_182, Belt.XS, Belt.S)));

        add(new Costume(670).setPhotos(1091).setName("tygrys").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_122, Height.cm_128)));

        add(new Costume(672).setPhotos(1093).setName("mikołaj").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Mikołajki).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_140, Height.cm_152),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_152, Height.cm_158)));

        add(new Costume(674).setPhotos(1095).setName("dama").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.L)));

        add(new Costume(84).setPhotos(1096).setName("wilk").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_122, Height.cm_128)));

        add(new Costume(676).setPhotos(1098).setName("król").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.M)));

        add(new Costume(677).setPhotos(1099, 1100).setName("krokodyl").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116, Height.cm_122)));

        add(new Costume(679).setPhotos(1103).setName("duch").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.M)));

        add(new Costume(680).setPhotos(1104).setName("myśliwy").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(681).setPhotos(1105).setName("nietoperz").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Halloween).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(682).setPhotos(1106).setName("hipiska").setForPair(14).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.L, Belt.XL)));

        add(new Costume(683).setPhotos(1115).setName("hipiska").setForPair(14).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.L, Belt.XL)));

        add(new Costume(684).setPhotos(1107).setName("piesek").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(685).setPhotos(1108).setName("avatar neytiri").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(686).setPhotos(1109).setName("świnka").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(687).setPhotos(1110).setName("kotek").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(688).setPhotos(1111).setName("avatar jake sully").setForPair(49).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        add(new Costume(689).setPhotos(1112).setName("lew").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(690).setPhotos(1113).setName("król").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_98),
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(691).setPhotos(1114).setName("batman").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L)));

        add(new Costume(692).setPhotos(1116).setName("kot w butach").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(693).setPhotos(1117, 1118).setName("zebra").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_122, Height.cm_128)));

        add(new Costume(694).setPhotos(1119).setName("wróżka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.XS, Belt.S)));

        add(new Costume(697).setPhotos(1126).setName("śnieżynka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Jasełka).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        add(new Costume(698).setPhotos(1127, 1111).setName("avatar neytiri").setForPair(49).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(87).setPhotos(1122).setName("superman").setForPair(33).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.SUPER_HEROES).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L)));

        add(new Costume(699).setPhotos(1122).setName("supergirl").setForPair(33).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.SUPER_HEROES).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(701).setPhotos(1128).setName("hiszpanka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(702).setPhotos(1129).setName("gandalf").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_188, Height.cm_194, Belt.M, Belt.XL)));

        add(new Costume(704).setPhotos(1131).setName("czarownica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(705).setPhotos(1134).setName("tygrys").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(707).setPhotos(1136, 1137).setName("Żyrafa").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(708).setPhotos(1139, 1140).setName("lis").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_122, Height.cm_128)));

        add(new Costume(709).setPhotos(1142).setName("elf").setForPair(32).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S)));

        add(new Costume(710).setPhotos(1143).setName("leia").setForPair(5).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(711).setPhotos(1144).setName("konik").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104, Height.cm_110)));

        add(new Costume(712).setPhotos(1145).setName("małpka").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104, Height.cm_110)));

        add(new Costume(713).setPhotos(1146).setName("łoś").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104, Height.cm_110)));

        add(new Costume(715).setPhotos(1151).setName("tygrysek").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104, Height.cm_110)));

        add(new Costume(716).setPhotos(1147, 1148).setName("anioł").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(717).setPhotos(1156).setName("sukienka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_50_60).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(719).setPhotos(1154).setName("król").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(720).setPhotos(1155).setName("król").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(721).setPhotos(1157).setName("diabełek").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116)));

        add(new Costume(722).setPhotos(1161).setName("jabłko").setAge(Age.CHILD_ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FRUITS_VEGETABLES).setSizes(
                new Size(Height.cm_128, Height.cm_164)));

        add(new Costume(725).setPhotos(1168).setName("pszczółka").setForPair(13).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(726).setPhotos(1234).setName("suknia").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(37).setOccasions(Occasion.Inne).setCategories(Category.YEARS_20_30).setSizes(
                new Size(Height.cm_158, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_158, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_158, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(727).setPhotos(1236).setName("suknia").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(37).setOccasions(Occasion.Inne).setCategories(Category.YEARS_20_30).setSizes(
                new Size(Height.cm_158, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_158, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_158, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(728).setPhotos(1237).setName("Papa Smurf").setAge(Age.ADULT).setSex(Sex.MALE).setForPair(46).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_176, Height.cm_188, Belt.S, Belt.L)));

        add(new Costume(729).setPhotos(1332).setName("Turek").setAge(Age.ADULT).setSex(Sex.MALE).setForPair(11).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Height.cm_182, Belt.M, Belt.L)));

        add(new Costume(730).setPhotos(1318).setName("ananas").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FRUITS_VEGETABLES).setSizes(
                new Size(Height.cm_170, Height.cm_194, Belt.M, Belt.XXL)));

        add(new Costume(732).setPhotos(1166).setName("policjantka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY, Category.PROFESSIONS).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS),
                new Size(Height.cm_164, Height.cm_170, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        add(new Costume(733).setPhotos(1170).setName("hiszpanka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(52).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_158, Height.cm_164, Belt.S, Belt.M)));

        add(new Costume(734).setPhotos(1169, 1418).setName("kocica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween, Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        add(new Costume(735).setPhotos(1232).setName("Rzymianin").setForPair(39).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.L)));

        add(new Costume(736).setPhotos(1235).setName("Posejdon").setAge(Age.ADULT).setSex(Sex.MALE).setForPair(53).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_170, Height.cm_188, Belt.S, Belt.L)));

        add(new Costume(737).setPhotos(1233).setName("pszczółka").setForPair(13).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.M)));

        add(new Costume(739).setPhotos(1230).setName("Leprechaun").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_152, Belt.XS),
                new Size(Height.cm_158, Belt.L),
                new Size(Height.cm_164, Belt.M)));

        add(new Costume(740).setPhotos(1242, 1243).setName("Lady Marion").setForPair(3).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(741).setPhotos(1313).setName("truskawka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FRUITS_VEGETABLES).setSizes(
                new Size(Height.cm_164, Height.cm_182, Belt.S, Belt.XL)));

        add(new Costume(742).setPhotos(1326).setName("pastuszek").setAge(Age.ADULT).setSex(Sex.MALE).setForPair(55).setOccasions(Occasion.Jasełka, Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(743).setPhotos(1314).setName("smoking").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.YEARS_20_30).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(744).setPhotos(1315).setName("marchewka").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FRUITS_VEGETABLES).setSizes(
                new Size(Height.cm_176, Height.cm_194, Belt.S, Belt.XL)));

        add(new Costume(745).setPhotos(1328).setName("dworzanin").setForPair(16).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_176, Belt.M)));

        add(new Costume(748).setPhotos(1323).setName("biedronka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(749).setPhotos(1319).setName("smoking").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.YEARS_20_30).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(750).setPhotos(1240).setName("Wilma Flinstone").setForPair(17).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.OTHERS).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.M),
                new Size(Height.cm_164, Height.cm_176, Belt.L),
                new Size(Height.cm_164, Height.cm_176, Belt.XL)));

        add(new Costume(751).setPhotos(1251).setName("cyganka").setForPair(19).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.M)));

        add(new Costume(752).setPhotos(1252).setName("cyganka").setForPair(19).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        add(new Costume(753).setPhotos(1288).setName("hipiska").setForPair(14).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        add(new Costume(754).setPhotos(1278).setName("Rzymianka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(39).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(821).setPhotos(1378, 1217).setName("Policjantka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(29).setOccasions(Occasion.Inne).setCategories(Category.SEXY, Category.PROFESSIONS).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        add(new Costume(756).setPhotos(1264, 1265).setName("strój do samby czerwony").setIsLongName().setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.OTHERS).setSizes(
                new Size(Height.cm_158, Height.cm_170, Belt.XS, Belt.S)));

        add(new Costume(757).setPhotos(1265).setName("strój do samby czarny").setIsLongName().setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.OTHERS).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(758).setPhotos(1263).setName("strój do samby zielony").setIsLongName().setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.OTHERS).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        add(new Costume(759).setPhotos(1226).setName("kowbojka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(2).setOccasions(Occasion.Inne).setCategories(Category.WILD_WEST, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS),
                new Size(Height.cm_164, Height.cm_170, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.L)));

        add(new Costume(760).setPhotos(1162).setName("jabłko").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FRUITS_VEGETABLES).setSizes(
                new Size(Height.cm_116, Height.cm_158)));

        add(new Costume(761).setPhotos(1320).setName("Wiking").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        add(new Costume(762).setPhotos(1277).setName("Japonka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(7).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.L)));

        add(new Costume(763).setPhotos(1305).setName("hipiska").setForPair(14).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(764).setPhotos(1283).setName("chinka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Belt.XS, Belt.S)));

        add(new Costume(765).setPhotos(1299).setName("hinduska").setForPair(23).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.XS, Belt.S)));

        add(new Costume(766).setPhotos(1261, 1267).setName("biedronka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.XS, Belt.S),
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(767).setPhotos(1190, 1201).setName("dama").setForPair(16).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_158, Height.cm_164, Belt.S, Belt.M),
                new Size(Height.cm_158, Height.cm_164, Belt.M, Belt.L)));

        add(new Costume(768).setPhotos(1174).setName("skinhead").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.L)));

        add(new Costume(769).setPhotos(1293).setName("turczynka").setForPair(11).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_158, Height.cm_164, Belt.S, Belt.M)));

        add(new Costume(770).setPhotos(1211).setName("czarny anioł").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(8).setOccasions(Occasion.Halloween, Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(773).setPhotos(1286, 1290).setName("szkotka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(27).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.M)));

        add(new Costume(775).setPhotos(1296).setName("mieszczka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L),
                new Size(Height.cm_170, Height.cm_176, Belt.L, Belt.XL),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(777).setPhotos(1173).setName("dama").setForPair(16).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_164, Belt.L)));

        add(new Costume(778).setPhotos(1171).setName("dama").setForPair(16).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_164, Belt.M),
                new Size(Height.cm_164, Belt.L)));

        add(new Costume(779).setPhotos(1172, 841).setName("dama").setForPair(16).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_158, Belt.XS, Belt.S)));

        add(new Costume(780).setPhotos(1193).setName("dama").setForPair(16).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_158, Belt.XS, Belt.S)));

        add(new Costume(781).setPhotos(1284).setName("dama").setForPair(16).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(782).setPhotos(1280).setName("dama").setForPair(16).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_176, Belt.XL)));

        add(new Costume(784).setPhotos(1333, 1334).setName("kowbojka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(2).setOccasions(Occasion.Inne).setCategories(Category.WILD_WEST).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(785).setPhotos(1301).setName("agentka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(787).setPhotos(1306).setName("pasterka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(55).setOccasions(Occasion.Jasełka, Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_170, Height.cm_176, Belt.L, Belt.XL)));

        add(new Costume(789).setPhotos(1247, 1246).setName("hiszpanka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(52).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S),
                new Size(Height.cm_170, Height.cm_176, Belt.M),
                new Size(Height.cm_170, Height.cm_176, Belt.L)));

        add(new Costume(790).setPhotos(1228, 1229).setName("zakonnica").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(10).setOccasions(Occasion.Halloween, Occasion.Inne).setCategories(Category.PROFESSIONS, Category.OTHERS).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.L)));

        add(new Costume(792).setPhotos(1274, 1273).setName("hinduska").setForPair(23).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S),
                new Size(Height.cm_170, Height.cm_176, Belt.M),
                new Size(Height.cm_170, Height.cm_176, Belt.L),
                new Size(Height.cm_170, Height.cm_176, Belt.XL)));

        add(new Costume(794).setPhotos(1181).setName("pokojówka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_170, Belt.XS, Belt.S)));

        add(new Costume(795).setPhotos(1189).setName("czarownica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Halloween).setCategories(Category.FAIRY_TALES, Category.OTHERS).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(796).setPhotos(1178).setName("wilk").setForPair(18).setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_158, Height.cm_164, Belt.S, Belt.L)));

        add(new Costume(797).setPhotos(1266).setName("ośmiornica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_170, Height.cm_182, Belt.M, Belt.L)));

        add(new Costume(798).setPhotos(1302).setName("toga akademicka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(799).setPhotos(1196).setName("biedronka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(800).setPhotos(1208).setName("chomik").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.L)));

        add(new Costume(801).setPhotos(1294).setName("lis").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.L)));

        add(new Costume(802).setPhotos(1262).setName("wilk").setForPair(18).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne, Occasion.Halloween).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.L)));

        add(new Costume(629).setPhotos(1290).setName("szkot").setAge(Age.ADULT).setSex(Sex.MALE).setForPair(27).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.S),
                new Size(Height.cm_176, Height.cm_182, Belt.L)));

        add(new Costume(535).setPhotos(1260).setName("wilk").setForPair(18).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Halloween, Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.L)));

        add(new Costume(505).setPhotos(1272).setName("jesienne liście").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.L)));

        add(new Costume(487).setPhotos(1308).setName("Morticia").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween, Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_176, Belt.S)));

        add(new Costume(363).setPhotos(1309).setName("panterka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.M)));

        add(new Costume(746).setPhotos(1224).setName("Robin Hood damski").setIsLongName().setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(3).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(731).setPhotos(1224, 1243).setName("Robin Hood męski").setIsLongName().setAge(Age.ADULT).setSex(Sex.MALE).setForPair(3).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.XS),
                new Size(Height.cm_176, Height.cm_182, Belt.S),
                new Size(Height.cm_176, Height.cm_182, Belt.M),
                new Size(Height.cm_176, Height.cm_182, Belt.L),
                new Size(Height.cm_176, Height.cm_182, Belt.XL)));

        add(new Costume(723).setPhotos(1256).setName("Morticia").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween, Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_170, Belt.XS, Belt.S)));

        add(new Costume(678).setPhotos(1275).setName("Hermes").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_158, Height.cm_170, Belt.XS, Belt.M)));

        add(new Costume(511).setPhotos(1185).setName("króliczek").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        add(new Costume(500).setPhotos(1184).setName("króliczek").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        add(new Costume(475).setPhotos(1209).setName("Czerwony Kapturek").setAge(Age.CHILD).setIsLongName().setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(474).setPhotos(1271).setName("Stańczyk").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_176, Height.cm_188, Belt.M, Belt.XL)));

        add(new Costume(454).setPhotos(1192).setName("gorset").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        add(new Costume(446).setPhotos(1194).setName("gorset").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        add(new Costume(443).setPhotos(1188).setName("gorset").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        add(new Costume(432).setPhotos(1182).setName("kotek").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween, Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_128)));

        add(new Costume(427).setPhotos(1175).setName("Monster High Skelita").setIsLongName().setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(424).setPhotos(1176).setName("Monster High Frankie Stein").setIsLongName().setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_128)));

        add(new Costume(411).setPhotos(1200).setName("Monster High Drakulaura Sweet").setIsLongName().setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Jasełka).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(410).setPhotos(1340).setName("Szkot").setAge(Age.ADULT).setSex(Sex.MALE).setForPair(27).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        add(new Costume(408).setPhotos(1186).setName("Monster High Cleo De Nile").setIsLongName().setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(405).setPhotos(1179).setName("Monster High Abby").setIsLongName().setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(404).setPhotos(1216).setName("rybka").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_134, Height.cm_140)));

        add(new Costume(403).setPhotos(1167).setName("owieczka").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Jasełka).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_128)));

        add(new Costume(398).setPhotos(1164).setName("kościotrup").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(396).setPhotos(1183).setName("biedronka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_134)));

        add(new Costume(393).setPhotos(1187).setName("Hello Kitty").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_128)));

        add(new Costume(380).setPhotos(1203).setName("pszczółka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_110),
                new Size(Height.cm_128)));

        add(new Costume(368).setPhotos(1198, 1197).setName("dynia").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116)));

        add(new Costume(360).setPhotos(1195).setName("czarownica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(324).setPhotos(1205).setName("muchomor").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_152)));

        add(new Costume(314).setPhotos(1214).setName("ptak").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_110, Height.cm_146)));

        add(new Costume(272).setPhotos(1180).setName("biedronka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128)));

        add(new Costume(236).setPhotos(1191).setName("biedronka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        add(new Costume(215).setPhotos(1218).setName("Zorro").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Halloween).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(213).setPhotos(1213).setName("rybka").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(192).setPhotos(1269).setName("Czerwony Kapturek").setForPair(18).setIsLongName().setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_152, Height.cm_158, Belt.XS, Belt.S),
                new Size(Height.cm_158, Height.cm_164, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.L),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.XL)));

        add(new Costume(186).setPhotos(1291).setName("Królewna").setForPair(22).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_170, Belt.S),
                new Size(Height.cm_170, Belt.L)));

        add(new Costume(185).setPhotos(1253, 1254).setName("kombinezon").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(175).setPhotos(1282).setName("Kapitan").setForPair(28).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.PROFESSIONS).setSizes(
                new Size(Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(145).setPhotos(1250, 1249).setName("więzień").setAge(Age.ADULT).setSex(Sex.MALE).setForPair(29).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_182, Height.cm_194, Belt.S, Belt.M),
                new Size(Height.cm_182, Height.cm_194, Belt.L, Belt.XL)));

        add(new Costume(144).setPhotos(1229).setName("Ksiądz").setForPair(10).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Halloween).setCategories(Category.MOVIE_STAGE, Category.PROFESSIONS).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S),
                new Size(Height.cm_176, Height.cm_182, Belt.M),
                new Size(Height.cm_182, Height.cm_188, Belt.L)));

        add(new Costume(143).setPhotos(1289).setName("kocica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Halloween).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(142).setPhotos(1339).setName("kotek").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Halloween).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.L)));

        add(new Costume(141).setPhotos(1241, 1239).setName("Fred Flinstone").setForPair(17).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_182, Height.cm_194, Belt.M, Belt.XL)));

        add(new Costume(140).setPhotos(1334, 1331).setName("kowboj").setAge(Age.ADULT).setSex(Sex.MALE).setForPair(2).setOccasions(Occasion.Inne).setCategories(Category.WILD_WEST, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.XS, Belt.S),
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.M),
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L)));

        add(new Costume(139).setPhotos(1341).setName("Mary Poppins").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.M),
                new Size(Height.cm_170, Height.cm_176, Belt.L),
                new Size(Height.cm_170, Height.cm_176, Belt.XXL)));

        add(new Costume(138).setPhotos(1347).setName("kufel piwa").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.XL)));

        add(new Costume(133).setPhotos(1345).setName("disco").setForPair(20).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.YEARS_70_80).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.S),
                new Size(Height.cm_176, Height.cm_182, Belt.M)));

        add(new Costume(132).setPhotos(1343).setName("Meksykanin").setForPair(4).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_182, Belt.S, Belt.M)));

        add(new Costume(131).setPhotos(1338).setName("Cezar").setForPair(39).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.HISTORICAL, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        add(new Costume(128).setPhotos(1335).setName("Egipcjanin").setAge(Age.ADULT).setSex(Sex.MALE).setForPair(65).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.HISTORICAL, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        add(new Costume(127).setPhotos(1324).setName("kierowca rajdowy").setIsLongName().setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.M),
                new Size(Height.cm_170, Height.cm_182, Belt.L, Belt.XL)));

        add(new Costume(126).setPhotos(1292).setName("marynarz Papaj").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.L)));

        add(new Costume(124).setPhotos(1300).setName("Samuraj").setIsLongName().setAge(Age.ADULT).setSex(Sex.MALE).setForPair(7).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L)));

        add(new Costume(121).setPhotos(1255).setName("Egipcjanin").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        add(new Costume(119).setPhotos(1245, 1246).setName("Hiszpan").setAge(Age.ADULT).setSex(Sex.MALE).setForPair(52).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.NATIONALISTIC, Category.PROFESSIONS).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.M),
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L)));

        add(new Costume(117).setPhotos(1257).setName("lis").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.XL)));

        add(new Costume(116).setPhotos(1281).setName("Spiderman").setForPair(33).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.SUPER_HEROES).setSizes(
                new Size(Height.cm_176, Height.cm_188, Belt.S, Belt.L)));

        add(new Costume(115).setPhotos(1298).setName("Aladyn").setForPair(11).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.XS, Belt.S)));

        add(new Costume(113).setPhotos(1344).setName("disco").setAge(Age.ADULT).setSex(Sex.MALE).setForPair(20).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.YEARS_70_80).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.M)));

        add(new Costume(111).setPhotos(1287).setName("Grabarz").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Halloween, Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_176, Height.cm_188, Belt.S, Belt.M),
                new Size(Height.cm_176, Height.cm_188, Belt.L)));

        add(new Costume(107).setPhotos(1337).setName("lekarz").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_176, Height.cm_188, Belt.S, Belt.M)));

        add(new Costume(106).setPhotos(1285).setName("pilot").setAge(Age.ADULT).setSex(Sex.MALE).setForPair(30).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L)));

        add(new Costume(105).setPhotos(1317).setName("król").setAge(Age.ADULT).setSex(Sex.MALE).setForPair(22).setOccasions(Occasion.Jasełka).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_182, Height.cm_194, Belt.L, Belt.XXL)));

        add(new Costume(100).setPhotos(1348).setName("dozorca").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_176, Belt.S, Belt.M)));

        add(new Costume(99).setPhotos(1307).setName("Pinokio").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_182, Height.cm_194, Belt.M, Belt.L)));

        add(new Costume(95).setPhotos(1310).setName("Żołnierz").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(85).setPhotos(1248, 1249).setName("policjantka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(29).setOccasions(Occasion.Inne).setCategories(Category.SEXY, Category.PROFESSIONS).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.XS, Belt.S),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(77).setPhotos(1222, 1221, 1223).setName("Hawajczyk").setAge(Age.ADULT).setSex(Sex.MALE).setForPair(35).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_158, Height.cm_164, Belt.XS, Belt.S),
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.L),
                new Size(Height.cm_182, Height.cm_194, Belt.L, Belt.XXL)));

        add(new Costume(51).setPhotos(1422, 1215).setName("Żołnierz").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(49).setPhotos(1258).setName("zebra").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.L)));

        add(new Costume(42).setPhotos(1330).setName("ptak").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.L)));

        add(new Costume(35).setPhotos(1322).setName("policjant").setAge(Age.ADULT).setSex(Sex.MALE).setForPair(29).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.XL, Belt.XXL)));

        add(new Costume(32).setPhotos(1312).setName("Elvis Presley").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.YEARS_70_80).setSizes(
                new Size(Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(15).setPhotos(1311).setName("Szewc Dratewka").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_188, Height.cm_194, Belt.L, Belt.XXL)));

        add(new Costume(290).setPhotos(1043).setName("Żołnierz Rzymski").setForPair(39).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_170, Belt.S)));

        add(new Costume(273).setPhotos(1083).setName("piratka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(1).setOccasions(Occasion.Inne).setCategories(Category.PIRATES).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(224).setPhotos(1016).setName("cygan").setForPair(19).setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_176, Height.cm_188, Belt.S, Belt.M),
                new Size(Height.cm_176, Height.cm_188, Belt.M, Belt.L),
                new Size(Height.cm_176, Height.cm_188, Belt.L, Belt.XL),
                new Size(Height.cm_176, Height.cm_188, Belt.XL, Belt.XXL)));

        add(new Costume(188).setPhotos(960).setName("Książe").setAge(Age.ADULT).setSex(Sex.MALE).setForPair(16).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.M),
                new Size(Height.cm_182, Height.cm_188, Belt.L, Belt.XL)));

        add(new Costume(179).setPhotos(1011).setName("piratka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(1).setOccasions(Occasion.Inne).setCategories(Category.PIRATES, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.XS, Belt.M)));

        add(new Costume(134).setPhotos(1015).setName("piratka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(1).setOccasions(Occasion.Inne).setCategories(Category.PIRATES, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.XS, Belt.M)));

        add(new Costume(464).setPhotos(1273).setName("hindus").setAge(Age.ADULT).setSex(Sex.MALE).setForPair(23).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.M),
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L),
                new Size(Height.cm_182, Height.cm_188, Belt.L, Belt.XL)));

        add(new Costume(65).setPhotos(1244).setName("pirat").setAge(Age.ADULT).setSex(Sex.MALE).setForPair(1).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.HISTORICAL, Category.PIRATES).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L),
                new Size(Height.cm_182, Height.cm_188, Belt.L, Belt.XL),
                new Size(Height.cm_182, Height.cm_188, Belt.XL, Belt.XXL)));

        add(new Costume(118).setPhotos(1244).setName("piratka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(1).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.HISTORICAL, Category.PIRATES).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.M)));

        add(new Costume(120).setPhotos(1227).setName("bawarczyk").setAge(Age.ADULT).setSex(Sex.MALE).setForPair(41).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Height.cm_182, Belt.S, Belt.M),
                new Size(Height.cm_170, Height.cm_182, Belt.L, Belt.XL)));

        add(new Costume(444).setPhotos(1227).setName("bawarka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(41).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.L, Belt.XL)));

        add(new Costume(803).setPhotos(1427, 1349).setName("Evil Mad Hatter").setAge(Age.ADULT).setSex(Sex.MALE).setForPair(9).setOccasions(Occasion.Halloween).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.M),
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L),
                new Size(Height.cm_182, Height.cm_188, Belt.L, Belt.XL)));

        add(new Costume(804).setPhotos(1350).setName("Alicja z Krainy Czarów").setIsLongName().setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(805).setPhotos(1351).setName("Piratka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(1).setOccasions(Occasion.Inne).setCategories(Category.PIRATES, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        add(new Costume(806).setPhotos(1352).setName("Policjantka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(29).setOccasions(Occasion.Inne).setCategories(Category.SEXY, Category.PROFESSIONS).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XL)));

        add(new Costume(807).setPhotos(1353, 1354, 1355, 1356).setName("sukienka lata XX-te").setIsLongName().setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(37).setOccasions(Occasion.Inne).setCategories(Category.YEARS_20_30, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.S),
                new Size(Height.cm_164, Height.cm_176, Belt.M),
                new Size(Height.cm_164, Height.cm_176, Belt.L),
                new Size(Height.cm_164, Height.cm_176, Belt.XL)));

        add(new Costume(808).setPhotos(1357, 1358).setName("Hipiska").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(14).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80, Category.SEXY).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.XS, Belt.S),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(809).setPhotos(1359, 1360).setName("Wampirzyca").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(9).setOccasions(Occasion.Halloween).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(810).setPhotos(1361, 1362).setName("Wampirzyca").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(9).setOccasions(Occasion.Halloween).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(812).setPhotos(1367).setName("Greczynka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.SEXY).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        add(new Costume(813).setPhotos(1368).setName("Wojowniczka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(39).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.SEXY).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(814).setPhotos(1369).setName("Ninja").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.SEXY).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(815).setPhotos(1370).setName("Smoczyca").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        add(new Costume(816).setPhotos(1371, 1372).setName("Motyl").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(818).setPhotos(1374, 1375).setName("Jaskiniowiec").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(17).setOccasions(Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(819).setPhotos(1376).setName("Piratka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(1).setOccasions(Occasion.Inne).setCategories(Category.PIRATES, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(820).setPhotos(1377).setName("greczynka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(76).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(822).setPhotos(1379).setName("wojowniczka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(39).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(823).setPhotos(1380).setName("smok").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(824).setPhotos(1381, 1382).setName("smok").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(825).setPhotos(1383).setName("piratka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(1).setOccasions(Occasion.Inne).setCategories(Category.PIRATES, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XL, Belt.XXL)));

        add(new Costume(826).setPhotos(1384).setName("mieszczka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(827).setPhotos(1385).setName("greczynka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(76).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.L, Belt.XL)));

        add(new Costume(828).setPhotos(1386, 1387).setName("smok").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.ANIMALS).setSizes(
                new Size(Height.cm_110, Height.cm_116),
                new Size(Height.cm_122, Height.cm_128)));

        add(new Costume(829).setPhotos(1388, 1389).setName("zebra").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_122, Height.cm_128),
                new Size(Height.cm_134, Height.cm_140),
                new Size(Height.cm_146, Height.cm_152)));

        add(new Costume(830).setPhotos(1390).setName("policjantka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_110, Height.cm_116),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(831).setPhotos(1391, 1392, 1393).setName("lew").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(832).setPhotos(1394, 1395).setName("wampirzyca").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_146),
                new Size(Height.cm_152)));

        add(new Costume(833).setPhotos(1396, 1397).setName("piratka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.PIRATES).setSizes(
                new Size(Height.cm_152)));

        add(new Costume(834).setPhotos(1398, 1399).setName("Robin Hood").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(3).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.SEXY).setSizes(
                new Size(Height.cm_158, Height.cm_164, Belt.S)));

        add(new Costume(835).setPhotos(1400).setName("jaskiniowiec").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_146),
                new Size(Height.cm_152)));

        add(new Costume(837).setPhotos(1403).setName("Czerwony Kapturek").setAge(Age.ADULT).setIsLongName().setSex(Sex.FEMALE).setForPair(18).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(838).setPhotos(1405).setName("Robin Hood").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(3).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.L),
                new Size(Height.cm_164, Height.cm_170, Belt.XL)));

        add(new Costume(839).setPhotos(1406).setName("Panterka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY, Category.ANIMALS).setSizes(
                new Size(Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(840).setPhotos(1407).setName("Tygrys").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY, Category.ANIMALS).setSizes(
                new Size(Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(841).setPhotos(1408).setName("Króliczek").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(842).setPhotos(1409).setName("cyganka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(19).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        add(new Costume(848).setPhotos(1424).setName("cigarettes girl").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        add(new Costume(849).setPhotos(1428).setName("Różowy potwór").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_152)));

        add(new Costume(850).setPhotos(1429).setName("Fioletowy potwór").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        add(new Costume(851).setPhotos(1432).setName("Zombie").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_140),
                new Size(Height.cm_146)));

        add(new Costume(852).setPhotos(1435).setName("piratka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.PIRATES).setSizes(
                new Size(Height.cm_146, Height.cm_152),
                new Size(Height.cm_158, Height.cm_164),
                new Size(Height.cm_152, Height.cm_158)));

        add(new Costume(853).setPhotos(1437).setName("Cyganka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        add(new Costume(854).setPhotos(1438).setName("Pokojówka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L),
                new Size(Height.cm_170, Height.cm_176, Belt.L, Belt.XL)));

        add(new Costume(855).setPhotos(1440).setName("Cyganka").setAge(Age.ADULT).setForPair(19).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.XL, Belt.XXL)));

        add(new Costume(856).setPhotos(1441).setName("Czerwona Królowa").setIsLongName().setAge(Age.ADULT).setForPair(22).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.XL, Belt.XXL)));

        add(new Costume(857).setPhotos(1442).setName("Kleopatra").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(65).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.XL, Belt.XXL)));

        add(new Costume(858).setPhotos(1443).setName("Czerwony Kapturek").setIsLongName().setAge(Age.ADULT).setForPair(18).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.XL, Belt.XXL)));

        add(new Costume(859).setPhotos(1444).setName("Spartanka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.SEXY).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S)));

        add(new Costume(860).setPhotos(1445).setName("Bawarka").setForPair(41).setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.S),
                new Size(Height.cm_164, Height.cm_176, Belt.M),
                new Size(Height.cm_164, Height.cm_176, Belt.L)));

        add(new Costume(861).setPhotos(1446).setName("sukienka lata 20-te").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_20_30, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.L)));

        add(new Costume(862).setPhotos(1447).setName("sukienka lata 20-te").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_20_30, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XXL),
                new Size(Height.cm_164, Height.cm_170, Belt.XXXXL)));

        add(new Costume(863).setPhotos(1448).setName("Gotycki Czerwony Kapturek").setIsLongName().setAge(Age.ADULT).setForPair(18).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.L),
                new Size(Height.cm_164, Height.cm_176, Belt.L, Belt.XL),
                new Size(Height.cm_164, Height.cm_176, Belt.XXL, Belt.XXXL),
                new Size(Height.cm_164, Height.cm_176, Belt.XXXL, Belt.XXXXL)));

        add(new Costume(864).setPhotos(1449).setName("sukienka lata 20-te").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_20_30, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        add(new Costume(865).setPhotos(1450).setName("Wampirzyca").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(9).setOccasions(Occasion.Halloween).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XXL, Belt.XXXL)));

        add(new Costume(866).setPhotos(1451, 1452).setName("Wojowniczka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(39).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.XXL),
                new Size(Height.cm_164, Height.cm_176, Belt.XXXL)));

        add(new Costume(867).setPhotos(1453).setName("Wojowniczka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(39).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.S),
                new Size(Height.cm_164, Height.cm_176, Belt.L)));

        add(new Costume(868).setPhotos(1454).setName("Pielęgniarka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.XXL)));

        add(new Costume(869).setPhotos(1455).setName("księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_134)));

        add(new Costume(870).setPhotos(1456).setName("suknia").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_170, Height.cm_176)));

        add(new Costume(871).setPhotos(1457, 1458).setName("szata grecka").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.HISTORICAL, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_182, Height.cm_188)));

        add(new Costume(872).setPhotos(1459).setName("Duszek").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween, Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_104, Height.cm_110)));

        add(new Costume(873).setPhotos(1460).setName("Biedronka").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_86, Height.cm_98)));

        add(new Costume(874).setPhotos(1461).setName("Pszczółka").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_86, Height.cm_98)));

        add(new Costume(875).setPhotos(1462).setName("Lord Vader").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Halloween, Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L),
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        add(new Costume(876).setPhotos(1463).setName("Księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_110, Height.cm_116)));

        add(new Costume(877).setPhotos(1464, 1465).setName("Szop").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_182, Height.cm_194)));

        add(new Costume(878).setPhotos(1466).setName("Kopciuszek").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(879).setPhotos(1467).setName("Kurczak").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_176, Height.cm_188, Belt.S, Belt.XL)));

        add(new Costume(880).setPhotos(1713, 1468).setName("Księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134)));

        add(new Costume(881).setPhotos(1469).setName("Kubuś Puchatek").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.ANIMALS).setSizes(
                new Size(Height.cm_152, Height.cm_158, Belt.XS, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.XL),
                new Size(Height.cm_188, Height.cm_194, Belt.S, Belt.XL)));

        add(new Costume(882).setPhotos(1470).setName("Księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(883).setPhotos(1471).setName("Konik polny").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_182, Height.cm_194)));

        add(new Costume(884).setPhotos(1472, 1707).setName("Bella").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_134)));

        add(new Costume(885).setPhotos(1473).setName("Rekin").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.XL),
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.XL),
                new Size(Height.cm_188, Height.cm_194, Belt.L, Belt.XXL)));

        add(new Costume(886).setPhotos(1474).setName("Wilk").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_176, Height.cm_188, Belt.S, Belt.XL)));

        add(new Costume(887).setPhotos(1475).setName("Jesienny Elf").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_104, Height.cm_110)));

        add(new Costume(888).setPhotos(1476).setName("Pszczółka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_122)));

        add(new Costume(889).setPhotos(1477).setName("Bocian").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_182, Height.cm_194, Belt.L, Belt.XXL),
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.L)));

        add(new Costume(890).setPhotos(1478).setName("Pszczółka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(891).setPhotos(1479).setName("pszczółka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_98, Height.cm_110)));

        add(new Costume(892).setPhotos(1480).setName("Pies").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_182, Height.cm_194)));

        add(new Costume(893).setPhotos(1481).setName("Wilk").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.M)));

        add(new Costume(894).setPhotos(1482).setName("Królowa").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Jasełka, Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_158, Height.cm_164, Belt.XS, Belt.M),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.XL)));

        add(new Costume(895).setPhotos(1483).setName("Biedronka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116)));

        add(new Costume(896).setPhotos(1484).setName("Klakier").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_182, Belt.M, Belt.L)));

        add(new Costume(897).setPhotos(1485).setName("Świnka").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_164, Belt.M, Belt.XL),
                new Size(Height.cm_170, Belt.XS, Belt.M),
                new Size(Height.cm_188, Belt.XL, Belt.XXXL)));

        add(new Costume(898).setPhotos(1486).setName("Biedronka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_98, Height.cm_110)));

        add(new Costume(899).setPhotos(1487).setName("Suknia").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_164, Belt.M)));

        add(new Costume(900).setPhotos(1489).setName("Koń").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.L, Belt.XXXL)));

        add(new Costume(901).setPhotos(1490).setName("Gargamel").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Halloween, Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.XL)));

        add(new Costume(902).setPhotos(1491).setName("Krasnoludek").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146),
                new Size(Height.cm_152),
                new Size(Height.cm_158)));

        add(new Costume(903).setPhotos(1492).setName("Kret").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.L)));

        add(new Costume(904).setPhotos(1493).setName("Pirat").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.PIRATES).setSizes(
                new Size(Height.cm_98),
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116)));

        add(new Costume(905).setPhotos(1494, 1495).setName("Indyk").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L)));

        add(new Costume(906).setPhotos(1496).setName("Wilk").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_164, Belt.S, Belt.L)));

        add(new Costume(907).setPhotos(1497).setName("Robin Hood").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.M),
                new Size(Height.cm_182, Height.cm_188, Belt.L),
                new Size(Height.cm_182, Height.cm_188, Belt.XL),
                new Size(Height.cm_182, Height.cm_188, Belt.XXL)));

        add(new Costume(908).setPhotos(1498).setName("Suknia").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(909).setPhotos(1499).setName("Obi Wan Kenobi").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_170, Belt.S, Belt.L),
                new Size(Height.cm_176, Belt.M, Belt.XL)));

        add(new Costume(910).setPhotos(1500).setName("Jack Sparrow").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.PIRATES).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.M),
                new Size(Height.cm_182, Height.cm_188, Belt.L),
                new Size(Height.cm_182, Height.cm_188, Belt.XL),
                new Size(Height.cm_182, Height.cm_188, Belt.XXL)));

        add(new Costume(911).setPhotos(1501).setName("Kapitan Hak").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.PIRATES).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L)));

        add(new Costume(912).setPhotos(1502).setName("Superman").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.SUPER_HEROES).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L),
                new Size(Height.cm_182, Height.cm_188, Belt.L, Belt.XXL)));

        add(new Costume(913).setPhotos(1503).setName("Kościotrup").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_176, Belt.S, Belt.M)));

        add(new Costume(914).setPhotos(1504).setName("Rycerz").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.L)));

        add(new Costume(915).setPhotos(1505).setName("Szecherezada").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        add(new Costume(916).setPhotos(1506).setName("Miś").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_158, Height.cm_164, Belt.S, Belt.L),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.XL),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.XXL),
                new Size(Height.cm_176, Height.cm_182, Belt.M, Belt.XXL),
                new Size(Height.cm_182, Height.cm_188, Belt.L, Belt.XXXL),
                new Size(Height.cm_188, Height.cm_194, Belt.XL, Belt.XXXXL)));

        add(new Costume(917).setPhotos(1507).setName("Mrówka").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.XS, Belt.M)));

        add(new Costume(918).setPhotos(1508).setName("Hipis").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_182, Belt.M, Belt.L)));

        add(new Costume(919).setPhotos(1509).setName("Wąż").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.XS, Belt.M)));

        add(new Costume(920).setPhotos(1510).setName("Syrena").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.PIRATES).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(921).setPhotos(1511).setName("Syrena").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.PIRATES).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(922).setPhotos(1512).setName("Królowa Zima").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Belt.XL, Belt.XXL)));

        add(new Costume(923).setPhotos(1513).setName("Syrena").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.PIRATES).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.M)));

        add(new Costume(925).setPhotos(1514).setName("Wróżka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Belt.L)));

        add(new Costume(926).setPhotos(1515).setName("Księżniczka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Belt.XS, Belt.S)));

        add(new Costume(927).setPhotos(1516).setName("Turczynka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M)));

        add(new Costume(928).setPhotos(1517).setName("Lord Vader").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Halloween, Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146),
                new Size(Height.cm_152),
                new Size(Height.cm_158)));

        add(new Costume(929).setPhotos(1518).setName("Stewardessa").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_164, Belt.L)));

        add(new Costume(930).setPhotos(1519).setName("Krówka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY, Category.ANIMALS).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.L, Belt.XXL)));

        add(new Costume(931).setPhotos(1520).setName("Dworzanin").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_164, Belt.S, Belt.M),
                new Size(Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(932).setPhotos(1521).setName("Clown").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.PROFESSIONS).setSizes(
                new Size(Height.cm_134)));

        add(new Costume(933).setPhotos(1522).setName("Jaskiniowiec").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.L)));

        add(new Costume(934).setPhotos(1523).setName("Syrena").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.PIRATES).setSizes(
                new Size(Height.cm_158, Height.cm_164, Belt.S, Belt.M)));

        add(new Costume(935).setPhotos(1524).setName("Clown").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.PROFESSIONS).setSizes(
                new Size(Height.cm_128)));

        add(new Costume(936).setPhotos(1525).setName("Ptak").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.XL)));

        add(new Costume(937).setPhotos(1526).setName("Bella").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Belt.XS, Belt.S)));

        add(new Costume(938).setPhotos(1527).setName("Zombie").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Halloween, Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_158)));

        add(new Costume(939).setPhotos(1528).setName("suknia lata XX-te").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.YEARS_20_30).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.L)));

        add(new Costume(940).setPhotos(1529).setName("Brzydkie Kaczątko").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.L)));

        add(new Costume(941).setPhotos(1530).setName("Więzień").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_146)));
        add(new Costume(942).setPhotos(1531, 1532).setName("suknia").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_164, Belt.XS, Belt.S)));

        add(new Costume(943).setPhotos(1533).setName("Spidermanka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SUPER_HEROES).setSizes(
                new Size(Height.cm_164, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(944).setPhotos(1534).setName("Kopciuszek").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.SEXY).setSizes(
                new Size(Height.cm_164, Belt.XS, Belt.S),
                new Size(Height.cm_164, Belt.S, Belt.M),
                new Size(Height.cm_164, Belt.M, Belt.L)));

        add(new Costume(945).setPhotos(1535).setName("Syrena").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.PIRATES).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(946).setPhotos(1536).setName("Straszydło").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_152, Height.cm_158)));

        add(new Costume(947).setPhotos(1537).setName("Żyrafa").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(948).setPhotos(1538).setName("Szara Śmierć").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_158)));

        add(new Costume(949).setPhotos(1539).setName("Wiosna").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_158, Height.cm_170, Belt.S, Belt.L)));

        add(new Costume(950).setPhotos(1540).setName("Supermanka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.SEXY, Category.SUPER_HEROES).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.L)));
        add(new Costume(951).setPhotos(1541, 1542).setName("Czarownica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M)));

        add(new Costume(952).setPhotos(1543).setName("Obi Wan Kenobi").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146),
                new Size(Height.cm_152),
                new Size(Height.cm_164)));

        add(new Costume(953).setPhotos(1544).setName("Wiosna").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_158, Height.cm_170, Belt.XS, Belt.L)));

        add(new Costume(954).setPhotos(1545).setName("Robin Hood").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_80),
                new Size(Height.cm_92),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152),
                new Size(Height.cm_164)));

        add(new Costume(955).setPhotos(1546).setName("Czarownica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.M)));

        add(new Costume(956).setPhotos(1547).setName("Jaszczurka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        add(new Costume(957).setPhotos(1548).setName("Hipiska").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(958).setPhotos(1549).setName("Rycerz").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(959).setPhotos(1550).setName("Diablica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(960).setPhotos(1551).setName("Żołnierz").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_152)));

        add(new Costume(961).setPhotos(1552, 1553).setName("Wonder Woman").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(33).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.NATIONALISTIC, Category.SEXY).setSizes(
                new Size(Height.cm_170, Height.cm_182, Belt.M, Belt.L)));

        add(new Costume(962).setPhotos(1554).setName("Kierowca rajdowy").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        add(new Costume(963).setPhotos(1555).setName("Rycerz").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_152, Height.cm_158)));

        add(new Costume(964).setPhotos(1556).setName("Policjantka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(29).setOccasions(Occasion.Inne).setCategories(Category.SEXY, Category.PROFESSIONS).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.L, Belt.XL)));

        add(new Costume(965).setPhotos(1557).setName("Bawarka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(966).setPhotos(1558).setName("Ninja").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146),
                new Size(Height.cm_152),
                new Size(Height.cm_158),
                new Size(Height.cm_164)));

        add(new Costume(967).setPhotos(1559).setName("Uczennica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(968).setPhotos(1560).setName("Książę").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        add(new Costume(969).setPhotos(1561).setName("Torreador").setAge(Age.ADULT).setSex(Sex.MALE).setForPair(52).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(970).setPhotos(1562).setName("Sułtan").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152)));

        add(new Costume(971).setPhotos(1563).setName("Księżniczka").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(26).setOccasions(Occasion.Andrzejki, Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        add(new Costume(972).setPhotos(1564).setName("Bałwanek").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Mikołajki, Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_92, Height.cm_110)));

        add(new Costume(973).setPhotos(1565).setName("Barbie").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S)));

        add(new Costume(974).setPhotos(1566, 1567).setName("Małpka").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_80, Height.cm_104)));

        add(new Costume(975).setPhotos(1568, 1569).setName("Dynia").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_92, Height.cm_104)));

        add(new Costume(976).setPhotos(1570).setName("Śnieżynka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Mikołajki).setCategories(Category.FAIRY_TALES, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(977).setPhotos(1571).setName("Suknia").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Belt.XS, Belt.S)));

        add(new Costume(978).setPhotos(1572, 1573).setName("Smok").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_74)));

        add(new Costume(979).setPhotos(1574, 1575).setName("Pingwin").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.ANIMALS).setSizes(
                new Size(Height.cm_80),
                new Size(Height.cm_92)));

        add(new Costume(980).setPhotos(1576).setName("Arlekin").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.XS, Belt.S),
                new Size(Height.cm_170, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(981).setPhotos(1577).setName("Miś").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_80, Height.cm_104)));

        add(new Costume(982).setPhotos(1578).setName("Renifer").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Mikołajki).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_176, Height.cm_188, Belt.M, Belt.XXL)));

        add(new Costume(983).setPhotos(1579).setName("Renifer").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Mikołajki).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_158, Height.cm_170, Belt.XS, Belt.L)));

        add(new Costume(984).setPhotos(1580).setName("Renifery").setAge(Age.ADULT).setSex(Sex.BOTH).setOccasions(Occasion.Mikołajki).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_158, Height.cm_188, Belt.XS, Belt.XXL)));

        add(new Costume(995).setPhotos(1593).setName("Diablica").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(8).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.L)));

        add(new Costume(996).setPhotos(1594).setName("Szejk").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_152)));

        add(new Costume(997).setPhotos(1595).setName("Kontusz Szlachecki").setAge(Age.ADULT).setSex(Sex.MALE).setForPair(15).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L)));

        add(new Costume(998).setPhotos(1597, 1598).setName("Suknia").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_158, Height.cm_164, Belt.S, Belt.M)));

        add(new Costume(999).setPhotos(1599).setName("Kotek").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_134)));

        add(new Costume(1000).setPhotos(1600).setName("Księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_80),
                new Size(Height.cm_86),
                new Size(Height.cm_98)));

        add(new Costume(1001).setPhotos(1601).setName("Pirat").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.PIRATES).setSizes(
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_146),
                new Size(Height.cm_152),
                new Size(Height.cm_158)));

        add(new Costume(1002).setPhotos(1602).setName("Diablica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween, Occasion.Inne).setCategories(Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(1003).setPhotos(1603).setName("Kontusz Szlachecki").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.L)));

        add(new Costume(1004).setPhotos(1604).setName("Robin Hood").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(3).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.L),
                new Size(Height.cm_164, Height.cm_170, Belt.XL),
                new Size(Height.cm_164, Height.cm_170, Belt.XXL)));

        add(new Costume(1005).setPhotos(1605).setName("Królowa Zima").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_110),
                new Size(Height.cm_134)));

        add(new Costume(1006).setPhotos(1606).setName("Księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_86)));

        add(new Costume(1007).setPhotos(1607).setName("Żołnierz").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_146),
                new Size(Height.cm_152)));

        add(new Costume(1008).setPhotos(1608).setName("Sukienka lata XX-te").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.YEARS_20_30, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_170, Belt.M, Belt.L)));

        add(new Costume(1009).setPhotos(1610).setName("Śnieżynka-Mikołajka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Mikołajki).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.L),
                new Size(Height.cm_164, Height.cm_176, Belt.L, Belt.XL)));

        add(new Costume(1018).setPhotos(1621).setName("suknia lata XX-te").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(37).setOccasions(Occasion.Inne).setCategories(Category.YEARS_20_30).setSizes(
                new Size(Height.cm_170, Belt.M)));

        add(new Costume(1019).setPhotos(1622).setName("Elf").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        add(new Costume(1020).setPhotos(1623).setName("Michel Jackson").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_152, Height.cm_158),
                new Size(Height.cm_164, Height.cm_170)));

        add(new Costume(1021).setPhotos(1624).setName("Pielęgniarka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(1022).setPhotos(1625).setName("Król").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.L, Belt.XXL)));

        add(new Costume(1023).setPhotos(1626).setName("Michael Jackson").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_152, Height.cm_158),
                new Size(Height.cm_164, Height.cm_170)));

        add(new Costume(1024).setPhotos(1627).setName("Czarownica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        add(new Costume(1025).setPhotos(1628).setName("Michael Jackson").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_152, Height.cm_158),
                new Size(Height.cm_164, Height.cm_170)));

        add(new Costume(1026).setPhotos(1629).setName("księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(1027).setPhotos(1630).setName("Król").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL).setSizes(
                new Size(Height.cm_188, Height.cm_194, Belt.L, Belt.XXL)));

        add(new Costume(1028).setPhotos(1631).setName("Kocica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween, Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.SEXY, Category.ANIMALS).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.XS, Belt.S)));

        add(new Costume(1029).setPhotos(1632).setName("Kopciuszek").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(1030).setPhotos(1633).setName("Krasnal").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_146, Height.cm_152)));

        add(new Costume(1031).setPhotos(1634).setName("Król").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.L, Belt.XXL)));

        add(new Costume(1032).setPhotos(1635).setName("Syrena").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.PIRATES).setSizes(
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(1033).setPhotos(1636).setName("Księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(1034).setPhotos(1637).setName("Krasnal").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146),
                new Size(Height.cm_152, Height.cm_158)));

        add(new Costume(1035).setPhotos(1638).setName("Król").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.L, Belt.XXL)));

        add(new Costume(1036).setPhotos(1639).setName("Księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(1037).setPhotos(1642).setName("Smok").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(1038).setPhotos(1643).setName("tancerka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(1039).setPhotos(1644).setName("Hipopotam").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_140)));

        add(new Costume(1040).setPhotos(1645).setName("Król").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.L, Belt.XXL)));

        add(new Costume(1041).setPhotos(1646).setName("Miś Coala").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(1042).setPhotos(1647).setName("Diablica").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_158, Height.cm_164, Belt.XS, Belt.S)));

        add(new Costume(1043).setPhotos(1648).setName("Piratka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.PIRATES).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(1044).setPhotos(1649).setName("Król").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.XL, Belt.XXXL)));

        add(new Costume(1045).setPhotos(1650).setName("Diabeł").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.XXL)));

        add(new Costume(1046).setPhotos(1651).setName("Pingwin").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_122, Height.cm_128),
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(1047).setPhotos(1652).setName("Księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_116)));

        add(new Costume(1048).setPhotos(1653).setName("Kombinezon").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_164, Belt.S, Belt.M)));

        add(new Costume(1049).setPhotos(1654).setName("Król").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.L, Belt.XXL)));

        add(new Costume(1050).setPhotos(1655).setName("Kombinezon").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_164, Belt.XS, Belt.S)));

        add(new Costume(1051).setPhotos(1656).setName("Smok").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(1052).setPhotos(1657).setName("Księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_116)));

        add(new Costume(1053).setPhotos(1658).setName("Kombinezon").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_164, Belt.XS, Belt.S),
                new Size(Height.cm_164, Belt.S, Belt.M)));

        add(new Costume(1054).setPhotos(1659).setName("Dinozaur").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_146, Height.cm_152)));

        add(new Costume(1055).setPhotos(1661).setName("Królewna").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(1056).setPhotos(1662).setName("Kombinezon").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_164, Belt.S, Belt.M)));

        add(new Costume(1057).setPhotos(1663).setName("Król").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Jasełka).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.M, Belt.XL)));

        add(new Costume(1058).setPhotos(1664).setName("Księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(1059).setPhotos(1665).setName("Kombinezon").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_164, Belt.XS, Belt.S),
                new Size(Height.cm_164, Height.cm_170, Belt.S, Belt.M)));

        add(new Costume(1061).setPhotos(1667).setName("Anna").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(1062).setPhotos(1668).setName("Elsa").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(1063).setPhotos(1669).setName("Banan").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FRUITS_VEGETABLES).setSizes(
                new Size(Height.cm_176, Height.cm_194, Belt.M, Belt.XL)));

        add(new Costume(1064).setPhotos(1670).setName("Księżniczka Zosia").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_116)));

        add(new Costume(993).setPhotos(1671).setName("Księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(992).setPhotos(1672).setName("Księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(991).setPhotos(1673).setName("Księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(990).setPhotos(1674).setName("Elf").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(989).setPhotos(1675).setName("Dzwoneczek").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(988).setPhotos(1676).setName("Elf").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(987).setPhotos(1677).setName("Elf").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(986).setPhotos(1678).setName("Elf").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(985).setPhotos(1679).setName("Cyganka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_104)));

        add(new Costume(924).setPhotos(1680).setName("Księżniczka").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.XL, Belt.XXL)));

        add(new Costume(847).setPhotos(1681).setName("Dama").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween, Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_140),
                new Size(Height.cm_146)));

        add(new Costume(846).setPhotos(1682).setName("Suknia").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.XL, Belt.XXL)));

        add(new Costume(845).setPhotos(1683).setName("Śnieżynka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Mikołajki).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_128),
                new Size(Height.cm_140),
                new Size(Height.cm_152),
                new Size(Height.cm_158)));

        add(new Costume(844).setPhotos(1684).setName("Suknia").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.HISTORICAL).setSizes(
                new Size(Height.cm_170, Height.cm_182, Belt.L, Belt.XL),
                new Size(Height.cm_170, Height.cm_182, Belt.XL, Belt.XXL)));

        add(new Costume(843).setPhotos(1685).setName("Dama").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_134),
                new Size(Height.cm_140)));

        add(new Costume(793).setPhotos(1686).setName("suknia grecka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.HISTORICAL, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_152)));

        add(new Costume(791).setPhotos(1687).setName("Czarownica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(788).setPhotos(1688).setName("Marynarz").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.PROFESSIONS).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_152)));

        add(new Costume(786).setPhotos(1689).setName("Diablica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_134),
                new Size(Height.cm_140),
                new Size(Height.cm_146)));

        add(new Costume(774).setPhotos(1690).setName("dama").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_146, Height.cm_152)));

        add(new Costume(755).setPhotos(1691).setName("Dama").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_122),
                new Size(Height.cm_146)));

        add(new Costume(747).setPhotos(1692).setName("Renifer").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Jasełka).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104),
                new Size(Height.cm_116),
                new Size(Height.cm_128)));

        add(new Costume(738).setPhotos(1693).setName("Dama").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_128),
                new Size(Height.cm_134)));

        add(new Costume(706).setPhotos(1697).setName("Lodowa Księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_134)));

        add(new Costume(696).setPhotos(1695).setName("Suknia lata XX-te").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_20_30).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.XL, Belt.XXL)));

        add(new Costume(659).setPhotos(1696).setName("Tancerka Turecka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_146)));

        add(new Costume(624).setPhotos(1698).setName("Dama").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_134)));

        add(new Costume(606).setPhotos(1699).setName("Śnieżynka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Mikołajki).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_140)));

        add(new Costume(575).setPhotos(1700).setName("Śnieżna Wróżka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Andrzejki, Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_110),
                new Size(Height.cm_134)));

        add(new Costume(522).setPhotos(1701).setName("Czarownica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_152)));

        add(new Costume(519).setPhotos(1592, 1702).setName("Królowa Śniegu").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_110),
                new Size(Height.cm_134)));

        add(new Costume(512).setPhotos(1703).setName("Czarownica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_140, Height.cm_152)));

        add(new Costume(510).setPhotos(1704).setName("Królowa Zima").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_110),
                new Size(Height.cm_134)));

        add(new Costume(489).setPhotos(1705).setName("Czarownica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_140),
                new Size(Height.cm_146)));

        add(new Costume(481).setPhotos(1706).setName("Piratka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_152)));

        add(new Costume(440).setPhotos(1708).setName("Panterka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_110, Height.cm_116),
                new Size(Height.cm_122, Height.cm_128),
                new Size(Height.cm_134, Height.cm_140),
                new Size(Height.cm_146, Height.cm_152)));

        add(new Costume(409).setPhotos(1709).setName("Dama").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_128),
                new Size(Height.cm_134)));

        add(new Costume(359).setPhotos(1710).setName("Tygrys").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_122, Height.cm_128),
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(350).setPhotos(1711).setName("Dama").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_128),
                new Size(Height.cm_134)));

        add(new Costume(349).setPhotos(1712).setName("Dama").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_116),
                new Size(Height.cm_140)));

        add(new Costume(320).setPhotos(1715).setName("Księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_128),
                new Size(Height.cm_140)));

        add(new Costume(309).setPhotos(1716).setName("Dama").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_110),
                new Size(Height.cm_116),
                new Size(Height.cm_140)));

        add(new Costume(303).setPhotos(1717).setName("Dama").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_140)));

        add(new Costume(289).setPhotos(1719).setName("Dama").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween, Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_134),
                new Size(Height.cm_146)));

        add(new Costume(278).setPhotos(1720).setName("Czarownica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_140),
                new Size(Height.cm_146)));

        add(new Costume(277).setPhotos(1721).setName("Czarownica").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_134)));

        add(new Costume(269).setPhotos(1722).setName("Mysz").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_140)));

        add(new Costume(255).setPhotos(1723).setName("Kościotrup").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_122),
                new Size(Height.cm_128),
                new Size(Height.cm_134)));

        add(new Costume(246).setPhotos(1724).setName("Turczynka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_128)));

        add(new Costume(228).setPhotos(1725).setName("Pokemon").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_140)));

        add(new Costume(210).setPhotos(1726).setName("Śnieżynka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Jasełka, Occasion.Mikołajki, Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_98),
                new Size(Height.cm_104),
                new Size(Height.cm_110),
                new Size(Height.cm_116)));

        add(new Costume(206).setPhotos(1727).setName("Hipis").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_134, Height.cm_140)));

        add(new Costume(204).setPhotos(1728).setName("księżniczka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_116)));

        add(new Costume(200).setPhotos(1729).setName("Cleo").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.SEXY).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.S, Belt.M),
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(199).setPhotos(1730).setName("Tancerka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(180).setPhotos(1731).setName("Hipis").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.YEARS_70_80).setSizes(
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(171).setPhotos(1732).setName("Kotek").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Halloween, Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_110)));

        add(new Costume(129).setPhotos(1733, 1734).setName("Żółw Ninja").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_104, Height.cm_110),
                new Size(Height.cm_116, Height.cm_122),
                new Size(Height.cm_128, Height.cm_134),
                new Size(Height.cm_140, Height.cm_146)));

        add(new Costume(125).setPhotos(1735).setName("Smok").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Halloween, Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_98, Height.cm_104)));

        add(new Costume(110).setPhotos(1736).setName("Książe").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE, Category.HISTORICAL).setSizes(
                new Size(Height.cm_134, Height.cm_140)));

        add(new Costume(109).setPhotos(1737).setName("Dinozaur").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_104, Height.cm_110)));

        add(new Costume(108).setPhotos(1738).setName("Gandalf").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Andrzejki).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_128, Height.cm_134)));

        add(new Costume(101).setPhotos(1739).setName("Dinozaur").setAge(Age.CHILD).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_98, Height.cm_104)));

        add(new Costume(98).setPhotos(1740).setName("Gąsienica").setAge(Age.CHILD).setSex(Sex.BOTH).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_116, Height.cm_122)));

        add(new Costume(97).setPhotos(1741).setName("Kotek").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.ANIMALS).setSizes(
                new Size(Height.cm_110, Height.cm_116)));

        add(new Costume(80).setPhotos(1742, 1743).setName("Kowbojka").setAge(Age.CHILD).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.WILD_WEST, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_116, Height.cm_122)));

        add(new Costume(76).setPhotos(1744, 1746).setName("Jesień").setAge(Age.ADULT).setSex(Sex.FEMALE).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES).setSizes(
                new Size(Height.cm_164, Height.cm_176, Belt.M, Belt.L)));

        add(new Costume(58).setPhotos(1745).setName("Statua Wolności").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.MOVIE_STAGE, Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_182, Height.cm_194, Belt.L, Belt.XXXXL)));

        add(new Costume(57).setPhotos(1747).setName("Wenus").setAge(Age.ADULT).setSex(Sex.FEMALE).setForPair(5).setOccasions(Occasion.Inne).setCategories(Category.FAIRY_TALES, Category.MOVIE_STAGE).setSizes(
                new Size(Height.cm_170, Height.cm_176, Belt.M)));

        add(new Costume(38).setPhotos(1748).setName("Duch Mężczyzny").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Halloween).setCategories(Category.OTHERS).setSizes(
                new Size(Height.cm_182, Height.cm_188, Belt.S, Belt.M),
                new Size(Height.cm_182, Height.cm_188, Belt.L, Belt.XL)));

        add(new Costume(14).setPhotos(1666).setName("Sułtan").setAge(Age.ADULT).setSex(Sex.MALE).setOccasions(Occasion.Inne).setCategories(Category.NATIONALISTIC).setSizes(
                new Size(Height.cm_176, Height.cm_182, Belt.S, Belt.M),
                new Size(Height.cm_176, Height.cm_182, Belt.L, Belt.XL)));

    }

    private void add(Costume s) {
        costumes.add(s);
    }

    public ArrayList<Costume> getCostumes() {
        return costumes;
    }
}
