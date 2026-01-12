package ex_17_Java_Code_Exam;

public class Lab114_codeExam13 {
    public static void main(String[] args) {
        int i = 1;
        while(i<=10){
            if(i==5){
                i++;
                continue;
            }
            else{
                System.out.println(i);
                i++;
            }
        }
    }
}

