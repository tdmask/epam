package task03.task0301;

public class Spreadsheet {

    private static final String LINE = "----";
    private static final int LENGTH = 22;
    private static final String[] headerDepartment = {"Name", "Product", "Service", "Location"};

    public static void printHeader() {
        System.out.println();
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(LINE);
        }
        System.out.println();
        for (String s : headerDepartment) {
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
