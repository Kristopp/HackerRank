package hackerrank.challenges.BreakingRecords;

import java.util.Arrays;
import java.util.List;

public class BreakingRecords {
    List<Integer> scores2 = Arrays.asList(12, 24, 11, 8, 15);

    public List<Integer> result(List<Integer> scores) {
        int min = scores.get(0);
        int max = scores.get(0);

        int minCount = 0;
        int maxCount = 0;

        // I need a loop

        for (Integer i : scores) {
            if (i < min) {
                min = i;
                minCount += 1;
            } else if (i > max) {
                max = i;
                maxCount += 1;
            }

            System.out.println("minCount: " + minCount);
            System.out.println("maxCount: " + maxCount);

        }
        System.out.println(Arrays.asList(minCount, maxCount));
        return Arrays.asList(maxCount, minCount);

    }
}
