package ex_12_Java_SwitchStatement;
import java.util.Scanner;
public class Lab077_RealAutomationScenario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name: ");
        String browser = sc.next();
        switch (browser.toLowerCase()) {
            case "chrome":
                System.out.println("Start Chrome Execution");
                System.out.println("-------------");
                System.out.println("TC1_______");
                System.out.println("TC2_______");
                break;
            case "firefox":
                System.out.println("Start Firefox Execution");
                System.out.println("-------------");
                System.out.println("TC1_______");
                System.out.println("TC2_______");
                break;
            case "edge":
                System.out.println("Start Microsoft Edge Execution");
                System.out.println("-------------");
                System.out.println("TC1_______");
                System.out.println("TC2_______");
                break;
            default:
                System.out.println("Invalid Browser");
        }
    }
}

