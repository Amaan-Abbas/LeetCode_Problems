import java.util.ArrayList;
import java.util.List;

public class StringMatchingArray {
        public List<String> stringMatching(String[] words) {
        List<String> ls = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (j == i) {
                    continue;
                }

                if (words[i].contains(words[j])) {
                    if (ls.contains(words[j])) continue;
                    ls.add(words[j]);
                }
            }
        }

        return ls;
    }
}
