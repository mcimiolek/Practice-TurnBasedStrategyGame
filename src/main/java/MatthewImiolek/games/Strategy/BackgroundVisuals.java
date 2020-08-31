package MatthewImiolek.games.Strategy;

import acm.graphics.GCanvas;
import acm.graphics.GRect;

import javax.swing.*;
import java.awt.*;

// Class that actually makes the board
public class BackgroundVisuals extends JFrame {

    // Constructor for a new background setup
    BackgroundVisuals(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // Get the size of the monitor

        this.setTitle("Practice Strategy Game");
        this.setVisible(true);
        this.setSize(screenSize.width, screenSize.height);
        this.setLocation(0, 0);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }

    // Function which adds tiles to the board
    public void addTiles(String boardSize) {
        SizeStringArrayPairs sizePairs = new SizeStringArrayPairs();
        int[] boardSizePair = sizePairs.getPairArray(boardSize); // A pair containing the height and width of the board
        Tile temp = new Tile(10, 10, 10, 10);
        GCanvas tenmo = new GCanvas();
        GRect hi = new GRect(10, 10 ,10 ,10);
        hi.setFilled(true);
        hi.setFillColor(Color.BLUE);
        tenmo.add(hi);
        this.add(tenmo);

        System.out.println("hi");

    }
}
