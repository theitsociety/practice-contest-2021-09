import java.util.ArrayList;
import java.util.List;

public class Solution8 {

    public static void main(String[] args) {
        String[] arr = {"also", "dog", "pol", "cat", "puter", "rotol"};
        maxLength(arr);
    }

    public static void maxLength(String[] arr) {
        List<String> longestElements=new ArrayList<>();
        int maxSize = 0;
        for(String str: arr){
            for (int j = 0; j < str.length(); j++) {
                if (j > maxSize) {
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
