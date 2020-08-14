package MatthewImiolek.games.Strategy;

import java.awt.Color;

/* Abstract class which sets up the basic needs for a tile. This includes whether a tile has a unit, how different unit
   types movement are impacted by a tile, and if a tile gives any other benefits. */

public class Tile {
    boolean hasUnit;    // States if a tile has a unit
    boolean hasAbility; // States if a tile has an ability that must be applied
    double evaBonus;    // The amount of evasion bonus a unit gets from a tile
    int flyCost;        // How much moving over the tile costs for a flying unit, -1 means cannot go there
    int heavyCost;      // How much moving over the tile costs for a heavy unit, -1 means cannot go there
    int lightCost;      // How much moving over the tile costs for a light unit, -1 means cannot go there
    int fastCost;       // How much moving over the tile costs for a fast unit, -1 means cannot go there
    int abilPhase;      // What phase of play the ability must be applied in, -1 means no ability
    int abilImpact;     // The impact of the ability, -1 means no ability
    int unit;           // An integer representing the exact unit on the tile, if -1 no unit is present
    Color color;       // The base color of the tile

    // Check if the tile has a unit or not
    public boolean isHasUnit() {
        return hasUnit;
    }

    // Set if the tile has a unit or not
    public void setHasUnit(boolean hasUnit){
        this.hasUnit = hasUnit;
    }

    // Check if the tile has an ability
    public boolean isHasAbility() {
        return hasAbility;
    }

    // Set if the tile has an ability
    public void setHasAbility(boolean hasAbility){
        this.hasAbility = hasAbility;
    }

    // Get the evasion bonus
    public double getEvaBonus() {
        return evaBonus;
    }

    // Set the evasion bonus
    public void setEvaBonus(double evaBonus){
        this.evaBonus = evaBonus;
    }

    // Get the move cost for flying units
    public int getFlyCost() {
        return flyCost;
    }

    // Set the cost for flying units
    public void setFlyCost(int flyCost){
        this.flyCost = flyCost;
    }

    // Get the move cost for heavy units
    public int getHeavyCost() {
        return heavyCost;
    }

    // Set the cost for heavy units
    public void setHeavyCost(int heavyCost){
        this.heavyCost = heavyCost;
    }

    // Get the move cost for light units
    public int getLightCost() {
        return lightCost;
    }

    // Set the cost for light units
    public void setLightCost(int lightCost){
        this.lightCost = lightCost;
    }

    // Get the move cost for fast units
    public int getFastCost() {
        return fastCost;
    }

    // Set the cost for fast units
    public void setFastCost(int fastCost){
        this.fastCost = fastCost;
    }

    // Get the phase of the game where the ability must be applied
    public int getAbilPhase() {
        return abilPhase;
    }

    // Set the phase of the game where the ability must be applied
    public void setAbilPhase(int abilPhase){
        this.abilPhase = abilPhase;
    }

    // Get the ability which the tile has
    public int getAbilImpact() {
        return abilImpact;
    }

    // Set which ability the tile has
    public void setAbilImpact(int abilImpact){
        this.abilImpact = abilImpact;
    }

    // Get which unit the tile has
    public int getUnit() {
        return unit;
    }

    // Set which unit is on the tile
    public void setUnit(int unit){
        this.unit = unit;
    }

    // Get which color the tile is
    public Color getColor() {
        return color;
    }

    // Set the color of the tile
    public void setColor(Color color){
        this.color = color;
    }
}
