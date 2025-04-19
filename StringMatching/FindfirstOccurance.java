class FindfirstOccurance {
    public static int strStr(String haystack, String needle) {
        // int needleLength = needle.length();
        // int haystackLength = haystack.length();

        // System.out.println(needleLength);
        // System.out.println(haystackLength);

        // for (int i = 0; i <= haystackLength - needleLength; i++) {
        //     int j = 0;
        //     while (j < needleLength && needle.charAt(j) == haystack.charAt(i + j)) {
        //         j++;
        //     }

        //     if (j == needleLength) return i;
        // }

        // return -1;

        int index = (haystack.contains(needle)) ? haystack.indexOf(needle) : -1;
        return index;
    }

    public static void main(String[] args) {
        String a = "sadbutsad", b = "sad";
        System.out.println(strStr(a, b));
    }
}