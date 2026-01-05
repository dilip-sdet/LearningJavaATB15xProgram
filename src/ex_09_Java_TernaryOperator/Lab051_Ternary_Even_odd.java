package ex_09_Java_TernaryOperator;

public class Lab051_Ternary_Even_odd {
    public static void main(String[] args) {
        int num = 23;
        String result = num%2==0?"Even": "Odd";
        System.out.println(result);
    }
}
