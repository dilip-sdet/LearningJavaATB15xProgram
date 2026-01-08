package ex_08_Java_TypeCasting;

public class Lab045_AdditionOfDiffDatatype {
    public static void main(String[] args) {
        int a = 124;
        float b = 200.89F;
        //int c = a + b; error - incompatible types: possible lossy conversion from float to int

        int d = a + (int)b;
        System.out.println(d); // .89 is lost

        float c = a + b;
        System.out.println(c); //Always use bigger basket, when we adding smaller and bigger basket

        int ch = 500;
        char cha = (char) ch;
        System.out.println(cha);

    }
}
