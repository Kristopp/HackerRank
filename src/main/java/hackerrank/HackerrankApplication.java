package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hackerrank.challenges.PlusMinus.PlusMinus;

@SpringBootApplication
public class HackerrankApplication {

	static List<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 1, 0, -1, -1));

	public static void main(String[] args) {
		SpringApplication.run(HackerrankApplication.class, args);
		PlusMinus.plusMinus(arr);


	}

}
