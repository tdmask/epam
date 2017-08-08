package task02.task0202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        String regExp;
        regExp = "\\{([0-9]*|[A-Z]*)\\}";
        String[] srcText = inputText();
        System.out.println("\nYour text:");
        for (String s : srcText) {
            System.out.println(s);
        }

        System.out.println("\n[----- OUTPUT -----]\nRegular expression: '" + regExp + "'");
        Parsing.parseText(srcText, regExp);
    }

    public static String[] inputText() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k;
        while (true) {
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