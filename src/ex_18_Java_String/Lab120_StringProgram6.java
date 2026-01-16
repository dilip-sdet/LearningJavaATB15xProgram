package ex_18_Java_String;

public class Lab120_StringProgram6 {
    public static void main(String[] args) {
        String s1 = "Dilip";
        char c = s1.charAt(4);
        String d = Character.toString(s1.charAt(2));
        System.out.println(c);
        System.out.println(d);
        String s2 = "ABC";
        String s3 = "abc";
        int stringcompareValue1 = s2.compareTo(s3);
        int stringcompareValue2 = s3.compareTo(s2);
        int stringcompareValue3 = s3.compareTo(s3);
        System.out.println(stringcompareValue1);
        System.out.println(stringcompareValue2);
        System.out.println(stringcompareValue3);
    }
}
