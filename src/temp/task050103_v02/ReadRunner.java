package temp.task050103_v02;

import java.util.HashMap;
import java.util.Map;

public class ReadRunner implements Runnable {
    Map<Integer, String> map;

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
