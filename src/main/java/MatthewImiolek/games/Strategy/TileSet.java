package MatthewImiolek.games.Strategy;

/* Abstract class which sets the basic functions for a tile set. This includes choosing the base tile, picking
   the percent ranges for each of the other tiles available, and picking the increased chances for a tile to be the same
   as the one it is next to. This is then extended to create the actual tile sets. */

public class TileSet {
    String baseTile;            // The base tile type for the set, which are then changed to other tiles
    double maxPlainRange;       // Max percent of the board that will be plains
    double minPlainRange;       // Min percent of the board that will be plains
    double maxWaterRange;       // Max percent of the board that will be water
    double minWaterRange;       // Min percent of the board that will be water
    double maxForestRange;      // Max percent of the board that will be forest
    double minForestRange;      // Min percent of the board that will be forest
    double maxMountainRange;    // Max percent of the board that will be mountains
    double minMountainRange;    // Min percent of the board that will be mountains
    double contChancePlain;     // Additional chance of a plain next to a plain
    double contChanceWater;     // Additional chance of a water next to a water
    double contChanceForest;    // Additional chance of a forest next to a forest
    double contChanceMountain;  // Additional chance of a mountain next to a mountain

    // Sets the default tile type for a set, which will be then be replaced with other tile types
    public void setBaseTile(String tileType){
        this.baseTile = tileType;
    }

    // Sets percent range for amount of forest tiles
    public void setChanceRangeForest(double max, double min){
        this.maxForestRange = max;
        this.minForestRange = min;
    }

    // Sets percent range for amount water tiles
    public void setChanceRangeWater(double max, double min){
        this.maxWaterRange = max;
        this.minWaterRange = min;
    }

    // Sets percent range for amount of plains tiles
    public void setChanceRangePlain(double max, double min){
        this.maxPlainRange = max;
        this.minPlainRange = min;
    }

    // Sets percent range for amount of mountain tiles
    public void setChanceRangeMountain(double max, double min){
        this.maxMountainRange = max;
        this.minMountainRange = min;
    }

    // Sets the additional chance for a forest next to another forest tile
    public void setContChanceForest(double contChanceForest){
        this.contChanceForest = contChanceForest;
    }

    // Sets the additional chance for a water next to another water tile
    public void setContChanceWater(double contChanceWater){
        this.contChanceWater = contChanceWater;
    }

    // Sets the additional chance for a plain next to another plain tile
    public void setContChancePlain(double contChancePlain){
        this.contChancePlain = contChancePlain;
    }

    // Sets the additional chance for a mountain next to another mountain tile
    public void setContChanceMountain(double contChanceMountain){
        this.contChanceMountain = contChanceMountain;
    }
}
