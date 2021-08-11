package com.company;

public class Main {

    public static void main(String[] args) {

//        byte;
//        short;
//        int;
//        long;
//        float;
//        double;
//        char;
//        boolean;
        String myString= "This is a String";
        System.out.println(myString);
        myString+=", and this is more";
        System.out.println(myString);
        myString+=" \u00A9 2019";
        System.out.println(myString);
        String numberString="250.55";
        numberString+="49.95";
        System.out.println(numberString);
        String lastString="10";
        int x=25;
        lastString+=x;
        System.out.println(lastString);
        double d=72.29;
        lastString+=d;
        System.out.println(lastString);


    }
}
