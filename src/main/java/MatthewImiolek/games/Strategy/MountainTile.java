package MatthewImiolek.games.Strategy;

/* A tile representing a mountain, heavily impacts movement and evasion. */

import java.awt.*;

public class MountainTile extends Tile {
    boolean hasUnit = false;
    boolean hasAbility = false;
    double evaBonus = 0.25;
    int flyCost = 1;
    int heavyCost = 3;
    int lightCost = 1;
    int fastCost = 2;
    int abilPhase = -1;
    int abilImpact = -1;
    int unit = -1;
    Color color = new Color(102, 51, 0);

    MountainTile(){}
}
