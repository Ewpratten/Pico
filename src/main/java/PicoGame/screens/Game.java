package PicoGame.screens;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Point;
import java.awt.Color;

import PicoEngine.Screen;
import PicoEngine.Window;
import PicoEngine.interaction.Button;
import PicoGame.Player;
import PicoEngine.ScreenManager;

public class Game implements Screen {
    private ScreenManager sm = ScreenManager.getInstance();
    private Player player;

    public Game(Window gc) {
        this.player = new Player(gc.getGrid().getX(10), gc.getGrid().getX(10));
    }


    public void feed(Window gc) {
    
    }
    
    public void draw(Window gc) {
        synchronized (gc) {
            gc.clear();
            gc.setColor(Color.black);

            // Test sprite
            gc.fillRect(player.getX(), player.getY(), 100, 100);
            
        }
    }
}