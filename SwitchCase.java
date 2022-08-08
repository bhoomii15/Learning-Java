package com.company;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /*int age;
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();*/
        String var = "Bhoomi";

        switch (var) {
            case "Bhoomi" -> System.out.println("You're gonna be an adult");
            case "Nishtha" -> System.out.println("Youre going to enjoy your life");
            case "Palak" -> System.out.println("Youre going to hit your peak");
        }
       /* if (age>56){
            System.out.println("You're experienced");
        }
        else if (age>46){
            System.out.println("You're not too experienced");
        }
        else {
            System.out.println("You're a begineer");
        }*/

    }
}
