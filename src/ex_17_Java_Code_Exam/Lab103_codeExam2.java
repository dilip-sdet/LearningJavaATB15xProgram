package ex_17_Java_Code_Exam;

import java.util.Scanner;

public class Lab103_codeExam2 {
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

        //check whether given number is even or odd

        if(a%2==0){
            System.out.println(a + " is a even number");
        }else{
            System.out.println(a + " is a odd number");
        }
    }
}
