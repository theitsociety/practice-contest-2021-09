package org.itsociety;

public class Solution2 {
  
  
  public boolean findCharacters(char c,String b) {

     for(int i=0;i<b.length();i++){
         if(b.charAt(i)==c){
             return true;
         }

     }
        return false;


    }
  
    public static void main(String[] args) {
        System.out.println( solution.findCharacters('a',"ramazan"));

    }
}
