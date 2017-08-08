package task04.task0403.task040301;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int capacity = inputInt("Please input Capacity of List/Set (int):");
        int startRange = inputInt("Please input start Number for the Range (int):");
        int endRange = inputInt("Please input end Number for the Range (int):");

        System.out.println("-- [ Result ] --");
        System.out.println("List  :" + ListSetGenerator.randomList(capacity,startRange,endRange));
        System.out.println("Set   :" + ListSetGenerator.randomSet(capacity,startRange,endRange));

    }

    public static int inputInt(String message) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int k = 0;
        while (true) {
            try {
                System.out.println(message);
                k = Integer.parseInt(reader.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("It is not a valid number");
            }
        }
            return k;
    }
}
