package task03.task0301;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Shop {

    private final ArrayList<Department> listDepartments = new ArrayList<>();

    public void printDepts() {
        if (listDepartments.size() != 0) {
            Spreadsheet.printHeader();
            for (Department listDepartment : listDepartments) {
                System.out.println(listDepartment);
            }
            Spreadsheet.printBottomLine();
        } else {
            System.out.println("There is no data!");
        }
    }

    public void addRandomDepts() {
        listDepartments.add(new Department("Auto", "Cars", "Painting cars", "floor 1"));
        listDepartments.add(new Department("Avia", "Models of plane", "Assembling", "floor 2, backyard"));
        listDepartments.add(new Department("Jewellery", "Gold rings", "Purchasing", "floor 3"));
        listDepartments.add(new Department("Books", "Best sellers", "Purchasing", "floor 5"));
        listDepartments.add(new Department("IT", "Computers", "Service", "floor 4"));
    }

    public void addDept() throws IOException {
        new Department().addDept();
    }

    public int getQtyDepts() {
        return listDepartments.size();
    }

    public void searchByDeptName() throws IOException {
        boolean isEmpty = true;
        String nameForSearch = new Department().inputDeptData("Please enter Department NAME:");
        System.out.println("--info: Qty of Depts for searching = " + this.listDepartments.size());
        System.out.print("Result:");
        Spreadsheet.printHeader();
        for (Department dept : listDepartments) {
            if (nameForSearch.equalsIgnoreCase(dept.name)) {
                System.out.println(dept);
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("There is no data for your request!");
        }
        Spreadsheet.printBottomLine();
    }


    private class Department {
        String name;
        String product;
        String service;
        String location;

        private Department() {
        }

        private Department(String name, String product, String service, String location) {
            this.name = name;
            this.product = product;
            this.service = service;
            this.location = location;
        }

        @Override
        public String toString() {
            return String.format("%20s%20s%20s%20s", name, product, service, location);
        }

        private void addDept() throws IOException {
            this.name = inputDeptData("Please input name of Department: ");
            this.product = inputDeptData("Please input product for Department: ");
            this.service = inputDeptData("Please input service for Department:: ");
            this.location = inputDeptData("Please input location for Department:: ");
            listDepartments.add(this);
        }

        private String inputDeptData(String message) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(message);
            return reader.readLine();
        }

    }

}
