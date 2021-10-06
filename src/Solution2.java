public class Solution2 {

    public static void main(String[] args) {
        char ch[] = {'a', 'e', 'f', 'w', 'y'};
        char given = 'a';
        System.out.println(checkArray(ch, given));
    }

    public static Boolean checkArray(char ch [], char given) {

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == given) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}

