package fi.samk;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Tehtävä 1 esimerkkitulostus
        int x1 = 0, y1 = 0;
        int x2 = 0, y2 = 3;

        double etaisyys = Tehtava1.laskeEtaisyys(x1, y1, x2, y2);

        System.out.println("Pisteiden välinen etäisyys on: " + etaisyys);

        Tehtavaerotin.tulostaErotin();

        //Tehtävä 2 tulostus

        int korkeus1 = 3;
        int korkeus2  = 5;

        Tehtava2.tulostaKuusi(korkeus1);
        System.out.println(" ");
        System.out.println(" ");
        Tehtava2.tulostaKuusi(korkeus2);

        Tehtavaerotin.tulostaErotin();
        //Tehtävä 3

        double ympyranSade = 5.0;
        double nelionSivu = 4.0;
        double suorakulmaisenKolmionKanta = 6.0;
        double suorakulmaisenKolmionKorkeus = 3.0;

        Tehtava3 laskuri3 = new Tehtava3();

        double ympyranPintaAla = laskuri3.laskeYmpyranPintaAla(ympyranSade);
        System.out.println("Ympyrän pinta-ala: " + ympyranPintaAla);

        double nelionPintaAla = laskuri3.laskeNelionPintaAla(nelionSivu);
        System.out.println("Neliön pinta-ala: " + nelionPintaAla);

        double suorakulmaisenKolmionPintaAla = laskuri3.laskeSuorakolmionPintaAla(suorakulmaisenKolmionKanta, suorakulmaisenKolmionKorkeus);
        System.out.println("Suorakulmaisen kolmion pinta-ala: " + suorakulmaisenKolmionPintaAla);

        Tehtavaerotin.tulostaErotin();
        //Tehtävä 4

        int[][] matrix = {
                {1, 5, 7},
                {9, 3, 1},
                {0, 1, 1}
        };

        Tehtava4 laskuri4 = new Tehtava4();
        int[] indeksi = laskuri4.etsiSuurimmanArvonIndeksi(matrix);

        System.out.println("Suurimman arvon indeksi: [" + indeksi[0] + ", " + indeksi[1] + "]");

        Tehtavaerotin.tulostaErotin();
        //Tehtävä 5

        int[] array = {8, 3, 2, 7};

        Tehtava5 laskuri5 = new Tehtava5();
        int[] jarjestettyArray = laskuri5.jarjestaPienimmastaSuurimpaan(array);

        System.out.println("Alkuperäinen array: " + Arrays.toString(array));
        System.out.println("Järjestetty array: " + Arrays.toString(jarjestettyArray));


        Tehtavaerotin.tulostaErotin();
        //Tehtävä 6

        String s1 = "Saippuakauppias";
        String s2 = "aivot avaavat ovia";

        Tehtava6 laskuri6 = new Tehtava6();

        // Testataan palindromien tarkistusta
        System.out.println(s1 + " on palindromi: " + laskuri6.onkoPalindromi(s1));
        System.out.println(s2 + " on palindromi: " + laskuri6.onkoPalindromi(s2));

        Tehtavaerotin.tulostaErotin();
        //Tehtävä 7

        int n = 4;

        Tehtava7 laskuri7 = new Tehtava7();
        int fibNth = laskuri7.laskeFibonacci(n);

        System.out.println("Fibonacci-sarjan " + n + ". luku on: " + fibNth);

        Tehtavaerotin.tulostaErotin();
        //Tehtävä 8

        int luku = 10;

        Tehtava8 laskuri8 = new Tehtava8();
        ArrayList<Integer> alkuluvut = laskuri8.etsiAlkuluvut(luku);

        System.out.println("Alkuluvut annetun luvun " + luku + " ja sen puolivälin väliltä ovat: " + alkuluvut);

        Tehtavaerotin.tulostaErotin();

        //Tehtävä 9

        int annetutSekunnit = 3661;
        String muunnettuAika = Tehtava9.muunnaAika(annetutSekunnit);
        System.out.println("Sekunnit " + annetutSekunnit + " muutettuna tunneiksi " + muunnettuAika );

        Tehtavaerotin.tulostaErotin();

    }
}