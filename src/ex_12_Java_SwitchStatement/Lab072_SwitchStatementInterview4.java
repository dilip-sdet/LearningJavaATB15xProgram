package ex_12_Java_SwitchStatement;

public class Lab072_SwitchStatementInterview4 {
    public static void main(String[] args) {
        int itemcode = 3;
        switch (itemcode) {
            case 1 -> System.out.println("Print itemcode 1");
            case 2 -> System.out.println("Print itemcode 2");
            case 3 -> System.out.println("Print itemcode 3");
            case 4 -> System.out.println("Print itemcode 4");
            default -> System.out.println("Invalid itemcode");
        }
    }
}
