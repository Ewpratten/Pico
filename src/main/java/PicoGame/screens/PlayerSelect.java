package PicoGame.screens;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Point;
import java.awt.Color;

import PicoEngine.Screen;
import PicoEngine.Window;
import PicoEngine.interaction.Button;
import PicoEngine.ScreenManager;

public class PlayerSelect implements Screen {
    private ScreenManager sm = ScreenManager.getInstance();


    public void feed(Window gc) {
    
    }
    
    public void draw(Window gc) {
        synchronized (gc) {
            gc.clear();
            gc.setColor(Color.black);
            gc.fillRect(0, 0, 100, 100);
            
        }
    }
}