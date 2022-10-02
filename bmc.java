package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class bmc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[100];
        int n = sc.nextInt();
        while(n>0){
            arr[n]++;
            if (n<o){
                break;
            }
            System.out.println(getLargest(arr, arr.length));
        }


    }
}
