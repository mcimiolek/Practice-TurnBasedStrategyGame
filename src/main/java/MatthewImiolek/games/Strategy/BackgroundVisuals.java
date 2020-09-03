package MatthewImiolek.games.Strategy;

import acm.graphics.GCanvas;
import acm.graphics.GRect;

import javax.swing.*;
import java.awt.*;

// Class that actually makes the board
public class BackgroundVisuals extends JFrame {
    GCanvas content = new GCanvas();    // Shows all the tiles
    Tile[][] tiles;                     // Create a tile array to hold each tile

    // Constructor for a new background setup
    BackgroundVisuals(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // Get the size of the monitor

        // Setup the basics of the board
        this.setTitle("Practice Strategy Game");
        this.setVisible(true);
        this.setSize(screenSize.width, screenSize.height);
        this.setLocation(0, 0);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setContentPane(content);
        content.setVisible(true);
    }

    // Function which adds tiles to the board
    public void addTiles(String boardSize, String tileSetName) {
        TileSetStringMap setStringMap = new TileSetStringMap();
        SizeStringArrayPairs sizePairs = new SizeStringArrayPairs();
        int[] boardSizePair = sizePairs.getPairArray(boardSize);                                        // A pair containing the height and width of the board
        tiles = new Tile[boardSizePair[0]][boardSizePair[1]];
        double tileHeight = Toolkit.getDefaultToolkit().getScreenSize().getHeight() / boardSizePair[1]; // Height of each tile
        double tileWidth = Toolkit.getDefaultToolkit().getScreenSize().getWidth() / boardSizePair[0];   // Width of each tile
        TileSet tileSet = setStringMap.getTileSet(tileSetName);                                         // Create the tile set for the board
        String lastTile = null;                                                                         // The last tile so any necessary tile chances can be changed

        // Decide the base chance of each tile type



        // Add tiles to array and to the content pane
        for(int x = 0; x < boardSizePair[0]; x++) {
            for(int y = 0; y < boardSizePair[1]; y++) {

                tiles[x][y] = new PlainTile(x * tileWidth, y * tileHeight, tileWidth, tileHeight);
                tiles[x][y].setFilled(true);
                tiles[x][y].setFillColor(tiles[x][y].getColor());
                content.add(tiles[x][y]);
            }
        }
    }
}
