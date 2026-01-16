package ex_18_Java_String;

public class Lab118_StringProgram4 {
    public static void main(String[] args) {
        String name1 = "Dilip Kumar K";
        String name2 = "Dilip Kumar K";

        String name3 = new String("Dilip Kumar K");
        String name4 = new String("Dilip Kumar K");
        String name5 = new String("Dilip Kumar K");
        String name6 = new String("Dilip Kumar K");

        System.out.println(name1==name3); // check the String Area
        System.out.println(name1==name4); // check the String Area
        System.out.println(name1==name5); // check the String Area
        System.out.println(name1==name6); // check the String Area
        System.out.println(name1==name2); // check the String Area
        System.out.println(name1.equals(name5));
        System.out.println(name1.equals(name2)); //checks the values
        System.out.println(name3.equals(name5)); //checks the values
    }
}
