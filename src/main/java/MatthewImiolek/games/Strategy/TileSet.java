package MatthewImiolek.games.Strategy;

/* Abstract class which sets the basic functions for a tile set. This includes choosing the base tile, picking
   the percent ranges for each of the other tiles available, and picking the increased chances for a tile to be the same
   as the one it is next to. This is then extended to create the actual tile sets. In the arrays holding values for
   each tile type, 0 is plains, 1 is forests, 2 is mountains, and 3 is water. */

public class TileSet {
    int baseTile;      // The base tile type for the set, which is represented by its location in arrays
    double[] rangeMaxes;  // Array holding the maxes for each tile type
    double[] rangeMins;   // Array holding the minimums for each tile type
    double[] contChances; // Additional chance of the same tile following the previous tile
    int tileTypesPresent; // An integer counting the number of tiles with a chance greater than 0

    // Get the base tile
    public int getBaseTile(){
        return baseTile;
    }

    // Sets the default tile type for a set, which will be then be replaced with other tile types
    public void setBaseTile(int tileType){
        this.baseTile = tileType;
    }

    // Get the max for the range of a tile type
    public double getRangeMaxes(int tileType){
        return rangeMaxes[tileType];
    }

    // set a new max in the range for a type of tile
    public void setRangeMaxes(double max, int tileType){
        rangeMaxes[tileType] = max;
    }

    // Get the max for the range of a tile type
    public double getRangeMin(int tileType){
        return rangeMins[tileType];
    }

    // set a new min in the range for a type of tile
    public void setRangeMins(double min, int tileType){
        rangeMins[tileType] = min;
    }

    // Get the continuity chance for a tile type
    public double getContChance(int tileType){
        return contChances[tileType];
    }

    // set a new continuity chance for a type of tile
    public void setContChances(double chance, int tileType){
        contChances[tileType] = chance;
    }

    // Set the number of tile types available in this set
    public void setTileTypesPresent(int tileTypesPresent)
    {
        this.tileTypesPresent = tileTypesPresent;
    }

    // Get the number of tile types present
    public int getTileTypesPresent()
    {
        return tileTypesPresent;
    }
}
