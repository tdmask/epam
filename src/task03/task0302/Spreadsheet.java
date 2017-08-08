package task03.task0302;

public class Spreadsheet {

    private static final String LINE = "----";
    private static final int LENGTH = 31;

    private static final String[] header = {"Company", "Board No", "Flight No", "Destination", "Time", "Day"};

    public static void printHeader() {
        System.out.println();
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(LINE);
        }
        System.out.println();
        for (String s : header) {
            System.out.printf("%20s", s);
        }
        System.out.println();
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(LINE);
        }
        System.out.println();
    }

    public static void printBottomLine() {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(LINE);
        }
    }
}
