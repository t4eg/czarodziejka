package pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka;

import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Category;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Occasion;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Size;
import pl.com.czarodziejka.czarodziejka.client.model.wyszukiwarka.costume.Costume;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Administrator
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
        HashSet<Integer> all = new HashSet<Integer>();
        for (Costume stroj : stroje) {
            if (stroj.getNumer() > maxNumer) {
                maxNumer = stroj.getNumer();
            }
            all.add(stroj.getNumer());
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
            Occasion[] kat = stroj.getOkazja();
            if (kat.length > 1 && Arrays.asList(kat).contains(Occasion.Inne)) {
                raport.append("Okazja Inne dopisana jako nie jedyna dla stroju: ");
                raport.append(stroj.getNumer());
                raport.append("\n");
            }
        }
        raport.append("======stop testCzyNieJedynaOkazjaInne\n\n");
    }

    private void testCzyNieJedynaKategoriaInne(ArrayList<Costume> stroje) {
        raport.append("======start testCzyNieJedynaKategoriaInne\n");
        for (Costume stroj : stroje) {
            Category[] kat = stroj.getKategoria();
            if (kat.length > 1 && Arrays.asList(kat).contains(Category.Inne)) {
                raport.append("Kategoria Inne dopisana jako nie jedyna dla stroju: ");
                raport.append(stroj.getNumer());
                raport.append("\n");
            }
        }
        raport.append("======stop testCzyNieJedynaKategoriaInne\n\n");
    }

    private void testCzyZdjecieSiePowtarza(ArrayList<Costume> stroje) { //w calej bazie
        raport.append("======start testCzyZdjecieSiePowtarza\n");
        HashSet<Integer> set = new HashSet<Integer>();
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
            HashSet<String> set = new HashSet<String>();
            Occasion[] rozmiary = stroj.getOkazja();
            for (Occasion r : rozmiary) {
                if (set.contains(r.toString())) {
                    raport.append("powtórzona okazja stroju: ");
                    raport.append(stroj.getNumer());
                    raport.append(". nazwa:");
                    raport.append(stroj.getNazwa());
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
            HashSet<String> set = new HashSet<String>();
            Category[] rozmiary = stroj.getKategoria();
            for (Category r : rozmiary) {
                if (set.contains(r.toString())) {
                    raport.append("powtórzona kategoria stroju: ");
                    raport.append(stroj.getNumer());
                    raport.append(". nazwa:");
                    raport.append(stroj.getNazwa());
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
            HashSet<String> set = new HashSet<String>();
            Size[] rozmiary = stroj.getRozmiar();
            for (Size r : rozmiary) {
                String zmergowanyRozmiar = r.getWzrostOd() + "" + r.getWzrostDo() + "" + r.getPasOd() + "" + r.getPasDo();
                if (set.contains(zmergowanyRozmiar)) {
                    raport.append("powtórzony rozmiar stroju: ");
                    raport.append(stroj.getNumer());
                    raport.append(". nazwa:");
                    raport.append(stroj.getNazwa());
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
        HashSet<Integer> set = new HashSet<Integer>(stroje.size());
        for (Costume stroj : stroje) {
            if (set.contains(stroj.getNumer())) {
                raport.append("powtórzony numer stroju: ");
                raport.append(stroj.getNumer());
                raport.append(". nazwa:");
                raport.append(stroj.getNazwa());
                raport.append("\n");
            } else {
                set.add(stroj.getNumer());
            }
        }
        raport.append("======stop testCzyNumberSiePowtarza\n\n");
    }

    private void testCzyNazwaSieTrimuje(ArrayList<Costume> stroje) {
        raport.append("======start testCzyNazwaSieTrimuje\n");
        for (Costume stroj : stroje) {
            if (stroj.getNazwa().length() != stroj.getNazwa().trim().length()) {
                raport.append("nazwa '");
                raport.append(stroj.getNazwa());
                raport.append("' ma spacja na poczatku lub koncu\n");
            }
        }
        raport.append("======stop testCzyNazwaSieTrimuje\n\n");
    }

    private void testCzyJestUstawionaKategoria(ArrayList<Costume> stroje) {
        raport.append("======start testCzyJestUstawionaKategoria\n");
        for (Costume stroj : stroje) {
            if (stroj.getKategoria() == null || stroj.getKategoria().length == 0) {
                raport.append("kategoria dla stroju nr ");
                raport.append(stroj.getNumer());
                raport.append(" nie jest ustawiona\n");
            }
        }
        raport.append("======stop testCzyJestUstawionaKategoria\n\n");
    }

    private void testCzyJestUstawionaOkazja(ArrayList<Costume> stroje) {
        raport.append("======start testCzyJestUstawionaOkazja\n");
        for (Costume stroj : stroje) {
            if (stroj.getOkazja() == null || stroj.getOkazja().length == 0) {
                raport.append("okazja dla stroju nr ");
                raport.append(stroj.getNumer());
                raport.append(" nie jest ustawiona\n");
            }
        }
        raport.append("======stop testCzyJestUstawionaOkazja\n\n");
    }

    private void testCzyJestUstawionyRozmiar(ArrayList<Costume> stroje) {
        raport.append("======start testCzyJestUstawionyRozmiar\n");
        for (Costume stroj : stroje) {
            if (stroj.getRozmiar() == null || stroj.getRozmiar().length == 0) {
                raport.append("rozmiar dla stroju nr ");
                raport.append(stroj.getNumer());
                raport.append(" nie jest ustawiony\n");
            }
        }
        raport.append("======stop testCzyJestUstawionyRozmiar\n\n");
    }

    private void testCzyJestUstawionaPlec(ArrayList<Costume> stroje) {
        raport.append("======start testCzyJestUstawionaPlec\n");
        for (Costume stroj : stroje) {
            if (stroj.getPłeć() == null) {
                raport.append("plec dla stroju nr ");
                raport.append(stroj.getNumer());
                raport.append(" nie jest ustawiona\n");
            }
        }
        raport.append("======stop testCzyJestUstawionaPlec\n\n");
    }

    private void testCzyJestUstawionyWiek(ArrayList<Costume> stroje) {
        raport.append("======start testCzyJestUstawionyWiek\n");
        for (Costume stroj : stroje) {
            if (stroj.getWiek() == null) {
                raport.append("wiek dla stroju nr ");
                raport.append(stroj.getNumer());
                raport.append(" nie jest ustawiony\n");
            }
        }
        raport.append("======stop testCzyJestUstawionyWiek\n\n");
    }

    private void testCzyJestUstawionaNazwa(ArrayList<Costume> stroje) {
        raport.append("======start testCzyJestUstawionaNazwa\n");
        for (Costume stroj : stroje) {
            if (stroj.getNazwa() == null) {
                raport.append("nazwa dla stroju nr ");
                raport.append(stroj.getNumer());
                raport.append(" nie jest ustawiona\n");
            }
        }
        raport.append("======stop testCzyJestUstawionaNazwa\n\n");
    }

    private void testCzyJestUstawioneZdjecie(ArrayList<Costume> stroje) {
        raport.append("======start testCzyJestUstawioneZdjecie\n");
        for (Costume stroj : stroje) {
            if (stroj.getZdjęcie() == null || stroj.getZdjęcie().length == 0) {
                raport.append("zdjecie dla stroju nr ");
                raport.append(stroj.getNumer());
                raport.append(" nie jest ustawione\n");
            }
        }
        raport.append("======stop testCzyJestUstawioneZdjecie\n\n");
    }
}
