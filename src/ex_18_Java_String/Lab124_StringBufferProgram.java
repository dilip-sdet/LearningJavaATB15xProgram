package ex_18_Java_String;

public class Lab124_StringBufferProgram {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        StringBuffer sb2 = new StringBuffer("Mava");
        sb.append(" Welcome");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb2.replace(0,4, "Java");
        System.out.println(sb2);
        sb2.insert(0,"Mava");
        System.out.println(sb2);
        sb2.delete(0,2);
        System.out.println(sb2);
    }
}
