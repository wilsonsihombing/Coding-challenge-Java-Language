// Link : https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true
import java.util.Scanner;

public class substring_comparison{

    static String getSmallestAndLargest(String s, int k){
        String inputan = s;
        String[] data = new String[inputan.length() - k + 1]; 
        int j= k;
        for(int i = 0; i <= inputan.length() - k;i++ ){
            data[i] =  inputan.substring(i, j);
            j++;
        }

        bubblesort(data);
        return data[0]+ "\n" + data[data.length - 1];
    }


static void bubblesort(String[] arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j < n-i-1 ;j++){
                if(arr[j].compareTo(arr[j+1]) > 0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]  = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
