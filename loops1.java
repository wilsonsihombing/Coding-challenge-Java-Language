// Link : https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
import java.util.Scanner;

public class loops1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(x + " x " + i + " = " + (x*i));
        }
    }

}
