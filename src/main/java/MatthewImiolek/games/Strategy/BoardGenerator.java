package MatthewImiolek.games.Strategy;

import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.*;
import java.util.Enumeration;
import javax.swing.*;

/* class which generates the visible board given a choice of a tile set and a board size */

public class BoardGenerator{
    String boardSize = "Small";                                  // The size of the board, defaults to small
    String tileSet = "Equal";                                    // The tile set for the board, defaults to equal
    BackgroundVisuals backgroundGenerator;                       // Customized jframe which represents the board
    BoardChoices choicePopup;                                    // Customized jframe which represents the choices popup

    // Constructor for a board generator
    BoardGenerator() {
        backgroundGenerator = new BackgroundVisuals();
        choicePopup = new BoardChoices();
    }

    public void generate() throws InterruptedException{
        tileSet = choicePopup.updateSetChoice();
        boardSize = choicePopup.updateSizeChoice();
        backgroundGenerator.addTiles(boardSize);

        //GRect hie = new GRect(100, 100 ,100 ,100);
        //backgroundGenerator.getContentPane().add(hie);
    }
}