package ex_17_Java_Code_Exam;

import java.util.Scanner;

public class Lab104_codeExam3 {
    public static void main(String[] args) {
        double d = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of d: ");
        if(sc.hasNextDouble()){
            d = sc.nextDouble();
        }
        else {
            System.out.println("Enter double value only");
            System.exit(0);
        }
        System.out.println("The value of d " + d);

        int a = (int) d;
        System.out.println("The value of a " + a);

    }
}
