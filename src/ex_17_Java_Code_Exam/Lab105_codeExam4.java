package ex_17_Java_Code_Exam;

import java.util.Scanner;

public class Lab105_codeExam4 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
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
        int maxOf2 = (a>b)? a : b;
        System.out.println(maxOf2);
    }
}
