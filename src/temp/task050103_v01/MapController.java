package temp.task050103_v01;

import java.util.Map;

public class MapController {


    public static void writeByThreads(Map<Integer, String> map, int numberElements, int numberOfThreads) {

        Thread[] threads = new Thread[numberOfThreads];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Writer(map, numberElements, i, numberOfThreads));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void readByThreads(Map<Integer, String> map, int numberOfThreads) {
        Thread[] threads = new Thread[numberOfThreads];
        int start = 0;
        int end = 0;
        int offset = map.size() / numberOfThreads;

        for (int i = 0; i < numberOfThreads; i++) {
            start = i * offset;
            end = start + offset - 1;
            if (i != numberOfThreads - 1) {
                threads[i] = new Thread(new Reader(map, start, end));
            } else {
                threads[i] = new Thread(new Reader(map, start, end));
            }
        }

        for (Thread thread : threads) {
            thread.start();
        }
/*
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
    }

    public static void writeReadByThreads(Map<Integer, String> map, int numberElements, int numberOfThreads) throws InterruptedException {
        Thread[] readThreads = new Thread[numberOfThreads];
        Thread[] writeThreads = new Thread[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            writeThreads[i] = new Thread(new Writer(map, numberElements, i, numberOfThreads));

        }

        for (int i = 0; i < numberOfThreads; i++) {
            readThreads[i] = new Thread(new Reader(map, 0, map.size()));
        }

        for (Thread writeThread : writeThreads) {
            writeThread.start();
        }

        for (Thread readThread : readThreads) {
            readThread.start();
        }

        for (Thread writeThread : writeThreads) {
            writeThread.join();
        }

        for (Thread readThread : readThreads) {
            readThread.join();
        }

    }

    public static void printSizeMap(Map<Integer, String> map) {
        System.out.println("type: " + map.getClass().getName() + "\nsize: " + map.size());

    }

    public static void printMap(Map<Integer, String> map){

        for (Map.Entry entry : map.entrySet()) {
            System.out.printf("%20s %5s %20s\n",entry.getKey().toString(),"-",entry.getValue().toString());
        }

    }

}

