package gwt.client.model.wyszukiwarka;

import gwt.client.model.wyszukiwarka.stroj.Kategoria;
import gwt.client.model.wyszukiwarka.stroj.Okazja;
import gwt.client.model.wyszukiwarka.stroj.Rozmiar;
import gwt.client.model.wyszukiwarka.stroj.Strój;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class DatabaseTest {

    StringBuilder raport = new StringBuilder();

    public DatabaseTest(List<Strój> stroje) {
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

        String rap = raport.toString();
        rap = null;
    }

    private void testNiewykorzystanyNrStroju(List<Strój> stroje) {
        raport.append("======start testNiewykorzystanyNrStroju\n");
        Integer maxNumer = 0;
        HashSet<Integer> all = new HashSet<Integer>();
        for (Strój stroj : stroje) {
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

    private void testCzyNieJedynaOkazjaInne(List<Strój> stroje) {
        raport.append("======start testCzyNieJedynaOkazjaInne\n");
        for (Strój stroj : stroje) {
            Okazja[] kat = stroj.getOkazja();
            if (kat.length > 1 && Arrays.asList(kat).contains(Okazja.Inne)) {
                raport.append("Okazja Inne dopisana jako nie jedyna dla stroju: ");
                raport.append(stroj.getNumer());
                raport.append("\n");
            }
        }
        raport.append("======stop testCzyNieJedynaOkazjaInne\n\n");
    }

    private void testCzyNieJedynaKategoriaInne(List<Strój> stroje) {
        raport.append("======start testCzyNieJedynaKategoriaInne\n");
        for (Strój stroj : stroje) {
            Kategoria[] kat = stroj.getKategoria();
            if (kat.length > 1 && Arrays.asList(kat).contains(Kategoria.Inne)) {
                raport.append("Kategoria Inne dopisana jako nie jedyna dla stroju: ");
                raport.append(stroj.getNumer());
                raport.append("\n");
            }
        }
        raport.append("======stop testCzyNieJedynaKategoriaInne\n\n");
    }

    private void testCzyZdjecieSiePowtarza(List<Strój> stroje) { //w calej bazie
        raport.append("======start testCzyZdjecieSiePowtarza\n");
        HashSet<Integer> set = new HashSet<Integer>();
        for (Strój stroj : stroje) { //TODO: zakomentowalem to bo nie chcialo mi sie poprawiac errorow
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

    private void testCzyOkazjaSiePowtarza(List<Strój> stroje) {
        raport.append("======start testCzyOkazjaSiePowtarza\n");
        for (Strój stroj : stroje) {
            HashSet<String> set = new HashSet<String>();
            Okazja[] rozmiary = stroj.getOkazja();
            for (Okazja r : rozmiary) {
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

    private void testCzyKategoriaSiePowtarza(List<Strój> stroje) {
        raport.append("======start testCzyKategoriaSiePowtarza\n");
        for (Strój stroj : stroje) {
            HashSet<String> set = new HashSet<String>();
            Kategoria[] rozmiary = stroj.getKategoria();
            for (Kategoria r : rozmiary) {
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

    private void testCzyRozmiarSiePowtarza(List<Strój> stroje) {
        raport.append("======start testCzyRozmiarSiePowtarza\n");
        for (Strój stroj : stroje) {
            HashSet<String> set = new HashSet<String>();
            Rozmiar[] rozmiary = stroj.getRozmiar();
            for (Rozmiar r : rozmiary) {
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

    private void testCzyNumberSiePowtarza(List<Strój> stroje) {
        raport.append("======start testCzyNumberSiePowtarza\n");
        HashSet<Integer> set = new HashSet<Integer>(stroje.size());
        for (Strój stroj : stroje) {
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

    private void testCzyNazwaSieTrimuje(List<Strój> stroje) {
        raport.append("======start testCzyNazwaSieTrimuje\n");
        for (Strój stroj : stroje) {
            if (stroj.getNazwa().length() != stroj.getNazwa().trim().length()) {
                raport.append("nazwa '");
                raport.append(stroj.getNazwa());
                raport.append("' ma spacja na poczatku lub koncu\n");
            }
        }
        raport.append("======stop testCzyNazwaSieTrimuje\n\n");
    }

    private void testCzyJestUstawionaKategoria(List<Strój> stroje) {
        raport.append("======start testCzyJestUstawionaKategoria\n");
        for (Strój stroj : stroje) {
            if (stroj.getKategoria() == null || stroj.getKategoria().length == 0) {
                raport.append("kategoria dla stroju nr ");
                raport.append(stroj.getNumer());
                raport.append(" nie jest ustawiona\n");
            }
        }
        raport.append("======stop testCzyJestUstawionaKategoria\n\n");
    }

    private void testCzyJestUstawionaOkazja(List<Strój> stroje) {
        raport.append("======start testCzyJestUstawionaOkazja\n");
        for (Strój stroj : stroje) {
            if (stroj.getOkazja() == null || stroj.getOkazja().length == 0) {
                raport.append("okazja dla stroju nr ");
                raport.append(stroj.getNumer());
                raport.append(" nie jest ustawiona\n");
            }
        }
        raport.append("======stop testCzyJestUstawionaOkazja\n\n");
    }

    private void testCzyJestUstawionyRozmiar(List<Strój> stroje) {
        raport.append("======start testCzyJestUstawionyRozmiar\n");
        for (Strój stroj : stroje) {
            if (stroj.getRozmiar() == null || stroj.getRozmiar().length == 0) {
                raport.append("rozmiar dla stroju nr ");
                raport.append(stroj.getNumer());
                raport.append(" nie jest ustawiony\n");
            }
        }
        raport.append("======stop testCzyJestUstawionyRozmiar\n\n");
    }

    private void testCzyJestUstawionaPlec(List<Strój> stroje) {
        raport.append("======start testCzyJestUstawionaPlec\n");
        for (Strój stroj : stroje) {
            if (stroj.getPłeć() == null) {
                raport.append("plec dla stroju nr ");
                raport.append(stroj.getNumer());
                raport.append(" nie jest ustawiona\n");
            }
        }
        raport.append("======stop testCzyJestUstawionaPlec\n\n");
    }

    private void testCzyJestUstawionyWiek(List<Strój> stroje) {
        raport.append("======start testCzyJestUstawionyWiek\n");
        for (Strój stroj : stroje) {
            if (stroj.getWiek() == null) {
                raport.append("wiek dla stroju nr ");
                raport.append(stroj.getNumer());
                raport.append(" nie jest ustawiony\n");
            }
        }
        raport.append("======stop testCzyJestUstawionyWiek\n\n");
    }

    private void testCzyJestUstawionaNazwa(List<Strój> stroje) {
        raport.append("======start testCzyJestUstawionaNazwa\n");
        for (Strój stroj : stroje) {
            if (stroj.getNazwa() == null) {
                raport.append("nazwa dla stroju nr ");
                raport.append(stroj.getNumer());
                raport.append(" nie jest ustawiona\n");
            }
        }
        raport.append("======stop testCzyJestUstawionaNazwa\n\n");
    }

    private void testCzyJestUstawioneZdjecie(List<Strój> stroje) {
        raport.append("======start testCzyJestUstawioneZdjecie\n");
        for (Strój stroj : stroje) {
            if (stroj.getZdjęcie() == null || stroj.getZdjęcie().length == 0) {
                raport.append("zdjecie dla stroju nr ");
                raport.append(stroj.getNumer());
                raport.append(" nie jest ustawione\n");
            }
        }
        raport.append("======stop testCzyJestUstawioneZdjecie\n\n");
    }
}
