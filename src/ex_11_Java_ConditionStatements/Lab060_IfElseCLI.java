package ex_11_Java_ConditionStatements;

public class Lab060_IfElseCLI {
    public static void main(String[] args) {
        String age = args[0];
        System.out.println(age);
        int myAge = Integer.parseInt(age);
        if (myAge >= 18) {
            System.out.println("Person has a right to vote");
            }
        else {
            System.out.println("Person has not a right to vote");

        }
    }
}
