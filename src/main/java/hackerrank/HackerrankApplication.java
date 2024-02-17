package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hackerrank.challenges.MinMaxSum.MinMaxSum;
import hackerrank.challenges.PlusMinus.PlusMinus;
import hackerrank.challenges.TimeConversion.TimeConversion;

@SpringBootApplication
public class HackerrankApplication {

	static List<Integer> plusMinusData = new ArrayList<>(Arrays.asList(1, 1, 1, 0, -1, -1));
	static List<Long> minMaxData = new ArrayList<>(Arrays.asList(1L, 2L, 3L, 4L, 5L, 6L));
	static String timeConversionData = "07:05:45PM";

	public static void main(String[] args) {
		SpringApplication.run(HackerrankApplication.class, args);
					// PlusMinus.plusMinus(plusMinusData);
					// MinMaxSum.minMaxSum(minMaxData);
		TimeConversion.convertTime(timeConversionData);

	}

}
