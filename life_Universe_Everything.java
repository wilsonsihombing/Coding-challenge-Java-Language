//Link : https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/life-the-universe-and-everything/
import java.util.Scanner;

public class life_Universe_Everything {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan = sc.nextInt();
        while(bilangan != 42){
            System.out.println(bilangan);
            bilangan = sc.nextInt();
        }
        sc.close();
    }
}
