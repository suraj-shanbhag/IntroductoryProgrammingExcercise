import java.util.Scanner;

/**
 * Created by Suraj on 02-09-2016.
 */
public class DiamondWithName {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n");
        Scanner ret_scan=new Scanner(System.in);
        while (!ret_scan.hasNextInt()) ret_scan.next();
        n = ret_scan.nextInt();
        drawDiamond(n);
    }

    public static void drawDiamond(int n){
//        find number of lines
//        print them using *
//        print name in the middle of the diamond
        int numLines = findNumberLines(n);
        for (int i = 0; i < numLines; i++){
            drawAline(n,i);
        }
    }

    public static int findNumberLines(int n){
        return n + (n - 1);
    }

    private static void drawAline(int n, int i) {
//        I need:
//        How many asterisks
//        how many spaces
//        the name to print in the middle
        drawSpace(n,i);
        if (n == (i+1)){
//        drawName(n, i);
            drawName(n,i);
        } else {
//        drawAsterisk(n,i);
            drawAsterisk(n,i);
        }
        System.out.println();
    }

    private static void drawSpace(int n, int i) {
//        I need to know how many spaces
//        int abs(int i)
        int numSpaces = Math.abs( n - i -1);
        for (int a = 0; a < numSpaces ; a++){
            System.out.print(" ");
        }
    }

    private static void drawAsterisk(int n, int i){
        //        I need to know how many asterisks
        int number = findNumberOfAsterisks(n, i);
        for (int a = 0; a < number ; a++){
            System.out.print("*");
        }
    }

    private static void drawName(int n, int i){
//        based on n and i, draw name in the right place
//        when n is ... and i is ... print "Gaby"
        int middle_point = i + 1;
        if (n == middle_point){
            System.out.print("Suraj");
        }
    }

    private static int findNumberOfAsterisks(int n, int i){
        int numAsterisk;

        if (n <= i) {
            numAsterisk = (-2 * i) + ((2 * findNumberLines(n)) - 1);
        } else {
            numAsterisk = (2 * i) + 1;
        }
        return numAsterisk;
    }
}
