package ex_09_Java_TernaryOperator;

public class Lab050_Ternary_Max {
    public static void main(String[] args) {
        int x = 40;
        int y = 30;
        int max = (x>y)?x:y;
        int min = (x<y)?x:y;
        System.out.println(max);
        System.out.println(min);
    }
}
