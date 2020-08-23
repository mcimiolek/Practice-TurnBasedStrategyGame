package MatthewImiolek.games.Strategy;

import java.awt.*;
import javax.swing.*;

/* class which generates the visible board given a choice of a tile set and a board size */

public class BoardGenerator {
    String boardSize = "small"; // The size of the board, defaults to small
    String tileSet = "equal";   // The tile set for the board, defaults to equal

    // Constructor for a board generator
    BoardGenerator() throws InterruptedException{
        createBackground();
        JFrame dooes = boardChoices();
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
    public JFrame boardChoices() throws InterruptedException{
        JFrame setup = new JFrame("Board choices");            // Frame which holds board selection choices
        GridBagConstraints setupLayout = new GridBagConstraints();  // Layout for the frame
        ButtonGroup boardSizeChoice = new ButtonGroup();                  // Button group holding choices on board size
        ButtonGroup tileSetChoice = new ButtonGroup();              // Button group holding choices on tile set

        // Setup the basics of the frame
        setup.setVisible(true);
        setup.setSize(250,250);
        setup.setLocation(100,100);
        setup.setLayout(new GridBagLayout());

        // Setup the basics of the layout
        setupLayout.anchor = GridBagConstraints.LINE_START;

        // Add the size radio buttons
        addSizeOptions(setupLayout, setup, boardSizeChoice);

        // Add the tile set radio buttons
        addTileSetOptions(setupLayout, setup, tileSetChoice);

        updateFromChoices(setup, boardSizeChoice, tileSetChoice);

        return setup;
    }

    // Function which adds the details relating to the size options to the frame
    public void addSizeOptions(GridBagConstraints setupLayout, JFrame setup, ButtonGroup boardSize) {

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
    }

    // Function which adds the details relating to the tile set to the frame
    public void addTileSetOptions(GridBagConstraints setupLayout, JFrame setup, ButtonGroup tileSetChoice) {

        // Create and add a button to choose a small board size, also the default size
        JRadioButton equal = new JRadioButton("Equal");
        setupLayout.gridx = 1;
        setupLayout.gridy = 0;
        equal.setSelected(true);
        setup.add(equal, setupLayout);

        // Add all of the size buttons to the button group
        tileSetChoice.add(equal);
    }

    // Function which updates global variables after choices are made
    public void updateFromChoices(JFrame choiceFrame, ButtonGroup sizes, ButtonGroup tileSets) throws InterruptedException{

        // While the frame is visible choices may still be being made, so wait till those are done
        while(choiceFrame.isVisible()) {
            System.out.println(choiceFrame.isVisible());
        }

        System.out.println(sizes.getSelection().hashCode());
        System.out.println(tileSets.getSelection().hashCode());
    }
}

// javax.swing.JToggleButton$ToggleButtonModel@6193b845 1637070917
//javax.swing.JToggleButton$ToggleButtonModel@2e817b38 780237624