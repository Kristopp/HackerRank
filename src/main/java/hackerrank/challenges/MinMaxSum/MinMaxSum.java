package hackerrank.challenges.MinMaxSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.swing.text.Style;

import ch.qos.logback.core.joran.sanity.Pair;

public class MinMaxSum {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Long> minMaxSum(List<Long> arr) {
        // Write your code here

        List<Long> result = new ArrayList<Long>();
        
        arr.sort(null);
        
        Long minimumSum = (long) 0; // Initialize minimumSum to 0
        Long maximumSum = (long) 0; // Initialize maximumSum to 0

        for (int i = 0; i < 4; i++) {
            minimumSum += arr.get(i);
        }

        arr.sort(Collections.reverseOrder());
        for (int i = 0; i < 4; i++) {
            maximumSum += arr.get(i);
        }

       

        result.add(minimumSum);
        result.add(maximumSum);

        System.out.println(minimumSum + " " + maximumSum);

        return result;
    }

    List<Long> arr = new ArrayList<>(Arrays.asList(1L, 2L, 3L, 4L, 5L, 6L));

}
