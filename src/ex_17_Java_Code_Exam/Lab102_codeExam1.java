package ex_17_Java_Code_Exam;


import java.util.Scanner;

public class Lab102_codeExam1 {
    public static void main(String[] args) {
        //sum, difference, multiplication, division and remainders
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

        //add 2 integer number
        int sum = a + b;

        //Substract 2 integer number
        int sub = a - b;

        //Multiplication of 2 integer number
        int mul = a * b;

        //Division of 2 integer number
        float div = a / b;

        //Division of modulus of 2 integer number
        int mod = a % b;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
    }
}
