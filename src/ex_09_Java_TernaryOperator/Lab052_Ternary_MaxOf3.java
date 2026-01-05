package ex_09_Java_TernaryOperator;

public class Lab052_Ternary_MaxOf3 {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;
        int maxOf3 = (n1>n2)?(n1>n3)?n1:n3:n2;
        System.out.println(maxOf3);
    }
}
