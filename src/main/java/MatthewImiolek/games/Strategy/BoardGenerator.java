package MatthewImiolek.games.Strategy;

/* class which generates the visible board given a choice of a tile set and a board size */

public class BoardGenerator{
    String boardSize = "Small";                                  // The size of the board, defaults to small
    String tileSet = "equal";                                    // The tile set for the board, defaults to equal
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
        backgroundGenerator.addTiles(boardSize, tileSet.toLowerCase());
        backgroundGenerator.addText();
    }
}