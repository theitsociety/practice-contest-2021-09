public class Solution17 {
    //implement strstr of c or indexOf of java
    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
        System.out.println(strStr("aaaaa","bba"));
        System.out.println(strStr("racecar","car"));
        System.out.println(strStr("transatlantic",""));
        System.out.println(strStr("transatlantic","atl"));
        System.out.println(strStr("transatlantic","tran"));
        System.out.println(strStr("transatlantic","za"));
        System.out.println(strStr("mississippi","issipi"));
    }
    public static int strStr(String haystack, String needle) {
        int j=0;
        if (needle.equals(""))
            return 0;
        for (int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(j)){
                j++;
                if (j==needle.length())
                    return i-j+1;
            }
            else {
                i=i-j;
                j=0;
            }
        }
        return -1;
    }
}
