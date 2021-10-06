public class Solution5 {

    public static void main(String[] args) {
        String str = "ali";
        reverse(str);
    }
    public static void reverse(String str){
        StringBuilder reverse = new StringBuilder();
        int n = str.length()-1;
        while(n>=0){
            reverse.append(str.charAt(n));
            n--;
        }
        System.out.println(reverse);
    }
}
