package MatthewImiolek.games.Strategy;

/* Interface which sets the required functions for a tile set. This includes picking the base tile for the set, picking
   the percent ranges for each of the other tiles available, and picking the increased chances for a tile to be the same
   as the one it is next to. */

public interface TileSet {
    public void setBaseTile();          // Sets the default tile type for the set, which will be the base until replaced
    public void setPercRangeForest();   // Sets percent range for amount of forest tiles
    public void setPercRangeWater();    // Sets percent range for amount water tiles
    public void setPercRangePlain();    // Sets percent range for amount of plains tiles
    public void setPercRangeMountain(); // Sets percent range for amount of mountain tiles
    public void setContPercForest();    // Sets the additional chance for a forest next to another forest tile
    public void setContPercWater();     // Sets the additional chance for a water next to another water tile
    public void setContPercPlain();     // Sets the additional chance for a plain next to another plain tile
    public void setContPercMountain();  // Sets the additional chance for a mountain next to another mountain tile
}
