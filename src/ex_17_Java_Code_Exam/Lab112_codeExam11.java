package ex_17_Java_Code_Exam;

public class Lab112_codeExam11 {
    public static void main(String[] args) {
        int i = 1;
        int num = 6321;
        int reverse = 0;
        int digit = 0;
        do{
            digit = num % 10;
            reverse = reverse*10 + digit;
            num = num/10;
        }while(num!=0);
        System.out.println("The Reveresed number is " + reverse);
    }
}
