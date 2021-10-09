import java.util.Arrays;
public class Solution10 {
    /*
    "Reverse an integer array without creating a new array (in-place)
        ex: arr[1,2,3,4] will be returned as [4,3,2,1]"
     */

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};

        System.out.println(Arrays.toString(reverseArray(arr)));
    }
    public static int [] reverseArray(int[] arr){
        int n = arr.length;
        int left=0;
        int right=n-1;
        while(left<n/2){
            arr[left]=arr[left]+arr[right];
            arr[right]=arr[left]-arr[right];
            arr[left]=arr[left]-arr[right];
            left++;
            right--;
        }
        return arr;
    }
}
