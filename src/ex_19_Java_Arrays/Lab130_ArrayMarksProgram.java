package ex_19_Java_Arrays;

public class Lab130_ArrayMarksProgram {
    public static void main(String[] args) {
        int mymarks[] = {40,39,45,48,43,38};
        for(int marks:mymarks){
            System.out.println(marks);
        }
        System.out.println("__________________________________");

        for(int i = 0; i<mymarks.length; i++){
            System.out.println(mymarks[i]);
        }
    }
}
