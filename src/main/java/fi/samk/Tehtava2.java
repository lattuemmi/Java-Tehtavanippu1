package fi.samk;

public class Tehtava2 {

    public static void tulostaKuusi(int korkeus){
        for (int i = 1; i <= korkeus; i++){
            for (int j = 1; j <= korkeus - i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2* i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
