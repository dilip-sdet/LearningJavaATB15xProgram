package ex_18_Java_String;

public class Lab116_StringProgram2 {
    public static void main(String[] args) {
        String name = "Dilip Kumar K"; // this create the string in String Constant Pool
        String name_caps = name.toUpperCase();
        String name_small = name.toLowerCase();
        System.out.println(name_caps); //DILIP KUMAR K
        System.out.println(name_small); // dilip kumar k
        System.out.println(name); // Dilip KUmar K
        //even we have applied the methods on string, its respective output gets changed, but value of name remains unchanged. hence string is mutable
    }
}
