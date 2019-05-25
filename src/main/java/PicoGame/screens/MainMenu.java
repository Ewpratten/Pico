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

public class MainMenu implements Screen {
    Button start;

    private BufferedImage bgImageFile;

    private ScreenManager sm = ScreenManager.getInstance();

    public MainMenu(Window gc) {

        // Create buttons
        this.start = new Button(gc.getGrid().getX(26), gc.getGrid().getY(26), gc.getGrid().getX(20), gc.getGrid().getY(5));

        // Load the bg image
        try {
            bgImageFile = ImageIO.read(new File(getClass().getClassLoader().getResource("assets/menu.png").getFile()));
        } catch (Exception e) {
            System.out.println("Unable to load background image file for MianMenu:\n"+e);
        }
        
    }
    
    public void feed(Window gc) {
        // Get mouse data
        Point loc = gc.getMousePosition();
        int mouseInput = gc.getMouseClick();


        // If start button clicked, move to player select
        if (start.wasPressed(loc, mouseInput)) {
            sm.setScreen("Game");
        }
    }
    
    public void draw(Window gc) {
        synchronized (gc) {
            gc.clear();
            gc.setColor(Color.black);

            // Draw the backgorund image
            gc.drawImage(bgImageFile, 0, 0);
        }
    }
}