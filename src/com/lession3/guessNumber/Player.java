package com.lession3.guessNumber;


public class Player {

    private String playerName = null;
    private String[] playerAnswers = new String[100];

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }
}
