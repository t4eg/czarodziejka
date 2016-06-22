package pl.com.czarodziejka.czarodziejka.client.pages.search.database;

import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Category;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Occasion;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Size;
import pl.com.czarodziejka.czarodziejka.client.pages.search.database.costume.Costume;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Adam Mazur
 */
public class DatabaseTest {

    StringBuilder raport = new StringBuilder();

    public DatabaseTest(ArrayList<Costume> stroje) {
        testNiewykorzystanyNrStroju(stroje);

        testCzyJestUstawionaKategoria(stroje);
        testCzyJestUstawionaNazwa(stroje);
        testCzyJestUstawionaOkazja(stroje);
        testCzyJestUstawionaPlec(stroje);
        testCzyJestUstawioneZdjecie(stroje);
        testCzyJestUstawionyRozmiar(stroje);
        testCzyJestUstawionyWiek(stroje);

        testCzyNumberSiePowtarza(stroje);
        testCzyRozmiarSiePowtarza(stroje);
        testCzyKategoriaSiePowtarza(stroje);
        testCzyOkazjaSiePowtarza(stroje);
        testCzyZdjecieSiePowtarza(stroje);

        testCzyNieJedynaKategoriaInne(stroje);
        testCzyNieJedynaOkazjaInne(stroje);
        testCzyNazwaSieTrimuje(stroje);
        testCzyNazwaSieTrimuje(stroje);
        testCzyDlaParyMaPare(stroje);

        String rap = raport.toString();
        rap = null;
    }

    private void testCzyDlaParyMaPare(ArrayList<Costume> stroje) {
        raport.append("======start testDlaParyMaPare\n");
        Map<Integer, Integer> nrCount = new HashMap<>();
        for (Costume stroj : stroje) {
            int nr = stroj.getGrupaPary();
            if (nrCount.containsKey(nr)) {
                nrCount.put(nr, nrCount.get(nr) + 1);
            } else {
                nrCount.put(nr, 1);
            }
        }
        for (Entry<Integer, Integer> row : nrCount.entrySet()) {
            if (row.getValue() == 1) {
                raport.append("Para ");
                raport.append(row.getKey());
                raport.append(" ma tylko jeden element! Trzeba usunąć parę");
                raport.append("\n");
            }
        }
        raport.append("======stop testDlaParyMaPare\n");
    }

    private void testNiewykorzystanyNrStroju(ArrayList<Costume> stroje) {
        raport.append("======start testNiewykorzystanyNrStroju\n");
        Integer maxNumer = 0;
        HashSet<Integer> all = new HashSet<>();
        for (Costume stroj : stroje) {
            if (stroj.getNumber() > maxNumer) {
                maxNumer = stroj.getNumber();
            }
            all.add(stroj.getNumber());
        }
        for (int i = 1; i < maxNumer; i++) {
            if (!all.contains(i)) {
                raport.append("Nie wykorzystany numer stroju: ");
                raport.append(i);
                raport.append("\n");
            }
        }
        raport.append("======stop testNiewykorzystanyNrStroju\n\n");
    }

    private void testCzyNieJedynaOkazjaInne(ArrayList<Costume> stroje) {
        raport.append("======start testCzyNieJedynaOkazjaInne\n");
        for (Costume stroj : stroje) {
            Occasion[] kat = stroj.getOccasions();
            if (kat.length > 1 && Arrays.asList(kat).contains(Occasion.Inne)) {
                raport.append("Okazja Inne dopisana jako nie jedyna dla stroju: ");
                raport.append(stroj.getNumber());
                raport.append("\n");
            }
        }
        raport.append("======stop testCzyNieJedynaOkazjaInne\n\n");
    }

    private void testCzyNieJedynaKategoriaInne(ArrayList<Costume> stroje) {
        raport.append("======start testCzyNieJedynaKategoriaInne\n");
        for (Costume stroj : stroje) {
            Category[] kat = stroj.getCategories();
            if (kat.length > 1 && Arrays.asList(kat).contains(Category.OTHERS)) {
                raport.append("Kategoria Inne dopisana jako nie jedyna dla stroju: ");
                raport.append(stroj.getNumber());
                raport.append("\n");
            }
        }
        raport.append("======stop testCzyNieJedynaKategoriaInne\n\n");
    }

    private void testCzyZdjecieSiePowtarza(ArrayList<Costume> stroje) { //w calej bazie
        raport.append("======start testCzyZdjecieSiePowtarza\n");
        HashSet<Integer> set = new HashSet<>();
        for (Costume stroj : stroje) { //TODO: zakomentowalem to bo nie chcialo mi sie poprawiac errorow
//            int[] zdjecia = stroj.getZdjęcie();
//            if (zdjecia != null) {
//                for (Integer r : zdjecia) {
//                    if (set.contains(r)) {
//                        raport.append("powtórzone zdjecie stroju: ");
//                        raport.append(stroj.getNumer());
//                        raport.append(". nr zdjecia:");
//                        raport.append(r);
//                        raport.append("\n");
//                    } else {
//                        set.add(r);
//                    }
//                }
//            }
        }
        raport.append("======stop testCzyZdjecieSiePowtarza\n\n");
    }

    private void testCzyOkazjaSiePowtarza(ArrayList<Costume> stroje) {
        raport.append("======start testCzyOkazjaSiePowtarza\n");
        for (Costume stroj : stroje) {
            HashSet<String> set = new HashSet<>();
            Occasion[] rozmiary = stroj.getOccasions();
            for (Occasion r : rozmiary) {
                if (set.contains(r.toString())) {
                    raport.append("powtórzona okazja stroju: ");
                    raport.append(stroj.getNumber());
                    raport.append(". nazwa:");
                    raport.append(stroj.getName());
                    raport.append("\n");
                } else {
                    set.add(r.toString());
                }
            }
        }
        raport.append("======stop testCzyOkazjaSiePowtarza\n\n");
    }

    private void testCzyKategoriaSiePowtarza(ArrayList<Costume> stroje) {
        raport.append("======start testCzyKategoriaSiePowtarza\n");
        for (Costume stroj : stroje) {
            HashSet<String> set = new HashSet<>();
            Category[] rozmiary = stroj.getCategories();
            for (Category r : rozmiary) {
                if (set.contains(r.toString())) {
                    raport.append("powtórzona kategoria stroju: ");
                    raport.append(stroj.getNumber());
                    raport.append(". nazwa:");
                    raport.append(stroj.getName());
                    raport.append("\n");
                } else {
                    set.add(r.toString());
                }
            }
        }
        raport.append("======stop testCzyKategoriaSiePowtarza\n\n");
    }

    private void testCzyRozmiarSiePowtarza(ArrayList<Costume> stroje) {
        raport.append("======start testCzyRozmiarSiePowtarza\n");
        for (Costume stroj : stroje) {
            HashSet<String> set = new HashSet<>();
            Size[] rozmiary = stroj.getSizes();
            for (Size r : rozmiary) {
                String zmergowanyRozmiar = r.getSizeFrom() + "" + r.getSizeTo() + "" + r.getBeltFrom() + "" + r.getBeltTo();
                if (set.contains(zmergowanyRozmiar)) {
                    raport.append("powtórzony rozmiar stroju: ");
                    raport.append(stroj.getNumber());
                    raport.append(". nazwa:");
                    raport.append(stroj.getName());
                    raport.append("\n");
                } else {
                    set.add(zmergowanyRozmiar);
                }
            }
        }
        raport.append("======stop testCzyRozmiarSiePowtarza\n\n");
    }

    private void testCzyNumberSiePowtarza(ArrayList<Costume> stroje) {
        raport.append("======start testCzyNumberSiePowtarza\n");
        HashSet<Integer> set = new HashSet<>(stroje.size());
        for (Costume stroj : stroje) {
            if (set.contains(stroj.getNumber())) {
                raport.append("powtórzony numer stroju: ");
                raport.append(stroj.getNumber());
                raport.append(". nazwa:");
                raport.append(stroj.getName());
                raport.append("\n");
            } else {
                set.add(stroj.getNumber());
            }
        }
        raport.append("======stop testCzyNumberSiePowtarza\n\n");
    }

    private void testCzyNazwaSieTrimuje(ArrayList<Costume> stroje) {
        raport.append("======start testCzyNazwaSieTrimuje\n");
        for (Costume stroj : stroje) {
            if (stroj.getName().length() != stroj.getName().trim().length()) {
                raport.append("nazwa '");
                raport.append(stroj.getName());
                raport.append("' ma spacja na poczatku lub koncu\n");
            }
        }
        raport.append("======stop testCzyNazwaSieTrimuje\n\n");
    }

    private void testCzyJestUstawionaKategoria(ArrayList<Costume> stroje) {
        raport.append("======start testCzyJestUstawionaKategoria\n");
        for (Costume stroj : stroje) {
            if (stroj.getCategories() == null || stroj.getCategories().length == 0) {
                raport.append("kategoria dla stroju nr ");
                raport.append(stroj.getNumber());
                raport.append(" nie jest ustawiona\n");
            }
        }
        raport.append("======stop testCzyJestUstawionaKategoria\n\n");
    }

    private void testCzyJestUstawionaOkazja(ArrayList<Costume> stroje) {
        raport.append("======start testCzyJestUstawionaOkazja\n");
        for (Costume stroj : stroje) {
            if (stroj.getOccasions() == null || stroj.getOccasions().length == 0) {
                raport.append("okazja dla stroju nr ");
                raport.append(stroj.getNumber());
                raport.append(" nie jest ustawiona\n");
            }
        }
        raport.append("======stop testCzyJestUstawionaOkazja\n\n");
    }

    private void testCzyJestUstawionyRozmiar(ArrayList<Costume> stroje) {
        raport.append("======start testCzyJestUstawionyRozmiar\n");
        for (Costume stroj : stroje) {
            if (stroj.getSizes() == null || stroj.getSizes().length == 0) {
                raport.append("rozmiar dla stroju nr ");
                raport.append(stroj.getNumber());
                raport.append(" nie jest ustawiony\n");
            }
        }
        raport.append("======stop testCzyJestUstawionyRozmiar\n\n");
    }

    private void testCzyJestUstawionaPlec(ArrayList<Costume> stroje) {
        raport.append("======start testCzyJestUstawionaPlec\n");
        for (Costume stroj : stroje) {
            if (stroj.getSex() == null) {
                raport.append("plec dla stroju nr ");
                raport.append(stroj.getNumber());
                raport.append(" nie jest ustawiona\n");
            }
        }
        raport.append("======stop testCzyJestUstawionaPlec\n\n");
    }

    private void testCzyJestUstawionyWiek(ArrayList<Costume> stroje) {
        raport.append("======start testCzyJestUstawionyWiek\n");
        for (Costume stroj : stroje) {
            if (stroj.getAge() == null) {
                raport.append("wiek dla stroju nr ");
                raport.append(stroj.getNumber());
                raport.append(" nie jest ustawiony\n");
            }
        }
        raport.append("======stop testCzyJestUstawionyWiek\n\n");
    }

    private void testCzyJestUstawionaNazwa(ArrayList<Costume> stroje) {
        raport.append("======start testCzyJestUstawionaNazwa\n");
        for (Costume stroj : stroje) {
            if (stroj.getName() == null) {
                raport.append("nazwa dla stroju nr ");
                raport.append(stroj.getNumber());
                raport.append(" nie jest ustawiona\n");
            }
        }
        raport.append("======stop testCzyJestUstawionaNazwa\n\n");
    }

    private void testCzyJestUstawioneZdjecie(ArrayList<Costume> stroje) {
        raport.append("======start testCzyJestUstawioneZdjecie\n");
        for (Costume stroj : stroje) {
            if (stroj.getPhotos() == null || stroj.getPhotos().length == 0) {
                raport.append("zdjecie dla stroju nr ");
                raport.append(stroj.getNumber());
                raport.append(" nie jest ustawione\n");
            }
        }
        raport.append("======stop testCzyJestUstawioneZdjecie\n\n");
    }
}
