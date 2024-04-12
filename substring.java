//Link : https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true
import java.util.Scanner;
import java.util.*;

public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kata = sc.nextLine();
        String incount = sc.nextLine();
        String[] value  = incount.split(" ");
        int intervalbawah = Integer.parseInt(value[0]);
        int intervalatas = Integer.parseInt(value[1]);

        System.out.println(kata.substring(intervalbawah,intervalatas));
        

    }
}

