package ex_19_Java_Arrays;

public class Lab127_ArrayProgram1 {
    public static void main(String[] args) {
        String myname[] = new String[4];
        myname[0] = "Dilip";
        myname[1] = "Kumar";
        myname[2] = "K";
        myname[3] = "callmeasDK";

        int[] myarray = {10,20,30,40,50,60};

        for(String name:myname){
            System.out.println(name);
        }

        for(int x:myarray){
            System.out.println(x);
        }

    }
}
