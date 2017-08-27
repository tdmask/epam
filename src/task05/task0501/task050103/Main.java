package task05.task0501.task050103;
// ver.2
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static void main(String[] args) {

        final int NUMBER_OF_THREADS = 60;
        final int TOTAL = 3_000_000;
        Map<Integer, String> hmap = new HashMap<>();
        Map<Integer, String> cmap = new ConcurrentHashMap<>();

        System.out.println("-----");
        MapController mc1 = new MapController(hmap, TOTAL/NUMBER_OF_THREADS, NUMBER_OF_THREADS);
        mc1.calculation();

        System.out.println("-----");
        MapController mc2 = new MapController(cmap, TOTAL/NUMBER_OF_THREADS, NUMBER_OF_THREADS);
        mc2.calculation();

    }


}
