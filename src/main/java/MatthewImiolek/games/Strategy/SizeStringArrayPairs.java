package MatthewImiolek.games.Strategy;

import java.util.HashMap;

// Holds a hashmap of all of the potential map size names and an array of those actual sizes
public class SizeStringArrayPairs {
    HashMap sizeMap = new HashMap();

    SizeStringArrayPairs(){
        sizeMap.put("Small", new int[] {10, 10});
        sizeMap.put("Medium", new int[] {15, 15});
        sizeMap.put("Large", new int[] {20, 20});
    }
}
