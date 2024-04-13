package fi.samk;

public class Tehtava9 {
    public static String muunnaAika(int sekunnit) {
        int tunnit = sekunnit / 3600;
        int jaannos = sekunnit % 3600;
        int minuutit = jaannos / 60;
        int sek = jaannos % 60;

        return String.format("%02d:%02d:%02d", tunnit, minuutit, sek);
    }
}