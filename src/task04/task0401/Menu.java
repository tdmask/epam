package task04.task0401;

import java.util.Scanner;

public class Menu {

    public Menu(String[] listMenu) {
        this.listMenu = listMenu;
    }

    private final String[] listMenu;

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
        int LENGTH = 31;
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
