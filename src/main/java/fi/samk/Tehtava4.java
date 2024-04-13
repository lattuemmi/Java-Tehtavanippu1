package fi.samk;

public class Tehtava4 {
    public int[] etsiSuurimmanArvonIndeksi(int[][] matrix) {
        int max = matrix[0][0];
        int[] indeksi = {0, 0};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    indeksi[0] = i;
                    indeksi[1] = j;
                }
            }
        }

        return indeksi;
    }
}