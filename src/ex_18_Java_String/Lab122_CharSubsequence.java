package ex_18_Java_String;

public class Lab122_CharSubsequence {
    public static void main(String[] args) {
        CharSequence s1 = "Java";
        System.out.println(s1.charAt(3));
        System.out.println((s1.chars()));
        System.out.println((s1.subSequence(1,3)));
        System.out.println(s1.isEmpty());
        System.out.println(s1.length());
        System.out.println((s1.equals("Java")));
        System.out.println(s1.equals("Mava"));
        System.out.println((s1.toString()));
    }
}
