package fi.samk;

public class Tehtava7 {
    public int laskeFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int fibPrev = 1;
        int fibPrevPrev = 0;
        int fibNth = 0;

        for (int i = 2; i <= n; i++) {
            fibNth = fibPrev + fibPrevPrev;
            fibPrevPrev = fibPrev;
            fibPrev = fibNth;
        }

        return fibNth;
    }
}