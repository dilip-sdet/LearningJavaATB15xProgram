package ex_17_Java_Code_Exam;

import java.util.Scanner;

public class Lab108_codeExam7 {
    public static void main(String[] args) {
        int operator = 0;
        /* operator=1 for addition
        operator=2 for substraction
        operator=3 for multiplication
        operator=4 for division
         */
        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operator from 1-4: ");
        if(sc.hasNextInt()){
            operator = sc.nextInt();
        }
        else {
            System.out.println("Enter integers only");
            System.exit(0);
        }
        System.out.println("Enter the Value of a: ");
        if(sc.hasNextInt()){
            a = sc.nextInt();
        }
        else {
            System.out.println("Enter integers only");
            System.exit(0);
        }
        System.out.println("Enter the value of b: ");
        if(sc.hasNextInt()){
            b = sc.nextInt();
        }
        else {
            System.out.println("Enter integers only");
            System.exit(0);
        }
        switch(operator){
            case 1 -> System.out.println("Addition of " + a + " and " + b + " is " + (a+b));
            case 2 -> System.out.println("Substraction of " + a + " and " + b + " is " + (a-b));
            case 3 -> System.out.println("Multoplication of " + a + " and " + b + " is " + (a*b));
            case 4 -> System.out.println("Division of " + a + " and " + b + " is " + (a/b));
            default -> System.out.println("Currently we have 4 operator, please enter from 1-4");
        }
    }
}
