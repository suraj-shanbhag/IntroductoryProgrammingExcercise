/**
 * Created by Suraj on 02-09-2016.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        drawFizzBuzz();
    }

    private static void drawFizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 ==0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
