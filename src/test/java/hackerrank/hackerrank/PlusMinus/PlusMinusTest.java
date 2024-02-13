package hackerrank.hackerrank.PlusMinus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import hackerrank.challenges.PlusMinus.PlusMinus;

public class PlusMinusTest {
    @Test
    public void plusMinusTest() {
        Double positiveRatio = 0.500000;
        Double negativeRation = 0.333333;
        Double zeroRatio = 0.166667;

        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 1, 0, -1, -1));
        PlusMinus.plusMinus(arr);

        System.out.println("Result.plusMinus(arr); " + PlusMinus.plusMinus(arr));

        assertEquals((Double) positiveRatio, PlusMinus.plusMinus(arr).get(0));
        assertEquals((Double) negativeRation, PlusMinus.plusMinus(arr).get(1));
        assertEquals((Double) zeroRatio, PlusMinus.plusMinus(arr).get(2));
    }

    @Test
    public void plusMinusTest2() {

        Double positiveRatio = 1.000000;
        Double negativeRation = 0.000000;
        Double zeroRatio = 0.000000;

        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1));
        PlusMinus.plusMinus(arr);

        System.out.println("Result.plusMinus(arr); " + PlusMinus.plusMinus(arr));

        assertEquals((Double) positiveRatio, PlusMinus.plusMinus(arr).get(0));
        assertEquals((Double) negativeRation, PlusMinus.plusMinus(arr).get(1));
        assertEquals((Double) zeroRatio, PlusMinus.plusMinus(arr).get(2));
    }

}
