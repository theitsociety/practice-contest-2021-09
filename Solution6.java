
   public static int[] frequencyCharacter(String str){
        int [] character=new int[50];
        for(int i=0;i<str.length();i++){
            character[str.charAt(i)-'a']++;
        }
        return character;
     }

