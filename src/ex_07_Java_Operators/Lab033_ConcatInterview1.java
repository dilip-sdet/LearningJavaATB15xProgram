package ex_07_Java_Operators;

public class Lab033_ConcatInterview1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String firstname = "Dilip ";
        String lastname = "Kumar";
        System.out.println(firstname + lastname + a + b);
        System.out.println(firstname + lastname + (a + b));
        System.out.println(a + b + firstname + lastname);
    }
}
