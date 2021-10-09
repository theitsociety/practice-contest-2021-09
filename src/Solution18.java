public class Solution18 {
    /*
    Given a signed 32-bit integer x, return x with its digits reversed.
    If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
     */
    public static void main(String[] args) {

        System.out.println(reverseInt(-61488996));

    }
    public static int reverseInt(int num) {
        int rev = 0;
        while(num!=0) {
            rev = rev * 10 + num %10;
            num =num /10;
        }
        return rev;
    }
}
