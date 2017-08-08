package task01.task0102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task1 {
    public static void main(String[] args) throws IOException {

        final byte SIZE = 7;
        byte[][] array = new byte[SIZE][SIZE];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--[ (byte) Matrix. Min value swap with Exact element ]--\n");
        int iTarget = (int) (Math.random() * SIZE);
        int jTarget = (int) (Math.random() * SIZE);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                array[i][j] = (byte) (Math.random() * 256);
            }
        }

        printArray(array);

        int iMin = 0;
        int jMin = 0;
        int min = array[iMin][jMin];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                    iMin = i;
                    jMin = j;
                }
            }
        }

        System.out.println("\nElement for exchange (random) ["+iTarget+"]["+jTarget+"] : " + array[iTarget][jTarget]);
        System.out.println("Minimal value ["+iMin+"]["+jMin+"]: " + min);

//      swap rows
        if (iTarget!=iMin) {
            for (int j = 0; j < SIZE; j++){
                byte temp = array[iTarget][j];
                array[iTarget][j] = array[iMin][j];
                array[iMin][j] = temp;
            }
        }

//      swap columns
        if (jTarget!=jMin) {
            for (int i = 0; i < SIZE; i++){
                byte temp = array[i][jTarget];
                array[i][jTarget] = array[i][jMin];
                array[i][jMin] = temp;
            }
        }
        System.out.println("\n[ Result: ]");
        System.out.println();
        printArray(array);
    }

    public static void printArray(byte[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.format("%5d ", array[i][j]);
            }
            System.out.println();
        }
    }

}

