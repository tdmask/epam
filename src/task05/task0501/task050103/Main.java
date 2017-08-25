package task05.task0501.task050103;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    static Map<Integer, String> conMap = new ConcurrentHashMap<>();
    static Map<Integer, String> map = new HashMap<>();

    public static void main(String[] args) {
        final int NUM_OF_THREADS = 4;
        final int MAP_CAPACITY = 100_000;
        long startTime;
        long stopTime;

        System.out.println("-- Writer --");

        startTime = System.currentTimeMillis();
        MapController.writeByThreads(map, MAP_CAPACITY, NUM_OF_THREADS);
        stopTime = System.currentTimeMillis();
        System.out.println(map.size());
        System.out.println("duration: " + (stopTime-startTime) + " ms");


        startTime = System.currentTimeMillis();
        MapController.writeByThreads(conMap, MAP_CAPACITY, NUM_OF_THREADS);
        stopTime = System.currentTimeMillis();
        System.out.println(conMap.size());
        System.out.println("duration: " + (stopTime-startTime) + " ms");

//        System.out.println(conMap.toString());

        System.out.println("-- Reader --");
        startTime = System.currentTimeMillis();
        MapController.readByThreads(map,NUM_OF_THREADS);
        stopTime = System.currentTimeMillis();
        System.out.println(map.size());
        System.out.println("duration: " + (stopTime-startTime) + " ms");

        startTime = System.currentTimeMillis();
        MapController.readByThreads(conMap,NUM_OF_THREADS);
        stopTime = System.currentTimeMillis();
        System.out.println(conMap.size());
        System.out.println("duration: " + (stopTime-startTime) + " ms");





    }

}
