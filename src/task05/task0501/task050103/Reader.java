package task05.task0501.task050103;

import java.util.HashMap;
import java.util.Map;

public class Reader implements Runnable {

    Map<Integer, String> map;
    int start;
    int end;


    Reader(Map<Integer, String> map, int start, int end) {
        this.map = map;
        this.start = start;
        this.end = end;

    }

    @Override
    public void run() {
        if (map instanceof HashMap) {
            readMapSync(map, start, end);
        } else {
            readMap(map, start, end);
        }

    }

    public void readMap(Map<Integer, String> map, int start, int end) {
        for (int i = start; i <= end; i++) {
            map.get(i);
//            System.out.print(map.get(i) + " ");
        }
    }

    public void readMapSync(Map<Integer, String> map, int start, int end) {
        for (int i = start; i <= end; i++) {
            synchronized (map) {
                map.get(i);
//                System.out.print(map.get(i) + " ");
            }
        }
    }
}
