package fi.samk;

import java.util.Arrays;

public class Tehtava5 {
    public int[] jarjestaPienimmastaSuurimpaan(int[] array) {
        int[] kopio = Arrays.copyOf(array, array.length);

        Arrays.sort(kopio);

        return kopio;
    }
}