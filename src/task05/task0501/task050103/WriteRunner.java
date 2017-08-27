package task05.task0501.task050103;
// ver.2
import java.util.HashMap;
import java.util.Map;

public class WriteRunner implements Runnable {
    final Map<Integer, String> map;
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
            writeSync(beginValue, count, Thread.currentThread().getName());
        else
            write(beginValue, count, Thread.currentThread().getName());
    }

    public synchronized void writeSync(int beginValue, int count, String str) {
        for (int i = beginValue; i < (beginValue + count); i++) {
            map.put(i, str + ":" + i);
        }
    }

    public void write(int beginValue, int count, String str) {
        for (int i = beginValue; i < (beginValue + count); i++) {
            map.put(i, str + ":" + i);
        }
    }
}
