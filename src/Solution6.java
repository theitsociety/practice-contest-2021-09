public class Solution6 {
    /*
    Find and return the most frequent character for a given String
     */
    public static void main(String[] args) {
        String input = "fjareoiurepjfhdjddjhhffjjl";
        findMaxFrequency(input);

    }
    public static void findMaxFrequency(String str){
        int[] freqArr = new int[256];
        for(int i=0; i<str.length(); i++) {
            freqArr[str.charAt(i)]++;
        }
        int max=0, index=0;
        for(int i=0; i<freqArr.length; i++) {
            if(max<freqArr[i]) {
                max=freqArr[i];
                index=i;
            }
        }
        System.out.println("The most frequent character is: " +(char)index);
        System.out.println("Its frequency is " + max);
    }
}

