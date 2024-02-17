package hackerrank.hackerrank.TimeConversion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import hackerrank.challenges.TimeConversion.TimeConversion;

public class TimeConversionTest {
    @Test
    public void convertTimeTest() {
        String inputTimeStr = "07:05:45PM";
        String outputTimeStr = "19:05:45";
        assertEquals(outputTimeStr, TimeConversion.convertTime(inputTimeStr));
    }

}