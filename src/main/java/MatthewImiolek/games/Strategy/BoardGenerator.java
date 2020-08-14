package MatthewImiolek.games.Strategy;

import java.awt.*;
import javax.swing.*;

/* class which generates the visible board given a choice of a tile set and a board size */

public class BoardGenerator {

    // Constructor for a board generator
    BoardGenerator(){
    }

    // Create the background for the board
    public JFrame createBackground(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame frame = new JFrame("A Simple GUI");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocation(430, 100);

        return frame;
    }
}
