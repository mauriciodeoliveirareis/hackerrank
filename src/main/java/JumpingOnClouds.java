import java.util.Arrays;

public class JumpingOnClouds {


    public static int jumpingOnClouds(int[] ints) {
//        Integer numberOfThurderclouds = Arrays.stream(ints).reduce(0, Integer::sum);
        int jumps = -1;
        for(int currentIndex =0; currentIndex < ints.length;) {
            if(currentIndex+2 < ints.length && ints[currentIndex+2] == 0) {
                currentIndex = currentIndex + 2;
            } else currentIndex++;

            jumps++;
        }
        return jumps;
    }
}
