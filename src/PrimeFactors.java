import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Suraj on 02-09-2016.
 */
public class PrimeFactors {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n");
        Scanner ret_scan=new Scanner(System.in);
        while (!ret_scan.hasNextInt()) ret_scan.next();
        n = ret_scan.nextInt();
        drawPrimeFactors(n);

        for (Integer integer : drawPrimeFactors(n)) {
            System.out.println(integer);
        }
    }

    public static ArrayList<Integer> drawPrimeFactors(int numbers) {
        int n = numbers;
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }
}
