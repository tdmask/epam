package task01.task0101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--[ Pyramid building ]--");
        System.out.println("Pleas input the height of the pyramid (1-9): ");
        int input = Integer.parseInt(reader.readLine());
        if (input>=1 && input<=9) {
            int spaceNumber = input;
            for (int i = 1; i <= input; i++) {
                printSpace(spaceNumber);
                for (int j = 1; j < i; j++) {
                    System.out.print(j);
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
                spaceNumber--;
                System.out.println();
            }
        } else {
            System.out.println("Incorrect value! Exit..");
        }
    }

    public static void printSpace(int spaceNumber) {
        for (int k = 1; k <= (spaceNumber - 1); k++) {
            System.out.print(" ");
        }
    }
}
