package com.leecode;

public class Fibonaccis {

    public static int[] getFibonaccis(int n) {
        int[] fibonaccis = new int[n];
        fibonaccis[0] = 1;
        fibonaccis[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonaccis[i] = fibonaccis[i - 2] + fibonaccis[i - 1];
        }
        return fibonaccis;
    }

    public static void main(String[] args) {
        int[] fibonaccis = getFibonaccis(6);
        for (int i = 0; i < fibonaccis.length; i++) {
            System.out.println(fibonaccis[i]);
        }
    }

}
