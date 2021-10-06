public class Solution3 {
    //Check a string contains a given string or not. (You are NOT allowed to use String.substring())
    public static void main(String[] args) {
        System.out.println(checkStringContains("applebasket","bas"));
        System.out.println(checkStringContains("firetruck","fire"));
        System.out.println(checkStringContains("firetruck","efire"));
        System.out.println(checkStringContains("firetruck","ffire"));
        System.out.println(checkStringContains("abbbcceed","abbbb"));
        System.out.println(checkStringContains("abbbcceed","abb"));
        System.out.println(checkStringContains("abbbcceed","ceee"));
        System.out.println(checkStringContains("abbbcceed","bce"));
    }
    public static boolean checkStringContains(String word, String given){
        int i=0;
        for (int j=0; j<word.length();j++){
            if(word.charAt(j)==given.charAt(i) ) {
                i++;
                if (i == given.length())
                    return true;
            }
            else {
                j=j-i;
                i=0;
            }
        }
        return false;
    }
}
