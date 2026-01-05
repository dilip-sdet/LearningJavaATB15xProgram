package ex_08_Java_TypeCasting;

public class Lab042_Narrowing {
    public static void main(String[] args) {
        int a = 300;
        //byte b = a; In Narrowing Typecasting, Implicit conversion is not possible
        byte c = (byte)a;
        //System.out.println(b);
        System.out.println(c);
    }
}
