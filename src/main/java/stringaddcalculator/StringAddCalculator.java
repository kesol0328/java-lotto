package stringaddcalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    private static final Pattern pattern = Pattern.compile("//(.)\n(.*)");
    private static final int ZERO = 0;

    public int splitAndSum(String inputString) {
        if (isNullOrEmpty(inputString)) {
            return ZERO;
        }
        return sum(inputString);
    }

    private boolean isNullOrEmpty(String inputString) {
        if (inputString == null || inputString.equals("")) {
            return true;
        }
        return false;
    }

    private int sum(String inputString) {
        int result = 0;
        for (String splitNumber : this.splitString(inputString)) {
            result += checkNegative(Integer.parseInt(splitNumber));
        }
        return result;
    }

    private String[] splitString(String inputString) {
        Matcher m = pattern.matcher(inputString);
        if (m.find()) {
            String customDelimiter = m.group(1);
            return m.group(2).split(customDelimiter);
        }
        return inputString.split(",|:");
    }

    private int checkNegative(int checkNumber) {
        if(checkNumber < 0) {
            throw new RuntimeException("음수는 입력 불가능합니다.");
        }
        return checkNumber;
    }
}
