package hackerrank.hackerrank.BreakingRecords;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import hackerrank.challenges.BreakingRecords.BreakingRecords;

public class breakingRecordsTest {
    List<Integer> scoresTest = Arrays.asList(12, 24, 13, 8, 15);

    @Test
    public void breakingRecords() {
       
        BreakingRecords breakingRecords = new BreakingRecords();
        List<Integer> result = breakingRecords.result(scoresTest);
        assertEquals(8, result.get(0));
        assertEquals(24, result.get(1));
    }
}
