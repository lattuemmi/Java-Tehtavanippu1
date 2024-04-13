package fi.samk;
import java.util.ArrayList;

public class Tehtava8 {
    public ArrayList<Integer> etsiAlkuluvut(int luku) {
        ArrayList<Integer> alkuluvut = new ArrayList<>();

        int puolivali = (int) Math.ceil(luku / 2.0);

        for (int i = puolivali; i <= luku; i++) {
            if (onkoAlkuluku(i)) {
                alkuluvut.add(i);
            }
        }

        return alkuluvut;
    }

    private boolean onkoAlkuluku(int luku) {
        if (luku <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(luku); i++) {
            if (luku % i == 0) {
                return false;
            }
        }

        return true;
    }
}