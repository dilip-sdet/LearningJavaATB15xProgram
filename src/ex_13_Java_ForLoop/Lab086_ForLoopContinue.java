package ex_13_Java_ForLoop;

public class Lab086_ForLoopContinue {
    public static void main(String[] args) {
        for(int i=0; i<20; i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
