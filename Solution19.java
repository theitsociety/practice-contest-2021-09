public class Solution19 {
    //Leetcode Longest Common Prefix
    public static void main(String[] args) {
        String [] s1={"flower","flow","flight"};
        String [] s2={"dog","racecar","car"};
        String [] s3={"","apple","app"};
        String [] s4={"precalculus","prefix","premature"};
        System.out.println(longestCommonPrefix(s1));
        System.out.println(longestCommonPrefix(s2));
        System.out.println(longestCommonPrefix(s3));
        System.out.println(longestCommonPrefix(s4));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
}
