package ex_06_Java_Literals;

public class Lab026_EscapeSequence {
    public static void main(String[] args) {
        /*
        \n - next line
        \t - tab space
        \b - backspace
        \r - carriage return
         */
        System.out.println(("Dilip"+'\n'+"Kumar"));
        System.out.println(("Dilip"+'\t'+"Kumar"));
        System.out.println(("Dilip "+'\b'+"Kumar"));
        System.out.println(("Dilip"+'\r'+"Kumar"));
    }
}
