package ex_16_Java_Function;

import java.util.Scanner;

public class Lab101_functiontype {

    static int readValueOfScanner(Scanner sc, String prompt){
        System.out.print(prompt);
        if(sc.hasNextInt()) {
            return sc.nextInt();
        }
        else{
            System.out.println("Enter integer only");
            System.exit(0);
            return 0;
        }
    }

    //no parameters with no return type
    static void hello(){
        System.out.println("hello");
    }

    //no parameters with return type
    static int sum(){
        int a = 10;
        int b = 20;
        int c = a+b;
        return c;
    }

    //parameters with no return type
    static void sumof2(int a, int b){
        int c = a+b;
        System.out.println(c);
    }

    //parameters with return type
    static int mulof2(int a, int b){
        int c = a*b;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = readValueOfScanner(sc, "Enter the valure of a: ");
        int b = readValueOfScanner(sc, "Enter the valure of b: ");
        hello();
        System.out.println(sum());
        sumof2(a,b);
        System.out.println(mulof2(a,b));
    }
}
