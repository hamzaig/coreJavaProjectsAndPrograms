package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int sorted[] = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int x){
        int newArray[] = new int[x];
        System.out.println("Enter "+x+" integers Values : \n");
        for(int i=0;i<newArray.length;i++){
            newArray[i] = scanner.nextInt();
        }
        return  newArray;
    }
    public static void printArray(int[] x){
        for(int i=0;i<x.length;i++){
            System.out.println("Element "+i+" contents "+ x[i]);
        }
    }
    public static int[] sortIntegers(int[] x){
        int sortedArray[] = new int[x.length];
        for (int i=0;i<x.length;i++){
            sortedArray[i] = x[i];
        }
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for(int i = 0 ; i<sortedArray.length - 1 ; i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return  sortedArray;
    }

}
