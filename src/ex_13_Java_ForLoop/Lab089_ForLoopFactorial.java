package ex_13_Java_ForLoop;
import java.util.Scanner;
public class Lab089_ForLoopFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            int fact = 1;
            for(int i=1;i<=n;i++){
                fact = fact*i;
            }
            System.out.println("The Factorial of "+ n + " is " + fact);
        }
        else{
            System.out.println("invalid Input");
        }
        sc.close();
    }
}
