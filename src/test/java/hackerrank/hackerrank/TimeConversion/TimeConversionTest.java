package hackerrank.hackerrank.TimeConversion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Time;

import org.junit.jupiter.api.Test;

import hackerrank.challenges.TimeConversion.TimeConversion;

public class TimeConversionTest {

    @Test
    public void convertTimeTest() {
        TimeConversion timeConversion = new TimeConversion();
        String inputTimeStr = "07:05:45PM";
        String outputTimeStr = "19:05:45";
        assertEquals(outputTimeStr, timeConversion.result(inputTimeStr));
    }

}