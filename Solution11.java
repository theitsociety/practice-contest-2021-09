public class Solution11 {
    public static void main(String[] args) {
        System.out.println("iterative solution");
        System.out.println(convertBinToDec(11));//3
        System.out.println(convertBinToDec(10001));//17
        System.out.println(convertBinToDec(1011));//11
        System.out.println(convertBinToDec(111));//7
       System.out.println(convertBinToDec(1));//1
        System.out.println(convertBinToDec(110));//6
        System.out.println(convertBinToDec(0));

        System.out.println("recursive solution");
        System.out.println(recursiveBinToDec(11,0));//3
       System.out.println(recursiveBinToDec(10001,0));//17
        System.out.println(recursiveBinToDec(1011,0));//11
        System.out.println(recursiveBinToDec(111,0));//7
        System.out.println(recursiveBinToDec(1,0));//1
        System.out.println(recursiveBinToDec(110,0));//6
        System.out.println(recursiveBinToDec(0,0));

    }
    public static int convertBinToDec(int binary){
        int result=0;
        int pow=0;
        while(binary!=0){
            result+= (binary%10)*Math.pow(2,pow);
            binary/=10;
            pow++;
        }
        return result;
    }
    public static int recursiveBinToDec(int binary,int pow){
        if (binary==0)
            return 0;
        int result= (int)((binary%10)*Math.pow(2,pow) + recursiveBinToDec(binary/10,pow+1));
        return result;
    }
}
