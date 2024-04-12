//Link: https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
import java.util.*;

public class String_Introduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int lstr1 = str1.length();
        int lstr2 = str2.length();
        int total =lstr1 + lstr2;
        System.out.println(total);

        int lex = str1.compareTo(str2);
        if(lex <= 0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }

        //ubah huruf pertama
        String modif1 = str1.substring(0, 1).toUpperCase() + str1.substring(1);
        String modif2 = str2.substring(0, 1).toUpperCase() + str2.substring(1);

        System.out.println(modif1 + " " + modif2);

    }
}

