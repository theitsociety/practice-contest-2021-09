import java.util.HashMap;
import java.util.IllegalFormatCodePointException;

public class Solution20 {
    //Leetcode Roman To Integer
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("CVIII"));
        System.out.println(romanToInt("MDCCVIII"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("MDCCCXLVI"));
        System.out.println(romanToInt("MDCCLIII"));
        System.out.println(romanToInt("CMXLVII"));
        System.out.println(romanToInt("MMMCMXCIX"));
        System.out.println(romanToInt("D"));
        System.out.println(romanToInt("MDCXCV"));
    }
    public static int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.putIfAbsent('M',1000) ;
        map.putIfAbsent('D',500) ;
        map.putIfAbsent('C',100) ;
        map.putIfAbsent('L',50) ;
        map.putIfAbsent('X',10) ;
        map.putIfAbsent('V',5) ;
        map.putIfAbsent('I',1) ;
        int result=0;

        if (s.length()==1)
            return map.get(s.charAt(0));

        for (int i=0;i<s.length()-1;i++){

            if (map.get(s.charAt(i))>=map.get(s.charAt(i+1))){
                result+=map.get(s.charAt(i));
                if(i==s.length()-2){
                    result+=map.get(s.charAt(s.length()-1));
                    break;
                }
            }
            if (map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                result+=map.get(s.charAt(i+1))-map.get(s.charAt(i));
                i=i+1;
                if(i==s.length()-2){
                    result+=map.get(s.charAt(s.length()-1));
                    break;
                }
            }
        }
        return result;
    }
}
