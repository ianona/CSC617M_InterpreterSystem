package sample;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Utilities {
    /* Checks if a String is empty ("") or null. */
    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

    /* Counts how many times the substring appears in the larger string. */
    public static int countMatches(String text, String str) {
        if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }

        Matcher matcher = Pattern.compile(str).matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public static int operandCount(String curVal){
        if (curVal.contains("-")) return Arrays.stream(curVal.split("-")).filter(elem -> !elem.isEmpty()).collect(Collectors.toList()).size();
        else if (curVal.contains("+")) return Arrays.stream(curVal.split("\\+")).filter(elem -> !elem.isEmpty()).collect(Collectors.toList()).size();
        else if (curVal.contains("/")) return Arrays.stream(curVal.split("/")).filter(elem -> !elem.isEmpty()).collect(Collectors.toList()).size();
        else return Arrays.stream(curVal.split("\\*")).filter(elem -> !elem.isEmpty()).collect(Collectors.toList()).size();
    }
}
