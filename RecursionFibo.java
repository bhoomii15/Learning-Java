package com.company;
import java.util.Scanner;

public class RecursionFibo {

    static int fibo(int n){
        if (n ==0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The fibonacci sum for the given no is :" + fibo(n));
    }
}
