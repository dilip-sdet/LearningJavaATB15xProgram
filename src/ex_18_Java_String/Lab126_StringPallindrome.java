package ex_18_Java_String;

import java.util.Scanner;

public class Lab126_StringPallindrome {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String please: ");
            String name = sc.next();
            String pallindrome = name;
            String reverse = "";
            for (int i = name.length()-1; i >= 0; i--) {
                reverse = reverse + name.charAt(i);
            }
            System.out.println(reverse);
            if(pallindrome.equalsIgnoreCase(reverse)) {
                System.out.println(name + " is a pallindrome");
            }else {
                System.out.println(name + " is not a pallindrome");
            }
    }
}

