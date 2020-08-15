package MatthewImiolek.games.Strategy;

import java.awt.*;
import javax.swing.*;

/* class which generates the visible board given a choice of a tile set and a board size */

public class BoardGenerator {

    // Constructor for a board generator
    BoardGenerator(){
        createBackground();
        boardChoices();
    }

    // Create the background for the board using a JFrame
    public JFrame createBackground(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame background = new JFrame("Practice Strategy Game");

        background.setVisible(true);
        background.setSize(screenSize.width, screenSize.height);
        background.setLocation(0, 0);

        return background;
    }

    // Create a popup where the user selects the board options
    public JFrame boardChoices(){
        JFrame setup = new JFrame("Board choices");

        setup.setVisible(true);
        setup.setSize(250,250);
        setup.setLocation(100,100);

        ButtonGroup boardSize = new ButtonGroup();

        JRadioButton small = new JRadioButton("Small");
        JRadioButton medium = new JRadioButton("Medium");
        JRadioButton large = new JRadioButton("Large");

        boardSize.add(small);
        boardSize.add(medium);
        boardSize.add(large);

        JComponent newContentPane = new RadioButtonDemo();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        return setup;
    }
}
