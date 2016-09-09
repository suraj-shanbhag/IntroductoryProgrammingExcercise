import java.util.Scanner;

/**
 * Created by Suraj on 02-09-2016.
 */
public class IsoscelesTriange {
    public static void main(String [] args){
        int n;
        System.out.println("Enter the value of n");
        Scanner ret_scan=new Scanner(System.in);
        while (!ret_scan.hasNextInt()) ret_scan.next();
        n = ret_scan.nextInt();
        drawCenteredTriangle(n);
    }


    public static void drawCenteredTriangle(int n){
        for(int i = 0; i < n; i++) {
            drawCenteredLine(i, n);
        }
    }

    public static void drawCenteredLine(int i, int n){
        int numberOfSpaces = numberOfSpaces(i, n);
        int numAsterisk = findNumAsterisk(i);
        printSpaces(numberOfSpaces);
        printAsterisks(numAsterisk);
        System.out.println();
    }
    
    public static int findNumAsterisk(int i){
        return 2 * i + 1;
    }

    public static int numberOfSpaces(int i, int n){
        return n - i - 1;
    }

    public static void printSpaces(int numSpaces){
        for(int i=1; i <= numSpaces; i++){
            System.out.print(" ");
        }
    }

    public static void printAsterisks(int numAsterisk){
        for(int i=1; i <= numAsterisk; i++){
            System.out.print("*");
        }

    }
}
