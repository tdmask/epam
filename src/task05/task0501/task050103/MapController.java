package task05.task0501.task050103;
// ver.2
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapController {
    private Map<Integer, String> map;
    private int total;
    private int numberOfThreads;

    MapController(Map<Integer, String> map) {
        this.map = map;
    }

    MapController(Map<Integer, String> map, int total, int numberOfThreads) {
        this.map = map;
        this.total = total;
        this.numberOfThreads = numberOfThreads;
    }

    public void printAll() {
        System.out.println(map);
    }

    public void printAllTable() {
        for (Map.Entry entry : map.entrySet()) {
            System.out.printf("%2s %1s %10s\n", entry.getKey().toString(), "-", entry.getValue().toString());
        }
    }

    public void printSize() {
        System.out.println(map.getClass().getName() + "; \tsize=" + map.size());
    }


    public void calculation() {
        List<Thread> threads = new ArrayList<>();

//        System.out.println("ArrayList.size [start]:" + threads.size());
        Stopwatch.start();
        for (int i = 0; i < numberOfThreads; i++) {
            threads.add(new Thread(new WriteRunner(map, i * total + 1, total)));
        }

        for (int i = 0; i < numberOfThreads; i++) {
            threads.add(new Thread(new ReadRunner(map)));
        }

        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println("error: ");

            }
        }
        Stopwatch.stop();
        this.printSize();
//        System.out.println("ArrayList.size [finish]:" + threads.size());
    }
}
