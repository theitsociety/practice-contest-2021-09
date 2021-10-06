import java.util.Locale;

public class Solution3 {
    public static void main(String[] args) {
        String str = "Hatice Cenik";
        String given = "ec";
        System.out.println("Contains method: "+ checkStringWithContains(str,given));
        System.out.println("CheckString method: "+ checkString(str,given));



    }
    public static Boolean checkStringWithContains(String str, String given){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if(str.replace(" ","").toLowerCase().contains(given)){
            return true;
        }
    return false;
    }
    public static Boolean checkString(String str, String given){
        char arr []= given.replace(" ","").toLowerCase().toCharArray();
        String lastStr = str.replace(" ","").toLowerCase();
        int strIndex = 0;
        int givenIndex = 0;
        while(strIndex < lastStr.length()) {
            if(arr[givenIndex] == lastStr.charAt(strIndex)){
                givenIndex++;
                if(givenIndex == arr.length)
                    return true;
            }else {
                strIndex = strIndex - givenIndex;
                givenIndex = 0;
            }
            strIndex++;
        }
        return false;
    }
}
