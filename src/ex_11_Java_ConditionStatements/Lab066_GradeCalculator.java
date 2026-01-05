package ex_11_Java_ConditionStatements;

import java.util.Scanner;

public class Lab066_GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade of a Grade: ");
        int grade = sc.nextInt();
        if(grade<=100 && grade>=90){
            System.out.println("Grade A");
        }else if (grade<90 && grade>=80){
            System.out.println("Grade B");
        }else if (grade<80 && grade>=70) {
            System.out.println("Grade C");
        }else if(grade<70 && grade>=60){
            System.out.println("Grade D");
        }else {
            System.out.println("Grade F");
        }
    }
}
