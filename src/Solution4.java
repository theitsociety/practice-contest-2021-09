public class Solution4 {
    public static void main(String[] args) {
        String str = "aloyupolo";
        char[] arr = {'o','p','u','y'};
        reverse(arr);
        System.out.println(hasInverse(str,arr));
    }
    public static Boolean hasInverse(String str, char [] arr){
        int strIndex = 0;
        int charIndex = 0;
        while(strIndex < str.length()) {
            if(arr[charIndex] == str.charAt(strIndex)){
                charIndex++;
                if(charIndex == arr.length)
                    return true;
            }else {
                strIndex = strIndex - charIndex;
                charIndex = 0;
            }
            strIndex++;
        }
        return true;
    }
    public static char[] reverse(char arr[]){
        int n = arr.length;
        int l = 0, r = n-1;
        char temp;
        while(l<r){
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;r--;
        }
      return arr;
    }
}