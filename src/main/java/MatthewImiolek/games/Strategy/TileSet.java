package MatthewImiolek.games.Strategy;

/* Abstract class which sets the basic functions for a tile set. This includes choosing the base tile, picking
   the percent ranges for each of the other tiles available, and picking the increased chances for a tile to be the same
   as the one it is next to. This is then extended to create the actual tile sets. */

public abstract class TileSet {
    String baseTile;
    double maxPlainChance;
    double minPlainChance;
    double maxWaterChance;
    double minWaterChance;
    double maxForestChance;
    double minForestChance;
    double maxMountainChance;
    double minMountainChance;
    double contChancePlain;
    double contChanceWater;
    double contChanceForest;
    double contChanceMountain;

    public void setBaseTile(){}            // Sets the default tile type for a set, which will be the base until replaced
    public void setChanceRangeForest(){}   // Sets percent range for amount of forest tiles
    public void setChanceRangeWater(){}    // Sets percent range for amount water tiles
    public void setChanceRangePlain(){}    // Sets percent range for amount of plains tiles
    public void setChanceRangeMountain(){} // Sets percent range for amount of mountain tiles
    public void setContChanceForest(){}    // Sets the additional chance for a forest next to another forest tile
    public void setContChanceWater(){}     // Sets the additional chance for a water next to another water tile
    public void setContChancePlain(){}     // Sets the additional chance for a plain next to another plain tile
    public void setContChanceMountain(){}  // Sets the additional chance for a mountain next to another mountain tile
}
