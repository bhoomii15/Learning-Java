package com.company;
import java.util.Scanner;

public class ArrayDS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b,c;
        a = sc.nextInt();
        //Taking input for number of arrays
        int n = sc.nextInt();
        //Initialising the array
        int[] A = new int[n];
        //Taking input for elements of array
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int[] B = new int[n];
        for (int j = 0; j < n; j++) {
            B[j] = A[(n - 1) - j];
        }

        for (int j = 0; j < n; j++) {
            System.out.print(B[j]);
        }

    }
}
