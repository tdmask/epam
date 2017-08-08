package temp.task0302_old1;

public class Spreadsheet {

    private static String separatorLine = "----";
    private static int length = 31;

    private static String[] header = {"Company", "Board No", "Flight No", "Destination", "Time", "Day"};

    public static void printHeader() {
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.print(separatorLine);
        }
        System.out.println();
        for (String s : header) {
            System.out.printf("%20s", s);
        }
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.print(separatorLine);
        }
        System.out.println();
    }

    public static void printBottomLine() {
        for (int i = 0; i < length; i++) {
            System.out.print(separatorLine);
        }
    }
}
