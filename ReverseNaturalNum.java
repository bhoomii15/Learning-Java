package com.company;
import java.util.Scanner;

public class ReverseNaturalNum {
    public static void main(String[] args) {
        System.out.println("Enter the number till where the string is needed:");
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for (int i = a; i>0; i--){
            System.out.println(i);
        }

    }
}
