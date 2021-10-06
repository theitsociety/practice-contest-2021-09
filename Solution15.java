public class Solution15 {
    //Leetcode 509 Fibonacci Number
    // 1 1 2 3 5 8 13 21 34 55 89
    public static void main(String[] args) {
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(6));
        System.out.println(fib(7));
        System.out.println(fib(8));
        System.out.println(fib(9));
        System.out.println(fib(10));
        System.out.println(fib(11));
        System.out.println(fib(12));

    }
    public static int fib(int n){
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        return fib(n-1)+fib(n-2);
    }
}
