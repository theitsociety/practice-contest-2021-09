public class Solution19 {

        /*
        Write a function to find the longest common prefix string amongst an array of strings.
        If there is no common prefix, return an empty string "".
         */
        public static void main(String[] args) {
            String[] arr ={"Hatice","Halide","Hafize","Hatun","Hatira"};
//            String[] arr ={"qHatice","aHalide","sHafize","dHatun","Hatira"};

            System.out.println(longestCommonPrefix(arr));
        }
    public static String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(n == 1) return strs[0];
        StringBuilder prefix = new StringBuilder();
        int index = 0;
        boolean isPrefix = true;
        while(isPrefix){
            char element = 0;
            if(index<strs[0].length()){
                element = strs[0].charAt(index);
            }
            for(String str: strs){
                if(str.length()==index || element != str.charAt(index)){
                    isPrefix = false;
                    break;
                }
            }
            if(isPrefix){
                prefix.append(element);
                index++;
            }
        }
        return prefix.toString();
    }
}