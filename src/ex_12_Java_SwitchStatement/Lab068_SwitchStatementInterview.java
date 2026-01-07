package ex_12_Java_SwitchStatement;

import java.util.Scanner;

public class Lab068_SwitchStatementInterview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7 for day program");
        if (sc.hasNextInt()) {
            int day = sc.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Day 1: Monday");
                case 2:
                    System.out.println("Day 2: Tuesday");
                case 3:
                    System.out.println("Day 3: Wednesday");
                case 4:
                    System.out.println("Day 4: Thursday");
                case 5:
                    System.out.println("Day 5: Friday");
                case 6:
                    System.out.println("Day 6: Saturday");
                case 7:
                    System.out.println("Day 7: Sunday");
                default:
                    System.out.println("Invalid Day");
                    // if there is no break, output will the matched day. Also it display the rest of the case as well
            }
        } else {
            System.out.println("invalid Input");
        }
    }
}
