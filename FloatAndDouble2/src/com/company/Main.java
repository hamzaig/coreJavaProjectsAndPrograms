package com.company;

public class Main {

    public static void main(String[] args) {
        
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        System.out.println();
        System.out.println();

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        System.out.println();
        System.out.println();

        int myIntValue=5/3;
        float myFloatValue=5f/3f;
        double myDoubleValue=5.0/3.0;
        System.out.println("My Int Value = "+myIntValue);
        System.out.println("My Float Value = "+myFloatValue);
        System.out.println("My DOuble Value = "+myDoubleValue);

        double numberOfPounds=200d;
        double convertedKilograms=numberOfPounds*(0.45359237d);
        System.out.println("Converted Kilograms = " + convertedKilograms);

        double pi=3.1415927d;
        double anotherNumber=3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

        

    }
}
