package ex_11_Java_ConditionStatements;

public class Lab064_ElseIf1 {
    public static void main(String[] args) {
        int age = 32;
        if(age < 18){
            System.out.println(("You are Teenager"));
        } else if (age > 60) {
            System.out.println("You are senior citizen");
        }else{
            System.out.println("You are Adult");
        }
    }
}
