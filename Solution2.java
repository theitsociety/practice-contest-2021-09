public class Solution2 {
    //For a given array, write a Java program to check if a given character exists or not in the array.
    public static void main(String[] args) {
        char[] arr1={'c','a','d','d','e'};
        char[] arr2={'b','a','s','k','e','t','b','a','l','l'};
        char[] arr3={'t','o','r','n','a','d','o'};
        System.out.println(isCharExists(arr1,'d'));
        System.out.println(isCharExists(arr1,'s'));
        System.out.println(isCharExists(arr2,'s'));
        System.out.println(isCharExists(arr2,'l'));
        System.out.println(isCharExists(arr2,'z'));
        System.out.println(isCharExists(arr3,'o'));
        System.out.println(isCharExists(arr3,'r'));
        System.out.println(isCharExists(arr3,'y'));



    }
    public static boolean isCharExists(char [] arr,char c) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c)
                return true;
        }
        return false;
    }

}
