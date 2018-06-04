package com.lession3.calculator;

import java.util.Scanner;

public class Calculator {

    private Scanner scanner = new Scanner(System.in);
    private String wantContinue = "yes";
    private String[] history = new String[100];
    private String result;
    private int i = 0;

    void continueCalc() {
        do {
            System.out.print("\nDo you want Continue?\nEnter yes or no: ");
            scanner.nextLine();
            wantContinue = scanner.nextLine();
            if (wantContinue.equals("yes") || wantContinue.equals("no")){
                break;
            }
        }while (true);
    }

    void run() {
        byte selector;
        double x;
        double y;
        System.out.println("Hello there! It's calculator.");
        while (wantContinue.equals("yes")) {
            System.out.println("What you want?");
            System.out.println("1. summation\n" +
                    "2. subtraction\n" +
                    "3. multiplication\n" +
                    "4. division\n" +
                    "5. exponentiation\n" +
                    "6. mod\n" +
                    "7. History\n" +
                    "0. Quit");
            selector = scanner.nextByte();
            switch (selector) {
                case 1:
                    System.out.print("Enter x: ");
                    x = scanner.nextDouble();
                    System.out.print("Enter y: ");
                    y = scanner.nextDouble();
                    result = x + " + " + y + " = " + (x + y);
                    System.out.print(result);
                    fillHistory();
                    break;
                case 2:
                    System.out.print("Enter x: ");
                    x = scanner.nextDouble();
                    System.out.print("Enter y: ");
                    y = scanner.nextDouble();
                    result = x + " - " + y + " = " + (x - y);
                    System.out.print(result);
                    fillHistory();
                    break;
                case 3:
                    System.out.print("Enter x: ");
                    x = scanner.nextDouble();
                    System.out.print("Enter y: ");
                    y = scanner.nextDouble();
                    result = x + " * " + y + " = " + (x * y);
                    System.out.print(result);
                    fillHistory();
                    break;
                case 4:
                    System.out.print("Enter x: ");
                    x = scanner.nextDouble();
                    System.out.print("Enter y: ");
                    y = scanner.nextDouble();
                    result = x + " / " + y + " = " + (x / y);
                    System.out.print(result);
                    fillHistory();
                    break;
                case 5:
                    System.out.print("Enter x: ");
                    x = scanner.nextDouble();
                    System.out.print("Enter y: ");
                    y = scanner.nextDouble();
                    result = x + "^" + y + " = " + Math.pow(x, y);
                    System.out.print(result);
                    fillHistory();
                    break;
                case 6:
                    System.out.print("Enter x: ");
                    x = scanner.nextDouble();
                    System.out.print("Enter y: ");
                    y = scanner.nextDouble();
                    result = x + " mod " + y + " = " + (x % y);
                    System.out.print(result);
                    fillHistory();
                    break;
                case 7:
                    System.out.println("History:");
                    System.out.println("---------------------------------");
                    for (i = 0; i < 100; i++) {
                        if (history[i] != null) {
                            System.out.println(history[i]);
                        }
                    }
                    break;
                case 0:
                    wantContinue = "no";
                    break;
                default:
                    System.out.println("Error number.");
            }
            continueCalc();
        }
    }

    private void fillHistory() {
        history[i] = result;
        i++;
    }
}
