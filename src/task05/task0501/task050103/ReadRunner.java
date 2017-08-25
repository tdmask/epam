package task05.task0501.task050103;

import java.util.HashMap;
import java.util.Map;

public class ReadRunner implements Runnable {
    final Map<Integer, String> map;

    ReadRunner(Map<Integer, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
//        System.out.println("Read : \t\t\t" + Thread.currentThread().getName());
        if (map instanceof HashMap)
            readSyn();
        else
            read();
    }

    public void readSyn() {
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                entry.getKey();
                entry.getValue();
            }
        }
    }

    public void read() {
            for (Map.Entry entry : map.entrySet()) {
                entry.getKey();
                entry.getValue();
            }
    }
}
