package ex_18_Java_String;

public class Lab121_StringProgram7 {
    public static void main(String[] args) {
        String s1 = "Java";
        System.out.println(s1.indexOf("a"));
        System.out.println(("".isEmpty()));
        System.out.println((s1.isEmpty()));
        System.out.println(String.join(" ", "Java", "Mava"));
        System.out.println(s1.replace("Java", "Mava"));
        System.out.println((s1.replace("a", "o")));
        System.out.println(s1.repeat((5)));
        System.out.println((s1.concat("Mava")));
        System.out.println(s1.subSequence(1,3));
        System.out.println((s1.substring(2,4)));
        System.out.println(s1.substring(0));
        System.out.println(s1.substring(1));
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(4));
        System.out.println(s1.equalsIgnoreCase(s1));
        String line = "a\nb\nc";
        System.out.println(line.lines().count());
        System.out.println("         Welcome        ".trim());

    }
}
