package ex_11_Java_ConditionStatements;

import java.util.Scanner;

public class Lab065_TriangularClassifier {
    public static void main(String[] args) {
        //Let the sides of Triangle be a,b,c
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("Enter the value of c: ");
        int c = sc.nextInt();
        if(a==b && b==c && c==a){
            System.out.println("ACUTE TRIANGLE");
        }else if(a==b && (c!=a || c!=b)){
            System.out.println("ISOSCELES TRIANGLE");
        }else{
            System.out.println(("SCALENE TRIANGLE"));
        }
    }
}
