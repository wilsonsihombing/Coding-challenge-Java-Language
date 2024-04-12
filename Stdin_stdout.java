// Link : https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true
import java.util.Scanner;

public class Stdin_stdout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrayangka = new int[3];
        for (int i = 0; i < 3; i++) {
            arrayangka[i] = sc.nextInt();
        }

        sc.close();
        for (int i = 0; i < 3; i++) {
            System.out.println(arrayangka[i]);
        }

    }
}


