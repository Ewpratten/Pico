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
        this.player = new Player(gc.getGrid().getX(10), gc.getGrid().getX(10), 50);
    }

    public void feed(Window gc) {
        // Set player movement un-conditionally
        if (gc.getKeyChar() == 'd')
            player.setX(player.getX() + 1);
        if (gc.getKeyChar() == 'a')
            player.setX(player.getX() - 1);
        if (gc.getKeyCode() == 20 && player.vy == 0)
            player.vy = -2.5;

        player.vy += 0.2;
        if (player.vy < 0) {
            
        }
        player.setY((int) (player.getY() + player.vy));
        
        player.set(checkWalls(gc, player.getX(), player.getY()));
    
    }
    
    public void draw(Window gc) {
        synchronized (gc) {
            gc.clear();
            gc.setColor(Color.black);

            // Test sprite
            gc.fillRect(player.getX(), player.getY(), player.width, player.width);

        }
    }
    
    private Point checkWalls(Window gc, int x, int y) {
        // Check basic collision with walls
        x = (x <= 0) ? 0 : x;
        x = (x + player.width >= gc.getWidth()) ? gc.getWidth() - player.width : x;

        y = (y <= 0) ? 0 : y;
        y = (y + player.width >= gc.getHeight()) ? gc.getHeight() - player.width : y;

        return new Point(x, y);
    }
}