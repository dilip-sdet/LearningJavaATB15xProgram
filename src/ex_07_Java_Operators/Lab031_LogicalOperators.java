package ex_07_Java_Operators;

public class Lab031_LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = !a;
        System.out.println(b);
        System.out.println(!b);
        System.out.println(!!b);

        boolean c = true || false;
        System.out.println(c);

        boolean e = false || false;
        System.out.println(e);

        boolean d = true && true;
        System.out.println(d);

        boolean f = true && false;
        System.out.println(f);
    }
}
