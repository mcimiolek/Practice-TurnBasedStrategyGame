package MatthewImiolek.games.Strategy;

import java.util.HashMap;

// Holds a hashmap of all of the potential map size names and an array of those actual sizes
public class SizeStringArrayPairs {
    HashMap sizeMap = new HashMap();

    SizeStringArrayPairs(){
        sizeMap.put("small", new int[] {10, 10});
        sizeMap.put("medium", new int[] {15, 15});
        sizeMap.put("large", new int[] {20, 20});
    }

    public int[] getPairArray(String size){
        return (int[]) sizeMap.get(size.toLowerCase());
    }
}
