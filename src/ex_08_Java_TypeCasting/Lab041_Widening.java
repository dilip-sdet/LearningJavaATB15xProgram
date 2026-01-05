package ex_08_Java_TypeCasting;

public class Lab041_Widening {
    public static void main(String[] args) {
        byte a = 12;
        int b = a; //Implicit Widening
        int c = (int)a; //Explicit Widening: Its not of use, since there is no overflow of data
        System.out.println(b);
        System.out.println(c);
    }
}
