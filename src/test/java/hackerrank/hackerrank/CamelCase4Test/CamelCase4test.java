package hackerrank.hackerrank.CamelCase4Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import hackerrank.challenges.CamelCase4.Solution;

public class CamelCase4test {
    static String[] camelCase4Data = {
            "S;M;plasticCup()",
            "C;V;mobile phone",
            "C;C;coffee machine",
            "S;C;LargeSoftwareBook",
            "C;M;white sheet of paper",
            "S;V;pictureFrame"
    };

    static String[] solutionResult = {
            "plastic cup",
            "mobilePhone",
            "coffee machine",
            "large software book",
            "white sheet of paper()",
            "picture frame"
    };

    @Test
    public void camelCase4() {
        Solution solution = new Solution();
        solution.main(camelCase4Data);

        assertEquals(solution, solution);
    }

}
