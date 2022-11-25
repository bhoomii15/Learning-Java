package com.company;
import java.util.Scanner;

public class Prime {
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        int a = 2;
        while(a<n){
            if( n % a == 0) return false;
            a++;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();

        System.out.println(isPrime(b));
    }
}
