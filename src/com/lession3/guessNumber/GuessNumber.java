package com.lession3.guessNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Scanner scanner = new Scanner(System.in);
    private String[] players;
    private byte parity = 0;
    private int findNumber;
    private int enteredNumber;
    private int countAnswer = 0;
    private int[] Answers = new int[100];
    private int numberOfPlayers;
    private int[] numberOfMoves;

    private String[] newName() {
        do {
            System.out.println("How many players will play?");
            System.out.println("Attention! The number of players can't be more than 2");
            numberOfPlayers = scanner.nextInt();
        } while (numberOfPlayers <= 0 || numberOfPlayers > 2);
        numberOfMoves = new int[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.print("Print your name, Player №" + (i + 1) + ": ");
            players[i] = scanner.nextLine();
        }
        return players;
    }

    private void initPlayers() {
        switch (newName().length) {
            case 1:
                Player player1 = new Player();
                player1.setPlayerName(players[1]);
                break;
            case 2:
                Player player2 = new Player();
                Player player3 = new Player();
                player2.setPlayerName(players[1]);
                player3.setPlayerName(players[2]);
                break;
        }
    }

    public void playGame() {
        Random random = new Random();
        String quit = "";
        newName();
        initPlayers();
        findNumber = random.nextInt(1);
        while (!quit.equals("yes")) {
            System.out.println("Your turn, " + playerList());
            parity++;
            System.out.print("Enter num: ");
            enteredNumber = scanner.nextInt();
            fillAnswers();
            numberOfMovesCounter();
            if (enteredNumber == findNumber) {
                System.out.println("Entered num = hidden num");
                returnAnswers();
                System.out.println("\nPlayer " + playerList() + " find number " + findNumber + " in " + numberOfMoves[parity % 2] + " moves\n");
        System.out.print("Do you want quit?\n" + "Type yes or no: ");
        scanner.nextLine();
        quit = scanner.nextLine();
        if (!quit.equals("yes")) {
        parity = 0;
        numberOfMoves[0] = 0;
        numberOfMoves[1] = 0;
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
        System.out.print("Answers of player " + playerList() + ":");
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
        } else return;
        }


public String playerList() {
        return players[parity % 2];
        }

public void numberOfMovesCounter() {
        numberOfMoves[parity % 2]++;
        }
        }
