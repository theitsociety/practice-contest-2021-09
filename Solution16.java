public class Solution16 {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(240));
        System.out.println(reverse(-455));
        System.out.println(reverse(-9));
        System.out.println(reverse(2147483647));
        System.out.println(reverse(536870911));
        System.out.println(reverse(-2147483647));
        System.out.println(reverse(-2147483648));


    }
    public static int reverse(int x ){
        int remainder;
        int result=0;
        int temp=0;
        while(x!=0){
            remainder=x%10;
            x=(x-remainder)/10;
            result= result*10 + remainder;
            if ((result-remainder)/10 != temp)
                return 0;
            temp=result;

        }
        return result;
    }

}
