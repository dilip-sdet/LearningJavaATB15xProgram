package ex_17_Java_Code_Exam;

import java.util.Scanner;

public class Lab106_codeExam5 {
    public static void main(String[] args) {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        if(sc.hasNextInt()){
            a = sc.nextInt();
        }
        else {
            System.out.println("Enter integers only");
            System.exit(0);
        }
        String numberCheck = (a>0)?(a + " is greater than zero") :(a<0)?(a + " is lesser than zero"): "Given number is zero";
        System.out.println(numberCheck);
    }
}
