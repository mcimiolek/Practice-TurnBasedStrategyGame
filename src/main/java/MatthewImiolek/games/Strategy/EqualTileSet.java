package MatthewImiolek.games.Strategy;

/* A very basic tile set built on plains tiles with an equal chance of all the tile types. It also has a slight increase
   in the chance of the same tiles being near each other. */
public class EqualTileSet extends TileSet {
    int baseTile = 0;
    double maxPlainChance = 0.25;
    double minPlainChance = 0.25;
    double maxWaterChance = 0.25;
    double minWaterChance = 0.25;
    double maxForestChance = 0.25;
    double minForestChance = 0.25;
    double maxMountainChance = 0.25;
    double minMountainChance = 0.25;
    double contChancePlain = 0.1;
    double contChanceWater = 0.1;
    double contChanceForest = 0.1;
    double contChanceMountain = 0.1;
}
