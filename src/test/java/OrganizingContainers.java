import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class OrganizingContainers {
    static final String POSS = "Possible";
    static final String IMP = "Impossible";

    public static String organizingContainers(int[][] containerMatrix) {
        HashMap<Integer, Integer> typesCountMap = new HashMap<>();
        HashMap<Integer, Integer> containerSizeMap = new HashMap<>();
        for (int x = 0; x < containerMatrix.length; x++) {
            int[] container = containerMatrix[x];
            int containerSize = 0;
            for (int ballType = 0; ballType < container.length; ballType++) {
                Integer amountOfBallTypes = container[ballType];
                containerSize += amountOfBallTypes;
                typesCountMap.putIfAbsent(ballType, 0);
                typesCountMap.put(ballType, typesCountMap.get(ballType) + amountOfBallTypes);
            }
            containerSizeMap.putIfAbsent(containerSize, 0);
            containerSizeMap.put(containerSize, containerSizeMap.get(containerSize) + 1);
        }
        Set<Integer> setOfTypes = typesCountMap.keySet();
        for (Integer type : setOfTypes) {
            Integer typeCount = typesCountMap.get(type);
            if(containerSizeMap.containsKey(typeCount) && containerSizeMap.get(typeCount) != 0)
                containerSizeMap.put(typeCount, containerSizeMap.get(typeCount) - 1);
            else return IMP;
        }
        return POSS;

    }
}
