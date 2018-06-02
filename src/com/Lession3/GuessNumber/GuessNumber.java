package com.Lession3.GuessNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Scanner scanner = new Scanner(System.in);
    private Player player = new Player();
    private int findNumber;
    private int enteredNumber;
    private int countAnswer = 0;
    private int[] Answers = new int[100];
    private int parityCounter = 0;

    public void playGame() {
        Random random = new Random();
        String quit = "";
        player.newName();
        findNumber = random.nextInt(1);
        while (!quit.equals("yes")) {
            System.out.println("Your turn, " + player.playerList());
            player.setParity(parityCounter++);
            System.out.print("Enter num: ");
            enteredNumber = scanner.nextInt();
            fillAnswers();
            player.numberOfMovesCounter();
            if (enteredNumber == findNumber) {
                System.out.println("Entered num = hidden num");
                player.setParity(parityCounter++);
                returnAnswers();
                System.out.println("\nPlayer " + player.playerList() + " find number " + findNumber + " in " + player.getNumberOfMoves() + " moves\n");
                System.out.print("Do you want quit?\n" + "Type yes or no: ");
                scanner.nextLine();
                quit = scanner.nextLine();
                if (!quit.equals("yes")) {
                    player.setParity(0);
                    player.setNumberOfMovesI(0);
                    player.setNumberOfMovesJ(0);
                }
            } else if (enteredNumber > findNumber) {
                System.out.println("Entered num > hidden num");
            } else if (enteredNumber < findNumber) {
                System.out.println("Entered num < hidden num");
            }
        }
    }

    public void fillAnswers() {
        Answers[countAnswer] = enteredNumber;
        countAnswer++;
    }

    public void returnAnswers() {
        System.out.print("Answers of player " + player.playerList() + ":");
        if (player.getParity() % 2 == 0) {
            for (int j = 0; j < 100; j += 2) {
                if (Answers[j] == 0) {
                    return;
                }
                System.out.print(" " + Answers[j]);
            }
        } else if (player.getParity() % 2 == 1) {
            for (int j = 1; j < 100; j += 2) {
                if (Answers[j] == 0) {
                    return;
                }
                System.out.print(" " + Answers[j]);
            }
        } else return;
    }
}
