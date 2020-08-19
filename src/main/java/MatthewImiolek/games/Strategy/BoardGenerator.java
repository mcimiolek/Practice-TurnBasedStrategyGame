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
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // Get the size of the monitor
        JFrame background = new JFrame("Practice Strategy Game");       // Create the frame for the board

        // Set the basics for the frame
        background.setVisible(true);
        background.setSize(screenSize.width, screenSize.height);
        background.setLocation(0, 0);
        background.setDefaultCloseOperation(background.EXIT_ON_CLOSE);

        return background;
    }

    // Create a popup where the user selects the board options
    public JFrame boardChoices(){
        JFrame setup = new JFrame("Board choices");            // Frame which holds board selection choices
        GridBagConstraints setupLayout = new GridBagConstraints();  // Layout for the frame
        ButtonGroup boardSize = new ButtonGroup();                  // Button group holding choices on board size

        // Setup the basics of the frame
        setup.setVisible(true);
        setup.setSize(250,250);
        setup.setLocation(100,100);
        setup.setLayout(new GridBagLayout());

        // Setup the basics of the layout
        setupLayout.anchor = GridBagConstraints.LINE_START;

        // Create and add a button to choose a small board size, also the default size
        JRadioButton small = new JRadioButton("Small");
        setupLayout.gridx = 0;
        setupLayout.gridy = 0;
        small.setSelected(true);
        setup.add(small, setupLayout);

        // Create and add a button to choose a medium board size
        JRadioButton medium = new JRadioButton("Medium");
        setupLayout.gridx = 0;
        setupLayout.gridy = 1;
        setup.add(medium, setupLayout);

        // Create and add a button to choose a large board size
        JRadioButton large = new JRadioButton("Large");
        setupLayout.gridx = 0;
        setupLayout.gridy = 2;
        setup.add(large, setupLayout);

        // Add all of the size buttons to the button group
        boardSize.add(small);
        boardSize.add(medium);
        boardSize.add(large);

        return setup;
    }
}
