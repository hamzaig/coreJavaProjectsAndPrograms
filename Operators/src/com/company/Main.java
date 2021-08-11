package com.company;

public class Main {

    public static void main(String[] args) {
        int result=1+2;
        System.out.println(result);
        int previousResult=result;
        System.out.println(previousResult);
        result-=1;
        System.out.println(result);
        System.out.println(previousResult);

        result*=10;
        System.out.println(result);

        int remainder = result%3;
        System.out.println(remainder);

        result/=5;
        System.out.println(result);

        result++;
        System.out.println(result);

        result--;
        System.out.println(result);

        boolean isAlien=false;
        if (isAlien==true) {
            System.out.println("not Alien");
            System.out.println("H");
        }

//        int newValue=50;
//        if((Boolean.getBoolean((String)(newValue=50)))){
//            System.out.println("Hello");
//        }


        boolean isCar=false;
        isCar=true;
        boolean wasCar= isCar? true:false;

//        System.out.println(wasCar);
        if(wasCar){
            System.out.println("WasCar is True");
        }
        System.out.println();
        double myFirstValue=20.00d;
        double mySecondValue=80.00d;
        double myValuesTotal=(myFirstValue+mySecondValue)*100.00d;
        System.out.println("Total Values = "+myValuesTotal);
        double theRemainder=myValuesTotal%40.00d;
        System.out.println("The Reaminder is = "+theRemainder);
        boolean isNoRemainder=(theRemainder==0)?true:false;
        System.out.println("Is Remainder is Zero = "+isNoRemainder);
        if (!isNoRemainder){
            System.out.println("Got Some Remainder");
        }



    }
}
