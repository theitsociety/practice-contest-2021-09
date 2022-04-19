class Solution {
    public int reverse(int x) {


int reversed=0;
 int temp;
   while(x!=0){

       temp=x%10;
       x/=10;
     //Bu kismi tam anlamadim.Internetten yardim aldim.
       if(reversed>Integer.MAX_VALUE/10 ||reversed==Integer.MAX_VALUE/10 && temp>7){
           return 0;
       }else if(reversed<Integer.MIN_VALUE/10 ||reversed==Integer.MIN_VALUE/10 && temp<-8){
           
           return 0;
       }
       reversed=(reversed*10) +temp;
   }
   return reversed;





    }
  
  // Benim kendim gelebildigim code :
   /*
   public int reverse(int x) {
   


int reverse=0;
 int temp;
   while(x!=0){

       temp=x%10;
       x/=10;

           return 0;
       }
       // code here
       reverse=(reverse*10) +temp;
   }
   return reverse;


*/


    }
}
