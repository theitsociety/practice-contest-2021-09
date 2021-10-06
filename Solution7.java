public class Solution7 {
    //Write a program converting given fahrenheit temperature to centigrade
    public static void main(String[] args) {
        System.out.println(fahrenheitToCelsius(98.6));
        System.out.println(fahrenheitToCelsius(100.0));
        System.out.println(fahrenheitToCelsius(75.0));
        System.out.println(fahrenheitToCelsius(32.0));
        System.out.println(fahrenheitToCelsius(50.0));
        System.out.println(fahrenheitToCelsius(50.8));
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius= ((fahrenheit-32)*5)/9;
        return celsius;
    }

}
