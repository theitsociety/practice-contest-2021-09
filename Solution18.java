import java.util.Arrays;

public class Solution18 {
    // Leetcode Remove Duplicates from Sorted Array
    public static void main(String[] args) {
        int []arr1={1,1,1,1,1,2,3,3,3,4,4};
        int []arr2={1,1,1,1,1,2,2};
        int []arr3={1,1,1,2,3,3,3,4,4,5};
        int []arr4={1,1,2,2,2,2,3,3,3,4,4,5,5,5,6,6};
        int []arr5={2};
        System.out.println(removeDuplicates(arr1));
        System.out.println(removeDuplicates(arr2));
        System.out.println(removeDuplicates(arr3));
        System.out.println(removeDuplicates(arr4));
        System.out.println(removeDuplicates(arr5));


    }
    public static int removeDuplicates(int[] nums) {
        int j=0;
        for (int i=0;i< nums.length-1;i++){
             if(nums[i]!=nums[i+1]){
                 j++;
                 nums[j]=nums[i+1];
             }
        }
        //System.out.println(Arrays.toString(nums));
        return j+1;
    }
}
