package com.company;

public class MethodOverloading {
    static void tellJoke(){
        System.out.println("I invented a new word!!\n" + "Sarcasmm");
    }

    int sum(int a, int b) {
        return a + b;
    }

    static void change(int a) {
        a = 98;
    }

    static void change2(int [] arr) {
        arr[0] = 98;
    }

    static void gm(){
        System.out.println("Good Morning!!");
    }

    static void gm(int a){
        System.out.println("Good Morning!!" + " " + a);
    }








    public static void main(String[] args) {

        tellJoke();                                                       // void return
        MethodOverloading obj = new MethodOverloading();
        int c = obj.sum(4, 5);                                       //nothinmg happens if you change this
        int a = 3;
        System.out.println(c);


        //Changing the integer
        int x = 45;
        change(x);
        // as the output will show it doesn't change in case of integers
        System.out.println(x);

        //Changing a digit in the array
        int[] marks = {55, 66, 88, 99, 56};
        change2(marks);
        System.out.println(marks[0]);
        // it will change in this case as

        gm();
        gm(6);

    }


}
