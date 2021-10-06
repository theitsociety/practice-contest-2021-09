public class Solution7 {
    /*
    Write a program converting given fahrenheit temperature to centigrade
     */
    public static void main(String[] args) {
        int fahrenheit = 82;

        System.out.println(convertFtoC(fahrenheit));
    }
    public static int convertFtoC(int fahrenheit){
        int celsius;

        celsius = ((fahrenheit-32)*5)/9;

        return celsius;
    }
}
