/*A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false

TC: O(n)
SC: O(1)
*/

public class Pangram {
    //class Solution {
        public boolean checkIfPangram(String sentence) {
           if(sentence.length() < 26) {
            return false;
           }
    
           boolean[] array = new boolean[26];
    
           for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
    
            if(currentChar >= 'a' && currentChar <= 'z') {
                int index = currentChar - 'a';
                array[index] = true;
            }
           }
           for(boolean present: array) {
            if(!present) {
                return false;
            }
           }
           return true;
        }
    //}
}
