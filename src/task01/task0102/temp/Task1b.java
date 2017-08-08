package task01.task0102.temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task1b {
    public static void main(String[] args) throws IOException {

        final byte SIZE = 4;
        byte[][] array = new byte[SIZE][SIZE];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--[ (byte) Matrix. Min value swap with Exact element ]--\n");
        int iTarget = (int) (Math.random() * SIZE);
        int jTarget = (int) (Math.random() * SIZE);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                array[i][j] = (byte) (Math.random() * 20);
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
            swapRows(array, iTarget, iMin);
        }

//      swap columns
        if (jTarget!=jMin) {
            swapColumns(array, jTarget, jMin);
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

    public static void swapRows(byte[][] array, int src, int dst) {

        for (int j = 0; j < array.length; j++){
            byte temp = array[src][j];
            array[src][j] = array[dst][j];
            array[dst][j] = temp;
        }
    }

    public static void swapColumns(byte[][] array, int src, int dst) {

        for (int i = 0; i < array.length; i++){
            byte temp = array[i][src];
            array[i][src] = array[i][dst];
            array[i][dst] = temp;
        }

    }

}

