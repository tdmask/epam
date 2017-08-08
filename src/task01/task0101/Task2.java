package task01.task0101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--[ Searching perfect numbers in the sequence 1 .. N ]--");
        System.out.println("Please input N : ");
        int number = Integer.parseInt(reader.readLine());
        System.out.println("your Number is " + number);

        for (int i = 1; i <= number; i++) {
//            if ((i%10_000) == 0) System.out.println(i);
            int sum = 0;
            for (int j = 1; j < i; j++) {
//                System.out.print("iter" + i + "" + j + ":");
                if (i % j == 0) {
                    sum = sum + j;
//                    System.out.print("for boardNumber " + i + " divider = " + j + "; ");
//                    System.out.print("sum = " + sum);
                }
//                System.out.println();
            }

            if (i == sum) {
                System.out.println("perfect Number is " + i);
            }

        }

    }
}
