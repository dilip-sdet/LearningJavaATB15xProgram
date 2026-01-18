package ex_19_Java_Arrays;

import java.util.Scanner;

public class Lab133_InputArrayProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of an array: ");
        int length = sc.nextInt();
        int value[] = new int[length];
        for(int i=0; i<value.length; i++){
            System.out.println("Enter the arrays for Value: ");
            if(sc.hasNextInt()){
                value[i] = sc.nextInt();
            }
            else {
                System.out.println("Enter only integers");
                value[i] = 0;
            }
        }
        for(int i=0; i<value.length; i++){
            System.out.println(value[i]);
        }
    }
}
