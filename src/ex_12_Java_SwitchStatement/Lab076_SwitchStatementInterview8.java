package ex_12_Java_SwitchStatement;

public class Lab076_SwitchStatementInterview8 {
    public static void main(String[] args) {
        char ch = 'C';
        switch(ch){
            default:
                System.out.println("Hello");
                //Since here break is not there, it will print case 65 as well
            case 65:
                System.out.println("ASCHI value is matched with A");
                break;
            case 66:
                System.out.println("ASCHI value is matched with B");
                break;
        }
    }
}
