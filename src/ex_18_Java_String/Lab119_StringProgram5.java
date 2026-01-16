package ex_18_Java_String;

public class Lab119_StringProgram5 {
    public static void main(String[] args) {
        String name1 = "Dilip Kumar K";
        String name2 = "Dilip Kumar K";

        String name3 = new String("Dilip Kumar K");
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name1.equals(name3));
        System.out.println(name1.equals(name2));
    }
}
