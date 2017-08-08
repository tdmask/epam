package task02.task0202;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parsing {

    public static void parseText(String[] strs, String regExp) {
        Matcher m;
        Pattern p = Pattern.compile(regExp);

        for (String s : strs) {
            m = p.matcher(s);
            System.out.println("\nsource string: '" + s + "'");
            while (m.find()) {
                String text = m.group();
                System.out.println("match, position[" + m.start() + "-" + m.end() +"]\t:" + text);
            }
        }

    }

}
