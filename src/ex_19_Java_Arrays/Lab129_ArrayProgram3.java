package ex_19_Java_Arrays;

public class Lab129_ArrayProgram3 {
    public static void main(String[] args) {
        String[] name = new String[3];
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println("_____________________________________________");
        name[0] = "Dilip";
        name[1] = "Kumar";
        name[2] = "K";
        for(String myname:name){
            System.out.println(myname);
        }
    }
}
