import java.util.Scanner;

public class Calculator {
    public static void main(String[] argc) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        double x;
        double y;
        byte selector;
        while (quit != true) {
            System.out.println("Hello there! It's a calculator.");
            System.out.print("Enter x: ");
            x = sc.nextDouble();
            System.out.print("Enter y: ");
            y = sc.nextDouble();
            System.out.println("What you want?");
            System.out.println("1. summation\n" +
                    "2. subtraction\n" +
                    "3. multiplication\n" +
                    "4. division\n" +
                    "5. exponentiation\n" +
                    "6. mod\n" +
                    "0. Quit");
            selector = sc.nextByte();
            switch (selector) {
                case 1: {
                    System.out.println("x + y = " + (x + y));
                    break;
                }
                case 2: {
                    System.out.println("x - y = " + (x - y));
                    break;
                }
                case 3: {
                    System.out.println("x * y = " + (x * y));
                    break;
                }
                case 4: {
                    System.out.println("x / y = " + (x / y));
                    break;
                }
                case 5: {
                    System.out.println("x^y = " + Math.pow(x, y));
                    break;
                }
                case 6: {
                    System.out.println("x mod y = " + x % y);
                    break;
                }
                case 0: {
                    quit = true;
                    break;
                }
                default: {
                    System.out.println("Error number.");
                }
            }
        }
    }
}
