package chapterFour;

import java.util.Scanner;

public class AverageTest {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int totalScore = 0, score = 0, totalNumberofInputCollected = 0;

      while(totalNumberofInputCollected < 3) {

        System.out.println("Enter student grade: ");
        score = userInput.nextInt();
        totalScore = totalScore + score;

        totalNumberofInputCollected++;


      }

        System.out.println(totalScore);


    }
}
