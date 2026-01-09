package ex_14_Java_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class Lab096_GuessNumber1 {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100);
        int attempt = 0;
        int guess;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please try again.");
                sc.next();
                continue;
            }
            guess = sc.nextInt();
            attempt++;
            if (guess < numberToGuess) {
                System.out.println("Number is less than Guess number");
            } else if (guess > numberToGuess) {
                System.out.println("Number is more than Guess number");
            } else {
                System.out.println("Number is correct !" + attempt);
                break;
            }
        }
    }
}

