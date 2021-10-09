import java.util.HashMap;

public class Solution20 {
    public static void main(String[] args) {

    }
    public int romanToInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        char[] input = s.toCharArray();
        int n = input.length;
        if(n==1){
            return roman.get(input[0]);
        }
        int result= 0, index= 0;
        while(index<n){
            if(index+1<n && roman.get(input[index])<roman.get(input[index+1])){
                result += (roman.get(input[index+1])-roman.get(input[index]));
                index += 2;
            }else{
                result += roman.get(input[index]);
                index++;
            }
        }
        return result;
    }
}

