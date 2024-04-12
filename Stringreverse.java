// Link : https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
import java.util.*;
public class Stringreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputan = sc.nextLine();

        boolean palindrom = true;
        for(int i = 0; i < inputan.length()/2 ;i++){
            int j = inputan.length() - 1 - i;
            if(inputan.charAt(i) != inputan.charAt(j)){
                palindrom = false;
                break;
            }
        }

        if(palindrom){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }   
}

