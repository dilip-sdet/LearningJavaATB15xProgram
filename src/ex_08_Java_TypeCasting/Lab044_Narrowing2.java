package ex_08_Java_TypeCasting;

public class Lab044_Narrowing2 {
    public static void main(String[] args) {
        float f = 123.67F;
        byte b = (byte)f;
        short s = (short)f;
        int i = (int)f;
        long l = (long)f;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
    }
}
