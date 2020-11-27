package MatthewImiolek.games.Strategy;

import acm.graphics.GCanvas;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.*;

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
        content.setBackground(Color.BLACK);
    }

    // Function which adds tiles to the board
    public void addTiles(String boardSize, String tileSetName) {
        TileSetStringMap setStringMap = new TileSetStringMap();
        SizeStringArrayPairs sizePairs = new SizeStringArrayPairs();
        int[] boardSizePair = sizePairs.getPairArray(boardSize);                                                // A pair containing the height and width of the board
        tiles = new Tile[boardSizePair[0]][boardSizePair[1]];
        double baseHeight = (Toolkit.getDefaultToolkit().getScreenSize().getHeight() - 100) / boardSizePair[1]; // Height of each background
        double baseWidth = baseHeight;                                                                          // Width of each background
        double borderWidth = baseHeight / 40;                                                                   // The amount of border around each tile
        double tileHeight = baseHeight - (2 * borderWidth);                                                     // The width of each tile
        double tileWidth = tileHeight;                                                                          // The height of each tile
        TileSet tileSet = setStringMap.getTileSet(tileSetName);                                                 // Create the tile set for the board
        int lastTile;                                                                                           // The last tile so tile chances can be changed, defaulted to the base tile
        double[] baseTileChances = tileSet.calcTileChance();                                                    // The chance of each tile type by default
        double[] updatedChances = baseTileChances.clone();                                                      // The chance of each tile after accounting for previous tile
        double randNum;                                                                                         // A random number selecting the next tile
        Random rand = new Random();

        // Add tiles to array and to the content pane
        for(int x = 0; x < boardSizePair[0]; x++) {
            for(int y = 0; y < boardSizePair[1]; y++) {

                randNum = rand.nextDouble();

                if(randNum < updatedChances[0]){
                    tiles[x][y] = new PlainTile((x * baseWidth) + borderWidth, (y * baseHeight) + borderWidth, tileWidth, tileHeight);
                    tiles[x][y].setFilled(true);
                    tiles[x][y].setFillColor(tiles[x][y].getColor());
                    content.add(tiles[x][y]);

                    lastTile = 0;
                }
                else if(randNum < updatedChances[1]) {
                    tiles[x][y] = new ForestTile((x * baseWidth) + borderWidth, (y * baseHeight) + borderWidth, tileWidth, tileHeight);
                    tiles[x][y].setFilled(true);
                    tiles[x][y].setFillColor(tiles[x][y].getColor());
                    content.add(tiles[x][y]);

                    lastTile = 1;
                }
                else if (randNum < updatedChances[2]) {
                    tiles[x][y] = new MountainTile((x * baseWidth) + borderWidth, (y * baseHeight) + borderWidth, tileWidth, tileHeight);
                    tiles[x][y].setFilled(true);
                    tiles[x][y].setFillColor(tiles[x][y].getColor());
                    content.add(tiles[x][y]);

                    lastTile = 2;
                }
                else {
                    tiles[x][y] = new WaterTile((x * baseWidth) + borderWidth, (y * baseHeight) + borderWidth, tileWidth, tileHeight);
                    tiles[x][y].setFilled(true);
                    tiles[x][y].setFillColor(tiles[x][y].getColor());
                    content.add(tiles[x][y]);

                    lastTile = 3;
                }

                tileSet.updateTileChance(baseTileChances, lastTile);
            }
        }
    }
}
