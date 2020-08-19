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
        background.setDefaultCloseOperation(background.EXIT_ON_CLOSE);

        return background;
    }

    // Create a popup where the user selects the board options
    public JFrame boardChoices(){
        JFrame setup = new JFrame("Board choices");
        GridBagConstraints setupLayout = new GridBagConstraints();
        ButtonGroup boardSize = new ButtonGroup();

        setup.setVisible(true);
        setup.setSize(250,250);
        setup.setLocation(100,100);
        setup.setLayout(new GridBagLayout());

        setupLayout.anchor = GridBagConstraints.LINE_START;

        JRadioButton small = new JRadioButton("Small");
        setupLayout.gridx = 0;
        setupLayout.gridy = 0;
        small.setSelected(true);
        setup.add(small, setupLayout);


        JRadioButton medium = new JRadioButton("Medium");
        setupLayout.gridx = 0;
        setupLayout.gridy = 1;
        setup.add(medium, setupLayout);

        JRadioButton large = new JRadioButton("Large");
        setupLayout.gridx = 0;
        setupLayout.gridy = 2;
        setup.add(large, setupLayout);

        boardSize.add(small);
        boardSize.add(medium);
        boardSize.add(large);

        return setup;
    }
}
