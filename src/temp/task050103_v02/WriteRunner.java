package temp.task050103_v02;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WriteRunner implements Runnable {
    Map<Integer, String> map;
    int beginValue;
    int count;

    public WriteRunner(Map<Integer, String> map, int beginValue, int count) {
        this.map = map;
        this.beginValue = beginValue;
        this.count = count;
    }

    @Override
    public void run() {
//        System.out.println("Write: " + Thread.currentThread().getName());

        if (map instanceof HashMap)
            writeSync(beginValue, count, Thread.currentThread().getName().toString());
        else
            write(beginValue, count, Thread.currentThread().getName().toString());

    }

    public void writeSync(int beginValue, int count, String str) {
        for (int i = beginValue; i < (beginValue + count); i++) {
            synchronized (map) {
                map.put(i, str + ":" + i);
            }
        }
    }

    public void write(int beginValue, int count, String str) {
        for (int i = beginValue; i < (beginValue + count); i++) {
            map.put(i, str + ":" + i);
        }
    }
}
