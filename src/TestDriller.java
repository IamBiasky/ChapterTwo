import java.util.Scanner;

public class TestDriller {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int order = 1;

        while (order >= 0) {
            System.out.println("Enter order number: ");
            order = input.nextInt();

            if (order < 1) {
                System.out.println("Invalid number");

            } else if (order <= 4) {
                    System.out.println("Price is N1,500");

                } else if (order <= 9) {
                    System.out.println("Price is N1,400");

                } else if (order <= 29) {
                    System.out.println("Price is N1,200");

                } else if (order <= 49) {
                    System.out.println("Price is N1,100");

                } else if (order <= 99) {
                    System.out.println("Price is N1,000");

                } else if (order <= 199) {
                    System.out.println("Price is N900");

                } else if (order >= 200) {
                    System.out.println("Price is N800");
                }


            }
        }
    }





