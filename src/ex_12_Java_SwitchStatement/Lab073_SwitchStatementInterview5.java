package ex_12_Java_SwitchStatement;

public class Lab073_SwitchStatementInterview5 {
    public static void main(String[] args) {
        int itemcode = 5;
        switch (itemcode) {
//            case 1,3,5 -> System.out.println("Haha");
//            case 2,4,6 -> System.out.println("Hoho");
//            default -> System.out.println("Invalid itemcode");

            case 1, 4, 5:
                System.out.println("Haha");
                break;
            case 2, 3, 6:
                System.out.println("Hoho");
                break;
            default:
                System.out.println("Invalid itemcode");
        }
    }
}
