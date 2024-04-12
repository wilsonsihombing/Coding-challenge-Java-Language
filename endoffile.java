// Link:https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true

import java.util.Scanner;
public class endoffile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linenumber = 0;

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            linenumber++;

            System.out.println(linenumber + " " + line);
        }
        sc.close();        
    }
}

