package hackerrank.challenges.BreakingRecords;

import java.util.Arrays;
import java.util.List;

public class BreakingRecords {
    List<Integer> scores2 = Arrays.asList(12, 24, 13, 8, 15);

    int min = 0;
    int max = 0;

    public List<Integer> result(List<Integer> scores) {
        // Sort array smallest to higest and return first and last
        scores.sort(null);


        min = scores.get(0);
        max = scores.get(scores.size() - 1);

        return Arrays.asList(min, max);

    }
}
