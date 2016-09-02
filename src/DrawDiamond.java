import java.util.Scanner;

/**
 * Created by Suraj on 02-09-2016.
 */
public class DrawDiamond {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n");
        Scanner ret_scan=new Scanner(System.in);
        while (!ret_scan.hasNextInt()) ret_scan.next();
        n = ret_scan.nextInt();
        drawDiamond(n);
    }

    public static void drawDiamond(int n){
        int numLines = findNumberOfLines(n);
        for (int i = 0;i < numLines; i++){
            drawALine(n,i);
        }
    }

    public static int findNumberOfLines(int n){
        return n + (n-1);
    }

    public static void drawALine(int n, int i){
        drawSpace(n,i);
        drawAsterisk(n,i);
        System.out.println();
    }

    public static void drawSpace(int n, int i){
        int numSpaces = Math.abs( n - i -1);
        for (int a = 0; a < numSpaces ; a++){
            System.out.print(" ");
        }
    }

    public static void drawAsterisk(int n, int i){
        int number = findNumberOfAsterisks(n, i);
        for (int a = 0; a < number ; a++){
            System.out.print("*");
        }
    }

    public static int findNumberOfAsterisks(int n, int i){
        int numAsterisk;

        if (n <= i) {
            numAsterisk = (-2 * i) + ((2 * findNumberOfLines(n)) - 1);
        } else {
            numAsterisk = (2 * i) + 1;
        }
        return numAsterisk;
    }
}
