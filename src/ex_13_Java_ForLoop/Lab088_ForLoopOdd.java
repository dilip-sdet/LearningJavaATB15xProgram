package ex_13_Java_ForLoop;
import java.util.Scanner;
public class Lab088_ForLoopOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for(int i =0; i<num; i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
