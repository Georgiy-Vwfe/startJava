package com.Lession3.Calculator;
import java.util.Scanner;

public class Calculator {

    private Scanner scanner = new Scanner(System.in);
    private String wantContinue = "yes";
    private double x;
    private double y;
    private byte selector;

    void continueCalc() {
        System.out.print("Do you want Continue?\nEnter yes or no: ");
        scanner.nextLine();
        wantContinue = scanner.nextLine();
    }

    void run() {
        System.out.println("Hello there! It's calculator.");
        while (wantContinue.equals("yes")) {
            System.out.print("Enter x: ");
            x = scanner.nextDouble();
            System.out.println("Enter y: ");
            y = scanner.nextDouble();
            System.out.println("What you want?");
            System.out.println("1. summation\n" +
                    "2. subtraction\n" +
                    "3. multiplication\n" +
                    "4. division\n" +
                    "5. exponentiation\n" +
                    "6. mod\n" +
                    "0. Quit");
            selector = scanner.nextByte();
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
                    wantContinue = "no";
                    break;
                }
                default: {
                    System.out.println("Error number.");
                }
            }
            continueCalc();
        }
    }
}
