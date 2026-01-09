package ex_14_Java_WhileLoop;
import java.util.Scanner;
public class Lab094_WhileLoopFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            int fact = 1;
            int i=1;
            while(i<=n){
                fact = fact*i;
                i++;
            }
            System.out.println("Factorial of " + n + " is " + fact);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
