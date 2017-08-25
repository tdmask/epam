package temp.task050103_v02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        final int NUMBER_OF_THREADS = 60;
        final int TOTAL = 3_000_000;
        Map<Integer, String> hmap = new HashMap<>(16);
        Map<Integer, String> cmap = new ConcurrentHashMap<>(16);

        System.out.println("---");
        MapController mc1 = new MapController(hmap, TOTAL/NUMBER_OF_THREADS, NUMBER_OF_THREADS);
        mc1.calculation();

        System.out.println("---");
        MapController mc2 = new MapController(cmap, TOTAL/NUMBER_OF_THREADS, NUMBER_OF_THREADS);
        mc2.calculation();

    }


}
