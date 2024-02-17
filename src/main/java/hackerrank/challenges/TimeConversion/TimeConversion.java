package hackerrank.challenges.TimeConversion;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// https://www.hackerrank.com/challenges/three-month-preparation-kit-time-conversion/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-one

public class TimeConversion {

    // sample input 07:05:45PM

    // sample output 19:05:45 time format

    public String result(String inputTimeStr) {
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("hh:mm:ssa", Locale.US);
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime time = LocalTime.parse(inputTimeStr, inputFormat);
        String outputTimeStr = time.format(outputFormat);

        return outputTimeStr;
    }
}
