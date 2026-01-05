package ex_11_Java_ConditionStatements;

import java.util.Scanner;

public class Lab061_IfElseScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int myAge = sc.nextInt();
        if (myAge >=18){
            System.out.println("You can vote");
        }else {
            System.out.println("You cannot vote");
        }
        sc.close();
    }
}
