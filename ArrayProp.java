package com.company;

public class ArrayProp {
    public static void main(String[] args) {
        int [] marks = {88,55,99,12,56};
        /*System.out.println(marks.length);*/
        //Displaying the array in a naive way
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //Displaying arrya using for loop
        System.out.println("Displaying the array using for loop");
        for(int i =0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("Prinbting using decrementing for loop in reverse order");
        for(int i=marks.length -1;  i>=0; i--){
            System.out.println(marks[i]);
        }

        //for each loop
        System.out.println("Printing using for each loop");
        for( int element: marks){
            System.out.println(element);
        }




           /*float [] marks = {88.0f,55.5f,99.25f,12.0f,56.5f};
        System.out.println(marks[1]);*/
        /*String [] names = {"Bhoomi", "Sharma"};
        System.out.println(names[1]);
        System.out.println(names.length);*/
    }
}
