//Link : https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
import java.util.*;


public class Static_Initializer {
    static Scanner sc = new Scanner(System.in);
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    static boolean flag = true;
    static{
        if(B <= 0 || H <= 0 ){
        flag = false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    }
    
    

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}

