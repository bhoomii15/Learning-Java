package com.company;

public class BreakContinue {
    public static void main(String[] args) {
        /*for(int i=1; i<=5; i++){
            System.out.println(i);
            System.out.println("Ending the loop");
            if(i==4){
                System.out.println("loop ends here");
                break;
            }*/
        for(int i=1; i<=5; i++){

            if(i==4){
                System.out.println("loop ends here");
                continue;
            }
            System.out.println(i);
            System.out.println("Ending the loop");
        }
    }
}
