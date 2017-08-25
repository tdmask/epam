package temp.task050103_v01;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    static Map<Integer, String> conMap = new ConcurrentHashMap<>();
    static Map<Integer, String> map = new HashMap<>();

    public static void main(String[] args) throws InterruptedException {
        final int NUM_OF_THREADS = 50;
        final int NUMBER_ELEMENTS = 1_000_000;

/*
        System.out.println("-- Writer --");
        Stopwatch.start();
        MapController.writeByThreads(map, NUMBER_ELEMENTS, NUM_OF_THREADS);
        MapController.printSizeMap(map);
        Stopwatch.stop();

        Stopwatch.start();
        MapController.writeByThreads(conMap, NUMBER_ELEMENTS, NUM_OF_THREADS);
        MapController.printSizeMap(conMap);
        Stopwatch.stop();

        Stopwatch.start();
        System.out.println("-- Reader --");
        MapController.readByThreads(map,NUM_OF_THREADS);
        MapController.printSizeMap(map);
        Stopwatch.stop();

        Stopwatch.start();
        MapController.readByThreads(conMap,NUM_OF_THREADS);
        MapController.printSizeMap(conMap);
        Stopwatch.stop();
*/

        System.out.println("-- Writer and Reader");
        Stopwatch.start();
        MapController.writeReadByThreads(map, NUMBER_ELEMENTS, NUM_OF_THREADS);
        Stopwatch.stop();
        MapController.printSizeMap(map);
//        MapController.printMap(map);

        System.out.println("-----");

        Stopwatch.start();
        MapController.writeReadByThreads(conMap, NUMBER_ELEMENTS, NUM_OF_THREADS);
        Stopwatch.stop();
        MapController.printSizeMap(conMap);
//        MapController.printMap(conMap);


    }

}
