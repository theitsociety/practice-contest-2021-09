public class Solution11 {

    /*
    Write a program converting binary number to decimal
        Example
        11 -> 3
        110 -> 6
        100 -> 4
        1001 -> 9
     */
    public static void main(String[] args) {
        int binary = 1001;
        System.out.println(convertBinaryToDecimal(binary));
    }
    public static int convertBinaryToDecimal(int binary) {
        int decimal = 0;
        int n = 0;
        while (binary > 0) {
            int temp = binary % 10;
            decimal += temp * Math.pow(2, n);
            binary = binary / 10;
            n++;
        }
        return decimal;
    }
}