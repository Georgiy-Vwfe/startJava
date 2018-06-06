package com.lession3.guessNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Scanner scanner = new Scanner(System.in);
    private int findNumber;
    private int enteredNumber;
    private int countAnswer = 0;
    private int[] Answers = new int[100];
    private int numberOfPlayers;
    private int[] numberOfMoves;
    private String quit = "";
    private Player player0 = new Player();
    private Player player1 = new Player();
    private Player player2 = new Player();

    private void initPlayers() {
        do {
            System.out.println("How many players will play?");
            System.out.println("Attention! The number of players can't be more than 2");
            numberOfPlayers = scanner.nextInt();
        } while (numberOfPlayers < 1 || numberOfPlayers > 2);
        numberOfMoves = new int[numberOfPlayers];
        switch (numberOfPlayers) {
            case 1:
                System.out.print("Print your name, Player №1: ");
                scanner.nextLine();
                player0.setPlayerName(scanner.nextLine());
                break;
            case 2:
                System.out.print("Print your name, Player №1: ");
                scanner.nextLine();
                player1.setPlayerName(scanner.nextLine());
                System.out.print("Print your name, Player №2: ");
                player2.setPlayerName(scanner.nextLine());
                break;
        }
    }

    public void playGame() {
        int parity = 0;
        Random random = new Random();
        initPlayers();
        findNumber = random.nextInt(1);
        switch (numberOfPlayers) {
            case 1:
                while (!quit.equals("yes")) {
                    System.out.println("Your turn, " + player0.getPlayerName());
                    System.out.print("Enter num: ");
                    enteredNumber = scanner.nextInt();
                    fillAnswers();
                    numberOfMovesCounter(parity);
                    endGame(parity);
                }
                break;
            case 2:
                while (!quit.equals("yes")) {
                    System.out.println("Your turn, " + playerList(parity));
                    parity++;
                    System.out.print("Enter num: ");
                    enteredNumber = scanner.nextInt();
                    fillAnswers();
                    numberOfMovesCounter(parity);
                    endGame(parity);
                }
                break;
        }

    }


    private void fillAnswers() {
        Answers[countAnswer] = enteredNumber;
        countAnswer++;
    }

    private void returnAnswers(int parity) {
        System.out.print("Answers of player " + playerList(parity) + ":");
        if (parity % 2 == 0) {
            for (int j = 0; j < 100; j += 2) {
                if (Answers[j] == 0) {
                    return;
                }
                System.out.print(" " + Answers[j]);
            }
        } else if (parity % 2 == 1) {
            for (int j = 1; j < 100; j += 2) {
                if (Answers[j] == 0) {
                    return;
                }
                System.out.print(" " + Answers[j]);
            }
        }
    }


    private String playerList(int parity) {
        if (parity % 2 == 0) {
            return player1.getPlayerName();
        } else if (parity % 2 == 1) {
            return player2.getPlayerName();
        }
        return "Error";
    }

    private void numberOfMovesCounter(int parity) {
        if (parity % 2 == 0) {
            numberOfMoves[0]++;
        } else if (parity % 2 == 1) {
            numberOfMoves[1]++;
        }

    }

    private void endGame(int parity) {
        if (enteredNumber == findNumber) {
            System.out.println("Entered num = hidden num");
            returnAnswers(parity);
            System.out.println("\nPlayer " + player0.getPlayerName() + " find number " + findNumber + " in " + numberOfMoves[parity % 2] + " moves\n");
            System.out.print("Do you want quit?\n" + "Type yes or no: ");
            scanner.nextLine();
            wantExit();
        } else if (enteredNumber > findNumber) {
            System.out.println("Entered num > hidden num");
        } else if (enteredNumber < findNumber) {
            System.out.println("Entered num < hidden num");
        }
    }

    private void wantExit() {
        quit = scanner.nextLine();
        if (!quit.equals("yes")) {
            numberOfMoves[0] = 0;
        }
    }
}
