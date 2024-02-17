package hackerrank.hackerrank.MinMaxSum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import hackerrank.challenges.MinMaxSum.MinMaxSum;

public class MinMaxSumTest {
    @Test

    public void minMaxSumTest() {
        MinMaxSum minMaxSum = new MinMaxSum();
        ArrayList<Long> arr = new ArrayList<>(Arrays.asList(1L, 2L, 3L, 4L, 5L, 6L));
        ArrayList<Long> result = new ArrayList<>(Arrays.asList(10L, 18L));
        assertEquals(result, minMaxSum.result(arr));
    }
}