package task02.task0201.temp;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsingBeta1 {
    Pattern pat;
    String textString;

    ParsingBeta1(Pattern pat, String textString) {
        this.pat = pat;
        this.textString = textString;
    }

    public int parse() {
        int sum = 0;
        Matcher m0 = pat.matcher(textString);
        while (m0.find()) {
            String text0 = m0.group();
            String str = text0.replaceAll("[^\\d]", "");
            System.out.println("--test: '" + text0 + "'" + " -> '" + str + "' position: [" + m0.start() + "] to [" + m0.end
                    () +
                    "]");
            sum = sum + Integer.parseInt(str);
        }

        System.out.println("--testing: Total: " + sum);
        return sum;

    }

}
