package ex_12_Java_SwitchStatement;

public class Lab071_SwitchStatementInterview3 {
    public static void main(String[] args) {
        long a = 45L;
        switch ((int)a){
            case 45:
                System.out.println("Narrow Casting");
                break;
                case 12:
                    System.out.println("Not Narrow Casting");
        }
    }
}
