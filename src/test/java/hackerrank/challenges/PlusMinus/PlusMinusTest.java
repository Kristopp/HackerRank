package hackerrank.challenges.PlusMinus;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
public class PlusMinusTest {
    @Test
    public void plusMinusTest() {
        PlusMinus plusMinus = new PlusMinus();
        Double positiveRatio = 0.500000;
        Double negativeRation = 0.333333;
        Double zeroRatio = 0.166667;

        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 1, 0, -1, -1));
        plusMinus.result(arr);

        System.out.println("Result.plusMinus(arr); " + plusMinus.result(arr));

        assertEquals((Double) positiveRatio, plusMinus.result(arr).get(0));
        assertEquals((Double) negativeRation, plusMinus.result(arr).get(1));
        assertEquals((Double) zeroRatio, plusMinus.result(arr).get(2));
    }

    @Test
    public void plusMinusTest2() {
        PlusMinus plusMinus = new PlusMinus();
        Double positiveRatio = 1.000000;
        Double negativeRation = 0.000000;
        Double zeroRatio = 0.000000;

        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1));
        plusMinus.result(arr);

        System.out.println("Result.plusMinus(arr); " + plusMinus.result(arr));

        assertEquals((Double) positiveRatio, plusMinus.result(arr).get(0));
        assertEquals((Double) negativeRation, plusMinus.result(arr).get(1));
        assertEquals((Double) zeroRatio, plusMinus.result(arr).get(2));
    }

}
