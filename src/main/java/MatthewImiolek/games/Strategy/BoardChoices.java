package MatthewImiolek.games.Strategy;

import javax.sound.midi.SysexMessage;
import javax.swing.*;
import java.awt.*;
import java.util.Enumeration;

// Create a popup where the user selects the board options
public class BoardChoices extends JFrame{
    GridBagConstraints setupLayout = new GridBagConstraints();  // Layout for the frame
    ButtonGroup boardSizeChoice = new ButtonGroup();            // Button group holding choices on board size
    ButtonGroup tileSetChoice = new ButtonGroup();              // Button group holding choices on tile set

    // Constructor which sets up the basics of the
    BoardChoices() {
        // Setup the basics of the frame
        this.setVisible(true);
        this.setSize(250,250);
        this.setLocation(100,100);
        this.setLayout(new GridBagLayout());

        // Setup the basics of the layout
        setupLayout.anchor = GridBagConstraints.LINE_START;

        // Add the size radio buttons
        addSizeOptions(setupLayout, this, boardSizeChoice);

        // Add the tile set radio buttons
        addTileSetOptions(setupLayout, this, tileSetChoice);
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

    // Function which updates global variable for the size choice
    public String updateSizeChoice() {

        // While the frame is visible choices may still be being made, so wait till those are done
        while(this.isVisible()) {
        }

        // Go through and check which size button was selected, and set the store that value
        for (Enumeration<AbstractButton> sizeOptions = boardSizeChoice.getElements(); sizeOptions.hasMoreElements();) {
            AbstractButton sizeChoice = sizeOptions.nextElement();
            if (sizeChoice.isSelected()) {
                return sizeChoice.getText();
            }
        }

        return null;
    }

    // Function which updates global variable for the tile set choice
    public String updateSetChoice() throws InterruptedException{

        // While the frame is visible choices may still be being made, so wait till those are done
        while(this.isVisible()) {
            Thread.sleep(2);
        }

        // Go through and check which tile set button was selected, and store that value
        for (Enumeration<AbstractButton> setOptions = tileSetChoice.getElements(); setOptions.hasMoreElements();) {
            AbstractButton setChoice = setOptions.nextElement();
            if (setChoice.isSelected()) {
                return setChoice.getText();
            }
        }
        return null;
    }
}
