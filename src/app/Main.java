package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("Enter scale start");
        int scaleStart = scanner.nextInt();

        System.out.println("Enter scale end");
        int scaleEnd = scanner.nextInt();

        int total = 0;
        int numeric = scaleEnd - scaleStart + 1;

        for (int i = 1; i <= numeric; i++, scaleStart++) {
            total = total + scaleStart;
            System.out.println(i + ") Num is " + scaleStart + ", sum is " + total);
        }
        System.out.println("-------------------------");
        System.out.println("Sum of numbers is " + total);
    }
}
