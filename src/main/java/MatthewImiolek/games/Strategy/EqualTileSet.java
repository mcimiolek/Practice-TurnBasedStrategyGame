package MatthewImiolek.games.Strategy;

/* A very basic tile set built on plains tiles with an equal chance of all the tile types. It also has a slight increase
   in the chance of the same tiles being near each other. */
public class EqualTileSet extends TileSet {
    String baseTile = "plain";
    double maxPlainChance = .25;
    double minPlainChance = .25;
    double maxWaterChance = .25;
    double minWaterChance = .25;
    double maxForestChance = .25;
    double minForestChance = .25;
    double maxMountainChance = .25;
    double minMountainChance = .25;
    double contChancePlain = .1;
    double contChanceWater = .1;
    double contChanceForest = .1;
    double contChanceMountain = .1;
}
