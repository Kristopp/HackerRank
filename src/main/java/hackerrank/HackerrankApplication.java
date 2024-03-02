package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import hackerrank.challenges.BreakingRecords.BreakingRecords;
import hackerrank.challenges.CamelCase4.Solution;
import hackerrank.challenges.MinMaxSum.MinMaxSum;
import hackerrank.challenges.PlusMinus.PlusMinus;
import hackerrank.challenges.TimeConversion.TimeConversion;

@SpringBootApplication
public class HackerrankApplication {

	List<Integer> plusMinusData = new ArrayList<>(Arrays.asList(1, 1, 1, 0, -1, -1));
	List<Long> minMaxData = new ArrayList<>(Arrays.asList(1L, 2L, 3L, 4L, 5L, 6L));
	List<Integer> breakingRecordsData = Arrays.asList(12, 24, 13, 8, 15);
	String timeConversionData = "07:05:45PM";
	static String[] camelCase4Data = {
			"S;M;plasticCup()",
			"C;V;mobile phone",
			"C;C;coffee machine",
			"S;C;LargeSoftwareBook",
			"C;M;white sheet of paper",
			"S;V;pictureFrame"
	};

	public static void main(String[] args) {

		// PlusMinus plusMinus = new PlusMinus();
		// MinMaxSum minMaxSum = new MinMaxSum();
		// TimeConversion timeConversion = new TimeConversion();
		// BreakingRecords breakingRecords = new BreakingRecords();

		// // PlusMinus
		// System.out.println("PlusMinus: " + plusMinus.result(Arrays.asList(1, 1, 1, 0,
		// -1, -1)));

		// // MinMaxSum
		// System.out.println("MinMaxSum: " + minMaxSum.result(Arrays.asList(1L, 2L, 3L,
		// 4L, 5L, 6L)));

		// // TimeConversion
		// System.out.println("TimeConversion: " + timeConversion.result("07:05:45PM"));

		// // BreakingRecords
		// System.out.println("BreakingRecords: " +
		// breakingRecords.result(Arrays.asList(12, 24, 13, 8, 15)));

		// CamelCase4
		// Solution.main(camelCase4Data);
	}

}
