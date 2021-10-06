public class Solution5 {
    //Write a Java program to build a reverse of a given string (ex: ali to ila)
    public static void main(String[] args) {
        System.out.println(reverseString("ali"));
        System.out.println(reverseString("john"));
        System.out.println(reverseString("egg"));
        System.out.println(reverseString("racecar"));
        System.out.println(reverseString("telephone"));
        System.out.println(reverseString("aAa"));

    }
    public static String reverseString(String str){
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=str.length()-1;i>=0;i--){
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

}
