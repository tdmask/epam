package task05.task0501.task050103;

import java.util.HashMap;
import java.util.Map;

public class Writer implements Runnable {
    Map<Integer, String> map;
    int capacity;
    int offset;
    int numberOfThreads;

    Writer (Map<Integer, String> map, int capacity, int offset, int numberOfThreads) {
        this.map = map;
        this.capacity = capacity;
        this.offset = offset;
        this.numberOfThreads = numberOfThreads;
    }

    @Override
    public void run() {
        if (map instanceof HashMap) {
            writeMapSync(map, capacity * offset, Thread.currentThread().getName(), capacity / numberOfThreads);
        } else {
            writeMap(map, capacity * offset, Thread.currentThread().getName(), capacity / numberOfThreads);
        }

    }

    private static void writeMap(Map<Integer, String> map, Integer initNumber, String initString, int capacity) {
        for (int i = 0; i < capacity; i++) {
            map.put((initNumber + i), (initString + "_" + i).toString());
        }
    }

    private static void writeMapSync(Map<Integer, String> map, Integer initNumber, String initString, int capacity) {
        for (int i = 0; i < capacity; i++) {
            synchronized (map) {
                map.put((initNumber + i), (initString + "_" + i).toString());
            }
        }
    }
}
