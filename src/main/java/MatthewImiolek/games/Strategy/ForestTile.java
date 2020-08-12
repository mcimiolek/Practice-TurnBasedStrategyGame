package MatthewImiolek.games.Strategy;

/* A tile representing a forest, a relatively basic tile minorly impacting evasion and fast units. */

public class ForestTile extends Tile {
    boolean hasUnit = false;
    boolean hasAbility = false;
    double evaBonus = 0.15;
    int flyCost = 1;
    int heavyCost = 1;
    int lightCost = 1;
    int fastCost = 2;
    int abilPhase = -1;
    int abilImpact = -1;
}
