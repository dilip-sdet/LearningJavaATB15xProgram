package ex_06_Java_Literals;

public class Lab023_ConstantReinitialization {
    public static void main(String[] args) {
        final float pi = 3.14f;
        //pi = 3.14f;
        //even if I reassign the same to value to final variable, we will face a error
        System.out.println(pi);
    }
}
