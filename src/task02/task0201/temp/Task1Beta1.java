package task02.task0201.temp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Task1Beta1 {
    public static void main(String[] args) throws IOException {
        final int NUMBER_OF_STRINGS = 4;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


//        init Strings for TEST
/*

        String[] textStrings = new String[]{
                "Lorem ipsum 0.5 dolor45 sit 3 amet, ",
                "consectetur7. 100 adipiscing elit, ",
                "sed do 14,56 eiusmod tempor incididunt",
                "ut labore et 26, 11 dolore 2magna7 aliqua."
        };

*/

//        SUM = 44,
        String textStringsTest = "10 Lorem 1, 77 ipsum 4.2 dolor33 sit 1. 10  2,44 amet, 10, 4consectetur88 (10) adipiscing elit, 1";
        String text1, text0;

        System.out.println(textStringsTest);

/*
        String[] textStrings = new String[NUMBER_OF_STRINGS];
        System.out.println("Please input " + NUMBER_OF_STRINGS + " textStrings:");
        for (int i = 0; i < textStrings.length; i++) {
            String str = reader.readLine();
            textStrings[i] = str;
        }
*/
/*
        for (String string : textStrings) {
            System.out.println(string);
        }
        */

        /*
        Pattern p1 = Pattern.compile("sit");
        Matcher m1 = p1.matcher(textStringsTest);
        while (m1.find()) {
            text1 = m1.group();
            System.out.println("-- Result: --");
            System.out.println("'" + text1 + "'" + " found from " + m1.start() + " to " + m1.end());
        }
*/

//        Pattern = Pattern.compile("(\\s+[\\d]+\\s+)|([\\d]+[.]+\\s+)");
//        Pattern p0 = Pattern.compile("[\\d]+");
//        Pattern p0 = Pattern.compile("(\\d+\\.\\d+)|(\\d+\\,\\d+)|([a-zA-Z]+\\d+)|(\\d+[a-zA-Z]+)");
//        Pattern p0 = Pattern.compile("\\-?\\d+([.,]\\d{0,})?");
//        Pattern p0 = Pattern.compile("([^.,\\w]\\d+[^.,\\w])|(\\d+[.,][^\\d])|(\\s\\d+$)|(^\\s*\\d+)");

//        Pattern p0 = Pattern.compile("([^.,a-zA-Z]\\d+[^.,a-zA-Z])|(\\d+[.,][^\\d+])|(\\s\\d+$)|(^\\s*\\d+)");

        Pattern p1 = Pattern.compile("(^[^.,a-zA-Z][\\d]+[^.,a-zA-Z]$)|^(\\d+[.,]$)|(^\\d+$)");

        new ParsingBeta1(p1,textStringsTest).parse();

/*

        int sum=0;

        for (String string : textStrings) {
            sum = sum + new ParsingBeta1(p0, string).parse();
        }

        System.out.println("Total amount: " + sum);
        */
    }

}
