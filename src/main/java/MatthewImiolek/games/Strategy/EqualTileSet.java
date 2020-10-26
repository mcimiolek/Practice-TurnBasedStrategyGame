package MatthewImiolek.games.Strategy;

/* A very basic tile set built on plains tiles with an equal chance of all the tile types. It also has a slight increase
   in the chance of the same tiles being near each other. */
public class EqualTileSet extends TileSet {
    int baseTile = 0;
    double[] rangeMaxes = {.25, .25, .25, .25};  // Array holding the maxes for each tile type
    double[] rangeMins = {.25, .25, .25, .25};   // Array holding the minimums for each tile type
    double[] contChances = {.1, .1, .1, .1}; // Additional chance of the same tile following the previous tile
    int tileTypesPresent = 4;

    public double[] calcTileChance() {
        return super.calcTileChance(rangeMaxes, rangeMins, baseTile);
    }
}
