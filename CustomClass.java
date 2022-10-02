package com.company;

class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.print("My emp id is: " + id);
        System.out.println(" and my name is: " + name);
    }
}

public class CustomClass {
    public static void main(String[] args) {
        System.out.println("Bhoomi's first custom class");
        // instantiating a new object
        Employee raman = new Employee();
        Employee sita = new Employee();

        //setting attributes for raman
        raman.id = 10;
        raman.name = "Raman S.";

        //setting attributes for sita
        sita.id = 11;
        sita.name = "Sita";
        //printing the attributes
        /*System.out.println(raman.id);
        System.out.println(raman.name);*/

        //printing attributes
        raman.printDetails();
        sita.printDetails();

    }
}
