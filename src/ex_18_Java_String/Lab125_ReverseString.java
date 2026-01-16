package ex_18_Java_String;

import java.util.Scanner;

public class Lab125_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name please: ");
        String name = sc.next();
        String reverse = "";
        for (int i = name.length()-1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.println(reverse);
    }
}

