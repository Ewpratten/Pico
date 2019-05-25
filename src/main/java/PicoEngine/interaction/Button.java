package PicoEngine.interaction;

import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;

import PicoEngine.Window;

public class Button extends Rectangle {
    static final long serialVersionUID = 0;

    public Button(int x, int y, int w, int h) {
        super(x, y, w, h);
    }

    public boolean wasPressed(Point loc) {
        return this.contains(loc);
    }

    public boolean wasPressed(Point loc, int mouseInput) {
        if (mouseInput >= 1) {
            return this.contains(loc);
        } else {
            return false;
        }
    }

    /**
     * Draw buton for debug
     */
    public void debug(Window gc) {
        gc.setColor(Color.pink);
        gc.fillRect(x, y, width, height);
    }

}