package ex_13_Java_ForLoop;

public class Lab085_ForLoopBreak {
    public static void main(String[] args) {
        for(int i = 0; i<20; i++){
            if(i==8){
                break;
            }
            System.out.println(i);
        }
    }
}
