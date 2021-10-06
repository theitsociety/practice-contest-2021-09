import java.util.HashMap;

public class Solution6 {
    //Find and return the most frequent character for a given String
    public static void main(String[] args) {
        System.out.println(mostFrequentCharacter("aaabbccccd"));
        System.out.println(mostFrequentCharacter("banana"));
        //if there are characters which their frequency is same, it returns the first character according to alphabetic order
        System.out.println(mostFrequentCharacter("fahrenheit"));
        System.out.println(mostFrequentCharacter("software"));
    }
    public static char mostFrequentCharacter(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int maxFreq = 0;
        char maxOccuredChar = 0;
        for (char c : map.keySet()) {
            if (map.get(c) > maxFreq) {
                maxFreq = map.get(c);
                maxOccuredChar = c;
            }
        }
    return maxOccuredChar;
    }
}
