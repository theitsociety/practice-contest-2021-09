class Solution {
     public int  fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

 int  firstNumber=0;
        int lastNumber=1;
 int sum=0;
        while(n>1){
            sum=firstNumber+lastNumber;
            firstNumber=lastNumber;
            lastNumber=sum;
            n--;
        }
        return sum;
    }

}
    
