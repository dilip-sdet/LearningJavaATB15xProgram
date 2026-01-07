package ex_12_Java_SwitchStatement;

public class Lab074_SwitchStatementInterview6 {
    public static void main(String[] args) {
        int itemcode = 10;
        switch (-5){
            default ->  System.out.println("Invalid itemcode");
            case 10 -> System.out.println("item code is not matching");
            case -5 -> System.out.println("item code is matching");
        }
    }
}
