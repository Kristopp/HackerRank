package hackerrank.challenges.CamelCase4;

import java.util.Arrays;
import java.util.Scanner;

import lombok.experimental.var;

// https://www.hackerrank.com/challenges/three-month-preparation-kit-camel-case/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-one

// first check what will be the first letters

/*
 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
 * class should be named Solution.
 */
//

// args: S;M;plasticCup()
// args: C;V;mobile phone
// args: C;C;coffee machine
// args: S;C;LargeSoftwareBook
// args: C;M;white sheet of paper

/* plastic cup

mobilePhone

CoffeeMachine

large software book

whiteSheetOfPaper()

picture frame */
public class Solution {
    static String METHOD = "M";
    static String VARIABLE = "V";
    static String CLASS = "C";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] splitString = s.split(";");
            String result = "";

            if (splitString[0].equals("S")) {
                result = splitToString(splitString[2], splitString[1]);
                System.out.println(result);
            } else if (splitString[0].equals("C")) {
                result = combineToCamelCase(splitString[2], splitString[1]);
                System.out.println(result);
            }
        }

        scanner.close();
    }

    private static String splitToString(String s, String type) {
        String result = "";
        String[] words = s.split("(?=[A-Z])");

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            // Remove parentheses at the end of the word
            if (word.endsWith("()")) {
                word = word.substring(0, word.length() - 2);
            }
            result += word + " ";
        }

        // remove part of the end of the string
        if (type.equals(METHOD)) {
            result = result.substring(0, result.length() - 1);
        }

        return result.trim();
    }

    private static String combineToCamelCase(String s, String type) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder(words[0]);

        for (int i = 1; i < words.length; i++) {
            result.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1));
        }

        if (type.equals(CLASS)) {
            result.setCharAt(0, Character.toUpperCase(result.charAt(0)));
        }

        if (type.equals(VARIABLE)) {
            result.setCharAt(0, Character.toLowerCase(result.charAt(0)));
        }

        if (type.equals(METHOD)) {
            result.append("()");
        }

        return result.toString();
    }

}
