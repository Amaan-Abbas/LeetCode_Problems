
public class CheckSentence {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] sentences = sentence.split(" ");
        // System.out.println(Arrays.toString(sentences));
        int i = 0;

        for (String word : sentences) {
            i++;
            if (word.contains(searchWord)) {
                if (word.substring(0, searchWord.length()).equals(searchWord)) return i;
            }
        }

        return -1;
    }
}
