package com.company;


class Employee{
    int id;
    int salary;
    String name;
    public void printDeets(){
        System.out.println("Employye id is: " + id);
        System.out.println("Employee name is: " + name);
        /*System.out.println("Employee's salary is: " + salary);*/
    }

    public int getSalary(){    //creating a new method getsalary
        return salary;
    }
}
public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This is my custom class");

        //Instantiaitng an employee object
        Employee bhoomi = new Employee();
        Employee john =  new Employee();

        // setting attributes in this object
        bhoomi.id = 909;
        bhoomi.name = "BwhoomiCodes";
        bhoomi.salary = 500000;

        john.id = 101;
        john.name = "John";
        john.salary = 5000;

        //printing the attributes
        bhoomi.printDeets();
        System.out.println(bhoomi.getSalary());
        john.printDeets();
        System.out.println(john.getSalary());
        /*System.out.println(bhoomi.id);
        System.out.println(bhoomi.name);*/



    }
}
