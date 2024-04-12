// Link : https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        
        if (x % 2 == 1) {
            System.out.println("Weird");
        } else {
            if (x >= 2 && x <= 5) {
                System.out.println("Not Weird");
            } else if (x >= 6 && x <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
    }
}
