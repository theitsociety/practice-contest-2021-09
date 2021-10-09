import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution17 {
    /*
    The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
    such that each number is the sum of the two preceding ones, starting from 0,
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number...");
        int num = scan.nextInt();

        System.out.println(fib(num));
    }
    public static int fib(int num) {
        return num<2?num:fib(num-1)+fib(num-2);
    }

    //Thanks to Mr Turkoz to teach us recursion logic..
}
