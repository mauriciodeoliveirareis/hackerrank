public class CountingValleys {
    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        char[] steps = s.toCharArray();
        int level = 0;
        int previousLevel = 0;
        int numberOfValleys = 0;
        for (char step : steps) {
            previousLevel = level;
            if (step == 'U') level++;
            else level--;
            if(level == 0 && previousLevel == -1) numberOfValleys++;
        }
        return numberOfValleys;

    }

}
