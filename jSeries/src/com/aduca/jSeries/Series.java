package com.aduca.jSeries;

public class Series {

    public static long nSum(int n){
        long sum = 0;
        for (int i=0; i<=n; i++){
            sum += i;
        }
        return sum;
    }

    public static long factorial(int n){
        if (n < 0) {
            return -1;
        } else if (n == 0){
            return 1;
        }
        long prod = 1;
        for (int i=1; i<=n; i++){
            prod *= i;
        }
        return prod;
    }

    public static long fibonacci(int n){
        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
