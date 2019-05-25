package PicoEngine;

import hsa2.GraphicsConsole;
import java.awt.Color;

import PicoEngine.GridSystem;

public class Window extends GraphicsConsole {
    static final long serialVersionUID = 0;

    GridSystem gridsys;

    public Window(int width, int height, int gridW, int gridH, String name) {
        super(width, height, name);
        gridsys = new GridSystem(height, width, gridH, gridW);
    }

    public int getWidth() {
        return this.getDrawWidth();
    }

    public int getHeight() {
        return this.getDrawHeight();
    }

    public void centre() {
        this.setLocationRelativeTo(null);
    }

    public void autoConfig(Color bg) {
        this.setAntiAlias(true);
        this.enableMouse();
        centre();
        this.setBackgroundColor(bg);
        this.clear();
    }

    public GridSystem getGrid(){
        return gridsys;
    }
}
