package com.company;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();

        switch(empID){
            case 1 :
                System.out.println("Bhoomi Sharma");
                break;
            case 2 :
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "HR" -> System.out.println("HR Department");
                    case "TA" -> System.out.println("Technical Analyst");
                    default -> System.out.println("No department entered!");
                }
                break;
            default:
                System.out.println("Enter a valid EmpID");
        }
    }
}
