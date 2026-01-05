package ex_09_Java_TernaryOperator;

public class Lab054_Cli_Command_Maxof3 {
    public static void main(String[] args) {
        String n1 = args[0];
        String n2 = args[1];
        String n3 = args[2];
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        int num3 = Integer.parseInt(n3);

        int maxOf3 = num1>num2?num1:(num2>num3)?num2:num3;
        System.out.println(maxOf3);
    }
}
