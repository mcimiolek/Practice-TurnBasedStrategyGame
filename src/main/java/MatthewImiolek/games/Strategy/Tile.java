package MatthewImiolek.games.Strategy;

/* Abstract class which sets up the basic needs for a tile. This includes whether a tile has a unit, how different unit
   types movement are impacted by a tile, and if a tile gives any other benefits. */

public class Tile {
    boolean hasUnit;    // States if a tile has a unit
    boolean hasAbility; // States if a tile has an ability that must be applied
    double evaBonus;    // The amount of evasion bonus a unit gets from a tile
    int flyCost;        // How much moving over the tile costs for a flying unit
    int heavyCost;      // How much moving over the tile costs for a heavy unit
    int lightCost;      // How much moving over the tile costs for a light unit
    int fastCost;       // How much moving over the tile costs for a fast unit
    int abilPhase;      // What phase of play the ability must be applied in
    int abilImpact;     // The impact of the ability

    // set if the tile has a unit or not
    public void setHasUnit(boolean hasUnit){
        this.hasUnit = hasUnit;
    }

    // Set if the tile has an ability
    public void setHasAbility(boolean hasAbility){
        this.hasAbility = hasAbility;
    }

    // set the evasion bonus
    public void setEvaBonus(double evaBonus){
        this.evaBonus = evaBonus;
    }

    // Set the cost for flying units
    public void setFlyCost(int flyCost){
        this.flyCost = flyCost;
    }

    // Set the cost for heavy units
    public void setHeavyCost(int heavyCost){
        this.heavyCost = heavyCost;
    }

    // Set the cost for light units
    public void setLightCost(int lightCost){
        this.lightCost = lightCost;
    }

    // Set the cost for fast units
    public void setFastCost(int fastCost){
        this.fastCost = fastCost;
    }

    // Set the phase of the game where the ability must be applied
    public void setAbilPhase(int abilPhase){
        this.abilPhase = abilPhase;
    }

    // Set which ability the tile has
    public void setAbilImpact(int abilImpact){
        this.abilImpact = abilImpact;
    }
}
