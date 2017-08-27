package task05.task0501.task050103;
// ver.2

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

/*
        for (int i = 0; i < map.size(); i++) {
            synchronized (map) {
                map.get(i);
            }
        }
*/

        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                entry.getKey();
                entry.getValue();
            }
        }

    }

    public void read() {
/*
        for (int i = 0; i < map.size(); i++) {
            map.get(i);
        }
*/
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                entry.getKey();
                entry.getValue();
            }
        }
    }
}
