package PicoGame;

import PicoEngine.Entity;
import java.awt.Point;

public class Player extends Entity {
    public int width;
    
    public Player(int x, int y, int w) {
        this.x = x;
        this.y = y;
        this.name = "Player";
        this.width = w;
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

    public void set(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
}