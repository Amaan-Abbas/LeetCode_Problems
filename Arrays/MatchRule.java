import java.util.List;

public class MatchRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int j = 0;
        if(ruleKey.equals("type")) {
            for(int i = 0; i < items.size(); i++) {
                List<String> innerList = items.get(i);
                for(int t = 0; t < innerList.size(); t++) {
                    if(ruleValue.equals(innerList.get(t))) {
                    j++;
                    }
                }
            }
        }

        else if(ruleKey.equals("color")) {
            for(int k = 0; k < items.size(); k++) {
                List<String> innerList = items.get(k);
                for(int i = 0; i < innerList.size(); i++) {
                    if(ruleValue.equals(innerList.get(i))) {
                    j++;
                    }
                }
            }        
        }
            
        else if(ruleKey.equals("name")) {
            for(int m = 0; m < items.size(); m++) {
                List<String> innerList = items.get(m);
                for(int i = 0; i < innerList.size(); i++) {
                    if(ruleValue.equals(innerList.get(i))) {
                    j++;
                    }
                }
            }
        }
        return j;
    }

    public static void main(String[] args) {
        
        List<List<String>> items = new List<List<String>>() {
            // ("phone", "blue", "pixel"), ("computer", "silver", "phone")
        };
    }
}
