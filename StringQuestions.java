package com.company;

public class StringQuestions {
    public static void main(String[] args) {
        //Problem 1
        String name = "Bhoomi Sharma";
        name = name.toLowerCase();
        System.out.println(name);
        //Problem 2
        String title = "This is how we do it";
        title = title.replace(" ", "_");
        System.out.println(title);

        // Problem 3
        String letter= " Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Bhoomi");
        System.out.println(letter);

        // Problem4
        String  myString= "bHOOOMI   SHARMA  ";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("    "));

        //Problem 5
        String myLetter ="Dear Bhoomi,\n\t I'm so proud of you!\n\t Keep going<3";
        System.out.println(myLetter);

    }

}
