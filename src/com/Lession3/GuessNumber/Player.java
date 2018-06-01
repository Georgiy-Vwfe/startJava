package com.Lession3.GuessNumber;

import java.util.Scanner;

public class Player {
    private String[] players = new String[2];
    private int parity = 0;
    private int numberOfMovesI = 0;
    private int numberOfMovesJ = 0;

    public void newName() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("Print your name, Player: ");
            players[i] = scanner.nextLine();
        }
    }

    public String initPlayer() {
        if (parity % 2 == 0) {
            return players[0];
        } else {
            return players[1];
        }
    }

    public String getPlayer() {
        if (parity % 2 == 0) {
            parity++;
            return players[0];
        } else if (parity % 2 == 1){
            parity++;
            return players[1];
        } else return null;
    }

    public void fillAnswer() {
        if (parity % 2 == 0) {
            numberOfMovesI++;
        } else if (parity % 2 == 1) {
            numberOfMovesJ++;
        } else return;
    }

    public int getNumberOfMoves(){
        if (parity % 2 == 0) {
            return numberOfMovesI;
        } else if (parity % 2 == 1) {
            return numberOfMovesJ;
        } else return 1;
    }

    public int getParity() {
        return parity;
    }

    public void setParity(int parity) {
        this.parity = parity;
    }

    public void setNumberOfMovesI(int numberOfMovesI) {
        this.numberOfMovesI = numberOfMovesI;
    }

    public void setNumberOfMovesJ(int numberOfMovesJ) {
        this.numberOfMovesJ = numberOfMovesJ;
    }
}
