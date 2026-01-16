package ex_18_Java_String;

public class Lab117_StringProgram3 {
    public static void main(String[] args) {
        String name = new String("Dilip Kumar K");
        System.out.println("Length of name is " + name.length());
        System.out.println(name.toString()); // For a every String variable, toString() method call comes to picture, even if user don't call. So instead of string location, we use get a valid output
    }
}
