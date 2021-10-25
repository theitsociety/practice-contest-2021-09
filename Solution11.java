 public static int binaryConvertToDecimal(int a){

      int number=a;

      int decimal=0;
      int baseNum=1;

      while(number>0){
          int lastDigit=number%10;
          number/=10;
          decimal+=lastDigit*baseNum;
          baseNum*=2;
      }
      return decimal;

  }
