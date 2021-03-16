package chapterTwo;

import java.util.Scanner;

public class FiveIntegers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int smallest ;
        int largest ;



        System.out.println("Please first value: ");
        number1 = input.nextInt();

        System.out.println("Please second value: ");
        number2 = input.nextInt();

        System.out.println("Please third value: ");
        number3 = input.nextInt();

       System.out.println("Please fourth value: ");
        number4 = input.nextInt();

        System.out.println("Please fifth value: ");
        number5 = input.nextInt();

        largest = number1;





        if (number2 > largest)
            largest = number2;

        if (number3 > largest)
            largest = number3;

        if (number4 > largest)
            largest = number4;

        if (number5 > largest)
            largest = number5;

        smallest = number1;
        if (number2 < smallest)
            smallest = number2;

        if (number3 < smallest)
            smallest = number3;

        if (number4 < smallest)
            smallest = number4;

        if (number5 < smallest)
            smallest = number5;



        System.out.println("The largest number is " + largest);
        System.out.println("The smallest number is " + smallest);
    }
}
