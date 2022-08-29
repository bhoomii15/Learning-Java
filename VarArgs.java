package com.company;

public class VarArgs {

// But this is the long way so we will use varArgs here
   /* static int sum(int a , int b){
        return a+b;
    }
    static int sum(int a , int b, int c){
        return a+b+c;
    }
    static int sum(int a , int b, int c, int d){
        return a+b+c+d;
    }*/

    //USING VARARGS

    static int sum(int x, int ...arr){
        // this will make every integer be available as an array
        int result =0;
        for(int a: arr){
            result+= a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("This document helps us understand VarArgs");
        System.out.println("The sum of 4 and 5 is: " + sum(4,5));
        System.out.println("The sum of 4, 5 and 6 is: " + sum(4,5,6));
        System.out.println("The sum of 4, 5, 6 and 7 is: " + sum(4,5,6,7));
        // but if you want the following to not happen then initialise a compulsory variable int x
        /*System.out.println("The sum of nothing is:" + sum());*/

    }
}
