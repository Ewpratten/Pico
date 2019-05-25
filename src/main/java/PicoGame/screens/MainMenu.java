package PicoGame.screens;

import PicoEngine.Screen;
import PicoEngine.Window;
import PicoEngine.interaction.Button;

public class MainMenu implements Screen {
    Button start;
    Button quit;

    private final int buttonWidthRat = 8;
    private final int buttonHeightRat = 10;

    public MainMenu(Window gc) {
        // Get button positions
        int section = gc.getHeight() / 6;
        int loffset = (gc.getWidth() / 2) - (gc.getWidth() / buttonWidthRat);
        int roffset = (gc.getWidth() / buttonWidthRat);
        int height = gc.getHeight() / buttonHeightRat;

        // Create buttons
        this.start = new Button(loffset, section * 4, roffset, height);
    }
    
    public void feed(Window gc) {

    }
    
    public void draw(Window gc) {
        start.debug(gc);
        
    }
}