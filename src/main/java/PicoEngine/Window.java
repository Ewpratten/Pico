package PicoEngine;

import hsa2.GraphicsConsole;
import java.awt.Color;

public class Window extends GraphicsConsole {
    static final long serialVersionUID = 0;

    public Window(int width, int height, String name) {
        super(width, height, name);
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
}
