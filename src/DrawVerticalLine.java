import java.util.Scanner;

/**
 * Created by Suraj on 02-09-2016.
 */
public class DrawVerticalLine {
    public static void main(String [] args){
        int n;
        System.out.println("Enter the value of n");
        Scanner ret_scan=new Scanner(System.in);
        while (!ret_scan.hasNextInt()) ret_scan.next();
        n = ret_scan.nextInt();
        draw(n);
    }

    public static void draw(int n){
        for(int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }
}
