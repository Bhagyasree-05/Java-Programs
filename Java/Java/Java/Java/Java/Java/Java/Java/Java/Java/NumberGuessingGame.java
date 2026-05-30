import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int num = r.nextInt(10);
        System.out.print("Guess number (0-9): ");
        int guess = sc.nextInt();

        if(guess == num)
            System.out.println("Correct!");
        else
            System.out.println("Wrong! Number was " + num);
    }
}
