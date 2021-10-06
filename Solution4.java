public class Solution4 {
    //Given a string and a char array, check if the String has the inverse of char array or not.
    public static void main(String[] args) {
        char[]c={'o','p','u','y'};
        char[]arr={'b','b','b'};
        char[]arr1={'b','b','a'};
        char[]arr2={'e','e','d','c','b'};
        char[]arr3={'f','r','e','e','c'};
        char[]s={'r','a','c','e'};
        char[]s1={'c','e','c','a'};
        char[]s2={'a','c','e','c'};


        System.out.println(checkStringHasInverse("aloyupolo",c));
        System.out.println(checkStringHasInverse("aaabbabbbcdeerfggg",arr));
        System.out.println(checkStringHasInverse("aaabbabbbcdeerfggg",arr1));
        System.out.println(checkStringHasInverse("aaabbabbbcdeerfggg",arr2));
        System.out.println(checkStringHasInverse("aaabbabbbcdeerfggg",arr3));
        System.out.println(checkStringHasInverse("racecar",s));
        System.out.println(checkStringHasInverse("racecaarr",s1));
        System.out.println(checkStringHasInverse("racecaarr",s2));
    }
    public static boolean checkStringHasInverse(String word,char [] given){
        int i= 0;
        for (int j=word.length()-1; j>=0;j--){

            if(word.charAt(j)==given[i] ) {
                i++;
                if (i == given.length)
                    return true;
            }
            else {
                j=j+i;
                i=0;

            }
        }

        return false;
    }


}
