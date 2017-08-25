package task05.task0501.task050103;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Map;

public class MapController {


    public static void writeByThreads(Map<Integer, String> map, int capacity, int numberOfThreads) {

        Thread[] threads = new Thread[numberOfThreads];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Writer(map, capacity, i, numberOfThreads));
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
//        System.out.println(map.size() / numberOfThreads);
        int start = 0;
        int end = 0;
        int offset = map.size() / numberOfThreads;

        for (int i = 0; i < numberOfThreads; i++) {
            start = i * offset;
            end = start + offset - 1;
            if (i != numberOfThreads - 1) {
                threads[i] = new Thread(new Reader(map, start, end));
//                System.out.println(Thread.currentThread().getName() + ": k = " + offset + "; min = " + start + "; max = " + end);
            } else {
                threads[i] = new Thread(new Reader(map, start, end));
//                System.out.println(Thread.currentThread().getName() + ": last range k = " + offset + "; min = " + start + "; max = " + map.size());
            }
        }

        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }


}
