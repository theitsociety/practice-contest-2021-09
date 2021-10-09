public class Solution9 {
    /*
    "Write a program returning number of odd numbers in a given array
        Example:
        [3,2,6,7,5,4] returns 3 because there are 3 odd numbers in the array"
     */

    public static void main(String[] args) {
        int [] arr = {3,2,6,7,5,4};
        oddArray(arr);
    }
    public static void oddArray(int [] arr){
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
