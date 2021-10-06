import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution8 {
    //Given an array of Strings, return the string with maximum size.
    // If there is more than one strings in maximum size return all.
    public static void main(String[] args) {
       String [] s1={"also","dog","cat"}; // returns ["also"]
       String [] s2={"rotol","pol","puter"};// returns ["rotol","puter"]
       String [] s3={"apple","pie","telephone"};
        String [] s4={"refrigerator","pie","rabbit","cola","love"};
        String [] s5={"unconditional","pie","unconditional"};
        String [] s6={"salt","source","pear","doctor","carrot"};

        System.out.println(Arrays.toString(maxSizedStrings(s1).toArray()));
       System.out.println(Arrays.toString(maxSizedStrings(s2).toArray()));
        System.out.println(Arrays.toString(maxSizedStrings(s3).toArray()));
        System.out.println(Arrays.toString(maxSizedStrings(s4).toArray()));
        System.out.println(Arrays.toString(maxSizedStrings(s5).toArray()));
        System.out.println(Arrays.toString(maxSizedStrings(s6).toArray()));

    }
    public static ArrayList<String> maxSizedStrings(String[] words){
        ArrayList < String>result=new ArrayList<>();
        int maxLen= -1;

        for (int i=0;i<words.length;i++){
            if (words[i].length()>maxLen){
                maxLen=words[i].length();
            }
        }
        for (int i=0;i<words.length;i++){
            if (words[i].length()>=maxLen){
                result.add(words[i]);
            }
        }

        return  result;
    }
}
