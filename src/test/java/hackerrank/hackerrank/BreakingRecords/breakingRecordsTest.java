package hackerrank.hackerrank.BreakingRecords;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import hackerrank.challenges.BreakingRecords.BreakingRecords;

public class breakingRecordsTest {
    List<Integer> scoresTest = Arrays.asList(12, 24, 11, 8, 15);
    List<Integer> scoresTest2 = Arrays.asList(12, 24, 10, 24);
    List<Integer> scoresTest3 = Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1);

    @Test
    public void breakingRecords() {
        BreakingRecords breakingRecords = new BreakingRecords();
        List<Integer> result = Arrays.asList(1, 2);
        List<Integer> result2 = Arrays.asList(1, 1);
        List<Integer> result3 = Arrays.asList(2, 4);
        assertEquals(result, breakingRecords.result(scoresTest));
        assertEquals(result2, breakingRecords.result(scoresTest2));
        assertEquals(result3, breakingRecords.result(scoresTest3));
    }
}
