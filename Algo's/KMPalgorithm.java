
import java.util.Arrays;



public class KMPalgorithm {
    public static void main(String[] args) {
        String needle = "aaacaaaa";
        int[] lps = new int[needle.length()];

        int prevLPS = 0, i = 1;

        while (i < needle.length()) {
            if (needle.charAt(i) == needle.charAt(prevLPS)) {
                lps[i] = prevLPS + 1;
                prevLPS += 1;
                i += 1;
            } else if (prevLPS == 0) {
                lps[i] = 0;
                i++;
            } else {
                prevLPS = lps[prevLPS - 1];
            }
        }

        System.out.println(Arrays.toString(lps));
    }
}
