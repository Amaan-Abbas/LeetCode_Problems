import java.util.Arrays;

public class KMPalgorithm {
    public static void main(String[] args) {

        String haystack = "aaaxaaaa", needle = "aaaa";
        //LPS (longest prefix suffix) part of the KMP algorithm.
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

        //KMP part of the KMP algorithm
        int j = 0, k = 0; //pointer for the haystack and needle.

        while (i < haystack.length()) {
            if (haystack.charAt(j) == needle.charAt(k)) {
                j += 1;
                k += 1;
            } else {
                if (k == 0) j += 1;
                else k = lps[k - 1];
            }

            if (k == needle.length()) {
                System.out.println(j - needle.length());
                break;
            }
        }
    }
}
