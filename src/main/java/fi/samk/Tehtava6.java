package fi.samk;

public class Tehtava6 {
    public boolean onkoPalindromi(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}