package com.Lession3.GuessNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Scanner scanner = new Scanner(System.in);
    private Player player = new Player();
    private int findNumber;
    private int enteredNumber;
    private int fillAnswersI = 0;
    private int fillAnswersJ = 0;


    public void playGame() {
        Random random = new Random();
        String quit = "no";
        player.newName();
        String player1 = player.initPlayer();
        String player2 = player.initPlayer();
        findNumber = random.nextInt(1);
        while (quit.equals("no")) {
            System.out.println("Your turn, " + player.getPlayer());
            System.out.print("Enter num: ");
            enteredNumber = scanner.nextInt();
            player.fillAnswer();
            if (enteredNumber == findNumber) {
                System.out.println("Entered num = hidden num");
                if (player.getParity() % 2 == 0) {
                    System.out.println("\nPlayer " + player1 + " find number " + findNumber + " in " + player.getNumberOfMoves() + " moves\n");
                } else if (player.getParity() % 2 == 1) {
                    System.out.println("\nPlayer " + player2 + " find number " + findNumber + " in " + player.getNumberOfMoves() + " moves\n");
                } else {
                    System.out.println("\nError\n");
                }
                System.out.print("Do you want quit?\n" + "Type yes or no: ");
                scanner.nextLine();
                quit = scanner.nextLine();
                if (quit.equals("no")) {
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

}
