package ex_09_Java_TernaryOperator;

public class Lab048_NestedTernary {
    public static void main(String[] args) {
        int age = 12;
        String ageOfWorking = age>18? age>22? "You can have voting power. Also you can work" : "You can have only voting power" : "You should continue the education with Voting power";
        System.out.println(ageOfWorking);
    }
}
