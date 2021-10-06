public class Solution9 {
    //Write a program returning number of odd numbers in a given array
    public static void main(String[] args) {
        int [] arr1={3,2,6,7,5,4};// returns 3
        int [] arr2={13,22,16,7,5,44,1,56,0,8};// returns 4
        int [] arr3={11,1,9,7,59,100,87,534};// returns 6
        System.out.println(oddNumbers(arr1));
        System.out.println(oddNumbers(arr2));
        System.out.println(oddNumbers(arr3));
    }
    public static int oddNumbers(int [] arr){
        int count=0;
        for (int i=0;i< arr.length;i++){
            if(arr[i]%2 == 1)
                count++;
        }
        return count;
    }

}
