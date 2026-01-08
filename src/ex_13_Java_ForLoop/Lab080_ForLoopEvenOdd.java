package ex_13_Java_ForLoop;

public class Lab080_ForLoopEvenOdd {
    public static void main(String[] args) {
        for(int i=0;i<=10;++i){
            if(i%2==0) {
                System.out.println(i + " is a even number");
            }
            else{
                System.out.println(i + " is a odd number");
            }
        }
    }
}
