package IntroTopics;
import java.util.Scanner;


public class Temp {

    // readibility,  reusability of same code
    public static void printEvenOrOdd(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is an even number");
        } else {
            System.out.println(n + " is an odd number");
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any integer:");
        int n = Integer.parseInt(scn.nextLine());
        printEvenOrOdd(n);
        printEvenOrOdd(12);
        printEvenOrOdd(34);
        printEvenOrOdd(21);

        // 50 lines of code --> divide it into small small functions
        
    }
}
