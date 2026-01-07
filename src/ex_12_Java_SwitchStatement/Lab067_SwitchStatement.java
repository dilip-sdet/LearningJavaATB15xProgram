package ex_12_Java_SwitchStatement;

import java.util.Scanner;

public class Lab067_SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between 1 to 7, for the day program");
        if(sc.hasNextInt()) {
            int day = sc.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Day 1: Sunday");
                    break;
                case 2:
                    System.out.println("Day 2: Monday");
                    break;
                case 3:
                    System.out.println("Day 3: Tuesday");
                    break;
                case 4:
                    System.out.println("Day 4: Wednesday");
                    break;
                case 5:
                    System.out.println("Day 5: Thursday");
                    break;
                case 6:
                    System.out.println("Day 6: Friday");
                    break;
                case 7:
                    System.out.println("Day 7: Saturday");
                    break;
                default:
                    System.out.println("Invalid day is entered");
            }
        }
        else {
            System.out.println("Enter the valid data");
        }
    }
}


