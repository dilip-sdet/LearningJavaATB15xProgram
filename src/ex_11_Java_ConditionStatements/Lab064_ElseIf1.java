package ex_11_Java_ConditionStatements;

import java.util.Scanner;

public class Lab064_ElseIf1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int age = sc.nextInt();
        if(age < 18){
            System.out.println(("You are Teenager"));
        } else if (age > 60) {
            System.out.println("You are senior citizen");
        }else{
            System.out.println("You are Adult");
        }
        sc.close();
    }
}
