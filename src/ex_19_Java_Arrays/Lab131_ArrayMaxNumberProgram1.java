package ex_19_Java_Arrays;

import java.util.Arrays;

public class Lab131_ArrayMaxNumberProgram1 {
    public static void main(String[] args) {
        int num[] = {20,34,67,23,76,43,56};
        Arrays.sort(num);
        System.out.println(num[num.length - 1]);
    }
}
