import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution8 {
    /*
    "Given an array of Strings, return the string with maximum size. If there is more than one strings in maximum size return all.
        Example
        [""also"",""dog"",""cat""] returns [""also""]
        [""rotol"",""pol"",""puter""] returns [""rotol"",""puter""]"
     */
    public static void main(String[] args) {
        String[] arr = {"also", "dog", "pol", "cat", "puter", "rotol"};
        maxLength(arr);
    }

    public static void maxLength(String[] arr) {
        List<String> longestElements=new ArrayList<>();
        int maxSize = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (j > 0) {
                    maxSize = j;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()>=maxSize) {
                longestElements.add(arr[i]);
            }
        }
        System.out.println(longestElements);
    }

}
