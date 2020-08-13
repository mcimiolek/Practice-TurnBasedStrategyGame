package MatthewImiolek.games.Strategy;

/* A tile representing water, heavily restrict unit movement, and minorly evasion. */

public class WaterTile extends Tile {
    boolean hasUnit = false;
    boolean hasAbility = false;
    double evaBonus = -0.10;
    int flyCost = 1;
    int heavyCost = -1;
    int lightCost = -1;
    int fastCost = -1;
    int abilPhase = -1;
    int abilImpact = -1;
    int unit = -1;
}
