package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Count : ");
        int returnedArray[] = readIntegers(scanner.nextInt());
        scanner.nextLine();
        int returnedMin = findMin(returnedArray);
        System.out.println("Min = "+returnedMin);
    }

    private static int[] readIntegers(int count){
        int array[] = new int[count];
        for (int i=0;i<array.length;i++){
            System.out.println("Enter A Number : ");
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }
    private static int findMin(int[] x){
        int min = Integer.MAX_VALUE;
        for (int i=0;i<x.length;i++){
            if (x[i]<min){
                min = x[i];
            }
        }
        return min;
    }
}
