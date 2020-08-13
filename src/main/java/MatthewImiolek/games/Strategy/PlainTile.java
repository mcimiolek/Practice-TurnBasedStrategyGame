package MatthewImiolek.games.Strategy;

/* A tile representing a plain, meant to be the most basic tile available with no impact in anyway. */

public class PlainTile extends Tile {
    boolean hasUnit = false;
    boolean hasAbility = false;
    double evaBonus = 0;
    int flyCost = 1;
    int heavyCost = 1;
    int lightCost = 1;
    int fastCost = 1;
    int abilPhase = -1;
    int abilImpact = -1;
    int unit = -1;
}
