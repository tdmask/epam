package task02.task0201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) throws IOException {

// Test String: SUM = 127
        System.out.println("===== TEST =====");
        String textStringsTest = "10 Lorem 1, 77 ipsum 7 4.2 dolor33 sit 1. 10  2,44  145,444 amet, 10, " +
                "4consectetur88 99abc999. (10) adipiscing elit, 1";
        System.out.print("Source string (test):\t" + textStringsTest);

// parsing Stage 01+02
        int sum = parseAndSumAllDigits(splitBySpace(textStringsTest));
        System.out.println("\n--result: Grand Total Amount (TEST) = " + sum);

// Production String
        // input a few Strings via inputString();
        String[] textStrings = inputText();
        System.out.print("===== PRODUCTION =====");
        sum = 0;
        for (String s2 : textStrings) {
            System.out.print("\nSource string\t\t:\t" + s2);
            sum = sum + parseAndSumAllDigits(splitBySpace(s2));
        }
        System.out.println("\n--result: Grand Total Amount(PRODUCTION) = " + sum);

    }

    public static int parseAndSumAllDigits(String[] str) {
// parsing Stage-02
        int sum = 0;
        Matcher m;
        Pattern p2 = Pattern.compile("(^[^.,a-zA-Z][\\d]+[^.,a-zA-Z]$)|^(\\d+[.,]$)|(^\\d+$)");

        String text2;
//        System.out.println("\n--info: stage #02 'ParsingBeta1 with REGEX'");
        System.out.print("\nDigits for SUM\t\t:\t");
        for (String s1 : str) {
            m = p2.matcher(s1);
            while (m.find()) {
                text2 = m.group();
                System.out.print("'" + text2 + "' ");
//remove all symbols except digits
                String strFinal = text2.replaceAll("[^\\d]", "");
                sum = sum + Integer.parseInt(strFinal);
            }
        }

        return sum;
    }

    public static String[] splitBySpace(String str) {
        Pattern p1 = Pattern.compile("\\s");
        String s[] = p1.split(str);
//        System.out.println("--info: stage #01 'Splitting'");
        System.out.print("\nSplit by SPACE\t\t:\t");
        for (String s1 : s) {
            System.out.print("'" + s1 + "' ");
        }
        return s;
    }

    public static String[] inputText() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k;
        while(true) {
            try {
                System.out.println("Please input NUMBER of strings (ended by ENTER): ");
                k = Integer.parseInt(reader.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input is not a valid number");
            }
        }
        String[] strs = new String[k];
        System.out.println("Please enter text (" + k + ") strings");
        for (int i = 0; i < strs.length; i++) {
            strs[i] = reader.readLine();
        }
        return strs;
    }
}
