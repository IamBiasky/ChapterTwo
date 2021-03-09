package chapterTwo;

import java.util.Scanner;

public class AreaOfACircle {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.println("Enter integer for radius: ");
       double radius = input.nextInt();

        double  area = 3.14159 * radius * radius,
                diameter = 2 * radius,
                circumference = 2 * 3.14159 * radius ;



        System.out.println("The Area of a Circle is " + area);
        System.out.println("The diameter of a Circle is " + diameter);
        System.out.println("The circumference of a Circle is " + circumference);
    }
}
