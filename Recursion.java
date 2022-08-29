package com.company;

public class Recursion {
    // using recursion
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n *factorial( n-1);
        }
    }

    // using iterative approach
    static int fact(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            int product = 1;
            for(int i=1; i<=n; i++){
                product *= i ;
            }
            return product;
        }
    }


    public static void main(String[] args) {
        System.out.println("The factorial of 7 is:" + factorial(7));
        System.out.println("The factorial of 7 is:" + fact(7));

    }
}
