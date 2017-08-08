package task03.task0301;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class SelectionQuery {

    private static final ArrayList<String> menuListForDepartmentSearch =
            new ArrayList<>(Arrays.asList("Searching Departments in the Shop: ",
                            "\n[1]-by NAME ",
                            "\t[2]-by PRODUCT (n/a)",
                            "\t[3]-by SERVICE (n/a)",
                            "\t[4]-by LOCATION (n/a)",
                            "\n[0]-Exit"));
    private static final MenuHeader menuDepartment = new MenuHeader(menuListForDepartmentSearch);

    public static void searchInDepartments(Shop shopForSearch) throws IOException {
//        shopForSearch.printDepts();
        boolean isWorking = true;   // isWorking is needed to return to MAIN MENU
        while (isWorking) {
            int  choice = menuDepartment.userChoice();
            switch (choice) {
                case 1:
                    System.out.println("--info: searching by NAME");
                    shopForSearch.searchByDeptName();
                    break;
                case 2:
                    System.out.println("--info: searching by PRODUCT (not released yet)");
                    break;
                case 3:
                    System.out.println("--info: searching by SERVICE (not released yet)");
                    break;
                case 4:
                    System.out.println("--info: searching by LOCATION (not released yet)");
                    break;
                case 0:
                    System.out.println("-- Exit from searching --");
                    isWorking = false;
                    break;
            }
        }
    }

}
