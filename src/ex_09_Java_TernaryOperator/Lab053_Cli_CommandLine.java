package ex_09_Java_TernaryOperator;

public class Lab053_Cli_CommandLine {
    public static void main(String[] args) {
        String age = args[0];
        System.out.println(age);
        System.out.println(age instanceof String);
        int dilipAge = Integer.parseInt(age);
        System.out.println(dilipAge);
        String status = dilipAge>18? dilipAge>60? "Adult" : "Senior Citizen" : "Minor";
        System.out.println(status);
    }
}
