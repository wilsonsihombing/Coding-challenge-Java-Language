// Link : https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
import java.util.Scanner;

public class stdin_sdtout2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.nextLine(); // this is to consume the \n left by nextDouble()  
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
