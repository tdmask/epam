package task03.task0301;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ShopController {

    private Shop firstShop = new Shop();
    private final MenuHeader menuMain = new MenuHeader(menuListForShop);
    private static final ArrayList<String> menuListForShop = new ArrayList<>(
            Arrays.asList("MainWriteSerial menu for Shop: ",
                    "\n[1] - list all Depts    ",
                    "\t[2] - add new Depts (auto fill) ",
                    "\t[3] - add new Dept      ",
                    "\n[7] - search Dept by NAME|PRODUCT|SERVICE|LOCATION",
                    "\n[0] - Exit"));

    public void start() throws IOException {

        while (true) {
            int choice = menuMain.userChoice();
            switch (choice) {
                case 1:
                    firstShop.printDepts();
                    break;
                case 2:
                    System.out.println("--info: adding new Departments (auto)...");
                    firstShop.addRandomDepts();
                    System.out.println("--info: successfully added departments. Now we have " + firstShop.getQtyDepts() +
                            ".");
                    break;
                case 3:
                    System.out.println("--info: adding new Department...");
                    firstShop.addDept();
                    break;
                case 7:
                    System.out.println("--info: searching...");
                    SelectionQuery.searchInDepartments(firstShop);
                    break;
                case 0:
                    System.out.println("-- Shop Business closed --");
                    System.exit(0);
            }
        }
    }
}
