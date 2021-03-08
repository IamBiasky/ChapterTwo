package chapterTwo;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {

        int     number1,
                number2,
                number3,
                sum,
                product;
        double  average;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        number1 = input.nextInt();

        System.out.println("Enter second integer: ");
        number2 = input.nextInt();

        System.out.println("Enter second integer: ");
        number3 = input.nextInt();

        sum = number1 + number2;
        product = number1 * number2;
        average = (number1 + number2 + number3)/ 3.0;

        System.out.println("The sum is " + sum);
        System.out.println("The product is " + product);
        System.out.println("The average is " + average);

        if (number1 > number2 && number1 > number3) {
            System.out.printf("The number %d is greater", number1);
        }

        else if (number2 > number1 && number2 > number3) {
            System.out.printf("The number %d is greater", number2);
        }

        else if (number3 > number2 && number3 > number1) {
            System.out.printf("The number %d is greater", number3);
        }
    }
}
