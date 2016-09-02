import java.util.Scanner;

/**
 * Created by Suraj on 02-09-2016.
 */
public class DrawRightTriangle {
    public static void main (String [] args){
        int n;
        System.out.println("Enter the value of n");
        Scanner ret_scan=new Scanner(System.in);
        while (!ret_scan.hasNextInt()) ret_scan.next();
        n = ret_scan.nextInt();
        drawVertical(n);
    }

    //    Given a number n, print n lines, each with one asterisks
    public static void drawVertical(int n){
        for(int i = 0; i <n; i++){
            draw(i + 1);
            System.out.println("");
        }
    }

    //    given a number n, print n number of "*" in one line
    public static void draw(int n){
        for(int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
