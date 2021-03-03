package chapterFour;

import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberToGuess = 25;
        int userGuess = 0;

        while (userGuess != numberToGuess) {
            System.out.println("Enter number To Guess: ");
            userGuess = input.nextInt();

            if (userGuess == numberToGuess)
                System.out.println("You Won!");

            else if (userGuess < numberToGuess)
                System.out.println("Too low, please try again");

            else if (userGuess > numberToGuess)
                System.out.println("Too high, please try again");
        }


    }
}
