package task02.task0201.temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task1ver01 {
    public static void main(String[] args) throws IOException {
        final int NUMBER_OF_STRINGS = 4;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] textStrings = new String[]{
                "Lorem ipsum 0.5 dolor45 sit 3 amet, ",
                "consectetur7. 100 adipiscing elit, ",
                "sed do 14,56 eiusmod tempor incididunt",
                "ut labore et 26, 11 dolore 2magna7 aliqua."
        };

// Test String: SUM = 127
        System.out.println("===== TEST =====");
        String textStringsTest = "10 Lorem 1, 77 ipsum 7 4.2 dolor33 sit 1. 10  2,44  145,444 amet, 10, " +
                "4consectetur88 99abc999. (10) adipiscing elit, 1";
        System.out.print("Source string (test):\t" + textStringsTest);

// parsing Stage 01+02
        int sum = parseAndSumAllDigits(splitBySpace(textStringsTest));
        System.out.println("\n--result: Grand Total Amount (TEST) = " + sum);

// Production String

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

//  Pattern p2 = Pattern.compile("([^.,a-zA-Z][\\d]+[^.,a-zA-Z])|(\\d+[.,]$)|(^\\d+[^.,a-zA-Z]+)|(^\\d+$)"); // BAD

//        Pattern p2 = Pattern.compile("(^[^.,a-zA-Z][\\d]+[^.,a-zA-Z]$)"); //(10) --> OK
//        Pattern p2 = Pattern.compile("^(\\d+[.,]$)"); // 1, 1. 10, --> OK
//        Pattern p2 = Pattern.compile("^\\d+[^.,a-zA-Z]+$"); // 10 77 10 --> not enough
//        Pattern p2 = Pattern.compile("(^\\d+$)"); // 10 77 7 10 1 --> OK

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
}
