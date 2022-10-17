package com.company;
import java.util.Scanner;


public class CaseSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit) {
            case "Mango" -> System.out.println("My fav fruit");
            case "Apple" -> System.out.println("Apples are healthy");
            case "Orange" -> System.out.println("Round Fruit");
            default -> System.out.println("Please enter a valid fruit");
        }


        // not using the break condition

        int day = sc.nextInt();


  /*      switch(day) {
            case 1 :
            case 2 :
            case 3:
            case 4 :
            case 5 :
                System.out.println("Weekday!");
                break;
            case 6 :
            case 7 :
                System.out.println("Weekend!" );
                break;
        }
*/
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday!");
            case 6, 7 -> System.out.println("Weekend!");
        }

    }
}