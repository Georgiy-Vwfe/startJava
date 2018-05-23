package com.Lession3.GuessNumber;
import java.util.Scanner;

public class Player {
    private String player;


    public void name() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print your name, Player: ");
        player = scanner.nextLine();
    }

    public String getPlayer() {
        return player;
    }
}
