package chapterFour;

public class WhileTest {
    public static void main(String[] args) {
        int counter = 11;


        while(counter >=1){
            System.out.printf("%d ", counter);
            --counter;

            System.out.println(counter * counter * counter);
        }
    }

}