// link : https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
import java.text.DecimalFormat;

public class CurrencyFormatter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bilangan = sc.nextDouble();

        //konversi to us
        NumberFormat usdFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String forammatedUS = usdFormat.format(bilangan);

        System.out.println("US: " + forammatedUS);

        //konversi to india
        DecimalFormat decimalformat = new DecimalFormat("#,##0.00");

        decimalformat.setGroupingUsed(true);
        decimalformat.setGroupingSize(3);

        String formattedindia = decimalformat.format(bilangan);

        System.out.println("India: " + "Rs." + formattedindia );

        //konversi to China
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String formattedChina = chinaFormat.format(bilangan);

        System.out.println("China: " + formattedChina);

        //konversi to France
        NumberFormat franceformat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String formattedfrance = franceformat.format(bilangan);

        System.out.println("France: " + formattedfrance);

        

        sc.close();
    }
}

