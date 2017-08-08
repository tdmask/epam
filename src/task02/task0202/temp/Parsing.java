package task02.task0202.temp;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parsing {

    public static void parseText(String[] strs, String regExp) {
//        System.out.println("--info: start parsing...");
        Matcher m;
//        System.out.println("--info: Pattern.compile(regExp)");
        Pattern p = Pattern.compile(regExp);

        for (String s : strs) {
            m = p.matcher(s);
            System.out.println("\nsource string: '" + s + "'");
            while (m.find()) {
                String text = m.group();
//                System.out.println("string:'" + s + "'\t-> match:'" + text + "'" + " -> Position: ["
//                        + m.start() + "] " +m.end() + "]");
//                System.out.println("match: " + text);
                System.out.println("match, position[" + m.start() + "-" + m.end() +"]\t:" + text);
            }
        }

    }

}
