package com.company;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter sub1:");
        int sub1= sc.nextInt();
        System.out.println("Enter sub2:");
        int sub2= sc.nextInt();
        System.out.println("Enter sub3:");
        int sub3= sc.nextInt();
        System.out.println("Enter sub4:");
        int sub4= sc.nextInt();
        System.out.println("Enter sub5:");
        int sub5= sc.nextInt();
        int totalMarks = sub1 + sub2 + sub3+ sub4+sub5;
        System.out.println(totalMarks);
        int percentage=  (totalMarks*100/500);
        System.out.print("Total Percenatge of the student: ");
        System.out.print(percentage);

    }
}
