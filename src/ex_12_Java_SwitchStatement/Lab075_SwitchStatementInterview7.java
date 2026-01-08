package ex_12_Java_SwitchStatement;

public class Lab075_SwitchStatementInterview7 {
    public static void main(String[] args) {
        int c = 67;
        switch (c) {
            default: {
                System.out.println("Invalid ASSCI matching");
                break;
            }
            case 'A':
                System.out.println("Ascii is matching");
                break;
            case 'C':
                System.out.println("Aschii is matching");
                break;
        }
    }
}
