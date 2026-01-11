package ex_16_Java_Function;

public class Lab100_functionexample {

    static int cal_add(int a,int b){
        int c=a+b;
        return c;
    }

    static int cal_sub(int a,int b){
        int c=a-b;
        return c;
    }

    static int cal_mul(int a,int b){
        int c=a*b;
        return c;
    }

    static float cal_div(int a,int b){
        float c=a/b;
        return c;
    }

    static int cal_mod(int a,int b){
        int c=a%b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(cal_add(40,20));
        System.out.println(cal_sub(40,20));
        System.out.println(cal_mul(40,20));
        System.out.println(cal_div(40,20));
        System.out.println(cal_mod(40,20));
    }
}
