package ex_08_Java_TypeCasting;

public class Lab043_Narrowing1 {
    public static void main(String[] args) {
        long value = 123456789L;
        byte a = (byte)value;
        short b = (short)value;
        int c = (int)value;
        float d = (float)value;
        double f = (double)value;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);

    }
}
