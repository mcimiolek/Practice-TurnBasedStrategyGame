package MatthewImiolek.games.Strategy;

import java.util.HashMap;

// Holds a hashmap of all the strings names of tile sets and the actual tile sets
public class TileSetStringMap {
    HashMap tileSetMap = new HashMap();

    TileSetStringMap() {
         tileSetMap.put("equal", new EqualTileSet());
    }

    public TileSet getTileSet(String tileSet){
        return (TileSet) tileSetMap.get(tileSet.toLowerCase());
    }
}