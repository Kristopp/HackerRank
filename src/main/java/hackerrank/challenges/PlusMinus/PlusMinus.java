package hackerrank.challenges.PlusMinus;

import java.util.*;

public class PlusMinus {

    // https://www.hackerrank.com/challenges/three-month-preparation-kit-plus-minus/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-one
    public List<Double> result(List<Integer> arr) {

        int positive = 0;
        int negative = 0;
        int zero = 0;

        List<Double> ratios = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                positive++;
            } else if (arr.get(i) < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        String positiveRatioStr = String.format("%.6f", (double) positive / arr.size());
        String negativeRatioStr = String.format("%.6f", (double) negative / arr.size());
        String zeroRatioStr = String.format("%.6f", (double) zero / arr.size());

        // System.out.println("positiveRatioStr: " + positiveRatioStr);
        // System.out.println("negativeRatioStr: " + negativeRatioStr);
        // System.out.println("zeroRatioStr: " + zeroRatioStr);

        ratios.add(Double.parseDouble(positiveRatioStr));
        ratios.add(Double.parseDouble(negativeRatioStr));
        ratios.add(Double.parseDouble(zeroRatioStr));

        // System.out.println("ratios: " + ratios);

        return ratios;
    }
}
