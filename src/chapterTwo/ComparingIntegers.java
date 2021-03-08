package chapterTwo;

import java.util.Scanner;

public class ComparingIntegers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1,
            number2;

        System.out.println("Enter first Value: ");
        number1 = input.nextInt();

        System.out.println("Enter second value: ");
        number2 = input.nextInt();

        if (number1 > number2)
            System.out.printf("The number %d is greater", number1 );

        if (number1 < number2)
            System.out.printf("The number %d is greater", number2);

        if (number1 == number2)
            System.out.printf("The numbers %d and %d are equal", number1, number2);
    }
}
