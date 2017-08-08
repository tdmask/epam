package task04.task0403.task040302;

import java.util.ArrayList;
import java.util.Scanner;

class MenuHeader {

    public MenuHeader(ArrayList<String> listMenu) {
        this.listMenu = listMenu;
    }

    private final ArrayList<String> listMenu;

    public int userChoice() {
        Scanner scan = new Scanner(System.in);
        printMenu();
        try {
            return scan.nextInt();
        } catch (Exception e) {
            System.out.println("--info: Incorrect choice, please try again!");
            return -1;
        }
    }

    private void printMenu() {
        System.out.println();
        String LINE = "====";
        int LENGTH = 22;
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(LINE);
        }
        System.out.println();
        for (String menuItem : this.listMenu) {
            System.out.print(menuItem);
        }
        System.out.println();
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(LINE);
        }
        System.out.println();
    }

}
