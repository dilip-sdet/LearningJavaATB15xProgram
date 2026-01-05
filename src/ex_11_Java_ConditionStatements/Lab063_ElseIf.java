package ex_11_Java_ConditionStatements;

public class Lab063_ElseIf {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;
        if(n1>n2 && n1>n3){
            System.out.println(n1 + " is greater");
        } else if (n2>n3 && n2>n1) {
            System.out.println(n2 +" is greater");
        }else {
            System.out.println(n3 +" is greater");
        }
    }
}
