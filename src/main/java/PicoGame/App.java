package PicoGame;

import java.awt.Color;

import PicoEngine.Window;
import PicoEngine.ScreenManager;

import PicoGame.screens.*;

public class App {
    static Window gc = new Window(1200, 800, "Pico");
    static ScreenManager sm = ScreenManager.getInstance();

    public static void main(String[] args) {
        new App();
    }

    private App() {
        setup();

        while (true) {
            loop();
        }
    }

    private void setup() {
        // Auto-config the window
        gc.autoConfig(Color.white);

        // Register all screens
        sm.register("Main Menu", new MainMenu(gc));

        // Load starting screen
        sm.setScreen("Main Menu");
    }
    
    private void loop() {
        sm.feed(gc);
        sm.draw(gc);
        gc.sleep(2);
    }
}
