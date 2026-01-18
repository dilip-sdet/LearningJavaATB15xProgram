package ex_19_Java_Arrays;

import java.util.Scanner;

public class Lab134_ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of an array: ");
        int length = sc.nextInt();
        int value[] = new int[length];
        int i;
        for (i = 0; i < value.length; i++) {
            System.out.println("Enter the values for an array: ");
            if (sc.hasNextInt()) {
                value[i] = sc.nextInt();
            } else {
                System.out.println("Enter Integers only");
                value[i] = 0;
            }
        }
        for (int j = value.length - 1; j >= 0; j--) {
            System.out.println(value[j]);
        }
    }
}


