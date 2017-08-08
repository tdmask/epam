package task02.task0202.temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        String regExp;
        regExp = "\\{[0-9,A-Z]*\\}";

        String[] srcTextTest = {"{aaA} {A94} ppp{45} [444]{tt}",
                "{ }    {pP45} {BBBZZ}",
                "9696 { 86968} {75-69} {777AABB}",
                ""};

        for (String s : srcTextTest) {
            System.out.println(s);
        }
 /*
        regExp = inputRegexp();
        while (!ifRegexpCorrect(regExp)){
            regExp = inputRegexp();
        };
*/

        /*
        String[] srcText = inputString();

        for (String s : srcText) {
            System.out.println(s);
        }
        */

        System.out.println("\n[----- OUTPUT -----]\nRegular expression: '" + regExp + "'");
        Parsing.parseText(srcTextTest,regExp);

    }


        public static String[] inputText () throws IOException {
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

        public static String inputRegexp() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please input REGEX '{' 0-9 or A-Z '}' :");
            return reader.readLine();
        }

        public static String correctionRegexp(String regExp){


        return regExp;
        }

        public static boolean ifRegexpCorrect(String regExp) {
            if ((regExp.startsWith("{")) && (regExp.endsWith("}"))){
                System.out.println("regExp is correct");
                return true;
            } else {
                System.out.println("regExp is not correct. Please start with '{' then <regular expression> and finish" +
                        " with '}'. Example: {[A95]+}");
                return false;
            }
        }
    }
