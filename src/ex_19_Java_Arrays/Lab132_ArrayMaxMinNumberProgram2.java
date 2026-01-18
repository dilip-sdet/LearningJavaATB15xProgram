package ex_19_Java_Arrays;

public class Lab132_ArrayMaxMinNumberProgram2 {
    public static void main(String[] args) {
        int num[] = {20,34,67,23,76,43,56};
        int max_num = num[0];
        int min_num = num[0];
        for(int i=0; i<num.length; i++){
            if (num[i] > max_num){
                max_num = num[i];
            }
        }
        System.out.println(max_num);
        for(int i=0; i<num.length; i++){
            if(num[i] < min_num){
                min_num=num[i];
            }
        }
        System.out.println(min_num);
    }
}
