package ex_17_Java_Code_Exam;
import java.util.Scanner;
public class Lab107_codeExam6 {
    public static void main(String[] args) {
        int day = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from 1-7: ");
        if(sc.hasNextInt()){
            day = sc.nextInt();
        }
        else {
            System.out.println("Enter integers only");
            System.exit(0);
        }
        switch(day){
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("We have only 7 days in a week, please enter number from 1-7");
        }
    }
}
