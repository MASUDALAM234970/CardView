package com.error41.cardview;

public class GameModel {

    private  String gameNAme;
    private int gameImage;

    public GameModel(String gameNAme, int gameImage) {
        this.gameNAme = gameNAme;
        this.gameImage = gameImage;
    }


    public String getGameNAme() {
        return gameNAme;
    }

    public void setGameNAme(String gameNAme) {
        this.gameNAme = gameNAme;
    }

    public int getGameImage() {
        return gameImage;
    }

    public void setGameImage(int gameImage) {
        this.gameImage = gameImage;
    }
}
