    public static void main(String[] args) {


        System.out.println(reverseString("Ali"));



     }

    public static String reverseString(String a){
     String str =" ";
     for(int i=a.length()-1;i>=0;i--){
         str+=a.charAt(i);

     }
     return str;
    }

    }
