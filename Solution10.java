import java.util.ArrayList;
import java.util.Arrays;

public class Solution10 {
    public static void main(String[] args) {
        int [] ex1={1,2,3,4};
        int [] ex2={0,3,4,5,9};
        int [] ex3={11,2,4,5,6,13};
        int [] ex4={1,0,1,0,0,1,1,1};
        System.out.println(Arrays.toString(reverseInPlace(ex1)));
        System.out.println(Arrays.toString(reverseInPlace(ex2)));
        System.out.println(Arrays.toString(reverseInPlace(ex3)));
        System.out.println(Arrays.toString(reverseInPlace(ex4)));

    }
    public static int [] reverseInPlace(int [] arr){
        int swap1;
        int swap2;
       for (int i=0;i<arr.length/2;i++){
            swap1=arr[i];
            swap2=arr[arr.length-1-i];
            arr[i]=swap2;
            arr[arr.length-1-i]=swap1;
        }
        return arr;
    }
}
