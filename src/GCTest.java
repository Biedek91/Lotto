import java.util.Random;

/**
 * Created by Biedek91 on 2016-09-12.
 */
public class GCTest {


    public static void main(String[] args) {

        int[] tablica = losujLiczby();
        int[] posortowanaTablica = sortuj(tablica);
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }
    }

    private static int[] sortuj(int[] tablica) {
        return tablica;
    }


    public static int[] losujLiczby() {

        int[] wylosowaneNumery = new int[6];
        for (int i = 0; i < 6; i++) {
            Random wylosowanaLiczba = new Random();
            wylosowaneNumery[i] = wylosowanaLiczba.nextInt(49) + 1;
        }
        return wylosowaneNumery;
    }

    private static boolean sprawdzCzyDwieObokSiebie(int pierwszaLiczba, int drugaLiczba) {

        return false;
    }
}

/* -wypluj posortowana tablice
- czy żadna para liczb w tablicy nie jest parą
- historia ostatnich 5 losowań - pamietaj jak skończy Ci się proces javowy to tracisz historie wszystko z pamieci sprobuj z GUI w JavaFX
-

 */