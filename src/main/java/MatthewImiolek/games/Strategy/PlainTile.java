package MatthewImiolek.games.Strategy;

/* A tile representing a plain, meant to be the most basic tile available with no impact in anyway. */

import java.awt.Color;

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
    Color color = new Color(0, 102, 0);

    // Constructor for a plain tile
    PlainTile(){
        super();
    }

    PlainTile(double x, double y, double width, double height){
        super(x, y, width, height);
    }
}
