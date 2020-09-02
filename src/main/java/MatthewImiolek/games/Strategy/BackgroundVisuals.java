package MatthewImiolek.games.Strategy;

import acm.graphics.GCanvas;
import acm.graphics.GRect;

import javax.swing.*;
import java.awt.*;

// Class that actually makes the board
public class BackgroundVisuals extends JFrame {
    GCanvas content = new GCanvas();

    // Constructor for a new background setup
    BackgroundVisuals(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // Get the size of the monitor

        this.setTitle("Practice Strategy Game");
        this.setVisible(true);
        this.setSize(screenSize.width, screenSize.height);
        this.setLocation(0, 0);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setContentPane(content);

        content.setVisible(true);
    }

    // Function which adds tiles to the board
    public void addTiles(String boardSize) {
        System.out.println("HELLO");
        SizeStringArrayPairs sizePairs = new SizeStringArrayPairs();
        int[] boardSizePair = sizePairs.getPairArray(boardSize); // A pair containing the height and width of the board

        GRect hi = new GRect(100, 100 ,100 ,100);
        hi.setFilled(true);
        hi.setFillColor(Color.BLUE);
        content.add(hi);
        System.out.println("HELLO");
    }
}
