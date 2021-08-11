package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int array[] = {1,2,4,6,3,2,4,5};
        System.out.println("Array = " + Arrays.toString(array));
        reverseArray(array);
        System.out.println("Array = " + Arrays.toString(array));
    }
    private static void reverseArray(int array[]){
        int maxIndex = array.length - 1;
        int halfIndex = array.length/2;
        for (int i=0 ;i<halfIndex ;i++){
            int swap = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = swap;
        }
    }
}
