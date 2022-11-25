package com.company;
import java.util.Scanner;


public class Sum {
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The sum of the given numbers is: " + sum);

    }

    public static void main(String[] args) {
        //calling the function:

        sum();

        // you can call the function as many times as you want

    }
}
