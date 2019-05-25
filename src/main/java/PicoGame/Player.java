package PicoGame;

import PicoEngine.Entity;

public class Player extends Entity {
    
    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        this.name = "Player";
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}