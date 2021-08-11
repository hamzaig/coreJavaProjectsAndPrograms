package com.hamzaig.mylibarary;

public class Series {

    public static long nSum(int n){
        return ((n*(n+1))/2);
    }

    public static long factorial(int n){
        if(n==0){
            return 1;
        }
        int fact = 1;
        for (int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }

    public static long fibbonacci(int n){
        if (n==0){
            return 0;
        }else if (n==1){
            return 1;
        }
        long nMinus1 = 0;
        long nMinus2 = 0;
        long fibb=0;

        for (int i=0;i<n;i++){
            fibb = (nMinus1+nMinus2);
            nMinus2 = nMinus1;
            nMinus2 = fibb;
        }
        return fibb;
    }
}
