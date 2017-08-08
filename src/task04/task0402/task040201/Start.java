package task04.task0402.task040201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Start {
    static String srcStringAuto = "Lorem ipsum dolor sit amet, consectetur.";
    static String dstStringAuto = "Lorem ..... dolor cons.......ur.";

    final static String[] menuList = {"MainWriteSerial menu:" +
            "\n[1] - Use existing Original and Replacement strings",
            "\n[2] - Input Original and Replacement strings",
            "\n[3] - Print Original and Replacement strings",
            "\n[0] - Exit"
    };
    final static Menu menu = new Menu(menuList);

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, IOException {

        while (true) {
            int choice = menu.userChoice();
            switch (choice) {
                case 1:
                    System.out.println("--info: Use existing String-Replacement");
                    System.out.println("Original string: " + srcStringAuto);
                    changeString(srcStringAuto,dstStringAuto);
                    System.out.println("Modified string: " + srcStringAuto);
                    break;
                case 2:
                    System.out.println("--info: Input String-Replacement");
                    String srcString = inputData("Please input Original string:");
                    String dstString = inputData("Please input Replacement string:");
                    System.out.println("Original string: " + srcString);
                    changeString(srcString,dstString);
                    System.out.println("Modified string: " + srcString);
                    break;
                case 3:
                    System.out.println("Original string   : " + srcStringAuto);
                    System.out.println("Replacement string: " + dstStringAuto);
                    break;
                case 4:
                    // FOR TEST
                    System.out.println("--info: TESTING mode");
                    showFieldsValueForString(srcStringAuto);
                    break;
                case 0:
                    System.out.println("-- Exit --");
                    System.exit(0);
            }
        }
    }

    private static void changeString(String srcString, String dstString) throws NoSuchFieldException, IllegalAccessException {
        char[] arrChar = dstString.toCharArray();

        Class strClazz = srcString.getClass();
        Field field = strClazz.getDeclaredField("value");

        field.setAccessible(true);
        field.set(srcString, arrChar);
        field.setAccessible(false);
    }

    private static String inputData(String message) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(message);
        return reader.readLine();
    }

    private static void showFieldsValueForString(String str) throws IllegalAccessException {
        Class clazz = str.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Class fieldType = field.getType();
            if (field.getName().equalsIgnoreCase("value")) {
                field.setAccessible(true);
                System.out.println("type: " + fieldType + "; name: " + field.getName() + "; value: " + field.get(str));
                // show as char[]
                System.out.println("char[]: " + Arrays.toString((char[])field.get(str)));
                // show as String
                System.out.print("string: ");
                for (char ch : (char[])field.get(str)) {
                    System.out.print(ch);
                }
            }
        }
    }
}
