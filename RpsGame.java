package com.company;
import java.util.Scanner;
import java.util.Random;

public class RpsGame {
    public static void main(String[] args) {

            int userMove;
            System.out.println("Welcome to Rock, Paper, Scissors!!");
            System.out.println("What's your move? (Enter an integer between 0 to 2)");
            System.out.println("0=Rock, 1 =Paper, 2=Scissors");
            Scanner sc = new Scanner(System.in);
            userMove = sc.nextInt();
            if (userMove == 0) {
                System.out.println("You chose: Rock!");
            } else if (userMove == 1) {
                System.out.println("You chose:Paper");
            } else if (userMove == 2) {
                System.out.println("You chose: Scissors");
            } else {
                System.out.println("invalid input");
            }
            int opponentMove;
            Random rand = new Random();
            opponentMove = rand.nextInt(2);
            if (opponentMove == 0) {
                System.out.println("Opponent move is: Rock");
            } else if (opponentMove == 1) {
                System.out.println("Opponent move is: Paper");
            } else {
                System.out.println("Opponent move is:Scissors");
            }
            if (userMove == 0 && opponentMove == 0 || userMove == 1 && opponentMove == 1 || userMove == 2 && opponentMove == 2) {
                System.out.println("It's a draw");
            }
            else if (userMove == 0 && opponentMove == 2 || userMove == 1 && opponentMove == 0 || userMove == 2 && opponentMove == 1) {
                System.out.println("You won!");
            }

            else System.out.println("You lost");
        }

}
