package com.company;
import java.util.Scanner;

public class PracticeMethods {
    //q1
    static void multiply(int n){
        for(int i =1; i<=10; i++) {
            System.out.printf("%d X %d = %d\n", n, i, n*i);
            //we're using \n as printf won't automatically ive you a new line
        }
    }

    //q2

    static void pattern1(int n){
        // the first for loop will determine no of rows to be printed
       for(int i =0; i<n; i++){
           for (int j=0; j<i+1; j++){
               //this second for loop determines how many stars to print
               System.out.print("*");
           }
           System.out.println("");
        }
    }

//q3
    static int sumofn(int n){
        if(n ==1){
            return 1;
        }
        else{
            return n + sumofn(n-1);
            }
        }
//q4
    static void pattern2(int n){
        for(int i = 1; i<n; i++){
            for(int j=n-i-1; j>=0; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    //q5
    static int avg(int x, int  ...arr){
        int sum = 0;
        int result =0;
        for(int a: arr){
            sum += a;
            result = sum/ arr.length;
        }
        return result;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int n = sc.nextInt();*/
        /*pattern1(n);*/
       /* multiply(n);*/
        /*System.out.println(sumofn(n));*/
        /*pattern2(n);*/

        System.out.println(avg(1,2,3,4,5));

    }
}
