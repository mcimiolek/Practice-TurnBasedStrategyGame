package MatthewImiolek.games.Strategy;

/* A tile representing water, heavily restrict unit movement, and minorly evasion. */

import java.awt.*;

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
    Color color = new Color(0, 35, 200);

    // Constructor for a water tile
    WaterTile(double x, double y, double width, double height){
        super(x, y, width, height);
    }

    // Get which color the tile is
    public Color getColor() {
        return color;
    }
}
